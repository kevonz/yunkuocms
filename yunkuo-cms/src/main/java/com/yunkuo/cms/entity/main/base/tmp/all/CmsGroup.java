package com.yunkuo.cms.entity.main.base.tmp.all;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the cms_group database table.
 * 
 */
@Entity
@Table(name="cms_group")
public class CmsGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="group_id")
	private int groupId;

	@Column(name="allow_max_file")
	private int allowMaxFile;

	@Column(name="allow_per_day")
	private int allowPerDay;

	@Column(name="allow_suffix")
	private String allowSuffix;

	@Column(name="group_name")
	private String groupName;

	@Column(name="is_reg_def")
	private byte isRegDef;

	@Column(name="need_captcha")
	private byte needCaptcha;

	@Column(name="need_check")
	private byte needCheck;

	private int priority;

	//bi-directional many-to-many association to BaseChannel
	@ManyToMany(mappedBy="cmsGroups1")
	private List<BaseChannel> cmsChannels1;

	//bi-directional many-to-many association to BaseChannel
	@ManyToMany(mappedBy="cmsGroups2")
	private List<BaseChannel> cmsChannels2;

	//bi-directional many-to-many association to CmsContent
	@ManyToMany(mappedBy="cmsGroups")
	private List<CmsContent> cmsContents;

	//bi-directional many-to-one association to CmsUser
	@OneToMany(mappedBy="cmsGroup")
	private List<CmsUser> cmsUsers;

	public CmsGroup() {
	}

	public int getGroupId() {
		return this.groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public int getAllowMaxFile() {
		return this.allowMaxFile;
	}

	public void setAllowMaxFile(int allowMaxFile) {
		this.allowMaxFile = allowMaxFile;
	}

	public int getAllowPerDay() {
		return this.allowPerDay;
	}

	public void setAllowPerDay(int allowPerDay) {
		this.allowPerDay = allowPerDay;
	}

	public String getAllowSuffix() {
		return this.allowSuffix;
	}

	public void setAllowSuffix(String allowSuffix) {
		this.allowSuffix = allowSuffix;
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public byte getIsRegDef() {
		return this.isRegDef;
	}

	public void setIsRegDef(byte isRegDef) {
		this.isRegDef = isRegDef;
	}

	public byte getNeedCaptcha() {
		return this.needCaptcha;
	}

	public void setNeedCaptcha(byte needCaptcha) {
		this.needCaptcha = needCaptcha;
	}

	public byte getNeedCheck() {
		return this.needCheck;
	}

	public void setNeedCheck(byte needCheck) {
		this.needCheck = needCheck;
	}

	public int getPriority() {
		return this.priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public List<BaseChannel> getCmsChannels1() {
		return this.cmsChannels1;
	}

	public void setCmsChannels1(List<BaseChannel> cmsChannels1) {
		this.cmsChannels1 = cmsChannels1;
	}

	public List<BaseChannel> getCmsChannels2() {
		return this.cmsChannels2;
	}

	public void setCmsChannels2(List<BaseChannel> cmsChannels2) {
		this.cmsChannels2 = cmsChannels2;
	}

	public List<CmsContent> getCmsContents() {
		return this.cmsContents;
	}

	public void setCmsContents(List<CmsContent> cmsContents) {
		this.cmsContents = cmsContents;
	}

	public List<CmsUser> getCmsUsers() {
		return this.cmsUsers;
	}

	public void setCmsUsers(List<CmsUser> cmsUsers) {
		this.cmsUsers = cmsUsers;
	}

	public CmsUser addCmsUser(CmsUser cmsUser) {
		getCmsUsers().add(cmsUser);
		cmsUser.setCmsGroup(this);

		return cmsUser;
	}

	public CmsUser removeCmsUser(CmsUser cmsUser) {
		getCmsUsers().remove(cmsUser);
		cmsUser.setCmsGroup(null);

		return cmsUser;
	}

}