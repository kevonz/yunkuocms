package com.yunkuo.cms.entity.assist.base;

import com.yunkuo.cms.entity.assist.CmsAdvertisingSpace;
import com.yunkuo.cms.entity.main.CmsSite;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


/**
 * The persistent class for the cms_advertising database table.
 * 
 */
/*@Entity
@Table(name="cms_advertising")*/
@MappedSuperclass
public class BaseCmsAdvertising implements Serializable {
	private static final long serialVersionUID = 1L;
    public static String PROP_CODE = "code";

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="advertising_id")
	private Integer id;

	@Lob
	@Column(name="ad_code")
	private String code;

	@Column(name="ad_name")
	private String name;

	@Column(name="ad_weight")
	private Integer weight;

	private String category;

	@Column(name="click_count")
	private Long clickCount;

	@Column(name="display_count")
	private Long displayCount;

	@Temporal(TemporalType.DATE)
	@Column(name="end_time")
	private Date endTime;

	@Column(name="is_enabled")
	private Boolean enabled;

	@Temporal(TemporalType.DATE)
	@Column(name="start_time")
	private Date startTime;

	//bi-directional many-to-one association to CmsSite
	@ManyToOne
	@JoinColumn(name="site_id")
	private CmsSite site;

	//bi-directional many-to-one association to CmsAdvertisingSpace
	@ManyToOne
	@JoinColumn(name="adspace_id")
	private CmsAdvertisingSpace adspace;

	//bi-directional many-to-one association to CmsAdvertisingAttr
/*
	@OneToMany(mappedBy="cmsAdvertising")
	private List<CmsAdvertisingAttr> attr;
*/

    public Map<String, String> getAttr() {
        return attr;
    }

    public void setAttr(Map<String, String> attr) {
        this.attr = attr;
    }

    @ElementCollection
    @CollectionTable(name="cms_advertising_attr" , joinColumns = @JoinColumn(name="advertising_id"))
    @MapKeyColumn(name="attr_name")
    @Column(name="attr_value")
    private Map<String,String> attr = new HashMap<String, String>();


    // constructors
    public BaseCmsAdvertising () {
        initialize();
    }

    /**
     * Constructor for primary key
     */
    public BaseCmsAdvertising (Integer id) {
        this.setId(id);
        initialize();
    }

    /**
     * Constructor for required fields
     */
    public BaseCmsAdvertising (
            java.lang.Integer id,
            CmsAdvertisingSpace adspace,
            CmsSite site,
            java.lang.String name,
            java.lang.String category,
            java.lang.Integer weight,
            java.lang.Long displayCount,
            java.lang.Long clickCount,
            java.lang.Boolean enabled) {

        this.setId(id);
        this.setAdspace(adspace);
        this.setSite(site);
        this.setName(name);
        this.setCategory(category);
        this.setWeight(weight);
        this.setDisplayCount(displayCount);
        this.setClickCount(clickCount);
        this.setEnabled(enabled);
        initialize();
    }

    protected void initialize () {}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer advertisingId) {
		this.id = advertisingId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String adCode) {
		this.code = adCode;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String adName) {
		this.name = adName;
	}

	public Integer getWeight() {
		return this.weight;
	}

	public void setWeight(Integer adWeight) {
		this.weight = adWeight;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Long getClickCount() {
		return this.clickCount;
	}

	public void setClickCount(Long clickCount) {
		this.clickCount = clickCount;
	}

	public Long getDisplayCount() {
		return this.displayCount;
	}

	public void setDisplayCount(Long displayCount) {
		this.displayCount = displayCount;
	}

	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean isEnabled) {
		this.enabled = isEnabled;
	}

	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public CmsSite getSite() {
		return this.site;
	}

	public void setSite(CmsSite cmsSite) {
		this.site = cmsSite;
	}

	public CmsAdvertisingSpace getAdspace() {
		return this.adspace;
	}

	public void setAdspace(CmsAdvertisingSpace cmsAdvertisingSpace) {
		this.adspace = cmsAdvertisingSpace;
	}

	/*public List<CmsAdvertisingAttr> getAttr() {
		return this.attr;
	}

	public void setAttr(List<CmsAdvertisingAttr> cmsAdvertisingAttrs) {
		this.attr = cmsAdvertisingAttrs;
	}

	public CmsAdvertisingAttr addCmsAdvertisingAttr(CmsAdvertisingAttr cmsAdvertisingAttr) {
		getAttr().add(cmsAdvertisingAttr);
		cmsAdvertisingAttr.setCmsAdvertising((CmsAdvertising)this);

		return cmsAdvertisingAttr;
	}

	public CmsAdvertisingAttr removeCmsAdvertisingAttr(CmsAdvertisingAttr cmsAdvertisingAttr) {
		getAttr().remove(cmsAdvertisingAttr);
		cmsAdvertisingAttr.setCmsAdvertising(null);

		return cmsAdvertisingAttr;
	}
*/
}