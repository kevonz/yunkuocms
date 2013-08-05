package com.yunkuo.cms.entity.main.base.tmp;

import javax.persistence.*;
import java.io.Serializable;
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

	//bi-directional one-to-one association to CmsChannelTxt
	@OneToOne(mappedBy="cmsChannel")
	private CmsChannelTxt cmsChannelTxt;

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

	public CmsChannelTxt getCmsChannelTxt() {
		return this.cmsChannelTxt;
	}

	public void setCmsChannelTxt(CmsChannelTxt cmsChannelTxt) {
		this.cmsChannelTxt = cmsChannelTxt;
	}

}