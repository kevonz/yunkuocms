package com.yunkuo.cms.entity.assist.base;

import com.yunkuo.cms.entity.assist.CmsFriendlinkCtg;
import com.yunkuo.cms.entity.main.CmsSite;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the cms_friendlink database table.
 * 
 */
/*@Entity
@Table(name="cms_friendlink")*/
@MappedSuperclass
public class BaseCmsFriendlink implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="friendlink_id")
	private Integer id;

	private String description;

	private String domain;

	private String email;

	@Column(name="is_enabled")
	private Boolean enabled;

	private String logo;

	private Integer priority;

	@Column(name="site_name")
	private String name;

	private Integer views;

	//bi-directional many-to-one association to CmsFriendlinkCtg
	@ManyToOne
	@JoinColumn(name="friendlinkctg_id")
	private CmsFriendlinkCtg category;

	//bi-directional many-to-one association to CmsSite
	@ManyToOne
	@JoinColumn(name="site_id")
	private CmsSite site;

    // constructors
    public BaseCmsFriendlink () {
        initialize();
    }

    /**
     * Constructor for primary key
     */
    public BaseCmsFriendlink (java.lang.Integer id) {
        this.setId(id);
        initialize();
    }

    /**
     * Constructor for required fields
     */
    public BaseCmsFriendlink (
            java.lang.Integer id,
            com.yunkuo.cms.entity.assist.CmsFriendlinkCtg category,
            com.yunkuo.cms.entity.main.CmsSite site,
            java.lang.String name,
            java.lang.String domain,
            java.lang.Integer views,
            java.lang.Integer priority,
            java.lang.Boolean enabled) {

        this.setId(id);
        this.setCategory(category);
        this.setSite(site);
        this.setName(name);
        this.setDomain(domain);
        this.setViews(views);
        this.setPriority(priority);
        this.setEnabled(enabled);
        initialize();
    }

    protected void initialize () {}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer friendlinkId) {
		this.id = friendlinkId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean isEnabled) {
		this.enabled = isEnabled;
	}

	public String getLogo() {
		return this.logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String siteName) {
		this.name = siteName;
	}

	public Integer getViews() {
		return this.views;
	}

	public void setViews(Integer views) {
		this.views = views;
	}

	public CmsFriendlinkCtg getCategory() {
		return this.category;
	}

	public void setCategory(CmsFriendlinkCtg cmsFriendlinkCtg) {
		this.category = cmsFriendlinkCtg;
	}

	public CmsSite getSite() {
		return this.site;
	}

	public void setSite(CmsSite cmsSite) {
		this.site = cmsSite;
	}

}