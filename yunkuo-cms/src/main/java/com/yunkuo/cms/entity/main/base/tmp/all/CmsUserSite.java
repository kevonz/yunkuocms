package com.yunkuo.cms.entity.main.base.tmp.all;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cms_user_site database table.
 * 
 */
@Entity
@Table(name="cms_user_site")
public class CmsUserSite implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="usersite_id")
	private int usersiteId;

	@Column(name="check_step")
	private byte checkStep;

	@Column(name="is_all_channel")
	private byte isAllChannel;

	//bi-directional many-to-one association to CmsUser
	@ManyToOne
	@JoinColumn(name="user_id")
	private CmsUser cmsUser;

	//bi-directional many-to-one association to CmsSite
	@ManyToOne
	@JoinColumn(name="site_id")
	private CmsSite cmsSite;

	public CmsUserSite() {
	}

	public int getUsersiteId() {
		return this.usersiteId;
	}

	public void setUsersiteId(int usersiteId) {
		this.usersiteId = usersiteId;
	}

	public byte getCheckStep() {
		return this.checkStep;
	}

	public void setCheckStep(byte checkStep) {
		this.checkStep = checkStep;
	}

	public byte getIsAllChannel() {
		return this.isAllChannel;
	}

	public void setIsAllChannel(byte isAllChannel) {
		this.isAllChannel = isAllChannel;
	}

	public CmsUser getCmsUser() {
		return this.cmsUser;
	}

	public void setCmsUser(CmsUser cmsUser) {
		this.cmsUser = cmsUser;
	}

	public CmsSite getCmsSite() {
		return this.cmsSite;
	}

	public void setCmsSite(CmsSite cmsSite) {
		this.cmsSite = cmsSite;
	}

}