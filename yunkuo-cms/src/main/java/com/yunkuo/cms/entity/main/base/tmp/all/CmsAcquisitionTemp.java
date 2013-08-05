package com.yunkuo.cms.entity.main.base.tmp.all;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cms_acquisition_temp database table.
 * 
 */
@Entity
@Table(name="cms_acquisition_temp")
public class CmsAcquisitionTemp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="temp_id")
	private int tempId;

	@Column(name="channel_url")
	private String channelUrl;

	@Column(name="content_url")
	private String contentUrl;

	private String description;

	private int percent;

	private int seq;

	private String title;

	//bi-directional many-to-one association to CmsSite
	@ManyToOne
	@JoinColumn(name="site_id")
	private CmsSite cmsSite;

	public CmsAcquisitionTemp() {
	}

	public int getTempId() {
		return this.tempId;
	}

	public void setTempId(int tempId) {
		this.tempId = tempId;
	}

	public String getChannelUrl() {
		return this.channelUrl;
	}

	public void setChannelUrl(String channelUrl) {
		this.channelUrl = channelUrl;
	}

	public String getContentUrl() {
		return this.contentUrl;
	}

	public void setContentUrl(String contentUrl) {
		this.contentUrl = contentUrl;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPercent() {
		return this.percent;
	}

	public void setPercent(int percent) {
		this.percent = percent;
	}

	public int getSeq() {
		return this.seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public CmsSite getCmsSite() {
		return this.cmsSite;
	}

	public void setCmsSite(CmsSite cmsSite) {
		this.cmsSite = cmsSite;
	}

}