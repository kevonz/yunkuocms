package com.yunkuo.cms.entity.assist.base;

import com.yunkuo.cms.entity.main.Channel;
import com.yunkuo.cms.entity.main.CmsSite;
import com.yunkuo.cms.entity.main.CmsUser;
import com.yunkuo.cms.entity.main.ContentType;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the cms_acquisition database table.
 * 
 */
/*@Entity
@Table(name="cms_acquisition")*/
@MappedSuperclass
public class BaseCmsAcquisition implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="acquisition_id")
	private Integer id;

	@Column(name="acq_name")
	private String name;

	@Column(name="content_end")
	private String contentEnd;

	@Column(name="content_start")
	private String contentStart;

	@Column(name="curr_item")
	private Integer currItem;

	@Column(name="curr_num")
	private Integer currNum;

	@Column(name="description_end")
	private String descriptionEnd;

	@Column(name="description_start")
	private String descriptionStart;

	@Column(name="dynamic_addr")
	private String dynamicAddr;

	@Column(name="dynamic_end")
	private Integer dynamicEnd;

	@Column(name="dynamic_start")
	private Integer dynamicStart;

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
	private Integer pauseTime;

	@Lob
	@Column(name="plan_list")
	private String planList;

	private Integer queue;

	@Column(name="repeat_check_type")
	private String repeatCheckType;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="start_time")
	private Date startTime;

	private Integer status;

	@Column(name="title_end")
	private String titleEnd;

	@Column(name="title_start")
	private String titleStart;

	@Column(name="total_item")
	private Integer totalItem;

	//bi-directional many-to-one association to BaseChannel
	@ManyToOne
	@JoinColumn(name="channel_id")
	private Channel channel;

	//bi-directional many-to-one association to CmsContentType
	@ManyToOne
	@JoinColumn(name="type_id")
	private ContentType type;

	//bi-directional many-to-one association to CmsSite
	@ManyToOne
	@JoinColumn(name="site_id")
	private CmsSite site;

	//bi-directional many-to-one association to CmsUser
	@ManyToOne
	@JoinColumn(name="user_id")
	private CmsUser user;

	//bi-directional many-to-one association to CmsAcquisitionHistory
/*	@OneToMany(mappedBy="cmsAcquisition")
	private List<CmsAcquisitionHistory> cmsAcquisitionHistories;*/

    // constructors
    public BaseCmsAcquisition () {
        initialize();
    }

    /**
     * Constructor for primary key
     */
    public BaseCmsAcquisition (java.lang.Integer id) {
        this.setId(id);
        initialize();
    }

    /**
     * Constructor for required fields
     */
    public BaseCmsAcquisition (
            java.lang.Integer id,
            com.yunkuo.cms.entity.main.CmsUser user,
            com.yunkuo.cms.entity.main.ContentType type,
            com.yunkuo.cms.entity.main.CmsSite site,
            com.yunkuo.cms.entity.main.Channel channel,
            java.lang.String name,
            java.lang.Integer status,
            java.lang.Integer currNum,
            java.lang.Integer currItem,
            java.lang.Integer totalItem,
            java.lang.Integer pauseTime,
            java.lang.String pageEncoding,
            java.lang.Integer queue) {

        this.setId(id);
        this.setUser(user);
        this.setType(type);
        this.setSite(site);
        this.setChannel(channel);
        this.setName(name);
        this.setStatus(status);
        this.setCurrNum(currNum);
        this.setCurrItem(currItem);
        this.setTotalItem(totalItem);
        this.setPauseTime(pauseTime);
        this.setPageEncoding(pageEncoding);
        this.setQueue(queue);
        initialize();
    }

    protected void initialize () {}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer acquisitionId) {
		this.id = acquisitionId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String acqName) {
		this.name = acqName;
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

	public Integer getCurrItem() {
		return this.currItem;
	}

	public void setCurrItem(Integer currItem) {
		this.currItem = currItem;
	}

	public Integer getCurrNum() {
		return this.currNum;
	}

	public void setCurrNum(Integer currNum) {
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

	public Integer getDynamicEnd() {
		return this.dynamicEnd;
	}

	public void setDynamicEnd(Integer dynamicEnd) {
		this.dynamicEnd = dynamicEnd;
	}

	public Integer getDynamicStart() {
		return this.dynamicStart;
	}

	public void setDynamicStart(Integer dynamicStart) {
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

	public Integer getPauseTime() {
		return this.pauseTime;
	}

	public void setPauseTime(Integer pauseTime) {
		this.pauseTime = pauseTime;
	}

	public String getPlanList() {
		return this.planList;
	}

	public void setPlanList(String planList) {
		this.planList = planList;
	}

	public Integer getQueue() {
		return this.queue;
	}

	public void setQueue(Integer queue) {
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

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
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

	public Integer getTotalItem() {
		return this.totalItem;
	}

	public void setTotalItem(Integer totalItem) {
		this.totalItem = totalItem;
	}

	public Channel getChannel() {
		return this.channel;
	}

	public void setChannel(Channel cmsChannel) {
		this.channel = cmsChannel;
	}

	public ContentType getType() {
		return this.type;
	}

	public void setType(ContentType cmsContentType) {
		this.type = cmsContentType;
	}

	public CmsSite getSite() {
		return this.site;
	}

	public void setSite(CmsSite cmsSite) {
		this.site = cmsSite;
	}

	public CmsUser getUser() {
		return this.user;
	}

	public void setUser(CmsUser cmsUser) {
		this.user = cmsUser;
	}
/*
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
	}*/

}