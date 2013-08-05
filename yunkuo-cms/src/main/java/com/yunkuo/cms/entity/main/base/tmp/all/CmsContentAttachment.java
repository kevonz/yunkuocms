package com.yunkuo.cms.entity.main.base.tmp.all;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cms_content_attachment database table.
 * 
 */
@Entity
@Table(name="cms_content_attachment")
public class CmsContentAttachment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="attachment_name")
	private String attachmentName;

	@Column(name="attachment_path")
	private String attachmentPath;

	@Column(name="download_count")
	private int downloadCount;

	private String filename;

	private int priority;

	//bi-directional many-to-one association to CmsContent
	@ManyToOne
	@JoinColumn(name="content_id")
	private CmsContent cmsContent;

	public CmsContentAttachment() {
	}

	public String getAttachmentName() {
		return this.attachmentName;
	}

	public void setAttachmentName(String attachmentName) {
		this.attachmentName = attachmentName;
	}

	public String getAttachmentPath() {
		return this.attachmentPath;
	}

	public void setAttachmentPath(String attachmentPath) {
		this.attachmentPath = attachmentPath;
	}

	public int getDownloadCount() {
		return this.downloadCount;
	}

	public void setDownloadCount(int downloadCount) {
		this.downloadCount = downloadCount;
	}

	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public int getPriority() {
		return this.priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public CmsContent getCmsContent() {
		return this.cmsContent;
	}

	public void setCmsContent(CmsContent cmsContent) {
		this.cmsContent = cmsContent;
	}

}