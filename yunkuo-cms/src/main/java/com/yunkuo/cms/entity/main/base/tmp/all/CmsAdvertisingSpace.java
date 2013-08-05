package com.yunkuo.cms.entity.main.base.tmp.all;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the cms_advertising_space database table.
 * 
 */
@Entity
@Table(name="cms_advertising_space")
public class CmsAdvertisingSpace implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="adspace_id")
	private int adspaceId;

	@Column(name="ad_name")
	private String adName;

	private String description;

	@Column(name="is_enabled")
	private String isEnabled;

	//bi-directional many-to-one association to CmsAdvertising
	@OneToMany(mappedBy="cmsAdvertisingSpace")
	private List<CmsAdvertising> cmsAdvertisings;

	//bi-directional many-to-one association to CmsSite
	@ManyToOne
	@JoinColumn(name="site_id")
	private CmsSite cmsSite;

	public CmsAdvertisingSpace() {
	}

	public int getAdspaceId() {
		return this.adspaceId;
	}

	public void setAdspaceId(int adspaceId) {
		this.adspaceId = adspaceId;
	}

	public String getAdName() {
		return this.adName;
	}

	public void setAdName(String adName) {
		this.adName = adName;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIsEnabled() {
		return this.isEnabled;
	}

	public void setIsEnabled(String isEnabled) {
		this.isEnabled = isEnabled;
	}

	public List<CmsAdvertising> getCmsAdvertisings() {
		return this.cmsAdvertisings;
	}

	public void setCmsAdvertisings(List<CmsAdvertising> cmsAdvertisings) {
		this.cmsAdvertisings = cmsAdvertisings;
	}

	public CmsAdvertising addCmsAdvertising(CmsAdvertising cmsAdvertising) {
		getCmsAdvertisings().add(cmsAdvertising);
		cmsAdvertising.setCmsAdvertisingSpace(this);

		return cmsAdvertising;
	}

	public CmsAdvertising removeCmsAdvertising(CmsAdvertising cmsAdvertising) {
		getCmsAdvertisings().remove(cmsAdvertising);
		cmsAdvertising.setCmsAdvertisingSpace(null);

		return cmsAdvertising;
	}

	public CmsSite getCmsSite() {
		return this.cmsSite;
	}

	public void setCmsSite(CmsSite cmsSite) {
		this.cmsSite = cmsSite;
	}

}