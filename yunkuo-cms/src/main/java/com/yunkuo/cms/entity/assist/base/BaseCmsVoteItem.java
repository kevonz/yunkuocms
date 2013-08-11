package com.yunkuo.cms.entity.assist.base;

import com.yunkuo.cms.entity.assist.CmsVoteTopic;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the cms_vote_item database table.
 * 
 */
/*@Entity
@Table(name="cms_vote_item")*/
@MappedSuperclass
public class BaseCmsVoteItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="voteitem_id")
	private Integer id;

	private Integer priority;

	private String title;

	@Column(name="vote_count")
	private Integer voteCount;

	//bi-directional many-to-one association to CmsVoteTopic
    //TODO: an update bug in here
	@ManyToOne
	@JoinColumn(name="votetopic_id")
	private CmsVoteTopic topic;

    // constructors
    public BaseCmsVoteItem () {
        initialize();
    }

    /**
     * Constructor for primary key
     */
    public BaseCmsVoteItem (java.lang.Integer id) {
        this.setId(id);
        initialize();
    }

    /**
     * Constructor for required fields
     */
    public BaseCmsVoteItem (
            java.lang.Integer id,
            com.yunkuo.cms.entity.assist.CmsVoteTopic topic,
            java.lang.String title,
            java.lang.Integer voteCount,
            java.lang.Integer priority) {

        this.setId(id);
        this.setTopic(topic);
        this.setTitle(title);
        this.setVoteCount(voteCount);
        this.setPriority(priority);
        initialize();
    }

    protected void initialize () {}


    public Integer getId() {
		return this.id;
	}

	public void setId(Integer voteitemId) {
		this.id = voteitemId;
	}

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getVoteCount() {
		return this.voteCount;
	}

	public void setVoteCount(Integer voteCount) {
		this.voteCount = voteCount;
	}

	public CmsVoteTopic getTopic() {
		return this.topic;
	}

	public void setTopic(CmsVoteTopic cmsVoteTopic) {
		this.topic = cmsVoteTopic;
	}

}