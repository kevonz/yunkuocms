package com.yunkuo.cms.entity.main.base;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import com.yunkuo.cms.entity.main.ContentTagMapping;


/**
 * The persistent class for the cms_content_tag database table.
 * 
 */
/*@Entity
@Table(name="cms_content_tag")*/
@MappedSuperclass
public abstract class BaseContentTag implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="tag_id")
	private int id;

	@Column(name="ref_counter")
	private int count;

	@Column(name="tag_name")
	private String name;
	
	//bi-directional many-to-one association to ContentTagMapping
	//@OneToMany(mappedBy="ContentTag")
	//private List<ContentTagMapping> contentTags;
	public BaseContentTag() {
	}
	
	/**
	 * Constructor for primary key
	 */
	public BaseContentTag (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseContentTag (
		java.lang.Integer id,
		java.lang.String name,
		java.lang.Integer count) {

		this.setId(id);
		this.setName(name);
		this.setCount(count);
		initialize();
	}

	protected void initialize () {}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCount() {
		return this.count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	/*	
	public List<ContentTagMapping> getContentTags() {
		return this.contentTags;
	}

	public void setContentTags(List<ContentTagMapping> cmsContenttags) {
		this.contentTags = cmsContenttags;
	}

	public ContentTagMapping addCmsContenttag(ContentTagMapping cmsContenttag) {
		getContenttags().add(cmsContenttag);
		cmsContenttag.setContentTag(this);

		return cmsContenttag;
	}

	public ContentTagMapping removeCmsContenttag(ContentTagMapping cmsContenttag) {
		getContenttags().remove(cmsContenttag);
		cmsContenttag.setContentTag(null);

		return cmsContenttag;
	}
	*/
	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.yunkuo.cms.entity.main.ContentTag)) return false;
		else {
			com.yunkuo.cms.entity.main.ContentTag contentTag = (com.yunkuo.cms.entity.main.ContentTag) obj;
			if (0 == this.getId() || 0 == contentTag.getId()) return false;
			else return (this.getId()==contentTag.getId());
		}
	}


	public String toString () {
		return super.toString();
	}
}