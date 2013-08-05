package com.yunkuo.cms.entity.main.base.tmp.all;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the cms_advertising database table.
 * 
 */
@Entity
@Table(name="cms_advertising")
public class CmsAdvertising implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="advertising_id")
	private int advertisingId;

	@Lob
	@Column(name="ad_code")
	private String adCode;

	@Column(name="ad_name")
	private String adName;

	@Column(name="ad_weight")
	private int adWeight;

	private String category;

	@Column(name="click_count")
	private BigInteger clickCount;

	@Column(name="display_count")
	private BigInteger displayCount;

	@Temporal(TemporalType.DATE)
	@Column(name="end_time")
	private Date endTime;

	@Column(name="is_enabled")
	private String isEnabled;

	@Temporal(TemporalType.DATE)
	@Column(name="start_time")
	private Date startTime;

	//bi-directional many-to-one association to CmsSite
	@ManyToOne
	@JoinColumn(name="site_id")
	private CmsSite cmsSite;

	//bi-directional many-to-one association to CmsAdvertisingSpace
	@ManyToOne
	@JoinColumn(name="adspace_id")
	private CmsAdvertisingSpace cmsAdvertisingSpace;

	//bi-directional many-to-one association to CmsAdvertisingAttr
	@OneToMany(mappedBy="cmsAdvertising")
	private List<CmsAdvertisingAttr> cmsAdvertisingAttrs;

	public CmsAdvertising() {
	}

	public int getAdvertisingId() {
		return this.advertisingId;
	}

	public void setAdvertisingId(int advertisingId) {
		this.advertisingId = advertisingId;
	}

	public String getAdCode() {
		return this.adCode;
	}

	public void setAdCode(String adCode) {
		this.adCode = adCode;
	}

	public String getAdName() {
		return this.adName;
	}

	public void setAdName(String adName) {
		this.adName = adName;
	}

	public int getAdWeight() {
		return this.adWeight;
	}

	public void setAdWeight(int adWeight) {
		this.adWeight = adWeight;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public BigInteger getClickCount() {
		return this.clickCount;
	}

	public void setClickCount(BigInteger clickCount) {
		this.clickCount = clickCount;
	}

	public BigInteger getDisplayCount() {
		return this.displayCount;
	}

	public void setDisplayCount(BigInteger displayCount) {
		this.displayCount = displayCount;
	}

	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getIsEnabled() {
		return this.isEnabled;
	}

	public void setIsEnabled(String isEnabled) {
		this.isEnabled = isEnabled;
	}

	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public CmsSite getCmsSite() {
		return this.cmsSite;
	}

	public void setCmsSite(CmsSite cmsSite) {
		this.cmsSite = cmsSite;
	}

	public CmsAdvertisingSpace getCmsAdvertisingSpace() {
		return this.cmsAdvertisingSpace;
	}

	public void setCmsAdvertisingSpace(CmsAdvertisingSpace cmsAdvertisingSpace) {
		this.cmsAdvertisingSpace = cmsAdvertisingSpace;
	}

	public List<CmsAdvertisingAttr> getCmsAdvertisingAttrs() {
		return this.cmsAdvertisingAttrs;
	}

	public void setCmsAdvertisingAttrs(List<CmsAdvertisingAttr> cmsAdvertisingAttrs) {
		this.cmsAdvertisingAttrs = cmsAdvertisingAttrs;
	}

	public CmsAdvertisingAttr addCmsAdvertisingAttr(CmsAdvertisingAttr cmsAdvertisingAttr) {
		getCmsAdvertisingAttrs().add(cmsAdvertisingAttr);
		cmsAdvertisingAttr.setCmsAdvertising(this);

		return cmsAdvertisingAttr;
	}

	public CmsAdvertisingAttr removeCmsAdvertisingAttr(CmsAdvertisingAttr cmsAdvertisingAttr) {
		getCmsAdvertisingAttrs().remove(cmsAdvertisingAttr);
		cmsAdvertisingAttr.setCmsAdvertising(null);

		return cmsAdvertisingAttr;
	}

}