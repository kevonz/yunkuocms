package com.yunkuo.cms.entity.assist;

import com.yunkuo.cms.entity.assist.base.BaseCmsVoteItem;
import com.yunkuo.common.hibernate3.PriorityInterface;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="cms_vote_item")
public class CmsVoteItem extends BaseCmsVoteItem implements PriorityInterface {
	private static final long serialVersionUID = 1L;

	public int getPercent() {
		Integer totalCount = getTopic().getTotalCount();
		if (totalCount != null && totalCount != 0) {
			return (getVoteCount() * 100) / totalCount;
		} else {
			return 0;
		}
	}

	public void init() {
		if (getPriority() == null) {
			setPriority(10);
		}
		if (getVoteCount() == null) {
			setVoteCount(0);
		}
	}

	/* [CONSTRUCTOR MARKER BEGIN] */
	public CmsVoteItem() {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CmsVoteItem(java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public CmsVoteItem(java.lang.Integer id,
			com.yunkuo.cms.entity.assist.CmsVoteTopic topic,
			java.lang.String title, java.lang.Integer voteCount,
			java.lang.Integer priority) {

		super(id, topic, title, voteCount, priority);
	}

	/* [CONSTRUCTOR MARKER END] */

}