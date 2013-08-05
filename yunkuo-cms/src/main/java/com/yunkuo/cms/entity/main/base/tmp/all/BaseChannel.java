package com.yunkuo.cms.entity.main.base.tmp.all;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the cms_channel database table.
 * 
 */
@Entity
@Table(name="cms_channel")
public class BaseChannel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="channel_id")
	private Integer id;

	@Column(name="channel_path")
	private String path;

	@Column(name="has_content")
	private Boolean hasContent;

	@Column(name="is_display")
	private Boolean display;

	private Integer lft;

	private Integer priority;

	private Integer rgt;

	//bi-directional many-to-one association to BaseChannel
	@ManyToOne
	@JoinColumn(name="parent_id")
	private BaseChannel cmsChannel;

	//bi-directional many-to-one association to BaseChannel
	@OneToMany(mappedBy="cmsChannel")
	private List<BaseChannel> cmsChannels;

	//bi-directional many-to-one association to CmsModel
	@ManyToOne
	@JoinColumn(name="model_id")
	private CmsModel cmsModel;

	//bi-directional many-to-one association to CmsSite
	@ManyToOne
	@JoinColumn(name="site_id")
	private CmsSite cmsSite;

	//bi-directional many-to-one association to CmsChannelAttr
	@OneToMany(mappedBy="cmsChannel")
	private List<CmsChannelAttr> cmsChannelAttrs;

	//bi-directional many-to-one association to CmsChannelDepartment
	@OneToMany(mappedBy="cmsChannel")
	private List<CmsChannelDepartment> cmsChannelDepartments;

	//bi-directional one-to-one association to CmsChannelTxt
	@OneToOne(mappedBy="cmsChannel")
	private CmsChannelTxt cmsChannelTxt;

	//bi-directional many-to-one association to CmsChannelUser
	@OneToMany(mappedBy="cmsChannel")
	private List<CmsChannelUser> cmsChannelUsers;

	//bi-directional many-to-one association to CmsAcquisition
	@OneToMany(mappedBy="cmsChannel")
	private List<CmsAcquisition> cmsAcquisitions;

	//bi-directional many-to-many association to CmsDepartment
	@ManyToMany
	@JoinTable(
		name="cms_channel_department"
		, joinColumns={
			@JoinColumn(name="channel_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="department_id")
			}
		)
	private List<CmsDepartment> cmsDepartments;

	//bi-directional many-to-many association to CmsUser
	@ManyToMany
	@JoinTable(
		name="cms_channel_user"
		, joinColumns={
			@JoinColumn(name="channel_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="user_id")
			}
		)
	private List<CmsUser> cmsUsers;

	//bi-directional many-to-many association to CmsGroup
	@ManyToMany
	@JoinTable(
		name="cms_chnl_group_contri"
		, joinColumns={
			@JoinColumn(name="channel_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="group_id")
			}
		)
	private List<CmsGroup> cmsGroups1;

	//bi-directional many-to-many association to CmsGroup
	@ManyToMany
	@JoinTable(
		name="cms_chnl_group_view"
		, joinColumns={
			@JoinColumn(name="channel_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="group_id")
			}
		)
	private List<CmsGroup> cmsGroups2;

	//bi-directional many-to-one association to CmsContent
	@OneToMany(mappedBy="cmsChannel")
	private List<CmsContent> cmsContents1;

	//bi-directional many-to-many association to CmsContent
	@ManyToMany
	@JoinTable(
		name="cms_content_channel"
		, joinColumns={
			@JoinColumn(name="channel_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="content_id")
			}
		)
	private List<CmsContent> cmsContents2;

	//bi-directional many-to-one association to CmsContentShareCheck
	@OneToMany(mappedBy="cmsChannel")
	private List<CmsContentShareCheck> cmsContentShareChecks;

	//bi-directional many-to-one association to CmsTopic
	@OneToMany(mappedBy="cmsChannel")
	private List<CmsTopic> cmsTopics;

	public BaseChannel() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Boolean getHasContent() {
		return this.hasContent;
	}

	public void setHasContent(Boolean hasContent) {
		this.hasContent = hasContent;
	}

	public Boolean getDisplay() {
		return this.display;
	}

	public void setDisplay(Boolean display) {
		this.display = display;
	}

	public Integer getLft() {
		return this.lft;
	}

	public void setLft(Integer lft) {
		this.lft = lft;
	}

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Integer getRgt() {
		return this.rgt;
	}

	public void setRgt(Integer rgt) {
		this.rgt = rgt;
	}

	public BaseChannel getCmsChannel() {
		return this.cmsChannel;
	}

	public void setCmsChannel(BaseChannel cmsChannel) {
		this.cmsChannel = cmsChannel;
	}

	public List<BaseChannel> getCmsChannels() {
		return this.cmsChannels;
	}

	public void setCmsChannels(List<BaseChannel> cmsChannels) {
		this.cmsChannels = cmsChannels;
	}

	public BaseChannel addCmsChannel(BaseChannel cmsChannel) {
		getCmsChannels().add(cmsChannel);
		cmsChannel.setCmsChannel(this);

		return cmsChannel;
	}

	public BaseChannel removeCmsChannel(BaseChannel cmsChannel) {
		getCmsChannels().remove(cmsChannel);
		cmsChannel.setCmsChannel(null);

		return cmsChannel;
	}

	public CmsModel getCmsModel() {
		return this.cmsModel;
	}

	public void setCmsModel(CmsModel cmsModel) {
		this.cmsModel = cmsModel;
	}

	public CmsSite getCmsSite() {
		return this.cmsSite;
	}

	public void setCmsSite(CmsSite cmsSite) {
		this.cmsSite = cmsSite;
	}

	public List<CmsChannelAttr> getCmsChannelAttrs() {
		return this.cmsChannelAttrs;
	}

	public void setCmsChannelAttrs(List<CmsChannelAttr> cmsChannelAttrs) {
		this.cmsChannelAttrs = cmsChannelAttrs;
	}

	public CmsChannelAttr addCmsChannelAttr(CmsChannelAttr cmsChannelAttr) {
		getCmsChannelAttrs().add(cmsChannelAttr);
		cmsChannelAttr.setCmsChannel(this);

		return cmsChannelAttr;
	}

	public CmsChannelAttr removeCmsChannelAttr(CmsChannelAttr cmsChannelAttr) {
		getCmsChannelAttrs().remove(cmsChannelAttr);
		cmsChannelAttr.setCmsChannel(null);

		return cmsChannelAttr;
	}

	public List<CmsChannelDepartment> getCmsChannelDepartments() {
		return this.cmsChannelDepartments;
	}

	public void setCmsChannelDepartments(List<CmsChannelDepartment> cmsChannelDepartments) {
		this.cmsChannelDepartments = cmsChannelDepartments;
	}

	public CmsChannelDepartment addCmsChannelDepartment(CmsChannelDepartment cmsChannelDepartment) {
		getCmsChannelDepartments().add(cmsChannelDepartment);
		cmsChannelDepartment.setCmsChannel(this);

		return cmsChannelDepartment;
	}

	public CmsChannelDepartment removeCmsChannelDepartment(CmsChannelDepartment cmsChannelDepartment) {
		getCmsChannelDepartments().remove(cmsChannelDepartment);
		cmsChannelDepartment.setCmsChannel(null);

		return cmsChannelDepartment;
	}

	public CmsChannelTxt getCmsChannelTxt() {
		return this.cmsChannelTxt;
	}

	public void setCmsChannelTxt(CmsChannelTxt cmsChannelTxt) {
		this.cmsChannelTxt = cmsChannelTxt;
	}

	public List<CmsChannelUser> getCmsChannelUsers() {
		return this.cmsChannelUsers;
	}

	public void setCmsChannelUsers(List<CmsChannelUser> cmsChannelUsers) {
		this.cmsChannelUsers = cmsChannelUsers;
	}

	public CmsChannelUser addCmsChannelUser(CmsChannelUser cmsChannelUser) {
		getCmsChannelUsers().add(cmsChannelUser);
		cmsChannelUser.setCmsChannel(this);

		return cmsChannelUser;
	}

	public CmsChannelUser removeCmsChannelUser(CmsChannelUser cmsChannelUser) {
		getCmsChannelUsers().remove(cmsChannelUser);
		cmsChannelUser.setCmsChannel(null);

		return cmsChannelUser;
	}

	public List<CmsAcquisition> getCmsAcquisitions() {
		return this.cmsAcquisitions;
	}

	public void setCmsAcquisitions(List<CmsAcquisition> cmsAcquisitions) {
		this.cmsAcquisitions = cmsAcquisitions;
	}

	public CmsAcquisition addCmsAcquisition(CmsAcquisition cmsAcquisition) {
		getCmsAcquisitions().add(cmsAcquisition);
		cmsAcquisition.setCmsChannel(this);

		return cmsAcquisition;
	}

	public CmsAcquisition removeCmsAcquisition(CmsAcquisition cmsAcquisition) {
		getCmsAcquisitions().remove(cmsAcquisition);
		cmsAcquisition.setCmsChannel(null);

		return cmsAcquisition;
	}

	public List<CmsDepartment> getCmsDepartments() {
		return this.cmsDepartments;
	}

	public void setCmsDepartments(List<CmsDepartment> cmsDepartments) {
		this.cmsDepartments = cmsDepartments;
	}

	public List<CmsUser> getCmsUsers() {
		return this.cmsUsers;
	}

	public void setCmsUsers(List<CmsUser> cmsUsers) {
		this.cmsUsers = cmsUsers;
	}

	public List<CmsGroup> getCmsGroups1() {
		return this.cmsGroups1;
	}

	public void setCmsGroups1(List<CmsGroup> cmsGroups1) {
		this.cmsGroups1 = cmsGroups1;
	}

	public List<CmsGroup> getCmsGroups2() {
		return this.cmsGroups2;
	}

	public void setCmsGroups2(List<CmsGroup> cmsGroups2) {
		this.cmsGroups2 = cmsGroups2;
	}

	public List<CmsContent> getCmsContents1() {
		return this.cmsContents1;
	}

	public void setCmsContents1(List<CmsContent> cmsContents1) {
		this.cmsContents1 = cmsContents1;
	}

	public CmsContent addCmsContents1(CmsContent cmsContents1) {
		getCmsContents1().add(cmsContents1);
		cmsContents1.setCmsChannel(this);

		return cmsContents1;
	}

	public CmsContent removeCmsContents1(CmsContent cmsContents1) {
		getCmsContents1().remove(cmsContents1);
		cmsContents1.setCmsChannel(null);

		return cmsContents1;
	}

	public List<CmsContent> getCmsContents2() {
		return this.cmsContents2;
	}

	public void setCmsContents2(List<CmsContent> cmsContents2) {
		this.cmsContents2 = cmsContents2;
	}

	public List<CmsContentShareCheck> getCmsContentShareChecks() {
		return this.cmsContentShareChecks;
	}

	public void setCmsContentShareChecks(List<CmsContentShareCheck> cmsContentShareChecks) {
		this.cmsContentShareChecks = cmsContentShareChecks;
	}

	public CmsContentShareCheck addCmsContentShareCheck(CmsContentShareCheck cmsContentShareCheck) {
		getCmsContentShareChecks().add(cmsContentShareCheck);
		cmsContentShareCheck.setCmsChannel(this);

		return cmsContentShareCheck;
	}

	public CmsContentShareCheck removeCmsContentShareCheck(CmsContentShareCheck cmsContentShareCheck) {
		getCmsContentShareChecks().remove(cmsContentShareCheck);
		cmsContentShareCheck.setCmsChannel(null);

		return cmsContentShareCheck;
	}

	public List<CmsTopic> getCmsTopics() {
		return this.cmsTopics;
	}

	public void setCmsTopics(List<CmsTopic> cmsTopics) {
		this.cmsTopics = cmsTopics;
	}

	public CmsTopic addCmsTopic(CmsTopic cmsTopic) {
		getCmsTopics().add(cmsTopic);
		cmsTopic.setCmsChannel(this);

		return cmsTopic;
	}

	public CmsTopic removeCmsTopic(CmsTopic cmsTopic) {
		getCmsTopics().remove(cmsTopic);
		cmsTopic.setCmsChannel(null);

		return cmsTopic;
	}

}