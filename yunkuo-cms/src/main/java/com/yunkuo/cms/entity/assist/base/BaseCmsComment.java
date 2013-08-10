package com.yunkuo.cms.entity.assist.base;

import com.yunkuo.cms.entity.assist.CmsCommentExt;
import com.yunkuo.cms.entity.main.CmsSite;
import com.yunkuo.cms.entity.main.CmsUser;
import com.yunkuo.cms.entity.main.Content;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the cms_comment database table.
 * 
 */
/*@Entity
@Table(name="cms_comment")*/
@MappedSuperclass
public class BaseCmsComment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="comment_id")
	private Integer id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	private Short downs;

	@Column(name="is_checked")
	private Boolean checked;

	@Column(name="is_recommend")
	private Boolean recommend;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="reply_time")
	private Date replyTime;

	private Short ups;

	//bi-directional many-to-one association to CmsContent
	@ManyToOne
	@JoinColumn(name="content_id")
/*    @JoinTable(
            name="cms_content"
            , joinColumns={
            @JoinColumn(name="content_id")
    }
            , inverseJoinColumns={
            @JoinColumn(name="content_id")
    }
    )*/
	private Content content;

	//bi-directional many-to-one association to CmsUser
	@ManyToOne
	@JoinColumn(name="reply_user_id")
	private CmsUser replayUser;

	//bi-directional many-to-one association to CmsSite
	@ManyToOne
	@JoinColumn(name="site_id")
	private CmsSite site;

	//bi-directional many-to-one association to CmsUser
	@ManyToOne
	@JoinColumn(name="comment_user_id")
	private CmsUser commentUser;

	//bi-directional many-to-one association to CmsCommentExt
	@OneToOne
    @JoinColumn(name="comment_id")
  /* @JoinTable(name = "cms_comment_ext"
            *//*, joinColumns = {
            @JoinColumn(name = "comment_id")
    }*//*, inverseJoinColumns = {
            @JoinColumn(name = "comment_id")
    })*/
	private CmsCommentExt commentExt;

    // constructors
    public BaseCmsComment () {
        initialize();
    }

    /**
     * Constructor for primary key
     */
    public BaseCmsComment (java.lang.Integer id) {
        this.setId(id);
        initialize();
    }

    /**
     * Constructor for required fields
     */
    public BaseCmsComment (
            java.lang.Integer id,
            Content content,
            CmsSite site,
            java.util.Date createTime,
            java.lang.Short ups,
            java.lang.Short downs,
            java.lang.Boolean recommend,
            java.lang.Boolean checked) {

        this.setId(id);
        this.setContent(content);
        this.setSite(site);
        this.setCreateTime(createTime);
        this.setUps(ups);
        this.setDowns(downs);
        this.setRecommend(recommend);
        this.setChecked(checked);
        initialize();
    }

    protected void initialize () {}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer commentId) {
		this.id = commentId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Short getDowns() {
		return this.downs;
	}

	public void setDowns(Short downs) {
		this.downs = downs;
	}

	public Boolean getChecked() {
		return this.checked;
	}

	public void setChecked(Boolean isChecked) {
		this.checked = isChecked;
	}

	public Boolean getRecommend() {
		return this.recommend;
	}

	public void setRecommend(Boolean isRecommend) {
		this.recommend = isRecommend;
	}

	public Date getReplyTime() {
		return this.replyTime;
	}

	public void setReplyTime(Date replyTime) {
		this.replyTime = replyTime;
	}

	public Short getUps() {
		return this.ups;
	}

	public void setUps(Short ups) {
		this.ups = ups;
	}

	public Content getContent() {
		return this.content;
	}

	public void setContent(Content cmsContent) {
		this.content = cmsContent;
	}

	public CmsUser getReplayUser() {
		return this.replayUser;
	}

	public void setReplayUser(CmsUser cmsUser1) {
		this.replayUser = cmsUser1;
	}

	public CmsSite getSite() {
		return this.site;
	}

	public void setSite(CmsSite cmsSite) {
		this.site = cmsSite;
	}

	public CmsUser getCommentUser() {
		return this.commentUser;
	}

	public void setCommentUser(CmsUser cmsUser2) {
		this.commentUser = cmsUser2;
	}

	public CmsCommentExt getCommentExt() {
		return this.commentExt;
	}

	public void setCommentExt(CmsCommentExt cmsCommentExts) {
		this.commentExt = cmsCommentExts;
	}

	/*public CmsCommentExt addCmsCommentExt(CmsCommentExt cmsCommentExt) {
		getCommentExt().add(cmsCommentExt);
		cmsCommentExt.setCmsComment(this);

		return cmsCommentExt;
	}

	public CmsCommentExt removeCmsCommentExt(CmsCommentExt cmsCommentExt) {
		getCommentExt().remove(cmsCommentExt);
		cmsCommentExt.setCmsComment(null);

		return cmsCommentExt;
	}*/

}