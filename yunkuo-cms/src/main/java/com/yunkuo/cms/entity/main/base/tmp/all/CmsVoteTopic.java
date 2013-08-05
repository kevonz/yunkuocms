package com.yunkuo.cms.entity.main.base.tmp.all;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the cms_vote_topic database table.
 * 
 */
@Entity
@Table(name="cms_vote_topic")
public class CmsVoteTopic implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="votetopic_id")
	private int votetopicId;

	private String description;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="end_time")
	private Date endTime;

	@Column(name="is_def")
	private byte isDef;

	@Column(name="is_disabled")
	private byte isDisabled;

	@Column(name="is_restrict_cookie")
	private byte isRestrictCookie;

	@Column(name="is_restrict_ip")
	private byte isRestrictIp;

	@Column(name="is_restrict_member")
	private byte isRestrictMember;

	@Column(name="multi_select")
	private int multiSelect;

	@Column(name="repeate_hour")
	private int repeateHour;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="start_time")
	private Date startTime;

	private String title;

	@Column(name="total_count")
	private int totalCount;

	//bi-directional many-to-one association to CmsVoteItem
	@OneToMany(mappedBy="cmsVoteTopic")
	private List<CmsVoteItem> cmsVoteItems;

	//bi-directional many-to-one association to CmsVoteRecord
	@OneToMany(mappedBy="cmsVoteTopic")
	private List<CmsVoteRecord> cmsVoteRecords;

	//bi-directional many-to-one association to CmsSite
	@ManyToOne
	@JoinColumn(name="site_id")
	private CmsSite cmsSite;

	public CmsVoteTopic() {
	}

	public int getVotetopicId() {
		return this.votetopicId;
	}

	public void setVotetopicId(int votetopicId) {
		this.votetopicId = votetopicId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
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

	public byte getIsRestrictCookie() {
		return this.isRestrictCookie;
	}

	public void setIsRestrictCookie(byte isRestrictCookie) {
		this.isRestrictCookie = isRestrictCookie;
	}

	public byte getIsRestrictIp() {
		return this.isRestrictIp;
	}

	public void setIsRestrictIp(byte isRestrictIp) {
		this.isRestrictIp = isRestrictIp;
	}

	public byte getIsRestrictMember() {
		return this.isRestrictMember;
	}

	public void setIsRestrictMember(byte isRestrictMember) {
		this.isRestrictMember = isRestrictMember;
	}

	public int getMultiSelect() {
		return this.multiSelect;
	}

	public void setMultiSelect(int multiSelect) {
		this.multiSelect = multiSelect;
	}

	public int getRepeateHour() {
		return this.repeateHour;
	}

	public void setRepeateHour(int repeateHour) {
		this.repeateHour = repeateHour;
	}

	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public List<CmsVoteItem> getCmsVoteItems() {
		return this.cmsVoteItems;
	}

	public void setCmsVoteItems(List<CmsVoteItem> cmsVoteItems) {
		this.cmsVoteItems = cmsVoteItems;
	}

	public CmsVoteItem addCmsVoteItem(CmsVoteItem cmsVoteItem) {
		getCmsVoteItems().add(cmsVoteItem);
		cmsVoteItem.setCmsVoteTopic(this);

		return cmsVoteItem;
	}

	public CmsVoteItem removeCmsVoteItem(CmsVoteItem cmsVoteItem) {
		getCmsVoteItems().remove(cmsVoteItem);
		cmsVoteItem.setCmsVoteTopic(null);

		return cmsVoteItem;
	}

	public List<CmsVoteRecord> getCmsVoteRecords() {
		return this.cmsVoteRecords;
	}

	public void setCmsVoteRecords(List<CmsVoteRecord> cmsVoteRecords) {
		this.cmsVoteRecords = cmsVoteRecords;
	}

	public CmsVoteRecord addCmsVoteRecord(CmsVoteRecord cmsVoteRecord) {
		getCmsVoteRecords().add(cmsVoteRecord);
		cmsVoteRecord.setCmsVoteTopic(this);

		return cmsVoteRecord;
	}

	public CmsVoteRecord removeCmsVoteRecord(CmsVoteRecord cmsVoteRecord) {
		getCmsVoteRecords().remove(cmsVoteRecord);
		cmsVoteRecord.setCmsVoteTopic(null);

		return cmsVoteRecord;
	}

	public CmsSite getCmsSite() {
		return this.cmsSite;
	}

	public void setCmsSite(CmsSite cmsSite) {
		this.cmsSite = cmsSite;
	}

}