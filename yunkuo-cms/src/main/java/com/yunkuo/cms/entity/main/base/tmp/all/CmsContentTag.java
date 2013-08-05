package com.yunkuo.cms.entity.main.base.tmp.all;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the cms_content_tag database table.
 * 
 */
@Entity
@Table(name="cms_content_tag")
public class CmsContentTag implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="tag_id")
	private int tagId;

	@Column(name="ref_counter")
	private int refCounter;

	@Column(name="tag_name")
	private String tagName;

	//bi-directional many-to-many association to CmsContent
	@ManyToMany(mappedBy="cmsContentTags")
	private List<CmsContent> cmsContents;

	public CmsContentTag() {
	}

	public int getTagId() {
		return this.tagId;
	}

	public void setTagId(int tagId) {
		this.tagId = tagId;
	}

	public int getRefCounter() {
		return this.refCounter;
	}

	public void setRefCounter(int refCounter) {
		this.refCounter = refCounter;
	}

	public String getTagName() {
		return this.tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public List<CmsContent> getCmsContents() {
		return this.cmsContents;
	}

	public void setCmsContents(List<CmsContent> cmsContents) {
		this.cmsContents = cmsContents;
	}

}