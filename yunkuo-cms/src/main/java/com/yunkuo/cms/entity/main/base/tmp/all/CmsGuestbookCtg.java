package com.yunkuo.cms.entity.main.base.tmp.all;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the cms_guestbook_ctg database table.
 * 
 */
@Entity
@Table(name="cms_guestbook_ctg")
public class CmsGuestbookCtg implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="guestbookctg_id")
	private int guestbookctgId;

	@Column(name="ctg_name")
	private String ctgName;

	private String description;

	private int priority;

	//bi-directional many-to-one association to CmsGuestbook
	@OneToMany(mappedBy="cmsGuestbookCtg")
	private List<CmsGuestbook> cmsGuestbooks;

	//bi-directional many-to-one association to CmsSite
	@ManyToOne
	@JoinColumn(name="site_id")
	private CmsSite cmsSite;

	//bi-directional many-to-many association to CmsDepartment
	@ManyToMany(mappedBy="cmsGuestbookCtgs")
	private List<CmsDepartment> cmsDepartments;

	public CmsGuestbookCtg() {
	}

	public int getGuestbookctgId() {
		return this.guestbookctgId;
	}

	public void setGuestbookctgId(int guestbookctgId) {
		this.guestbookctgId = guestbookctgId;
	}

	public String getCtgName() {
		return this.ctgName;
	}

	public void setCtgName(String ctgName) {
		this.ctgName = ctgName;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPriority() {
		return this.priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public List<CmsGuestbook> getCmsGuestbooks() {
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

	public CmsSite getCmsSite() {
		return this.cmsSite;
	}

	public void setCmsSite(CmsSite cmsSite) {
		this.cmsSite = cmsSite;
	}

	public List<CmsDepartment> getCmsDepartments() {
		return this.cmsDepartments;
	}

	public void setCmsDepartments(List<CmsDepartment> cmsDepartments) {
		this.cmsDepartments = cmsDepartments;
	}

}