package com.yunkuo.cms.entity.main.base.tmp.all;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the cms_acquisition database table.
 * 
 */
@Entity
@Table(name="cms_acquisition")
public class CmsAcquisition implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="acquisition_id")
	private int acquisitionId;

	@Column(name="acq_name")
	private String acqName;

	@Column(name="content_end")
	private String contentEnd;

	@Column(name="content_start")
	private String contentStart;

	@Column(name="curr_item")
	private int currItem;

	@Column(name="curr_num")
	private int currNum;

	@Column(name="description_end")
	private String descriptionEnd;

	@Column(name="description_start")
	private String descriptionStart;

	@Column(name="dynamic_addr")
	private String dynamicAddr;

	@Column(name="dynamic_end")
	private int dynamicEnd;

	@Column(name="dynamic_start")
	private int dynamicStart;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="end_time")
	private Date endTime;

	@Column(name="keywords_end")
	private String keywordsEnd;

	@Column(name="keywords_start")
	private String keywordsStart;

	@Column(name="link_end")
	private String linkEnd;

	@Column(name="link_start")
	private String linkStart;

	@Column(name="linkset_end")
	private String linksetEnd;

	@Column(name="linkset_start")
	private String linksetStart;

	@Column(name="page_encoding")
	private String pageEncoding;

	@Column(name="pagination_end")
	private String paginationEnd;

	@Column(name="pagination_start")
	private String paginationStart;

	@Column(name="pause_time")
	private int pauseTime;

	@Lob
	@Column(name="plan_list")
	private String planList;

	private int queue;

	@Column(name="repeat_check_type")
	private String repeatCheckType;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="start_time")
	private Date startTime;

	private int status;

	@Column(name="title_end")
	private String titleEnd;

	@Column(name="title_start")
	private String titleStart;

	@Column(name="total_item")
	private int totalItem;

	//bi-directional many-to-one association to BaseChannel
	@ManyToOne
	@JoinColumn(name="channel_id")
	private BaseChannel cmsChannel;

	//bi-directional many-to-one association to CmsContentType
	@ManyToOne
	@JoinColumn(name="type_id")
	private CmsContentType cmsContentType;

	//bi-directional many-to-one association to CmsSite
	@ManyToOne
	@JoinColumn(name="site_id")
	private CmsSite cmsSite;

	//bi-directional many-to-one association to CmsUser
	@ManyToOne
	@JoinColumn(name="user_id")
	private CmsUser cmsUser;

	//bi-directional many-to-one association to CmsAcquisitionHistory
	@OneToMany(mappedBy="cmsAcquisition")
	private List<CmsAcquisitionHistory> cmsAcquisitionHistories;

	public CmsAcquisition() {
	}

	public int getAcquisitionId() {
		return this.acquisitionId;
	}

	public void setAcquisitionId(int acquisitionId) {
		this.acquisitionId = acquisitionId;
	}

	public String getAcqName() {
		return this.acqName;
	}

	public void setAcqName(String acqName) {
		this.acqName = acqName;
	}

	public String getContentEnd() {
		return this.contentEnd;
	}

	public void setContentEnd(String contentEnd) {
		this.contentEnd = contentEnd;
	}

	public String getContentStart() {
		return this.contentStart;
	}

	public void setContentStart(String contentStart) {
		this.contentStart = contentStart;
	}

	public int getCurrItem() {
		return this.currItem;
	}

	public void setCurrItem(int currItem) {
		this.currItem = currItem;
	}

	public int getCurrNum() {
		return this.currNum;
	}

	public void setCurrNum(int currNum) {
		this.currNum = currNum;
	}

	public String getDescriptionEnd() {
		return this.descriptionEnd;
	}

	public void setDescriptionEnd(String descriptionEnd) {
		this.descriptionEnd = descriptionEnd;
	}

	public String getDescriptionStart() {
		return this.descriptionStart;
	}

	public void setDescriptionStart(String descriptionStart) {
		this.descriptionStart = descriptionStart;
	}

	public String getDynamicAddr() {
		return this.dynamicAddr;
	}

	public void setDynamicAddr(String dynamicAddr) {
		this.dynamicAddr = dynamicAddr;
	}

	public int getDynamicEnd() {
		return this.dynamicEnd;
	}

	public void setDynamicEnd(int dynamicEnd) {
		this.dynamicEnd = dynamicEnd;
	}

	public int getDynamicStart() {
		return this.dynamicStart;
	}

	public void setDynamicStart(int dynamicStart) {
		this.dynamicStart = dynamicStart;
	}

	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getKeywordsEnd() {
		return this.keywordsEnd;
	}

	public void setKeywordsEnd(String keywordsEnd) {
		this.keywordsEnd = keywordsEnd;
	}

	public String getKeywordsStart() {
		return this.keywordsStart;
	}

	public void setKeywordsStart(String keywordsStart) {
		this.keywordsStart = keywordsStart;
	}

	public String getLinkEnd() {
		return this.linkEnd;
	}

	public void setLinkEnd(String linkEnd) {
		this.linkEnd = linkEnd;
	}

	public String getLinkStart() {
		return this.linkStart;
	}

	public void setLinkStart(String linkStart) {
		this.linkStart = linkStart;
	}

	public String getLinksetEnd() {
		return this.linksetEnd;
	}

	public void setLinksetEnd(String linksetEnd) {
		this.linksetEnd = linksetEnd;
	}

	public String getLinksetStart() {
		return this.linksetStart;
	}

	public void setLinksetStart(String linksetStart) {
		this.linksetStart = linksetStart;
	}

	public String getPageEncoding() {
		return this.pageEncoding;
	}

	public void setPageEncoding(String pageEncoding) {
		this.pageEncoding = pageEncoding;
	}

	public String getPaginationEnd() {
		return this.paginationEnd;
	}

	public void setPaginationEnd(String paginationEnd) {
		this.paginationEnd = paginationEnd;
	}

	public String getPaginationStart() {
		return this.paginationStart;
	}

	public void setPaginationStart(String paginationStart) {
		this.paginationStart = paginationStart;
	}

	public int getPauseTime() {
		return this.pauseTime;
	}

	public void setPauseTime(int pauseTime) {
		this.pauseTime = pauseTime;
	}

	public String getPlanList() {
		return this.planList;
	}

	public void setPlanList(String planList) {
		this.planList = planList;
	}

	public int getQueue() {
		return this.queue;
	}

	public void setQueue(int queue) {
		this.queue = queue;
	}

	public String getRepeatCheckType() {
		return this.repeatCheckType;
	}

	public void setRepeatCheckType(String repeatCheckType) {
		this.repeatCheckType = repeatCheckType;
	}

	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getTitleEnd() {
		return this.titleEnd;
	}

	public void setTitleEnd(String titleEnd) {
		this.titleEnd = titleEnd;
	}

	public String getTitleStart() {
		return this.titleStart;
	}

	public void setTitleStart(String titleStart) {
		this.titleStart = titleStart;
	}

	public int getTotalItem() {
		return this.totalItem;
	}

	public void setTotalItem(int totalItem) {
		this.totalItem = totalItem;
	}

	public BaseChannel getCmsChannel() {
		return this.cmsChannel;
	}

	public void setCmsChannel(BaseChannel cmsChannel) {
		this.cmsChannel = cmsChannel;
	}

	public CmsContentType getCmsContentType() {
		return this.cmsContentType;
	}

	public void setCmsContentType(CmsContentType cmsContentType) {
		this.cmsContentType = cmsContentType;
	}

	public CmsSite getCmsSite() {
		return this.cmsSite;
	}

	public void setCmsSite(CmsSite cmsSite) {
		this.cmsSite = cmsSite;
	}

	public CmsUser getCmsUser() {
		return this.cmsUser;
	}

	public void setCmsUser(CmsUser cmsUser) {
		this.cmsUser = cmsUser;
	}

	public List<CmsAcquisitionHistory> getCmsAcquisitionHistories() {
		return this.cmsAcquisitionHistories;
	}

	public void setCmsAcquisitionHistories(List<CmsAcquisitionHistory> cmsAcquisitionHistories) {
		this.cmsAcquisitionHistories = cmsAcquisitionHistories;
	}

	public CmsAcquisitionHistory addCmsAcquisitionHistory(CmsAcquisitionHistory cmsAcquisitionHistory) {
		getCmsAcquisitionHistories().add(cmsAcquisitionHistory);
		cmsAcquisitionHistory.setCmsAcquisition(this);

		return cmsAcquisitionHistory;
	}

	public CmsAcquisitionHistory removeCmsAcquisitionHistory(CmsAcquisitionHistory cmsAcquisitionHistory) {
		getCmsAcquisitionHistories().remove(cmsAcquisitionHistory);
		cmsAcquisitionHistory.setCmsAcquisition(null);

		return cmsAcquisitionHistory;
	}

}