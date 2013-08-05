package com.yunkuo.cms.entity.main.base.tmp.all;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cms_comment_ext database table.
 * 
 */
@Entity
@Table(name="cms_comment_ext")
public class CmsCommentExt implements Serializable {
	private static final long serialVersionUID = 1L;

	private String ip;

	@Lob
	private String reply;

	@Lob
	private String text;

	//bi-directional many-to-one association to CmsComment
	@ManyToOne
	@JoinColumn(name="comment_id")
	private CmsComment cmsComment;

	public CmsCommentExt() {
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getReply() {
		return this.reply;
	}

	public void setReply(String reply) {
		this.reply = reply;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public CmsComment getCmsComment() {
		return this.cmsComment;
	}

	public void setCmsComment(CmsComment cmsComment) {
		this.cmsComment = cmsComment;
	}

}