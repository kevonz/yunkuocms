package com.yunkuo.cms.entity.main.base.tmp.all;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cms_content_picture database table.
 * 
 */
@Entity
@Table(name="cms_content_picture")
public class CmsContentPicture implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CmsContentPicturePK id;

	private String description;

	@Column(name="img_path")
	private String imgPath;

	//bi-directional many-to-one association to CmsContent
	@ManyToOne
	@JoinColumn(name="content_id")
	private CmsContent cmsContent;

	public CmsContentPicture() {
	}

	public CmsContentPicturePK getId() {
		return this.id;
	}

	public void setId(CmsContentPicturePK id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImgPath() {
		return this.imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public CmsContent getCmsContent() {
		return this.cmsContent;
	}

	public void setCmsContent(CmsContent cmsContent) {
		this.cmsContent = cmsContent;
	}

}