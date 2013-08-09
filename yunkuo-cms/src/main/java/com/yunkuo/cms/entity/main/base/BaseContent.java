package com.yunkuo.cms.entity.main.base;

import com.yunkuo.cms.entity.assist.CmsComment;
import com.yunkuo.cms.entity.assist.CmsFile;
import com.yunkuo.cms.entity.main.*;
import org.hibernate.annotations.IndexColumn;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;


/**
 * The persistent class for the cms_content database table.
 * 
 */
/*@Entity
@Table(name="cms_content")*/
@MappedSuperclass
public class BaseContent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="content_id")
	private Integer id;

	@Column(name="comments_day")
	private Short commentsDay;

	@Column(name="downloads_day")
	private Short downloadsDay;

	@Column(name="has_title_img")
	private Boolean hasTitleImg;

	@Column(name="is_recommend")
	private Boolean recommend;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="sort_date")
	private Date sortDate;

	private Byte status;

	@Column(name="top_level")
	private Byte topLevel;

	@Column(name="ups_day")
	private Short upsDay;


    //bi-directional one-to-one association to CmsContentCount
    @OneToOne
    @JoinColumn(name="content_id")
    private ContentCount contentCount;

    //bi-directional one-to-one association to CmsContentExt
    @OneToOne
    @JoinColumn(name="content_id")
    private ContentExt contentExt;

    //bi-directional many-to-one association to BaseChannel
    @ManyToOne
    @JoinColumn(name="channel_id")
    private Channel channel;

    //bi-directional many-to-one association to CmsSite
    @ManyToOne
    @JoinColumn(name="site_id")
    private CmsSite site;

    //bi-directional many-to-one association to CmsContentType
    @ManyToOne
    @JoinColumn(name="type_id")
    private ContentType type;

    //bi-directional many-to-one association to CmsUser
    @ManyToOne
    @JoinColumn(name="user_id")
    private CmsUser user;


    //bi-directional many-to-many association to BaseChannel
    @ManyToMany
    @JoinTable(
            name="cms_content_channel"
            , joinColumns={
            @JoinColumn(name="content_id")
    }
            , inverseJoinColumns={
            @JoinColumn(name="channel_id")
    }
    )
    private Set<Channel> channels;

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
    private Set<CmsTopic> topics;

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
    private Set<CmsGroup> viewGroups;


    @ManyToMany
    @JoinTable(
            name="cms_user_collection"
            , joinColumns={
            @JoinColumn(name="content_id")
    }
            , inverseJoinColumns={
            @JoinColumn(name="user_id")
    }
    )
    private Set<CmsUser> collectUsers;


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
    private List<ContentTag> tags;


   /* @CollectionTable
    @JoinTable(name = "cms_content_picture"
            , joinColumns = {
            @JoinColumn(name = "content_id")
    }, inverseJoinColumns = {@JoinColumn(name = "img_path", referencedColumnName = "imgPath")
            , @JoinColumn(name = "description")})
    @IndexColumn(name = "priority")
    private List<ContentPicture> pictures;*/


    @OneToMany
    //@JoinTable(name = "cms_content_picture")
   // @JoinColumn(name="content_id")
    @JoinTable(name = "cms_content_picture"
            , joinColumns = {
            @JoinColumn(name = "content_id")
    },inverseJoinColumns=@JoinColumn(name="id"))
    private List<ContentPicture> pictures;
/*    @ManyToMany
    @JoinTable(name = "cms_content_picture"
            , joinColumns = {
            @JoinColumn(name = "content_id")
    }, inverseJoinColumns = {@JoinColumn(name = "img_path", referencedColumnName = "imgPath")
            , @JoinColumn(name = "description")})

    /*@CollectionTable
    @JoinTable(name = "cms_content_attachment"
            , joinColumns = {
            @JoinColumn(name = "content_id")
    }, inverseJoinColumns = {@JoinColumn(name = "attachment_path", referencedColumnName = "path")
            , @JoinColumn(name = "attachment_name", referencedColumnName = "name")
            , @JoinColumn(name = "filename"), @JoinColumn(name = "download_count", referencedColumnName = "count")})
    @IndexColumn(name = "priority")
    private List<ContentAttachment> attachments;*/
    @OneToMany
    @JoinTable(name = "cms_content_attachment"
            , joinColumns = {
            @JoinColumn(name = "content_id")
    },inverseJoinColumns=@JoinColumn(name="id"))
    private List<ContentAttachment> attachments;
    //bi-directional many-to-one association to CmsContentAttachment
