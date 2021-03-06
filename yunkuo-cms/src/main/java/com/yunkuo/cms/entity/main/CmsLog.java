package com.yunkuo.cms.entity.main;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.yunkuo.cms.entity.main.base.BaseCmsLog;
/**
 * The persistent class for the cms_log database table.
 * 
 */
@Entity
@Table(name="cms_log")
public class CmsLog extends BaseCmsLog {
	private static final long serialVersionUID = 1L;
	public static final int LOGIN_SUCCESS = 1;
	public static final int LOGIN_FAILURE = 2;
	public static final int OPERATING = 3;

	/* [CONSTRUCTOR MARKER BEGIN] */
	public CmsLog () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	/*public CmsLog (java.lang.Integer id) {
		super(id);
	}*/

	/**
	 * Constructor for required fields
	 */
/*	public CmsLog (
		java.lang.Integer id,
		java.lang.Integer category,
		java.util.Date time) {

		super (
			id,
			category,
			time);
	}*/

	/* [CONSTRUCTOR MARKER END] */

}