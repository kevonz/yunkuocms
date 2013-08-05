package com.yunkuo.cms.entity.main.base.tmp.all;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cms_channel_ext database table.
 * 
 */
@Entity
@Table(name="cms_channel_ext")
public class CmsChannelExt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="channel_id")
	private int channelId;

	@Column(name="after_check")
	private byte afterCheck;

	@Column(name="allow_updown")
	private byte allowUpdown;

	@Column(name="channel_name")
	private String channelName;

	@Column(name="channel_rule")
	private String channelRule;

	@Column(name="comment_control")
	private int commentControl;

	@Column(name="content_img")
	private String contentImg;

	@Column(name="content_img_height")
	private int contentImgHeight;

	@Column(name="content_img_width")
	private int contentImgWidth;

	@Column(name="content_rule")
	private String contentRule;

	private String description;

	@Column(name="final_step")
	private byte finalStep;

	@Column(name="has_content_img")
	private byte hasContentImg;

	@Column(name="has_title_img")
	private byte hasTitleImg;

	@Column(name="is_access_by_dir")
	private String isAccessByDir;

	@Column(name="is_blank")
	private byte isBlank;

	@Column(name="is_list_child")
	private String isListChild;

	@Column(name="is_static_channel")
	private String isStaticChannel;

	@Column(name="is_static_content")
	private String isStaticContent;

	private String keywords;

	private String link;

	@Column(name="page_size")
	private int pageSize;

	private String title;

	@Column(name="title_img")
	private String titleImg;

	@Column(name="title_img_height")
	private int titleImgHeight;

	@Column(name="title_img_width")
	private int titleImgWidth;

	@Column(name="tpl_channel")
	private String tplChannel;

	@Column(name="tpl_content")
	private String tplContent;

	public CmsChannelExt() {
	}

	public int getChannelId() {
		return this.channelId;
	}

	public void setChannelId(int channelId) {
		this.channelId = channelId;
	}

	public byte getAfterCheck() {
		return this.afterCheck;
	}

	public void setAfterCheck(byte afterCheck) {
		this.afterCheck = afterCheck;
	}

	public byte getAllowUpdown() {
		return this.allowUpdown;
	}

	public void setAllowUpdown(byte allowUpdown) {
		this.allowUpdown = allowUpdown;
	}

	public String getChannelName() {
		return this.channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public String getChannelRule() {
		return this.channelRule;
	}

	public void setChannelRule(String channelRule) {
		this.channelRule = channelRule;
	}

	public int getCommentControl() {
		return this.commentControl;
	}

	public void setCommentControl(int commentControl) {
		this.commentControl = commentControl;
	}

	public String getContentImg() {
		return this.contentImg;
	}

	public void setContentImg(String contentImg) {
		this.contentImg = contentImg;
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

	public String getContentRule() {
		return this.contentRule;
	}

	public void setContentRule(String contentRule) {
		this.contentRule = contentRule;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte getFinalStep() {
		return this.finalStep;
	}

	public void setFinalStep(byte finalStep) {
		this.finalStep = finalStep;
	}

	public byte getHasContentImg() {
		return this.hasContentImg;
	}

	public void setHasContentImg(byte hasContentImg) {
		this.hasContentImg = hasContentImg;
	}

	public byte getHasTitleImg() {
		return this.hasTitleImg;
	}

	public void setHasTitleImg(byte hasTitleImg) {
		this.hasTitleImg = hasTitleImg;
	}

	public String getIsAccessByDir() {
		return this.isAccessByDir;
	}

	public void setIsAccessByDir(String isAccessByDir) {
		this.isAccessByDir = isAccessByDir;
	}

	public byte getIsBlank() {
		return this.isBlank;
	}

	public void setIsBlank(byte isBlank) {
		this.isBlank = isBlank;
	}

	public String getIsListChild() {
		return this.isListChild;
	}

	public void setIsListChild(String isListChild) {
		this.isListChild = isListChild;
	}

	public String getIsStaticChannel() {
		return this.isStaticChannel;
	}

	public void setIsStaticChannel(String isStaticChannel) {
		this.isStaticChannel = isStaticChannel;
	}

	public String getIsStaticContent() {
		return this.isStaticContent;
	}

	public void setIsStaticContent(String isStaticContent) {
		this.isStaticContent = isStaticContent;
	}

	public String getKeywords() {
		return this.keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getLink() {
		return this.link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public int getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitleImg() {
		return this.titleImg;
	}

	public void setTitleImg(String titleImg) {
		this.titleImg = titleImg;
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

	public String getTplChannel() {
		return this.tplChannel;
	}

	public void setTplChannel(String tplChannel) {
		this.tplChannel = tplChannel;
	}

	public String getTplContent() {
		return this.tplContent;
	}

	public void setTplContent(String tplContent) {
		this.tplContent = tplContent;
	}

}