/*    @OneToMany
    @JoinTable(name = "cms_content_attachment"
            , joinColumns = {
            @JoinColumn(name = "content_id")
    }, inverseJoinColumns = {@JoinColumn(name = "attachment_path", referencedColumnName = "path")
            , @JoinColumn(name = "attachment_name", referencedColumnName = "name")
            , @JoinColumn(name = "filename"), @JoinColumn(name = "download_count", referencedColumnName = "count")})
    private List<ContentAttachment> attachments;*/

    //bi-directional one-to-one association to CmsContentTxt
    @OneToOne
    @JoinColumn(name="content_id")
    private ContentTxt contentTxtSet;



    //bi-directional one-to-one association to CmsContentCheck
    @OneToOne
    @JoinTable(name = "cms_content_check"
            , joinColumns = {
            @JoinColumn(name = "content_id")
    }, inverseJoinColumns = {
            @JoinColumn(name = "content_id")
    })
    private ContentCheck contentCheckSet;



    @ElementCollection
    @CollectionTable(name="cms_content_attr" , joinColumns = @JoinColumn(name="content_id"))
    @MapKeyColumn(name="attr_name")
    @Column(name="attr_value")
    private Map<String,String> attr = new HashMap<String, String>();

    //bi-directional many-to-one association to CmsComment
    @OneToMany
/*    @JoinTable(name = "cms_comment"
            , joinColumns = {
            @JoinColumn(name = "content_id")
    },inverseJoinColumns=@JoinColumn(name="comment_id"))*/
    private Set<CmsComment> comments;


	@Column(name="views_day")
	private Integer viewsDay;

    public Set<CmsUser> getCollectUsers() {
        return collectUsers;
    }

    public void setCollectUsers(Set<CmsUser> collectUsers) {
        this.collectUsers = collectUsers;
    }

    public List<ContentTag> getTags() {
        return tags;
    }

    public void setTags(List<ContentTag> tags) {
        this.tags = tags;
    }

    public List<ContentPicture> getPictures() {
        return pictures;
    }

    public void setPictures(List<ContentPicture> pictures) {
        this.pictures = pictures;
    }

    public Map<String, String> getAttr() {
        return attr;
    }

    public void setAttr(Map<String, String> attr) {
        this.attr = attr;
    }

    public Set<CmsComment> getComments() {
        return comments;
    }

    public void setComments(Set<CmsComment> comments) {
        this.comments = comments;
    }

    //bi-directional many-to-one association to CmsFile
    @OneToMany
    private Set<CmsFile> files;





