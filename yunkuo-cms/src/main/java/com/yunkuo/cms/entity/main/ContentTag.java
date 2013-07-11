package com.yunkuo.cms.entity.main;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.yunkuo.cms.entity.main.base.BaseContentTag;

@Entity
@Table(name="cms_content_tag")
@NamedQueries({
@NamedQuery(name="ContentTag.deleteContentRef", query="delete from ContentTagMapping where tag_id=?"),
@NamedQuery(name="ContentTag.countContentRef", query="select count(*) from ContentTagMapping where tag_id=?")
})
public class ContentTag extends BaseContentTag {
	private static final long serialVersionUID = 1L;

	public void init() {
		if (getCount() == 0) {
			setCount(1);
		}
	}

	/* [CONSTRUCTOR MARKER BEGIN] */
	public ContentTag () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public ContentTag (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public ContentTag (
		java.lang.Integer id,
		java.lang.String name,
		java.lang.Integer count) {

		super (
			id,
			name,
			count);
	}

	/* [CONSTRUCTOR MARKER END] */

}