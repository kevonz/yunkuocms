package com.yunkuo.cms.entity.main.base.tmp.all;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the cms_guestbook database table.
 * 
 */
@Entity
@Table(name="cms_guestbook")
public class CmsGuestbook implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="guestbook_id")
	private int guestbookId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	private String ip;

	@Column(name="is_checked")
	private byte isChecked;

	@Column(name="is_recommend")
	private byte isRecommend;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="replay_time")
	private Date replayTime;

	//bi-directional many-to-one association to CmsGuestbookCtg
	@ManyToOne
	@JoinColumn(name="guestbookctg_id")
	private CmsGuestbookCtg cmsGuestbookCtg;

	//bi-directional many-to-one association to CmsUser
	@ManyToOne
	@JoinColumn(name="admin_id")
	private CmsUser cmsUser1;

	//bi-directional many-to-one association to CmsUser
	@ManyToOne
	@JoinColumn(name="member_id")
	private CmsUser cmsUser2;

	//bi-directional many-to-one association to CmsSite
	@ManyToOne
	@JoinColumn(name="site_id")
	private CmsSite cmsSite;

	//bi-directional many-to-one association to CmsGuestbookExt
	@OneToMany(mappedBy="cmsGuestbook")
	private List<CmsGuestbookExt> cmsGuestbookExts;

	public CmsGuestbook() {
	}

	public int getGuestbookId() {
		return this.guestbookId;
	}

	public void setGuestbookId(int guestbookId) {
		this.guestbookId = guestbookId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
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

	public Date getReplayTime() {
		return this.replayTime;
	}

	public void setReplayTime(Date replayTime) {
		this.replayTime = replayTime;
	}

	public CmsGuestbookCtg getCmsGuestbookCtg() {
		return this.cmsGuestbookCtg;
	}

	public void setCmsGuestbookCtg(CmsGuestbookCtg cmsGuestbookCtg) {
		this.cmsGuestbookCtg = cmsGuestbookCtg;
	}

	public CmsUser getCmsUser1() {
		return this.cmsUser1;
	}

	public void setCmsUser1(CmsUser cmsUser1) {
		this.cmsUser1 = cmsUser1;
	}

	public CmsUser getCmsUser2() {
		return this.cmsUser2;
	}

	public void setCmsUser2(CmsUser cmsUser2) {
		this.cmsUser2 = cmsUser2;
	}

	public CmsSite getCmsSite() {
		return this.cmsSite;
	}

	public void setCmsSite(CmsSite cmsSite) {
		this.cmsSite = cmsSite;
	}

	public List<CmsGuestbookExt> getCmsGuestbookExts() {
		return this.cmsGuestbookExts;
	}

	public void setCmsGuestbookExts(List<CmsGuestbookExt> cmsGuestbookExts) {
		this.cmsGuestbookExts = cmsGuestbookExts;
	}

	public CmsGuestbookExt addCmsGuestbookExt(CmsGuestbookExt cmsGuestbookExt) {
		getCmsGuestbookExts().add(cmsGuestbookExt);
		cmsGuestbookExt.setCmsGuestbook(this);

		return cmsGuestbookExt;
	}

	public CmsGuestbookExt removeCmsGuestbookExt(CmsGuestbookExt cmsGuestbookExt) {
		getCmsGuestbookExts().remove(cmsGuestbookExt);
		cmsGuestbookExt.setCmsGuestbook(null);

		return cmsGuestbookExt;
	}

}