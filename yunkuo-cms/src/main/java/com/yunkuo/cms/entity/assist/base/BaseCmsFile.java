package com.yunkuo.cms.entity.assist.base;

import com.yunkuo.cms.entity.main.Content;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the cms_file database table.
 * 
 */
/*@Entity
@Table(name="cms_file")*/
@MappedSuperclass
public class BaseCmsFile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="file_path")
	private String filePath;

	@Column(name="file_isvalid")
	private Boolean fileIsvalid;

	@Column(name="file_name")
	private String fileName;

	//bi-directional many-to-one association to CmsContent
	@ManyToOne
	@JoinColumn(name="content_id")
	private Content content;

    // constructors
    public BaseCmsFile () {
        initialize();
    }

    /**
     * Constructor for primary key
     */
    public BaseCmsFile (java.lang.String filePath) {
        this.setFilePath(filePath);
        initialize();
    }

    /**
     * Constructor for required fields
     */
    public BaseCmsFile (
            java.lang.String filePath,
            boolean fileIsvalid) {

        this.setFilePath(filePath);
        this.setFileIsvalid(fileIsvalid);
        initialize();
    }

    protected void initialize () {}

	public String getFilePath() {
		return this.filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public Boolean getFileIsvalid() {
		return this.fileIsvalid;
	}

	public void setFileIsvalid(Boolean fileIsvalid) {
		this.fileIsvalid = fileIsvalid;
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Content getContent() {
		return this.content;
	}

	public void setContent(Content cmsContent) {
		this.content = cmsContent;
	}

}