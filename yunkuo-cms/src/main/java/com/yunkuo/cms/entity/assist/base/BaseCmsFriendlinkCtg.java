package com.yunkuo.cms.entity.assist.base;

import com.yunkuo.cms.entity.main.CmsSite;

import javax.persistence.*;
import java.io.Serializable;

/**
 * The persistent class for the cms_friendlink_ctg database table.
 * 
 */
/*@Entity
@Table(name="cms_friendlink_ctg")*/
@MappedSuperclass
public class BaseCmsFriendlinkCtg implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="friendlinkctg_id")
	private Integer id;

	@Column(name="friendlinkctg_name")
	private String name;

	private Integer priority;

	//bi-directional many-to-one association to CmsFriendlink
/*	@OneToMany(mappedBy="cmsFriendlinkCtg")
	private List<CmsFriendlink> cmsFriendlinks;*/

	//bi-directional many-to-one association to CmsSite
	@ManyToOne
	@JoinColumn(name="site_id")
	private CmsSite site;

    // constructors
    public BaseCmsFriendlinkCtg () {
        initialize();
    }

    /**
     * Constructor for primary key
     */
    public BaseCmsFriendlinkCtg (java.lang.Integer id) {
        this.setId(id);
        initialize();
    }

    /**
     * Constructor for required fields
     */
    public BaseCmsFriendlinkCtg (
            java.lang.Integer id,
            com.yunkuo.cms.entity.main.CmsSite site,
            java.lang.String name,
            java.lang.Integer priority) {

        this.setId(id);
        this.setSite(site);
        this.setName(name);
        this.setPriority(priority);
        initialize();
    }

    protected void initialize () {}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	/*public List<CmsFriendlink> getCmsFriendlinks() {
		return this.cmsFriendlinks;
	}

	public void setCmsFriendlinks(List<CmsFriendlink> cmsFriendlinks) {
		this.cmsFriendlinks = cmsFriendlinks;
	}

	public CmsFriendlink addCmsFriendlink(CmsFriendlink cmsFriendlink) {
		getCmsFriendlinks().add(cmsFriendlink);
		cmsFriendlink.setCmsFriendlinkCtg(this);

		return cmsFriendlink;
	}

	public CmsFriendlink removeCmsFriendlink(CmsFriendlink cmsFriendlink) {
		getCmsFriendlinks().remove(cmsFriendlink);
		cmsFriendlink.setCmsFriendlinkCtg(null);

		return cmsFriendlink;
	}*/

	public CmsSite getSite() {
		return this.site;
	}

	public void setSite(CmsSite cmsSite) {
		this.site = cmsSite;
	}

}