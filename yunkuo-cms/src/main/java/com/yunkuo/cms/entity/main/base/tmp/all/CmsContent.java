package com.yunkuo.cms.entity.main.base.tmp.all;

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

	@Column(name="comments_day")
	private short commentsDay;

	@Column(name="downloads_day")
	private short downloadsDay;

	@Column(name="has_title_img")
	private byte hasTitleImg;

	@Column(name="is_recommend")
	private byte isRecommend;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="sort_date")
	private Date sortDate;

	private byte status;

	@Column(name="top_level")
	private byte topLevel;

	@Column(name="ups_day")
	private short upsDay;

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

	//bi-directional many-to-one association to CmsComment
	@OneToMany(mappedBy="cmsContent")
	private List<CmsComment> cmsComments;

	//bi-directional many-to-one association to BaseChannel
	@ManyToOne
	@JoinColumn(name="channel_id")
	private BaseChannel cmsChannel;

	//bi-directional many-to-one association to CmsSite
	@ManyToOne
	@JoinColumn(name="site_id")
	private CmsSite cmsSite;

	//bi-directional many-to-one association to CmsContentType
	@ManyToOne
	@JoinColumn(name="type_id")
	private CmsContentType cmsContentType;

	//bi-directional many-to-one association to CmsUser
	@ManyToOne
	@JoinColumn(name="user_id")
	private CmsUser cmsUser;

	//bi-directional many-to-one association to CmsContentAttachment
	@OneToMany(mappedBy="cmsContent")
	private List<CmsContentAttachment> cmsContentAttachments;

	//bi-directional many-to-one association to CmsContentAttr
	@OneToMany(mappedBy="cmsContent")
	private List<CmsContentAttr> cmsContentAttrs;

	//bi-directional many-to-many association to BaseChannel
	@ManyToMany(mappedBy="cmsContents2")
	private List<BaseChannel> cmsChannels;

	//bi-directional one-to-one association to CmsContentCheck
	@OneToOne(mappedBy="cmsContent")
	private CmsContentCheck cmsContentCheck;

	//bi-directional one-to-one association to CmsContentCount
	@OneToOne(mappedBy="cmsContent")
	private CmsContentCount cmsContentCount;

	//bi-directional one-to-one association to CmsContentExt
	@OneToOne(mappedBy="cmsContent")
	private CmsContentExt cmsContentExt;

	//bi-directional many-to-many association to CmsGroup
	@ManyToMany
	@JoinTable(
		name="cms_content_group_view"
		, joinColumns={
			@JoinColumn(name="content_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="group_id")
			}
		)
	private List<CmsGroup> cmsGroups;

	//bi-directional many-to-one association to CmsContentPicture
	@OneToMany(mappedBy="cmsContent")
	private List<CmsContentPicture> cmsContentPictures;

	//bi-directional many-to-one association to CmsContentShareCheck
	@OneToMany(mappedBy="cmsContent")
	private List<CmsContentShareCheck> cmsContentShareChecks;

	//bi-directional many-to-many association to CmsTopic
	@ManyToMany
	@JoinTable(
		name="cms_content_topic"
		, joinColumns={
			@JoinColumn(name="content_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="topic_id")
			}
		)
	private List<CmsTopic> cmsTopics;

	//bi-directional one-to-one association to CmsContentTxt
	@OneToOne(mappedBy="cmsContent")
	private CmsContentTxt cmsContentTxt;

	//bi-directional many-to-one association to CmsFile
	@OneToMany(mappedBy="cmsContent")
	private List<CmsFile> cmsFiles;

	//bi-directional many-to-many association to CmsUser
	@ManyToMany(mappedBy="cmsContents2")
	private List<CmsUser> cmsUsers;

	public CmsContent() {
	}

	public int getContentId() {
		return this.contentId;
	}

	public void setContentId(int contentId) {
		this.contentId = contentId;
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

	public short getUpsDay() {
		return this.upsDay;
	}

	public void setUpsDay(short upsDay) {
		this.upsDay = upsDay;
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

	public List<CmsComment> getCmsComments() {
		return this.cmsComments;
	}

	public void setCmsComments(List<CmsComment> cmsComments) {
		this.cmsComments = cmsComments;
	}

	public CmsComment addCmsComment(CmsComment cmsComment) {
		getCmsComments().add(cmsComment);
		cmsComment.setCmsContent(this);

		return cmsComment;
	}

	public CmsComment removeCmsComment(CmsComment cmsComment) {
		getCmsComments().remove(cmsComment);
		cmsComment.setCmsContent(null);

		return cmsComment;
	}

	public BaseChannel getCmsChannel() {
		return this.cmsChannel;
	}

	public void setCmsChannel(BaseChannel cmsChannel) {
		this.cmsChannel = cmsChannel;
	}

	public CmsSite getCmsSite() {
		return this.cmsSite;
	}

	public void setCmsSite(CmsSite cmsSite) {
		this.cmsSite = cmsSite;
	}

	public CmsContentType getCmsContentType() {
		return this.cmsContentType;
	}

	public void setCmsContentType(CmsContentType cmsContentType) {
		this.cmsContentType = cmsContentType;
	}

	public CmsUser getCmsUser() {
		return this.cmsUser;
	}

	public void setCmsUser(CmsUser cmsUser) {
		this.cmsUser = cmsUser;
	}

	public List<CmsContentAttachment> getCmsContentAttachments() {
		return this.cmsContentAttachments;
	}

	public void setCmsContentAttachments(List<CmsContentAttachment> cmsContentAttachments) {
		this.cmsContentAttachments = cmsContentAttachments;
	}

	public CmsContentAttachment addCmsContentAttachment(CmsContentAttachment cmsContentAttachment) {
		getCmsContentAttachments().add(cmsContentAttachment);
		cmsContentAttachment.setCmsContent(this);

		return cmsContentAttachment;
	}

	public CmsContentAttachment removeCmsContentAttachment(CmsContentAttachment cmsContentAttachment) {
		getCmsContentAttachments().remove(cmsContentAttachment);
		cmsContentAttachment.setCmsContent(null);

		return cmsContentAttachment;
	}

	public List<CmsContentAttr> getCmsContentAttrs() {
		return this.cmsContentAttrs;
	}

	public void setCmsContentAttrs(List<CmsContentAttr> cmsContentAttrs) {
		this.cmsContentAttrs = cmsContentAttrs;
	}

	public CmsContentAttr addCmsContentAttr(CmsContentAttr cmsContentAttr) {
		getCmsContentAttrs().add(cmsContentAttr);
		cmsContentAttr.setCmsContent(this);

		return cmsContentAttr;
	}

	public CmsContentAttr removeCmsContentAttr(CmsContentAttr cmsContentAttr) {
		getCmsContentAttrs().remove(cmsContentAttr);
		cmsContentAttr.setCmsContent(null);

		return cmsContentAttr;
	}

	public List<BaseChannel> getCmsChannels() {
		return this.cmsChannels;
	}

	public void setCmsChannels(List<BaseChannel> cmsChannels) {
		this.cmsChannels = cmsChannels;
	}

	public CmsContentCheck getCmsContentCheck() {
		return this.cmsContentCheck;
	}

	public void setCmsContentCheck(CmsContentCheck cmsContentCheck) {
		this.cmsContentCheck = cmsContentCheck;
	}

	public CmsContentCount getCmsContentCount() {
		return this.cmsContentCount;
	}

	public void setCmsContentCount(CmsContentCount cmsContentCount) {
		this.cmsContentCount = cmsContentCount;
	}

	public CmsContentExt getCmsContentExt() {
		return this.cmsContentExt;
	}

	public void setCmsContentExt(CmsContentExt cmsContentExt) {
		this.cmsContentExt = cmsContentExt;
	}

	public List<CmsGroup> getCmsGroups() {
		return this.cmsGroups;
	}

	public void setCmsGroups(List<CmsGroup> cmsGroups) {
		this.cmsGroups = cmsGroups;
	}

	public List<CmsContentPicture> getCmsContentPictures() {
		return this.cmsContentPictures;
	}

	public void setCmsContentPictures(List<CmsContentPicture> cmsContentPictures) {
		this.cmsContentPictures = cmsContentPictures;
	}

	public CmsContentPicture addCmsContentPicture(CmsContentPicture cmsContentPicture) {
		getCmsContentPictures().add(cmsContentPicture);
		cmsContentPicture.setCmsContent(this);

		return cmsContentPicture;
	}

	public CmsContentPicture removeCmsContentPicture(CmsContentPicture cmsContentPicture) {
		getCmsContentPictures().remove(cmsContentPicture);
		cmsContentPicture.setCmsContent(null);

		return cmsContentPicture;
	}

	public List<CmsContentShareCheck> getCmsContentShareChecks() {
		return this.cmsContentShareChecks;
	}

	public void setCmsContentShareChecks(List<CmsContentShareCheck> cmsContentShareChecks) {
		this.cmsContentShareChecks = cmsContentShareChecks;
	}

	public CmsContentShareCheck addCmsContentShareCheck(CmsContentShareCheck cmsContentShareCheck) {
		getCmsContentShareChecks().add(cmsContentShareCheck);
		cmsContentShareCheck.setCmsContent(this);

		return cmsContentShareCheck;
	}

	public CmsContentShareCheck removeCmsContentShareCheck(CmsContentShareCheck cmsContentShareCheck) {
		getCmsContentShareChecks().remove(cmsContentShareCheck);
		cmsContentShareCheck.setCmsContent(null);

		return cmsContentShareCheck;
	}

	public List<CmsTopic> getCmsTopics() {
		return this.cmsTopics;
	}

	public void setCmsTopics(List<CmsTopic> cmsTopics) {
		this.cmsTopics = cmsTopics;
	}

	public CmsContentTxt getCmsContentTxt() {
		return this.cmsContentTxt;
	}

	public void setCmsContentTxt(CmsContentTxt cmsContentTxt) {
		this.cmsContentTxt = cmsContentTxt;
	}

	public List<CmsFile> getCmsFiles() {
		return this.cmsFiles;
	}

	public void setCmsFiles(List<CmsFile> cmsFiles) {
		this.cmsFiles = cmsFiles;
	}

	public CmsFile addCmsFile(CmsFile cmsFile) {
		getCmsFiles().add(cmsFile);
		cmsFile.setCmsContent(this);

		return cmsFile;
	}

	public CmsFile removeCmsFile(CmsFile cmsFile) {
		getCmsFiles().remove(cmsFile);
		cmsFile.setCmsContent(null);

		return cmsFile;
	}

	public List<CmsUser> getCmsUsers() {
		return this.cmsUsers;
	}

	public void setCmsUsers(List<CmsUser> cmsUsers) {
		this.cmsUsers = cmsUsers;
	}

}