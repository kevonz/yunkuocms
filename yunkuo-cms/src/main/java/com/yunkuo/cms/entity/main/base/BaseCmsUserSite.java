package com.yunkuo.cms.entity.main.base;

import com.yunkuo.cms.entity.main.CmsSite;
import com.yunkuo.cms.entity.main.CmsUser;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the cms_user_site database table.
 * 
 */
/*@Entity
@Table(name="cms_user_site")*/
@MappedSuperclass
public class BaseCmsUserSite implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="usersite_id")
	private int id;

	@Column(name="check_step")
	private Byte checkStep;

	@Column(name="is_all_channel")
	private Boolean allChannel;

	//bi-directional many-to-one association to CmsUser
	@ManyToOne
	@JoinColumn(name="user_id")
	private CmsUser user;

	//bi-directional many-to-one association to CmsSite
	@ManyToOne
	@JoinColumn(name="site_id")
	private CmsSite site;

    // constructors
    public BaseCmsUserSite () {
        initialize();
    }

    /**
     * Constructor for primary key
     */
    public BaseCmsUserSite (java.lang.Integer id) {
        this.setId(id);
        initialize();
    }

    /**
     * Constructor for required fields
     */
    public BaseCmsUserSite (
            java.lang.Integer id,
            com.yunkuo.cms.entity.main.CmsUser user,
            com.yunkuo.cms.entity.main.CmsSite site,
            java.lang.Byte checkStep,
            java.lang.Boolean allChannel) {

        this.setId(id);
        this.setUser(user);
        this.setSite(site);
        this.setCheckStep(checkStep);
        this.setAllChannel(allChannel);
        initialize();
    }

    protected void initialize () {}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Byte getCheckStep() {
		return this.checkStep;
	}

	public void setCheckStep(Byte checkStep) {
		this.checkStep = checkStep;
	}

	public Boolean getAllChannel() {
		return this.allChannel;
	}

	public void setAllChannel(Boolean isAllChannel) {
		this.allChannel = isAllChannel;
	}

	public CmsUser getUser() {
		return this.user;
	}

	public void setUser(CmsUser cmsUser) {
		this.user = cmsUser;
	}

	public CmsSite getSite() {
		return this.site;
	}

	public void setSite(CmsSite cmsSite) {
		this.site = cmsSite;
	}

}