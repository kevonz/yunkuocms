package com.yunkuo.cms.entity.assist.base;

//import com.sun.istack.internal.Nullable;
import com.yunkuo.cms.entity.assist.CmsAcquisition;
import com.yunkuo.cms.entity.main.Content;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the cms_acquisition_history database table.
 * 
 */
/*@Entity
@Table(name="cms_acquisition_history")*/
@MappedSuperclass
public class BaseCmsAcquisitionHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="history_id")
	private Integer id;

	@Column(name="channel_url")
	private String channelUrl;

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    /*	@Column(name="content_id")
        private int contentId;*/
    //bi-directional many-to-one association to CmsAcquisition
    @ManyToOne
    @JoinColumn(name="content_id")
    @NotFound(action = NotFoundAction.IGNORE)
    private Content content;

	@Column(name="content_url")
	private String contentUrl;

	private String description;

	private String title;

	//bi-directional many-to-one association to CmsAcquisition
	@ManyToOne
	@JoinColumn(name="acquisition_id")
	private CmsAcquisition acquisition;

    // constructors
    public BaseCmsAcquisitionHistory () {
        initialize();
    }

    /**
     * Constructor for primary key
     */
    public BaseCmsAcquisitionHistory (java.lang.Integer id) {
        this.setId(id);
        initialize();
    }

    /**
     * Constructor for required fields
     */
    public BaseCmsAcquisitionHistory (
            Integer id,
            String channelUrl,
            String contentUrl) {

        this.setId(id);
        this.setChannelUrl(channelUrl);
        this.setContentUrl(contentUrl);
        initialize();
    }

    protected void initialize () {}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer historyId) {
		this.id = historyId;
	}

	public String getChannelUrl() {
		return this.channelUrl;
	}

	public void setChannelUrl(String channelUrl) {
		this.channelUrl = channelUrl;
	}
/*
	public int getContentId() {
		return this.contentId;
	}

	public void setContentId(int contentId) {
		this.contentId = contentId;
	}*/

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

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public CmsAcquisition getAcquisition() {
		return this.acquisition;
	}

	public void setAcquisition(CmsAcquisition cmsAcquisition) {
		this.acquisition = cmsAcquisition;
	}

}