package com.yunkuo.cms.entity.assist.base;

import com.yunkuo.cms.entity.main.CmsSite;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the cms_keyword database table.
 * 
 */
//@Entity
//@Table(name="cms_keyword")
@MappedSuperclass
public class BaseCmsKeyword implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="keyword_id")
	private Integer id;

	@Column(name="is_disabled")
	private Boolean disabled;

	@Column(name="keyword_name")
	private String name;

	private String url;

	//bi-directional many-to-one association to CmsSite
	@ManyToOne
	@JoinColumn(name="site_id")
	private CmsSite site;

    // constructors
    public BaseCmsKeyword () {
        initialize();
    }

    /**
     * Constructor for primary key
     */
    public BaseCmsKeyword (java.lang.Integer id) {
        this.setId(id);
        initialize();
    }

    /**
     * Constructor for required fields
     */
    public BaseCmsKeyword (
            java.lang.Integer id,
            java.lang.String name,
            java.lang.String url,
            java.lang.Boolean disabled) {

        this.setId(id);
        this.setName(name);
        this.setUrl(url);
        this.setDisabled(disabled);
        initialize();
    }

    protected void initialize () {}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer keywordId) {
		this.id = keywordId;
	}

	public Boolean getDisabled() {
		return this.disabled;
	}

	public void setDisabled(Boolean isDisabled) {
		this.disabled = isDisabled;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String keywordName) {
		this.name = keywordName;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public CmsSite getSite() {
		return this.site;
	}

	public void setSite(CmsSite cmsSite) {
		this.site = cmsSite;
	}

}