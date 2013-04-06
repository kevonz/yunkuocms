package com.yunkuo.core.entity;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.net.SocketException;

import javax.persistence.*;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.net.PrintCommandListener;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.yunkuo.common.upload.UploadUtils;


/**
 * The persistent class for the yk_ftp database table.
 * 
 */
@Entity
@Table(name="yk_ftp")
public class Ftp implements Serializable {
	private static final long serialVersionUID = 1L;
	private static final Logger log = LoggerFactory.getLogger(Ftp.class);

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ftp_id")
	private int ftpId;

	private String encoding;

	@Column(name="ftp_name")
	private String ftpName;

	@Column(name="ftp_path")
	private String ftpPath;

	private String ip;

	private String password;

	private int port;

	private Integer timeout;

	private String url;

	private String username;

	public Ftp() {
	}

	public int getFtpId() {
		return this.ftpId;
	}

	public void setFtpId(int ftpId) {
		this.ftpId = ftpId;
	}

	public String getEncoding() {
		return this.encoding;
	}

	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}

	public String getFtpName() {
		return this.ftpName;
	}

	public void setFtpName(String ftpName) {
		this.ftpName = ftpName;
	}

	public String getFtpPath() {
		return this.ftpPath;
	}

	public void setFtpPath(String ftpPath) {
		this.ftpPath = ftpPath;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPort() {
		return this.port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public Integer getTimeout() {
		return this.timeout;
	}

	public void setTimeout(Integer timeout) {
		this.timeout = timeout;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String storeByExt(String path, String ext, InputStream in)
			throws IOException {
		String filename = UploadUtils.generateFilename(path, ext);
		store(filename, in);
		return filename;
	}

	public String storeByFilename(String filename, InputStream in)
			throws IOException {
		store(filename, in);
		return filename;
	}

	public File retrieve(String name) throws IOException {
		String path = System.getProperty("java.io.tmpdir");
		File file = new File(path, name);
		file = UploadUtils.getUniqueFile(file);

		FTPClient ftp = getClient();
		OutputStream output = new FileOutputStream(file);
		ftp.retrieveFile(getFtpPath() + name, output);
		output.close();
		ftp.logout();
		ftp.disconnect();
		return file;
	}

	public boolean restore(String name, File file) throws IOException {
		store(name, FileUtils.openInputStream(file));
		file.deleteOnExit();
		return true;
	}

	private int store(String remote, InputStream in) {
		try {
			FTPClient ftp = getClient();
			if (ftp != null) {
				String filename = getFtpPath() + remote;
				String name = FilenameUtils.getName(filename);
				String path = FilenameUtils.getFullPath(filename);
				if (!ftp.changeWorkingDirectory(path)) {
					String[] ps = StringUtils.split(path, '/');
					String p = "/";
					ftp.changeWorkingDirectory(p);
					for (String s : ps) {
						p += s + "/";
						if (!ftp.changeWorkingDirectory(p)) {
							ftp.makeDirectory(s);
							ftp.changeWorkingDirectory(p);
						}
					}
				}
				ftp.storeFile(name, in);
				ftp.logout();
				ftp.disconnect();
			}
			in.close();
			return 0;
		} catch (SocketException e) {
			log.error("ftp store error", e);
			return 3;
		} catch (IOException e) {
			log.error("ftp store error", e);
			return 4;
		}
	}

	private FTPClient getClient() throws SocketException, IOException {
		FTPClient ftp = new FTPClient();
		ftp.addProtocolCommandListener(new PrintCommandListener(
				new PrintWriter(System.out)));
		ftp.setDefaultPort(getPort());
		ftp.connect(getIp());
		int reply = ftp.getReplyCode();
		if (!FTPReply.isPositiveCompletion(reply)) {
			log.warn("FTP server refused connection: {}", getIp());
			ftp.disconnect();
			return null;
		}
		if (!ftp.login(getUsername(), getPassword())) {
			log.warn("FTP server refused login: {}, user: {}", getIp(),
					getUsername());
			ftp.logout();
			ftp.disconnect();
			return null;
		}
		ftp.setControlEncoding(getEncoding());
		ftp.setFileType(FTP.BINARY_FILE_TYPE);
		ftp.enterLocalPassiveMode();
		return ftp;
	}
}