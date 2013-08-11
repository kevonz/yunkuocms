package com.yunkuo.cms.entity.assist;

import com.yunkuo.cms.entity.assist.base.BaseCmsAcquisitionHistory;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="cms_acquisition_history")
public class CmsAcquisitionHistory extends BaseCmsAcquisitionHistory {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public CmsAcquisitionHistory () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CmsAcquisitionHistory (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public CmsAcquisitionHistory (
		java.lang.Integer id,
		java.lang.String channelUrl,
		java.lang.String contentUrl) {

		super (
			id,
			channelUrl,
			contentUrl);
	}

/*[CONSTRUCTOR MARKER END]*/


}