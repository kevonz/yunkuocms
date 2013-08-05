package com.yunkuo.cms.entity.main.base.tmp.all;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the cms_comment database table.
 * 
 */
@Entity
@Table(name="cms_comment")
public class CmsComment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="comment_id")
	private int commentId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	private short downs;

	@Column(name="is_checked")
	private byte isChecked;

	@Column(name="is_recommend")
	private byte isRecommend;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="reply_time")
	private Date replyTime;

	private short ups;

	//bi-directional many-to-one association to CmsContent
	@ManyToOne
	@JoinColumn(name="content_id")
	private CmsContent cmsContent;

	//bi-directional many-to-one association to CmsUser
	@ManyToOne
	@JoinColumn(name="reply_user_id")
	private CmsUser cmsUser1;

	//bi-directional many-to-one association to CmsSite
	@ManyToOne
	@JoinColumn(name="site_id")
	private CmsSite cmsSite;

	//bi-directional many-to-one association to CmsUser
	@ManyToOne
	@JoinColumn(name="comment_user_id")
	private CmsUser cmsUser2;

	//bi-directional many-to-one association to CmsCommentExt
	@OneToMany(mappedBy="cmsComment")
	private List<CmsCommentExt> cmsCommentExts;

	public CmsComment() {
	}

	public int getCommentId() {
		return this.commentId;
	}

	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public short getDowns() {
		return this.downs;
	}

	public void setDowns(short downs) {
		this.downs = downs;
	}

	public byte getIsChecked() {
		return this.isChecked;
	}

	public void setIsChecked(byte isChecked) {
		this.isChecked = isChecked;
	}

	public byte getIsRecommend() {
		return this.isRecommend;
	}

	public void setIsRecommend(byte isRecommend) {
		this.isRecommend = isRecommend;
	}

	public Date getReplyTime() {
		return this.replyTime;
	}

	public void setReplyTime(Date replyTime) {
		this.replyTime = replyTime;
	}

	public short getUps() {
		return this.ups;
	}

	public void setUps(short ups) {
		this.ups = ups;
	}

	public CmsContent getCmsContent() {
		return this.cmsContent;
	}

	public void setCmsContent(CmsContent cmsContent) {
		this.cmsContent = cmsContent;
	}

	public CmsUser getCmsUser1() {
		return this.cmsUser1;
	}

	public void setCmsUser1(CmsUser cmsUser1) {
		this.cmsUser1 = cmsUser1;
	}

	public CmsSite getCmsSite() {
		return this.cmsSite;
	}

	public void setCmsSite(CmsSite cmsSite) {
		this.cmsSite = cmsSite;
	}

	public CmsUser getCmsUser2() {
		return this.cmsUser2;
	}

	public void setCmsUser2(CmsUser cmsUser2) {
		this.cmsUser2 = cmsUser2;
	}

	public List<CmsCommentExt> getCmsCommentExts() {
		return this.cmsCommentExts;
	}

	public void setCmsCommentExts(List<CmsCommentExt> cmsCommentExts) {
		this.cmsCommentExts = cmsCommentExts;
	}

	public CmsCommentExt addCmsCommentExt(CmsCommentExt cmsCommentExt) {
		getCmsCommentExts().add(cmsCommentExt);
		cmsCommentExt.setCmsComment(this);

		return cmsCommentExt;
	}

	public CmsCommentExt removeCmsCommentExt(CmsCommentExt cmsCommentExt) {
		getCmsCommentExts().remove(cmsCommentExt);
		cmsCommentExt.setCmsComment(null);

		return cmsCommentExt;
	}

}