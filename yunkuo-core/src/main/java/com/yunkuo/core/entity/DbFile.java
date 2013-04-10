package com.yunkuo.core.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the yk_upload database table.
 * 
 */
@Entity
@Table(name="yk_upload")
public class DbFile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String filename;

	@Lob
	private byte[] content;

	@Column(name="last_modified")
	private long lastModified;

	private int length;

	public DbFile() {
	}

	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public byte[] getContent() {
		return this.content;
	}

	public void setContent(byte[] content) {
		this.content = content;
	}

	public long getLastModified() {
		return this.lastModified;
	}

	public void setLastModified(long lastModified) {
		this.lastModified = lastModified;
	}

	public int getLength() {
		return this.length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	
	/**
	 * Constructor for primary key
	 */
	public DbFile (java.lang.String filename) {
		this.filename = filename;
	}

	/**
	 * Constructor for required fields
	 */
	public DbFile (
		java.lang.String filename,
		java.lang.Integer length,
		java.lang.Long lastModified,
		byte[] content) {
		this.filename = filename;
		this.length = length;
		this.lastModified = lastModified;
		this.content = content;
	}
	
}