/*

	//bi-directional many-to-one association to CmsContentPicture
	@OneToMany(mappedBy="cmsContent")
	private List<CmsContentPicture> cmsContentPictures;

	//bi-directional many-to-one association to CmsContentShareCheck
	@OneToMany(mappedBy="cmsContent")
	private List<CmsContentShareCheck> cmsContentShareChecks;



	//bi-directional many-to-many association to CmsUser
	@ManyToMany(mappedBy="cmsContents2")
	private List<CmsUser> cmsUsers;
*/

    // constructors
    public BaseContent () {
        initialize();
    }

    /**
     * Constructor for primary key
     */
    public BaseContent (java.lang.Integer id) {
        this.setId(id);
        initialize();
    }

    /**
     * Constructor for required fields
     */
    public BaseContent (
            java.lang.Integer id,
            com.yunkuo.cms.entity.main.CmsSite site,
            java.util.Date sortDate,
            java.lang.Byte topLevel,
            java.lang.Boolean hasTitleImg,
            java.lang.Boolean recommend,
            java.lang.Byte status,
            java.lang.Integer viewsDay,
            java.lang.Short commentsDay,
            java.lang.Short downloadsDay,
            java.lang.Short upsDay) {

        this.setId(id);
        this.setSite(site);
        this.setSortDate(sortDate);
        this.setTopLevel(topLevel);
        this.setHasTitleImg(hasTitleImg);
        this.setRecommend(recommend);
        this.setStatus(status);
        this.setViewsDay(viewsDay);
        this.setCommentsDay(commentsDay);
        this.setDownloadsDay(downloadsDay);
        this.setUpsDay(upsDay);
        initialize();
    }

    protected void initialize () {}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer contentId) {
		this.id = contentId;
	}

	public Short getCommentsDay() {
		return this.commentsDay;
	}

	public void setCommentsDay(Short commentsDay) {
		this.commentsDay = commentsDay;
	}

	public Short getDownloadsDay() {
		return this.downloadsDay;
	}

	public void setDownloadsDay(Short downloadsDay) {
		this.downloadsDay = downloadsDay;
	}

	public Boolean getHasTitleImg() {
		return this.hasTitleImg;
	}

	public void setHasTitleImg(Boolean hasTitleImg) {
		this.hasTitleImg = hasTitleImg;
	}

	public Boolean getRecommend() {
		return this.recommend;
	}

	public void setRecommend(Boolean isRecommend) {
		this.recommend = isRecommend;
	}

	public Date getSortDate() {
		return this.sortDate;
	}

	public void setSortDate(Date sortDate) {
		this.sortDate = sortDate;
	}

	public Byte getStatus() {
		return this.status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	public Byte getTopLevel() {
		return this.topLevel;
	}

	public void setTopLevel(Byte topLevel) {
		this.topLevel = topLevel;
	}

	public Short getUpsDay() {
		return this.upsDay;
	}

	public void setUpsDay(Short upsDay) {
		this.upsDay = upsDay;
	}

	public Integer getViewsDay() {
		return this.viewsDay;
	}

	public void setViewsDay(Integer viewsDay) {
		this.viewsDay = viewsDay;
	}

	/*public List<CmsContentTag> getTags() {
		return this.tags;
	}

	public void setTags(List<CmsContentTag> cmsContentTags) {
		this.tags = cmsContentTags;
	}

	public List<CmsComment> getCmsComment() {
		return this.comments;
	}

	public void setCmsComment(List<CmsComment> cmsComments) {
		this.comments = cmsComments;
	}

	public CmsComment addCmsComment(CmsComment cmsComment) {
		getCmsComment().add(cmsComment);
		cmsComment.setCmsContent(this);

		return cmsComment;
	}

	public CmsComment removeCmsComment(CmsComment cmsComment) {
		getCmsComment().remove(cmsComment);
		cmsComment.setCmsContent(null);

		return cmsComment;
	}*/

	public Channel getChannel() {
		return this.channel;
	}

	public void setChannel(Channel cmsChannel) {
		this.channel = cmsChannel;
	}

	public CmsSite getSite() {
		return this.site;
	}

	public void setSite(CmsSite cmsSite) {
		this.site = cmsSite;
	}

	public ContentType getType() {
		return this.type;
	}

	public void setType(ContentType cmsContentType) {
		this.type = cmsContentType;
	}

	public CmsUser getUser() {
		return this.user;
	}

	public void setUser(CmsUser cmsUser) {
		this.user = cmsUser;
	}

	public List<ContentAttachment> getAttachments() {
		return this.attachments;
	}

	public void setAttachments(List<ContentAttachment> cmsContentAttachments) {
		this.attachments = cmsContentAttachments;
	}
/*
	public ContentAttachment addCmsContentAttachment(ContentAttachment cmsContentAttachment) {
		getAttachments().add(cmsContentAttachment);
		cmsContentAttachment.setCmsContent(this);

		return cmsContentAttachment;
	}

	public ContentAttachment removeCmsContentAttachment(ContentAttachment cmsContentAttachment) {
		getAttachments().remove(cmsContentAttachment);
		cmsContentAttachment.setContent(null);

		return cmsContentAttachment;
	}*/

	/*public List<CmsContentAttr> getCmsContentAttrs() {
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
*/
	public Set<Channel> getChannels() {
		return this.channels;
	}

	public void setChannels(Set<Channel> cmsChannels) {
		this.channels = cmsChannels;
	}

	public ContentCheck getContentCheckSet() {
		return this.contentCheckSet;
	}

	public void setContentCheckSet(ContentCheck cmsContentCheck) {
		this.contentCheckSet = cmsContentCheck;
	}

	public ContentCount getContentCount() {
		return this.contentCount;
	}

	public void setContentCount(ContentCount cmsContentCount) {
		this.contentCount = cmsContentCount;
	}

	public ContentExt getContentExt() {
		return this.contentExt;
	}

	public void setContentExt(ContentExt cmsContentExt) {
		this.contentExt = cmsContentExt;
	}

	public Set<CmsGroup> getViewGroups() {
		return this.viewGroups;
	}

	public void setViewGroups(Set<CmsGroup> cmsGroups) {
		this.viewGroups = cmsGroups;
	}

	/*public List<CmsContentPicture> getCmsContentPictures() {
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
	}*/

	public Set<CmsTopic> getTopics() {
		return this.topics;
	}

	public void setTopics(Set<CmsTopic> cmsTopics) {
		this.topics = cmsTopics;
	}

	public ContentTxt getContentTxtSet() {
		return this.contentTxtSet;
	}

	public void setContentTxtSet(ContentTxt cmsContentTxt) {
		this.contentTxtSet = cmsContentTxt;
	}

	public Set<CmsFile> getFiles() {
		return this.files;
	}

	public void setFiles(Set<CmsFile> cmsFiles) {
		this.files = cmsFiles;
	}

	/*public CmsFile addCmsFile(CmsFile cmsFile) {
		getFiles().add(cmsFile);
		cmsFile.setCmsContent(this);

		return cmsFile;
	}

	public CmsFile removeCmsFile(CmsFile cmsFile) {
		getFiles().remove(cmsFile);
		cmsFile.setCmsContent(null);

		return cmsFile;
	}

	public List<CmsUser> getCmsUsers() {
		return this.cmsUsers;
	}

	public void setCmsUsers(List<CmsUser> cmsUsers) {
		this.cmsUsers = cmsUsers;
	}
*/
}