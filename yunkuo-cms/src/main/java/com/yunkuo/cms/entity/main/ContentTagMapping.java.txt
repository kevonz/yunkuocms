package com.yunkuo.cms.entity.main;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the cms_contenttag database table.
 * 
 */
@Entity
@Table(name="cms_contenttag")
public class ContentTagMapping implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name="content_id")
	private int contentId;

	private int priority;

	//bi-directional many-to-one association to ContentTag
	@ManyToOne
	@JoinColumn(name="tag_id")
	private ContentTag contentTag;

	public ContentTagMapping() {
	}

	public int getContentId() {
		return this.contentId;
	}

	public void setContentId(int contentId) {
		this.contentId = contentId;
	}

	public int getPriority() {
		return this.priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public ContentTag getContentTag() {
		return this.contentTag;
	}

	public void setContentTag(ContentTag contentTag) {
		this.contentTag = contentTag;
	}

}