package com.yunkuo.cms.entity.main.base.tmp.all;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cms_friendlink database table.
 * 
 */
@Entity
@Table(name="cms_friendlink")
public class CmsFriendlink implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="friendlink_id")
	private int friendlinkId;

	private String description;

	private String domain;

	private String email;

	@Column(name="is_enabled")
	private String isEnabled;

	private String logo;

	private int priority;

	@Column(name="site_name")
	private String siteName;

	private int views;

	//bi-directional many-to-one association to CmsFriendlinkCtg
	@ManyToOne
	@JoinColumn(name="friendlinkctg_id")
	private CmsFriendlinkCtg cmsFriendlinkCtg;

	//bi-directional many-to-one association to CmsSite
	@ManyToOne
	@JoinColumn(name="site_id")
	private CmsSite cmsSite;

	public CmsFriendlink() {
	}

	public int getFriendlinkId() {
		return this.friendlinkId;
	}

	public void setFriendlinkId(int friendlinkId) {
		this.friendlinkId = friendlinkId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIsEnabled() {
		return this.isEnabled;
	}

	public void setIsEnabled(String isEnabled) {
		this.isEnabled = isEnabled;
	}

	public String getLogo() {
		return this.logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public int getPriority() {
		return this.priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getSiteName() {
		return this.siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	public int getViews() {
		return this.views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public CmsFriendlinkCtg getCmsFriendlinkCtg() {
		return this.cmsFriendlinkCtg;
	}

	public void setCmsFriendlinkCtg(CmsFriendlinkCtg cmsFriendlinkCtg) {
		this.cmsFriendlinkCtg = cmsFriendlinkCtg;
	}

	public CmsSite getCmsSite() {
		return this.cmsSite;
	}

	public void setCmsSite(CmsSite cmsSite) {
		this.cmsSite = cmsSite;
	}

}