package com.yunkuo.cms.entity.main.base;

import com.yunkuo.cms.entity.main.Content;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the cms_content_count database table.
 * 
 */
/*@Entity
@Table(name="cms_content_count")*/
@MappedSuperclass
public class BaseContentCount implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="content_id")
    @GenericGenerator(name="foreignKey", strategy="foreign", parameters=@Parameter(name="property", value="content"))
    @GeneratedValue(generator="foreignKey", strategy=GenerationType.IDENTITY)
	private Integer id;

	private Integer comments;

	@Column(name="comments_day")
	private Short commentsDay;

	@Column(name="comments_month")
	private Integer commentsMonth;

	@Column(name="comments_week")
	private Short commentsWeek;

	private Integer downloads;

	@Column(name="downloads_day")
	private Short downloadsDay;

	@Column(name="downloads_month")
	private Integer downloadsMonth;

	@Column(name="downloads_week")
	private Short downloadsWeek;

	private Integer downs;

	private Integer ups;

	@Column(name="ups_day")
	private Short upsDay;

	@Column(name="ups_month")
	private Integer upsMonth;

	@Column(name="ups_week")
	private Short upsWeek;

	private Integer views;

	@Column(name="views_day")
	private Integer viewsDay;

	@Column(name="views_month")
	private Integer viewsMonth;

	@Column(name="views_week")
	private Integer viewsWeek;

	//bi-directional one-to-one association to CmsContent
	@OneToOne
	@JoinColumn(name="content_id")
	private Content content;

    // constructors
    public BaseContentCount () {
        initialize();
    }

    /**
     * Constructor for primary key
     */
    public BaseContentCount (java.lang.Integer id) {
        this.setId(id);
        initialize();
    }

    /**
     * Constructor for required fields
     */
    public BaseContentCount (
            java.lang.Integer id,
            java.lang.Integer views,
            java.lang.Integer viewsMonth,
            java.lang.Integer viewsWeek,
            java.lang.Integer viewsDay,
            java.lang.Integer comments,
            java.lang.Integer commentsMonth,
            java.lang.Short commentsWeek,
            java.lang.Short commentsDay,
            java.lang.Integer downloads,
            java.lang.Integer downloadsMonth,
            java.lang.Short downloadsWeek,
            java.lang.Short downloadsDay,
            java.lang.Integer ups,
            java.lang.Integer upsMonth,
            java.lang.Short upsWeek,
            java.lang.Short upsDay,
            java.lang.Integer downs) {

        this.setId(id);
        this.setViews(views);
        this.setViewsMonth(viewsMonth);
        this.setViewsWeek(viewsWeek);
        this.setViewsDay(viewsDay);
        this.setComments(comments);
        this.setCommentsMonth(commentsMonth);
        this.setCommentsWeek(commentsWeek);
        this.setCommentsDay(commentsDay);
        this.setDownloads(downloads);
        this.setDownloadsMonth(downloadsMonth);
        this.setDownloadsWeek(downloadsWeek);
        this.setDownloadsDay(downloadsDay);
        this.setUps(ups);
        this.setUpsMonth(upsMonth);
        this.setUpsWeek(upsWeek);
        this.setUpsDay(upsDay);
        this.setDowns(downs);
        initialize();
    }

    protected void initialize () {}

    public boolean equals (Object obj) {
        if (null == obj) return false;
        if (!(obj instanceof com.yunkuo.cms.entity.main.ContentCount)) return false;
        else {
            com.yunkuo.cms.entity.main.ContentCount contentCount = (com.yunkuo.cms.entity.main.ContentCount) obj;
            if (null == this.getId() || null == contentCount.getId()) return false;
            else return (this.getId().equals(contentCount.getId()));
        }
    }

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer contentId) {
		this.id = contentId;
	}

	public Integer getComments() {
		return this.comments;
	}

	public void setComments(Integer comments) {
		this.comments = comments;
	}

	public Short getCommentsDay() {
		return this.commentsDay;
	}

	public void setCommentsDay(Short commentsDay) {
		this.commentsDay = commentsDay;
	}

	public Integer getCommentsMonth() {
		return this.commentsMonth;
	}

	public void setCommentsMonth(Integer commentsMonth) {
		this.commentsMonth = commentsMonth;
	}

	public Short getCommentsWeek() {
		return this.commentsWeek;
	}

	public void setCommentsWeek(Short commentsWeek) {
		this.commentsWeek = commentsWeek;
	}

	public Integer getDownloads() {
		return this.downloads;
	}

	public void setDownloads(Integer downloads) {
		this.downloads = downloads;
	}

	public Short getDownloadsDay() {
		return this.downloadsDay;
	}

	public void setDownloadsDay(Short downloadsDay) {
		this.downloadsDay = downloadsDay;
	}

	public Integer getDownloadsMonth() {
		return this.downloadsMonth;
	}

	public void setDownloadsMonth(Integer downloadsMonth) {
		this.downloadsMonth = downloadsMonth;
	}

	public Short getDownloadsWeek() {
		return this.downloadsWeek;
	}

	public void setDownloadsWeek(Short downloadsWeek) {
		this.downloadsWeek = downloadsWeek;
	}

	public Integer getDowns() {
		return this.downs;
	}

	public void setDowns(Integer downs) {
		this.downs = downs;
	}

	public Integer getUps() {
		return this.ups;
	}

	public void setUps(Integer ups) {
		this.ups = ups;
	}

	public Short getUpsDay() {
		return this.upsDay;
	}

	public void setUpsDay(Short upsDay) {
		this.upsDay = upsDay;
	}

	public Integer getUpsMonth() {
		return this.upsMonth;
	}

	public void setUpsMonth(Integer upsMonth) {
		this.upsMonth = upsMonth;
	}

	public Short getUpsWeek() {
		return this.upsWeek;
	}

	public void setUpsWeek(Short upsWeek) {
		this.upsWeek = upsWeek;
	}

	public Integer getViews() {
		return this.views;
	}

	public void setViews(Integer views) {
		this.views = views;
	}

	public Integer getViewsDay() {
		return this.viewsDay;
	}

	public void setViewsDay(Integer viewsDay) {
		this.viewsDay = viewsDay;
	}

	public Integer getViewsMonth() {
		return this.viewsMonth;
	}

	public void setViewsMonth(Integer viewsMonth) {
		this.viewsMonth = viewsMonth;
	}

	public Integer getViewsWeek() {
		return this.viewsWeek;
	}

	public void setViewsWeek(Integer viewsWeek) {
		this.viewsWeek = viewsWeek;
	}

	public Content getContent() {
		return this.content;
	}

	public void setContent(Content cmsContent) {
		this.content = cmsContent;
	}

}