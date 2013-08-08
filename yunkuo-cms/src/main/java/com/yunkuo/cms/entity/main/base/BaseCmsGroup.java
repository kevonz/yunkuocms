package com.yunkuo.cms.entity.main.base;


import com.yunkuo.cms.entity.main.Channel;
import com.yunkuo.cms.entity.main.CmsUser;
import com.yunkuo.cms.entity.main.Content;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;


/**
 * The persistent class for the cms_group database table.
 * 
 */
/*@Entity
@Table(name="cms_group")*/
@MappedSuperclass
public class BaseCmsGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="group_id")
	private Integer id;

	@Column(name="allow_max_file")
	private Integer allowMaxFile;

	@Column(name="allow_per_day")
	private Integer allowPerDay;

	@Column(name="allow_suffix")
	private String allowSuffix;

	@Column(name="group_name")
	private String name;

	@Column(name="is_reg_def")
	private Boolean regDef;

	@Column(name="need_captcha")
	private Boolean needCaptcha;

	@Column(name="need_check")
	private Boolean needCheck;

	private Integer priority;

    public Set<Channel> getViewChannels() {
        return viewChannels;
    }

    public void setViewChannels(Set<Channel> viewChannels) {
        this.viewChannels = viewChannels;
    }

    public Set<Channel> getContriChannels() {
        return contriChannels;
    }

    public void setContriChannels(Set<Channel> contriChannels) {
        this.contriChannels = contriChannels;
    }

    //bi-directional many-to-many association to BaseChannel
	//@ManyToMany(mappedBy="cmsGroups1")
    @ManyToMany
    @JoinTable(
            name="cms_chnl_group_view"
            , joinColumns={
            @JoinColumn(name="group_id")
    }
            , inverseJoinColumns={
            @JoinColumn(name="channel_id")
    }
    )
	private Set<Channel> viewChannels;

	//bi-directional many-to-many association to BaseChannel
	//@ManyToMany(mappedBy="cmsGroups2")
    @ManyToMany
    @JoinTable(
            name="cms_chnl_group_contri"
            , joinColumns={
            @JoinColumn(name="group_id")
    }
            , inverseJoinColumns={
            @JoinColumn(name="channel_id")
    }
    )
	private Set<Channel> contriChannels;

	//bi-directional many-to-many association to CmsContent
	/*@ManyToMany(mappedBy="cmsGroups")
	private List<Content> cmsContents;*/

	//bi-directional many-to-one association to CmsUser
	/*@OneToMany(mappedBy="cmsGroup")
	private List<CmsUser> cmsUsers;
*/
	public BaseCmsGroup() {
	}
    /**
     * Constructor for primary key
     */
    public BaseCmsGroup (java.lang.Integer id) {
        this.setId(id);
        initialize();
    }

    /**
     * Constructor for required fields
     */
    public BaseCmsGroup (
            java.lang.Integer id,
            java.lang.String name,
            java.lang.Integer priority,
            java.lang.Integer allowPerDay,
            java.lang.Integer allowMaxFile,
            java.lang.Boolean needCaptcha,
            java.lang.Boolean needCheck,
            java.lang.Boolean regDef) {

        this.setId(id);
        this.setName(name);
        this.setPriority(priority);
        this.setAllowPerDay(allowPerDay);
        this.setAllowMaxFile(allowMaxFile);
        this.setNeedCaptcha(needCaptcha);
        this.setNeedCheck(needCheck);
        this.setRegDef(regDef);
        initialize();
    }

    protected void initialize () {}

    public boolean equals (Object obj) {
        if (null == obj) return false;
        if (!(obj instanceof com.yunkuo.cms.entity.main.CmsGroup)) return false;
        else {
            com.yunkuo.cms.entity.main.CmsGroup cmsGroup = (com.yunkuo.cms.entity.main.CmsGroup) obj;
            if (null == this.getId() || null == cmsGroup.getId()) return false;
            else return (this.getId().equals(cmsGroup.getId()));
        }
    }

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer groupId) {
		this.id = groupId;
	}

	public Integer getAllowMaxFile() {
		return this.allowMaxFile;
	}

	public void setAllowMaxFile(Integer allowMaxFile) {
		this.allowMaxFile = allowMaxFile;
	}

	public Integer getAllowPerDay() {
		return this.allowPerDay;
	}

	public void setAllowPerDay(Integer allowPerDay) {
		this.allowPerDay = allowPerDay;
	}

	public String getAllowSuffix() {
		return this.allowSuffix;
	}

	public void setAllowSuffix(String allowSuffix) {
		this.allowSuffix = allowSuffix;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String groupName) {
		this.name = groupName;
	}

	public Boolean getRegDef() {
		return this.regDef;
	}

	public void setRegDef(Boolean isRegDef) {
		this.regDef = isRegDef;
	}

	public Boolean getNeedCaptcha() {
		return this.needCaptcha;
	}

	public void setNeedCaptcha(Boolean needCaptcha) {
		this.needCaptcha = needCaptcha;
	}

	public Boolean getNeedCheck() {
		return this.needCheck;
	}

	public void setNeedCheck(Boolean needCheck) {
		this.needCheck = needCheck;
	}

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}
/*
	public List<com.yunkuo.cms.entity.main.base.tmp.all.BaseChannel> getCmsChannels1() {
		return this.cmsChannels1;
	}

	public void setCmsChannels1(List<com.yunkuo.cms.entity.main.base.tmp.all.BaseChannel> cmsChannels1) {
		this.cmsChannels1 = cmsChannels1;
	}

	public List<com.yunkuo.cms.entity.main.base.tmp.all.BaseChannel> getCmsChannels2() {
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
	}*/

}