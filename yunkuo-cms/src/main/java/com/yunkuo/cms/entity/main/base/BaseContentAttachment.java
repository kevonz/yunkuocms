package com.yunkuo.cms.entity.main.base;

import com.yunkuo.cms.entity.main.Content;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the cms_content_attachment database table.
 * 
 */
/*@Entity
@Table(name="cms_content_attachment")*/
@MappedSuperclass
public class BaseContentAttachment implements Serializable {
	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
	@Column(name="attachment_name")
	private String name;

	@Column(name="attachment_path")
	private String path;

	@Column(name="download_count")
	private Integer count;

	private String filename;

	private Integer priority;

	//bi-directional many-to-one association to CmsContent
	@ManyToOne
	@JoinColumn(name="content_id")
	private Content cmsContent;

	public BaseContentAttachment() {
	}
    /**
     * Constructor for required fields
     */
    public BaseContentAttachment (
            java.lang.String path,
            java.lang.String name,
            java.lang.Integer count) {

        this.setPath(path);
        this.setName(name);
        this.setCount(count);
        initialize();
    }

    protected void initialize () {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }




	public String getName() {
		return this.name;
	}

	public void setName(String attachmentName) {
		this.name = attachmentName;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String attachmentPath) {
		this.path = attachmentPath;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer downloadCount) {
		this.count = downloadCount;
	}

	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Content getCmsContent() {
		return this.cmsContent;
	}

	public void setCmsContent(Content cmsContent) {
		this.cmsContent = cmsContent;
	}

}