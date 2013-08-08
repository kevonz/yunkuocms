package com.yunkuo.cms.entity.main.base;

import com.yunkuo.cms.entity.main.Channel;
import com.yunkuo.cms.entity.main.CmsTopic;
import com.yunkuo.cms.entity.main.Content;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


/**
 * The persistent class for the cms_topic database table.
 * 
 */
/*@Entity
@Table(name="cms_topic")*/
@MappedSuperclass
public class BaseCmsTopic implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="topic_id")
	private Integer id;

	@Column(name="content_img")
	private String contentImg;

	private String description;

	@Column(name="is_recommend")
	private Boolean recommend;

	private String keywords;

	private Integer priority;

	@Column(name="short_name")
	private String shortName;

	@Column(name="title_img")
	private String titleImg;

	@Column(name="topic_name")
	private String name;

	@Column(name="tpl_content")
	private String tplContent;

	//bi-directional many-to-many association to CmsContent
	@ManyToMany(mappedBy="topics")
	private List<Content> contents;

	//bi-directional many-to-one association to BaseChannel
	@ManyToOne
	@JoinColumn(name="channel_id")
	private Channel channel;

	// constructors
    public BaseCmsTopic () {
        initialize();
    }

    /**
     * Constructor for primary key
     */
    public BaseCmsTopic (java.lang.Integer id) {
        this.setId(id);
        initialize();
    }

    /**
     * Constructor for required fields
     */
    public BaseCmsTopic (
            java.lang.Integer id,
            java.lang.String name,
            java.lang.Integer priority,
            java.lang.Boolean recommend) {

        this.setId(id);
        this.setName(name);
        this.setPriority(priority);
        this.setRecommend(recommend);
        initialize();
    }

    protected void initialize () {}
    public boolean equals (Object obj) {
        if (null == obj) return false;
        if (!(obj instanceof CmsTopic)) return false;
        else {
            CmsTopic cmsTopic = (CmsTopic) obj;
            if (null == this.getId() || null == cmsTopic.getId()) return false;
            else return (this.getId().equals(cmsTopic.getId()));
        }
    }

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer topicId) {
		this.id = topicId;
	}

	public String getContentImg() {
		return this.contentImg;
	}

	public void setContentImg(String contentImg) {
		this.contentImg = contentImg;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getRecommend() {
		return this.recommend;
	}

	public void setRecommend(Boolean isRecommend) {
		this.recommend = isRecommend;
	}

	public String getKeywords() {
		return this.keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public String getShortName() {
		return this.shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getTitleImg() {
		return this.titleImg;
	}

	public void setTitleImg(String titleImg) {
		this.titleImg = titleImg;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String topicName) {
		this.name = topicName;
	}

	public String getTplContent() {
		return this.tplContent;
	}

	public void setTplContent(String tplContent) {
		this.tplContent = tplContent;
	}

	public List<Content> getContents() {
		return this.contents;
	}

	public void setContents(List<Content> cmsContents) {
		this.contents = cmsContents;
	}

	public Channel getChannel() {
		return this.channel;
	}

	public void setChannel(Channel cmsChannel) {
		this.channel = cmsChannel;
	}

}