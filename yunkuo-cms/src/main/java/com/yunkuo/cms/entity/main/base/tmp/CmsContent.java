package com.yunkuo.cms.entity.main.base.tmp;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the cms_content database table.
 * 
 */
@Entity
@Table(name="cms_content")
public class CmsContent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="content_id")
	private int contentId;

	@Column(name="channel_id")
	private int channelId;

	@Column(name="comments_day")
	private short commentsDay;

	@Column(name="downloads_day")
	private short downloadsDay;

	@Column(name="has_title_img")
	private byte hasTitleImg;

	@Column(name="is_recommend")
	private byte isRecommend;

	@Column(name="site_id")
	private int siteId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="sort_date")
	private Date sortDate;

	private byte status;

	@Column(name="top_level")
	private byte topLevel;

	@Column(name="type_id")
	private int typeId;

	@Column(name="ups_day")
	private short upsDay;

	@Column(name="user_id")
	private int userId;

	@Column(name="views_day")
	private int viewsDay;

	//bi-directional many-to-many association to CmsContentTag
	@ManyToMany
	@JoinTable(
		name="cms_contenttag"
		, joinColumns={
			@JoinColumn(name="content_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="tag_id")
			}
		)
	private List<CmsContentTag> cmsContentTags;

	public CmsContent() {
	}

	public int getContentId() {
		return this.contentId;
	}

	public void setContentId(int contentId) {
		this.contentId = contentId;
	}

	public int getChannelId() {
		return this.channelId;
	}

	public void setChannelId(int channelId) {
		this.channelId = channelId;
	}

	public short getCommentsDay() {
		return this.commentsDay;
	}

	public void setCommentsDay(short commentsDay) {
		this.commentsDay = commentsDay;
	}

	public short getDownloadsDay() {
		return this.downloadsDay;
	}

	public void setDownloadsDay(short downloadsDay) {
		this.downloadsDay = downloadsDay;
	}

	public byte getHasTitleImg() {
		return this.hasTitleImg;
	}

	public void setHasTitleImg(byte hasTitleImg) {
		this.hasTitleImg = hasTitleImg;
	}

	public byte getIsRecommend() {
		return this.isRecommend;
	}

	public void setIsRecommend(byte isRecommend) {
		this.isRecommend = isRecommend;
	}

	public int getSiteId() {
		return this.siteId;
	}

	public void setSiteId(int siteId) {
		this.siteId = siteId;
	}

	public Date getSortDate() {
		return this.sortDate;
	}

	public void setSortDate(Date sortDate) {
		this.sortDate = sortDate;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public byte getTopLevel() {
		return this.topLevel;
	}

	public void setTopLevel(byte topLevel) {
		this.topLevel = topLevel;
	}

	public int getTypeId() {
		return this.typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public short getUpsDay() {
		return this.upsDay;
	}

	public void setUpsDay(short upsDay) {
		this.upsDay = upsDay;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getViewsDay() {
		return this.viewsDay;
	}

	public void setViewsDay(int viewsDay) {
		this.viewsDay = viewsDay;
	}

	public List<CmsContentTag> getCmsContentTags() {
		return this.cmsContentTags;
	}

	public void setCmsContentTags(List<CmsContentTag> cmsContentTags) {
		this.cmsContentTags = cmsContentTags;
	}

}