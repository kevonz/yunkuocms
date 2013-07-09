package com.yunkuo.cms.entity.main;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.yunkuo.cms.entity.main.base.BaseContentType;

/**
 * The persistent class for the cms_content_type database table.
 * 
 */
@Entity
@Table(name="cms_content_type")
public class ContentType extends BaseContentType {
	private static final long serialVersionUID = 1L;

	/* [CONSTRUCTOR MARKER BEGIN] */
	public ContentType () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public ContentType (int id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
/*	public ContentType (
		int id,
		java.lang.String name,
		boolean hasImage,
		java.lang.Boolean disabled) {

		super (
			id,
			name,
			hasImage,
			disabled);
	}*/

	/* [CONSTRUCTOR MARKER END] */

}