package com.yunkuo.cms.entity.assist.base;

import com.yunkuo.cms.entity.assist.CmsVoteTopic;
import com.yunkuo.cms.entity.main.CmsUser;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the cms_vote_record database table.
 * 
 */
/*@Entity
@Table(name="cms_vote_record")*/
@MappedSuperclass
public class BaseCmsVoteRecord implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="voterecored_id")
	private int id;

	@Column(name="vote_cookie")
	private String cookie;

	@Column(name="vote_ip")
	private String ip;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="vote_time")
	private Date time;

	//bi-directional many-to-one association to CmsUser
	@ManyToOne
	@JoinColumn(name="user_id")
	private CmsUser user;

	//bi-directional many-to-one association to CmsVoteTopic
	@ManyToOne
	@JoinColumn(name="votetopic_id")
	private CmsVoteTopic topic;

    // constructors
    public BaseCmsVoteRecord () {
        initialize();
    }

    /**
     * Constructor for primary key
     */
    public BaseCmsVoteRecord (java.lang.Integer id) {
        this.setId(id);
        initialize();
    }

    /**
     * Constructor for required fields
     */
    public BaseCmsVoteRecord (
            java.lang.Integer id,
            com.yunkuo.cms.entity.assist.CmsVoteTopic topic,
            java.util.Date time,
            java.lang.String ip,
            java.lang.String cookie) {

        this.setId(id);
        this.setTopic(topic);
        this.setTime(time);
        this.setIp(ip);
        this.setCookie(cookie);
        initialize();
    }

    protected void initialize () {}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer voterecoredId) {
		this.id = voterecoredId;
	}

	public String getCookie() {
		return this.cookie;
	}

	public void setCookie(String voteCookie) {
		this.cookie = voteCookie;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String voteIp) {
		this.ip = voteIp;
	}

	public Date getTime() {
		return this.time;
	}

	public void setTime(Date voteTime) {
		this.time = voteTime;
	}

	public CmsUser getUser() {
		return this.user;
	}

	public void setUser(CmsUser cmsUser) {
		this.user = cmsUser;
	}

	public CmsVoteTopic getTopic() {
		return this.topic;
	}

	public void setTopic(CmsVoteTopic cmsVoteTopic) {
		this.topic = cmsVoteTopic;
	}

}