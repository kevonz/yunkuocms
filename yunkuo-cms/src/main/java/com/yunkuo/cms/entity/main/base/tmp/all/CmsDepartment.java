package com.yunkuo.cms.entity.main.base.tmp.all;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the cms_department database table.
 * 
 */
@Entity
@Table(name="cms_department")
public class CmsDepartment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="depart_id")
	private int departId;

	@Column(name="depart_name")
	private String departName;

	private int priority;

	private int weights;

	//bi-directional many-to-many association to BaseChannel
	@ManyToMany(mappedBy="cmsDepartments")
	private List<BaseChannel> cmsChannels;

	//bi-directional many-to-one association to CmsSite
	@ManyToOne
	@JoinColumn(name="site_id")
	private CmsSite cmsSite;

	//bi-directional many-to-many association to CmsGuestbookCtg
	@ManyToMany
	@JoinTable(
		name="cms_guestbook_ctg_department"
		, joinColumns={
			@JoinColumn(name="depart_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="guestbookctg_id")
			}
		)
	private List<CmsGuestbookCtg> cmsGuestbookCtgs;

	//bi-directional many-to-many association to CmsUser
	@ManyToMany
	@JoinTable(
		name="cms_user_department"
		, joinColumns={
			@JoinColumn(name="department_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="user_id")
			}
		)
	private List<CmsUser> cmsUsers;

	public CmsDepartment() {
	}

	public int getDepartId() {
		return this.departId;
	}

	public void setDepartId(int departId) {
		this.departId = departId;
	}

	public String getDepartName() {
		return this.departName;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}

	public int getPriority() {
		return this.priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public int getWeights() {
		return this.weights;
	}

	public void setWeights(int weights) {
		this.weights = weights;
	}

	public List<BaseChannel> getCmsChannels() {
		return this.cmsChannels;
	}

	public void setCmsChannels(List<BaseChannel> cmsChannels) {
		this.cmsChannels = cmsChannels;
	}

	public CmsSite getCmsSite() {
		return this.cmsSite;
	}

	public void setCmsSite(CmsSite cmsSite) {
		this.cmsSite = cmsSite;
	}

	public List<CmsGuestbookCtg> getCmsGuestbookCtgs() {
		return this.cmsGuestbookCtgs;
	}

	public void setCmsGuestbookCtgs(List<CmsGuestbookCtg> cmsGuestbookCtgs) {
		this.cmsGuestbookCtgs = cmsGuestbookCtgs;
	}

	public List<CmsUser> getCmsUsers() {
		return this.cmsUsers;
	}

	public void setCmsUsers(List<CmsUser> cmsUsers) {
		this.cmsUsers = cmsUsers;
	}

}