package com.yunkuo.cms.entity.main.base.tmp.all;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the cms_content_type database table.
 * 
 */
@Entity
@Table(name="cms_content_type")
public class CmsContentType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="type_id")
	private int typeId;

	@Column(name="has_image")
	private byte hasImage;

	@Column(name="img_height")
	private int imgHeight;

	@Column(name="img_width")
	private int imgWidth;

	@Column(name="is_disabled")
	private byte isDisabled;

	@Column(name="type_name")
	private String typeName;

	//bi-directional many-to-one association to CmsAcquisition
	@OneToMany(mappedBy="cmsContentType")
	private List<CmsAcquisition> cmsAcquisitions;

	//bi-directional many-to-one association to CmsContent
	@OneToMany(mappedBy="cmsContentType")
	private List<CmsContent> cmsContents;

	public CmsContentType() {
	}

	public int getTypeId() {
		return this.typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public byte getHasImage() {
		return this.hasImage;
	}

	public void setHasImage(byte hasImage) {
		this.hasImage = hasImage;
	}

	public int getImgHeight() {
		return this.imgHeight;
	}

	public void setImgHeight(int imgHeight) {
		this.imgHeight = imgHeight;
	}

	public int getImgWidth() {
		return this.imgWidth;
	}

	public void setImgWidth(int imgWidth) {
		this.imgWidth = imgWidth;
	}

	public byte getIsDisabled() {
		return this.isDisabled;
	}

	public void setIsDisabled(byte isDisabled) {
		this.isDisabled = isDisabled;
	}

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public List<CmsAcquisition> getCmsAcquisitions() {
		return this.cmsAcquisitions;
	}

	public void setCmsAcquisitions(List<CmsAcquisition> cmsAcquisitions) {
		this.cmsAcquisitions = cmsAcquisitions;
	}

	public CmsAcquisition addCmsAcquisition(CmsAcquisition cmsAcquisition) {
		getCmsAcquisitions().add(cmsAcquisition);
		cmsAcquisition.setCmsContentType(this);

		return cmsAcquisition;
	}

	public CmsAcquisition removeCmsAcquisition(CmsAcquisition cmsAcquisition) {
		getCmsAcquisitions().remove(cmsAcquisition);
		cmsAcquisition.setCmsContentType(null);

		return cmsAcquisition;
	}

	public List<CmsContent> getCmsContents() {
		return this.cmsContents;
	}

	public void setCmsContents(List<CmsContent> cmsContents) {
		this.cmsContents = cmsContents;
	}

	public CmsContent addCmsContent(CmsContent cmsContent) {
		getCmsContents().add(cmsContent);
		cmsContent.setCmsContentType(this);

		return cmsContent;
	}

	public CmsContent removeCmsContent(CmsContent cmsContent) {
		getCmsContents().remove(cmsContent);
		cmsContent.setCmsContentType(null);

		return cmsContent;
	}

}