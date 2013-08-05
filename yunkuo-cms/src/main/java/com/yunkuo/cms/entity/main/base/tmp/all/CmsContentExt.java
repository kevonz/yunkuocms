package com.yunkuo.cms.entity.main.base.tmp.all;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the cms_content_ext database table.
 * 
 */
@Entity
@Table(name="cms_content_ext")
public class CmsContentExt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="content_id")
	private int contentId;

	private String author;

	@Column(name="content_img")
	private String contentImg;

	private String description;

	@Column(name="is_bold")
	private byte isBold;

	private String link;

	@Column(name="media_path")
	private String mediaPath;

	@Column(name="media_type")
	private String mediaType;

	@Column(name="need_regenerate")
	private byte needRegenerate;

	private String origin;

	@Column(name="origin_url")
	private String originUrl;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="release_date")
	private Date releaseDate;

	@Column(name="short_title")
	private String shortTitle;

	private String title;

	@Column(name="title_color")
	private String titleColor;

	@Column(name="title_img")
	private String titleImg;

	@Column(name="tpl_content")
	private String tplContent;

	@Column(name="type_img")
	private String typeImg;

	//bi-directional one-to-one association to CmsContent
	@OneToOne
	@JoinColumn(name="content_id")
	private CmsContent cmsContent;

	public CmsContentExt() {
	}

	public int getContentId() {
		return this.contentId;
	}

	public void setContentId(int contentId) {
		this.contentId = contentId;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContentImg() {
		return this.contentImg;
	}

	public void setContentImg(String contentImg) {
		this.contentImg = contentImg;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte getIsBold() {
		return this.isBold;
	}

	public void setIsBold(byte isBold) {
		this.isBold = isBold;
	}

	public String getLink() {
		return this.link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getMediaPath() {
		return this.mediaPath;
	}

	public void setMediaPath(String mediaPath) {
		this.mediaPath = mediaPath;
	}

	public String getMediaType() {
		return this.mediaType;
	}

	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}

	public byte getNeedRegenerate() {
		return this.needRegenerate;
	}

	public void setNeedRegenerate(byte needRegenerate) {
		this.needRegenerate = needRegenerate;
	}

	public String getOrigin() {
		return this.origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getOriginUrl() {
		return this.originUrl;
	}

	public void setOriginUrl(String originUrl) {
		this.originUrl = originUrl;
	}

	public Date getReleaseDate() {
		return this.releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getShortTitle() {
		return this.shortTitle;
	}

	public void setShortTitle(String shortTitle) {
		this.shortTitle = shortTitle;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitleColor() {
		return this.titleColor;
	}

	public void setTitleColor(String titleColor) {
		this.titleColor = titleColor;
	}

	public String getTitleImg() {
		return this.titleImg;
	}

	public void setTitleImg(String titleImg) {
		this.titleImg = titleImg;
	}

	public String getTplContent() {
		return this.tplContent;
	}

	public void setTplContent(String tplContent) {
		this.tplContent = tplContent;
	}

	public String getTypeImg() {
		return this.typeImg;
	}

	public void setTypeImg(String typeImg) {
		this.typeImg = typeImg;
	}

	public CmsContent getCmsContent() {
		return this.cmsContent;
	}

	public void setCmsContent(CmsContent cmsContent) {
		this.cmsContent = cmsContent;
	}

}