package com.yunkuo.cms.entity.main.base.tmp.all;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cms_guestbook_ext database table.
 * 
 */
@Entity
@Table(name="cms_guestbook_ext")
public class CmsGuestbookExt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Lob
	private String content;

	private String email;

	private String phone;

	private String qq;

	@Lob
	private String reply;

	private String title;

	//bi-directional many-to-one association to CmsGuestbook
	@ManyToOne
	@JoinColumn(name="guestbook_id")
	private CmsGuestbook cmsGuestbook;

	public CmsGuestbookExt() {
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getReply() {
		return this.reply;
	}

	public void setReply(String reply) {
		this.reply = reply;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public CmsGuestbook getCmsGuestbook() {
		return this.cmsGuestbook;
	}

	public void setCmsGuestbook(CmsGuestbook cmsGuestbook) {
		this.cmsGuestbook = cmsGuestbook;
	}

}