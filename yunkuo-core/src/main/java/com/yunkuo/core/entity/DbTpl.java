package com.yunkuo.core.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;
import static com.yunkuo.common.web.Constants.SPT;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.util.Assert;

import com.yunkuo.core.tpl.Tpl;

/**
 * The persistent class for the yk_template database table.
 * 
 */
@Entity
@Table(name="yk_template")
public class DbTpl implements Tpl,Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="tpl_name")
	private String name;

	@Column(name="is_directory")
	private boolean directory;

	@Column(name="last_modified")
	private long lastModified;

	@Lob
	@Column(name="tpl_source")
	private String source;

	public DbTpl() {
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isDirectory() {
		return this.directory;
	}

	public void setDirectory(boolean isDirectory) {
		this.directory = isDirectory;
	}

	public Date getLastModifiedDate() {
		return new Timestamp(getLastModified());
	}

	public void setLastModified(long lastModified) {
		this.lastModified = lastModified;
	}
	public long getLastModified() {
		return this.lastModified;
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}
	
	/**
	 * 获得文件夹或文件的所有父文件夹
	 * 
	 * @param path
	 * @return
	 */
	public static String[] getParentDir(String path) {
		Assert.notNull(path);
		if (!path.startsWith(SPT)) {
			throw new IllegalArgumentException("path must start with /");
		}
		List<String> list = new ArrayList<String>();
		int index = path.indexOf(SPT, 1);
		while (index >= 0) {
			list.add(path.substring(0, index));
			index = path.indexOf(SPT, index + 1);
		}
		String[] arr = new String[list.size()];
		return list.toArray(arr);
	}


	public String getPath() {
		String name = getName();
		return getName().substring(0, name.lastIndexOf("/"));
	}

	public String getFilename() {
		String name = getName();
		if (!StringUtils.isBlank(name)) {
			int index = name.lastIndexOf(SPT);
			if (index != -1) {
				return name.substring(index + 1, name.length());
			}
		}
		return name;
	}

	public long getLength() {
		if (isDirectory() || getSource() == null) {
			return 128;
		} else {
			// 一个英文字符占1个字节，而一个中文则占3-4字节，这里取折中一个字符1.5个字节
			return (long) (getSource().length() * 1.5);
		}
	}

	public int getSize() {
		return (int) (getLength() / 1024) + 1;
	}
	
	/**
	 * Constructor for primary key
	 */
	public DbTpl (java.lang.String tplName) {
		this.name = tplName;
	}

	/**
	 * Constructor for required fields
	 */
	public DbTpl (
		java.lang.String tplName,
		long lastModified,
		boolean directory) {
		this.name = tplName;
		this.lastModified = lastModified;
		this.directory = directory;
	}


	

}