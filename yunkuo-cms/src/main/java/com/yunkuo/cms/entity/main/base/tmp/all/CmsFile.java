package com.yunkuo.cms.entity.main.base.tmp.all;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cms_file database table.
 * 
 */
@Entity
@Table(name="cms_file")
public class CmsFile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="file_path")
	private String filePath;

	@Column(name="file_isvalid")
	private byte fileIsvalid;

	@Column(name="file_name")
	private String fileName;

	//bi-directional many-to-one association to CmsContent
	@ManyToOne
	@JoinColumn(name="content_id")
	private CmsContent cmsContent;

	public CmsFile() {
	}

	public String getFilePath() {
		return this.filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public byte getFileIsvalid() {
		return this.fileIsvalid;
	}

	public void setFileIsvalid(byte fileIsvalid) {
		this.fileIsvalid = fileIsvalid;
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public CmsContent getCmsContent() {
		return this.cmsContent;
	}

	public void setCmsContent(CmsContent cmsContent) {
		this.cmsContent = cmsContent;
	}

}