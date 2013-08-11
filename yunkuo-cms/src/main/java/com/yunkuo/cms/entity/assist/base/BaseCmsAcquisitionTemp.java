package com.yunkuo.cms.entity.assist.base;

import com.yunkuo.cms.entity.main.CmsSite;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the cms_acquisition_temp database table.
 * 
 */
/*@Entity
@Table(name="cms_acquisition_temp")*/
@MappedSuperclass
public class BaseCmsAcquisitionTemp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="temp_id")
	private Integer id;

	@Column(name="channel_url")
	private String channelUrl;

	@Column(name="content_url")
	private String contentUrl;

	private String description;

	private Integer percent;

	private Integer seq;

	private String title;

	//bi-directional many-to-one association to CmsSite
	@ManyToOne
	@JoinColumn(name="site_id")
	private CmsSite site;

    // constructors
    public BaseCmsAcquisitionTemp () {
        initialize();
    }

    /**
     * Constructor for primary key
     */
    public BaseCmsAcquisitionTemp (java.lang.Integer id) {
        this.setId(id);
        initialize();
    }

    /**
     * Constructor for required fields
     */
    public BaseCmsAcquisitionTemp (
            java.lang.Integer id,
            java.lang.String channelUrl,
            java.lang.String contentUrl,
            java.lang.Integer percent,
            java.lang.String description,
            java.lang.Integer seq) {

        this.setId(id);
        this.setChannelUrl(channelUrl);
        this.setContentUrl(contentUrl);
        this.setPercent(percent);
        this.setDescription(description);
        this.setSeq(seq);
        initialize();
    }

    protected void initialize () {}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer tempId) {
		this.id = tempId;
	}

	public String getChannelUrl() {
		return this.channelUrl;
	}

	public void setChannelUrl(String channelUrl) {
		this.channelUrl = channelUrl;
	}

	public String getContentUrl() {
		return this.contentUrl;
	}

	public void setContentUrl(String contentUrl) {
		this.contentUrl = contentUrl;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPercent() {
		return this.percent;
	}

	public void setPercent(Integer percent) {
		this.percent = percent;
	}

	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public CmsSite getSite() {
		return this.site;
	}

	public void setSite(CmsSite cmsSite) {
		this.site = cmsSite;
	}

}