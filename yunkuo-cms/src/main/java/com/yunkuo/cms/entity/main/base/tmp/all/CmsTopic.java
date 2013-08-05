package com.yunkuo.cms.entity.main.base.tmp.all;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the cms_topic database table.
 * 
 */
@Entity
@Table(name="cms_topic")
public class CmsTopic implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="topic_id")
	private int topicId;

	@Column(name="content_img")
	private String contentImg;

	private String description;

	@Column(name="is_recommend")
	private byte isRecommend;

	private String keywords;

	private int priority;

	@Column(name="short_name")
	private String shortName;

	@Column(name="title_img")
	private String titleImg;

	@Column(name="topic_name")
	private String topicName;

	@Column(name="tpl_content")
	private String tplContent;

	//bi-directional many-to-many association to CmsContent
	@ManyToMany(mappedBy="cmsTopics")
	private List<CmsContent> cmsContents;

	//bi-directional many-to-one association to BaseChannel
	@ManyToOne
	@JoinColumn(name="channel_id")
	private BaseChannel cmsChannel;

	public CmsTopic() {
	}

	public int getTopicId() {
		return this.topicId;
	}

	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}

	public String getContentImg() {
		return this.contentImg;
	}

	public void setContentImg(String contentImg) {
		this.contentImg = contentImg;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte getIsRecommend() {
		return this.isRecommend;
	}

	public void setIsRecommend(byte isRecommend) {
		this.isRecommend = isRecommend;
	}

	public String getKeywords() {
		return this.keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public int getPriority() {
		return this.priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getShortName() {
		return this.shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getTitleImg() {
		return this.titleImg;
	}

	public void setTitleImg(String titleImg) {
		this.titleImg = titleImg;
	}

	public String getTopicName() {
		return this.topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public String getTplContent() {
		return this.tplContent;
	}

	public void setTplContent(String tplContent) {
		this.tplContent = tplContent;
	}

	public List<CmsContent> getCmsContents() {
		return this.cmsContents;
	}

	public void setCmsContents(List<CmsContent> cmsContents) {
		this.cmsContents = cmsContents;
	}

	public BaseChannel getCmsChannel() {
		return this.cmsChannel;
	}

	public void setCmsChannel(BaseChannel cmsChannel) {
		this.cmsChannel = cmsChannel;
	}

}