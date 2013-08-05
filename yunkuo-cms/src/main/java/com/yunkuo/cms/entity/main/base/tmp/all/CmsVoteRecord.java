package com.yunkuo.cms.entity.main.base.tmp.all;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the cms_vote_record database table.
 * 
 */
@Entity
@Table(name="cms_vote_record")
public class CmsVoteRecord implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="voterecored_id")
	private int voterecoredId;

	@Column(name="vote_cookie")
	private String voteCookie;

	@Column(name="vote_ip")
	private String voteIp;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="vote_time")
	private Date voteTime;

	//bi-directional many-to-one association to CmsUser
	@ManyToOne
	@JoinColumn(name="user_id")
	private CmsUser cmsUser;

	//bi-directional many-to-one association to CmsVoteTopic
	@ManyToOne
	@JoinColumn(name="votetopic_id")
	private CmsVoteTopic cmsVoteTopic;

	public CmsVoteRecord() {
	}

	public int getVoterecoredId() {
		return this.voterecoredId;
	}

	public void setVoterecoredId(int voterecoredId) {
		this.voterecoredId = voterecoredId;
	}

	public String getVoteCookie() {
		return this.voteCookie;
	}

	public void setVoteCookie(String voteCookie) {
		this.voteCookie = voteCookie;
	}

	public String getVoteIp() {
		return this.voteIp;
	}

	public void setVoteIp(String voteIp) {
		this.voteIp = voteIp;
	}

	public Date getVoteTime() {
		return this.voteTime;
	}

	public void setVoteTime(Date voteTime) {
		this.voteTime = voteTime;
	}

	public CmsUser getCmsUser() {
		return this.cmsUser;
	}

	public void setCmsUser(CmsUser cmsUser) {
		this.cmsUser = cmsUser;
	}

	public CmsVoteTopic getCmsVoteTopic() {
		return this.cmsVoteTopic;
	}

	public void setCmsVoteTopic(CmsVoteTopic cmsVoteTopic) {
		this.cmsVoteTopic = cmsVoteTopic;
	}

}