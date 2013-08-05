package com.yunkuo.cms.entity.main.base.tmp.all;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cms_vote_item database table.
 * 
 */
@Entity
@Table(name="cms_vote_item")
public class CmsVoteItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="voteitem_id")
	private int voteitemId;

	private int priority;

	private String title;

	@Column(name="vote_count")
	private int voteCount;

	//bi-directional many-to-one association to CmsVoteTopic
	@ManyToOne
	@JoinColumn(name="votetopic_id")
	private CmsVoteTopic cmsVoteTopic;

	public CmsVoteItem() {
	}

	public int getVoteitemId() {
		return this.voteitemId;
	}

	public void setVoteitemId(int voteitemId) {
		this.voteitemId = voteitemId;
	}

	public int getPriority() {
		return this.priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getVoteCount() {
		return this.voteCount;
	}

	public void setVoteCount(int voteCount) {
		this.voteCount = voteCount;
	}

	public CmsVoteTopic getCmsVoteTopic() {
		return this.cmsVoteTopic;
	}

	public void setCmsVoteTopic(CmsVoteTopic cmsVoteTopic) {
		this.cmsVoteTopic = cmsVoteTopic;
	}

}