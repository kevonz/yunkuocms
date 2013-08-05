package com.yunkuo.cms.entity.main.base.tmp.all;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cms_content_count database table.
 * 
 */
@Entity
@Table(name="cms_content_count")
public class CmsContentCount implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="content_id")
	private int contentId;

	private int comments;

	@Column(name="comments_day")
	private short commentsDay;

	@Column(name="comments_month")
	private int commentsMonth;

	@Column(name="comments_week")
	private short commentsWeek;

	private int downloads;

	@Column(name="downloads_day")
	private short downloadsDay;

	@Column(name="downloads_month")
	private int downloadsMonth;

	@Column(name="downloads_week")
	private short downloadsWeek;

	private int downs;

	private int ups;

	@Column(name="ups_day")
	private short upsDay;

	@Column(name="ups_month")
	private int upsMonth;

	@Column(name="ups_week")
	private short upsWeek;

	private int views;

	@Column(name="views_day")
	private int viewsDay;

	@Column(name="views_month")
	private int viewsMonth;

	@Column(name="views_week")
	private int viewsWeek;

	//bi-directional one-to-one association to CmsContent
	@OneToOne
	@JoinColumn(name="content_id")
	private CmsContent cmsContent;

	public CmsContentCount() {
	}

	public int getContentId() {
		return this.contentId;
	}

	public void setContentId(int contentId) {
		this.contentId = contentId;
	}

	public int getComments() {
		return this.comments;
	}

	public void setComments(int comments) {
		this.comments = comments;
	}

	public short getCommentsDay() {
		return this.commentsDay;
	}

	public void setCommentsDay(short commentsDay) {
		this.commentsDay = commentsDay;
	}

	public int getCommentsMonth() {
		return this.commentsMonth;
	}

	public void setCommentsMonth(int commentsMonth) {
		this.commentsMonth = commentsMonth;
	}

	public short getCommentsWeek() {
		return this.commentsWeek;
	}

	public void setCommentsWeek(short commentsWeek) {
		this.commentsWeek = commentsWeek;
	}

	public int getDownloads() {
		return this.downloads;
	}

	public void setDownloads(int downloads) {
		this.downloads = downloads;
	}

	public short getDownloadsDay() {
		return this.downloadsDay;
	}

	public void setDownloadsDay(short downloadsDay) {
		this.downloadsDay = downloadsDay;
	}

	public int getDownloadsMonth() {
		return this.downloadsMonth;
	}

	public void setDownloadsMonth(int downloadsMonth) {
		this.downloadsMonth = downloadsMonth;
	}

	public short getDownloadsWeek() {
		return this.downloadsWeek;
	}

	public void setDownloadsWeek(short downloadsWeek) {
		this.downloadsWeek = downloadsWeek;
	}

	public int getDowns() {
		return this.downs;
	}

	public void setDowns(int downs) {
		this.downs = downs;
	}

	public int getUps() {
		return this.ups;
	}

	public void setUps(int ups) {
		this.ups = ups;
	}

	public short getUpsDay() {
		return this.upsDay;
	}

	public void setUpsDay(short upsDay) {
		this.upsDay = upsDay;
	}

	public int getUpsMonth() {
		return this.upsMonth;
	}

	public void setUpsMonth(int upsMonth) {
		this.upsMonth = upsMonth;
	}

	public short getUpsWeek() {
		return this.upsWeek;
	}

	public void setUpsWeek(short upsWeek) {
		this.upsWeek = upsWeek;
	}

	public int getViews() {
		return this.views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public int getViewsDay() {
		return this.viewsDay;
	}

	public void setViewsDay(int viewsDay) {
		this.viewsDay = viewsDay;
	}

	public int getViewsMonth() {
		return this.viewsMonth;
	}

	public void setViewsMonth(int viewsMonth) {
		this.viewsMonth = viewsMonth;
	}

	public int getViewsWeek() {
		return this.viewsWeek;
	}

	public void setViewsWeek(int viewsWeek) {
		this.viewsWeek = viewsWeek;
	}

	public CmsContent getCmsContent() {
		return this.cmsContent;
	}

	public void setCmsContent(CmsContent cmsContent) {
		this.cmsContent = cmsContent;
	}

}