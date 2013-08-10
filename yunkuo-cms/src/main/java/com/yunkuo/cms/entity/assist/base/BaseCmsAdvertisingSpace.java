package com.yunkuo.cms.entity.assist.base;

import com.yunkuo.cms.entity.assist.CmsAdvertising;
import com.yunkuo.cms.entity.main.CmsSite;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


/**
 * The persistent class for the cms_advertising_space database table.
 * 
 */
/*@Entity
@Table(name="cms_advertising_space")*/
@MappedSuperclass
public class BaseCmsAdvertisingSpace implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="adspace_id")
	private Integer id;

	@Column(name="ad_name")
	private String name;

	private String description;

	@Column(name="is_enabled")
	private Boolean enabled;

	//bi-directional many-to-one association to CmsAdvertising
/*	@OneToMany(mappedBy="cmsAdvertisingSpace")
	private List<CmsAdvertising> cmsAdvertisings;*/

	//bi-directional many-to-one association to CmsSite
	@ManyToOne
	@JoinColumn(name="site_id")
	private CmsSite site;

    // constructors
    public BaseCmsAdvertisingSpace () {
        initialize();
    }

    /**
     * Constructor for primary key
     */
    public BaseCmsAdvertisingSpace (Integer id) {
        this.setId(id);
        initialize();
    }

    /**
     * Constructor for required fields
     */
    public BaseCmsAdvertisingSpace (
            java.lang.Integer id,
            CmsSite site,
            java.lang.String name,
            java.lang.Boolean enabled) {

        this.setId(id);
        this.setSite(site);
        this.setName(name);
        this.setEnabled(enabled);
        initialize();
    }

    protected void initialize () {}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer adspaceId) {
		this.id = adspaceId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String adName) {
		this.name = adName;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean isEnabled) {
		this.enabled = isEnabled;
	}
/*
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
*/

	public CmsSite getSite() {
		return this.site;
	}

	public void setSite(CmsSite cmsSite) {
		this.site = cmsSite;
	}

}