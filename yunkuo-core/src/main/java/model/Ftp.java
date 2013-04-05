package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the yk_ftp database table.
 * 
 */
@Entity
@Table(name="yk_ftp")
public class Ftp implements Serializable {
	private static final long serialVersionUID = 1L;

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

	private int timeout;

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

	public int getTimeout() {
		return this.timeout;
	}

	public void setTimeout(int timeout) {
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

}