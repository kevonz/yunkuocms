package com.yunkuo.cms.entity.main.base.tmp.all;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cms_acquisition_history database table.
 * 
 */
@Entity
@Table(name="cms_acquisition_history")
public class CmsAcquisitionHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="history_id")
	private int historyId;

	@Column(name="channel_url")
	private String channelUrl;

	@Column(name="content_id")
	private int contentId;

	@Column(name="content_url")
	private String contentUrl;

	private String description;

	private String title;

	//bi-directional many-to-one association to CmsAcquisition
	@ManyToOne
	@JoinColumn(name="acquisition_id")
	private CmsAcquisition cmsAcquisition;

	public CmsAcquisitionHistory() {
	}

	public int getHistoryId() {
		return this.historyId;
	}

	public void setHistoryId(int historyId) {
		this.historyId = historyId;
	}

	public String getChannelUrl() {
		return this.channelUrl;
	}

	public void setChannelUrl(String channelUrl) {
		this.channelUrl = channelUrl;
	}

	public int getContentId() {
		return this.contentId;
	}

	public void setContentId(int contentId) {
		this.contentId = contentId;
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

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public CmsAcquisition getCmsAcquisition() {
		return this.cmsAcquisition;
	}

	public void setCmsAcquisition(CmsAcquisition cmsAcquisition) {
		this.cmsAcquisition = cmsAcquisition;
	}

}