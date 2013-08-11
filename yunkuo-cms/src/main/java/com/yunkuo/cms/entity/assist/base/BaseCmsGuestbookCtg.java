package com.yunkuo.cms.entity.assist.base;

import com.yunkuo.cms.entity.main.CmsSite;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the cms_guestbook_ctg database table.
 * 
 */

@MappedSuperclass
public class BaseCmsGuestbookCtg implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="guestbookctg_id")
	private Integer id;

	@Column(name="ctg_name")
	private String name;

	private String description;

	private int priority;

	/*//bi-directional many-to-one association to CmsGuestbook
	@OneToMany(mappedBy="cmsGuestbookCtg")
	private List<CmsGuestbook> cmsGuestbooks;
*/
	//bi-directional many-to-one association to CmsSite
	@ManyToOne
	@JoinColumn(name="site_id")
	private CmsSite site;

	/*//bi-directional many-to-many association to CmsDepartment
	@ManyToMany(mappedBy="cmsGuestbookCtgs")
	private List<CmsDepartment> cmsDepartments;
*/
    // constructors
    public BaseCmsGuestbookCtg () {
        initialize();
    }

    /**
     * Constructor for primary key
     */
    public BaseCmsGuestbookCtg (java.lang.Integer id) {
        this.setId(id);
        initialize();
    }

    /**
     * Constructor for required fields
     */
    public BaseCmsGuestbookCtg (
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

	public void setId(Integer guestbookctgId) {
		this.id = guestbookctgId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String ctgName) {
		this.name = ctgName;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	/*public List<CmsGuestbook> getCmsGuestbooks() {
		return this.cmsGuestbooks;
	}

	public void setCmsGuestbooks(List<CmsGuestbook> cmsGuestbooks) {
		this.cmsGuestbooks = cmsGuestbooks;
	}

	public CmsGuestbook addCmsGuestbook(CmsGuestbook cmsGuestbook) {
		getCmsGuestbooks().add(cmsGuestbook);
		cmsGuestbook.setCmsGuestbookCtg(this);

		return cmsGuestbook;
	}

	public CmsGuestbook removeCmsGuestbook(CmsGuestbook cmsGuestbook) {
		getCmsGuestbooks().remove(cmsGuestbook);
		cmsGuestbook.setCmsGuestbookCtg(null);

		return cmsGuestbook;
	}
*/
	public CmsSite getSite() {
		return this.site;
	}

	public void setSite(CmsSite cmsSite) {
		this.site = cmsSite;
	}

/*	public List<CmsDepartment> getCmsDepartments() {
		return this.cmsDepartments;
	}

	public void setCmsDepartments(List<CmsDepartment> cmsDepartments) {
		this.cmsDepartments = cmsDepartments;
	}*/

}