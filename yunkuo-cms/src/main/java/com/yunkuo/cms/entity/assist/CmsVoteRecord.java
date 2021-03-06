package com.yunkuo.cms.entity.assist;

import com.yunkuo.cms.entity.assist.base.BaseCmsVoteRecord;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="cms_vote_record")
public class CmsVoteRecord extends BaseCmsVoteRecord {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public CmsVoteRecord () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CmsVoteRecord (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public CmsVoteRecord (
		java.lang.Integer id,
		com.yunkuo.cms.entity.assist.CmsVoteTopic topic,
		java.util.Date time,
		java.lang.String ip,
		java.lang.String cookie) {

		super (
			id,
			topic,
			time,
			ip,
			cookie);
	}

/*[CONSTRUCTOR MARKER END]*/


}