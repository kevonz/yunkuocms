package com.yunkuo.cms.entity.main.base;


import com.yunkuo.cms.entity.main.Content;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the cms_content_ext database table.
 * 
 */
//@Entity
//@Table(name="cms_content_ext")
@MappedSuperclass
//@NamedQuery(name="ContentExt.findAll", query="SELECT c FROM CmsContentExt c")
public class BaseContentExt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="content_id")
	private int id;

	private String author;

	@Column(name="content_img")
	private String contentImg;

	private String description;

	@Column(name="is_bold")
	private boolean bold;

	private String link;

	@Column(name="media_path")
	private String mediaPath;

	@Column(name="media_type")
	private String mediaType;

	@Column(name="need_regenerate")
	private boolean needRegenerate;

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
	private Content content;

	public BaseContentExt() {
	}
    public BaseContentExt (int id){
        this.id = id;
    }
    public BaseContentExt (
            int id,
            String title,
            Date releaseDate,
            boolean bold,
            boolean needRegenerate){
        this.id = id;
        this.title = title;
        this.releaseDate = releaseDate;
        this.bold = bold;
        this.needRegenerate = needRegenerate;
    }
	public int getId() {
		return this.id;
	}

	public void setId(int contentId) {
		this.id = contentId;
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

	public Boolean getBold() {
		return this.bold;
	}

	public void setBold(Boolean isBold) {
		this.bold = isBold;
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

	public Boolean getNeedRegenerate() {
		return this.needRegenerate;
	}

	public void setNeedRegenerate(Boolean needRegenerate) {
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

	public Content getContent() {
		return this.content;
	}

	public void setContent(Content content) {
		this.content = content;
	}

}