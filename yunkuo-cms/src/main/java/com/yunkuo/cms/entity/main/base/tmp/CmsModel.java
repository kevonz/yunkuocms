package com.yunkuo.cms.entity.main.base.tmp;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the cms_model database table.
 * 
 */
@Entity
@Table(name="cms_model")
public class CmsModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="model_id")
	private int modelId;

	@Column(name="content_img_height")
	private int contentImgHeight;

	@Column(name="content_img_width")
	private int contentImgWidth;

	@Column(name="has_content")
	private byte hasContent;

	@Column(name="is_def")
	private byte isDef;

	@Column(name="is_disabled")
	private byte isDisabled;

	@Column(name="model_name")
	private String modelName;

	@Column(name="model_path")
	private String modelPath;

	private int priority;

	@Column(name="title_img_height")
	private int titleImgHeight;

	@Column(name="title_img_width")
	private int titleImgWidth;

	@Column(name="tpl_channel_prefix")
	private String tplChannelPrefix;

	@Column(name="tpl_content_prefix")
	private String tplContentPrefix;

	//bi-directional many-to-one association to BaseChannel
	@OneToMany(mappedBy="cmsModel")
	private List<BaseChannel> cmsChannels;

	public CmsModel() {
	}

	public int getModelId() {
		return this.modelId;
	}

	public void setModelId(int modelId) {
		this.modelId = modelId;
	}

	public int getContentImgHeight() {
		return this.contentImgHeight;
	}

	public void setContentImgHeight(int contentImgHeight) {
		this.contentImgHeight = contentImgHeight;
	}

	public int getContentImgWidth() {
		return this.contentImgWidth;
	}

	public void setContentImgWidth(int contentImgWidth) {
		this.contentImgWidth = contentImgWidth;
	}

	public byte getHasContent() {
		return this.hasContent;
	}

	public void setHasContent(byte hasContent) {
		this.hasContent = hasContent;
	}

	public byte getIsDef() {
		return this.isDef;
	}

	public void setIsDef(byte isDef) {
		this.isDef = isDef;
	}

	public byte getIsDisabled() {
		return this.isDisabled;
	}

	public void setIsDisabled(byte isDisabled) {
		this.isDisabled = isDisabled;
	}

	public String getModelName() {
		return this.modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getModelPath() {
		return this.modelPath;
	}

	public void setModelPath(String modelPath) {
		this.modelPath = modelPath;
	}

	public int getPriority() {
		return this.priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public int getTitleImgHeight() {
		return this.titleImgHeight;
	}

	public void setTitleImgHeight(int titleImgHeight) {
		this.titleImgHeight = titleImgHeight;
	}

	public int getTitleImgWidth() {
		return this.titleImgWidth;
	}

	public void setTitleImgWidth(int titleImgWidth) {
		this.titleImgWidth = titleImgWidth;
	}

	public String getTplChannelPrefix() {
		return this.tplChannelPrefix;
	}

	public void setTplChannelPrefix(String tplChannelPrefix) {
		this.tplChannelPrefix = tplChannelPrefix;
	}

	public String getTplContentPrefix() {
		return this.tplContentPrefix;
	}

	public void setTplContentPrefix(String tplContentPrefix) {
		this.tplContentPrefix = tplContentPrefix;
	}

	public List<BaseChannel> getCmsChannels() {
		return this.cmsChannels;
	}

	public void setCmsChannels(List<BaseChannel> cmsChannels) {
		this.cmsChannels = cmsChannels;
	}

}