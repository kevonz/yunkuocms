package com.yunkuo.cms.entity.main.base.tmp.all;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cms_keyword database table.
 * 
 */
@Entity
@Table(name="cms_keyword")
public class CmsKeyword implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="keyword_id")
	private int keywordId;

	@Column(name="is_disabled")
	private byte isDisabled;

	@Column(name="keyword_name")
	private String keywordName;

	private String url;

	//bi-directional many-to-one association to CmsSite
	@ManyToOne
	@JoinColumn(name="site_id")
	private CmsSite cmsSite;

	public CmsKeyword() {
	}

	public int getKeywordId() {
		return this.keywordId;
	}

	public void setKeywordId(int keywordId) {
		this.keywordId = keywordId;
	}

	public byte getIsDisabled() {
		return this.isDisabled;
	}

	public void setIsDisabled(byte isDisabled) {
		this.isDisabled = isDisabled;
	}

	public String getKeywordName() {
		return this.keywordName;
	}

	public void setKeywordName(String keywordName) {
		this.keywordName = keywordName;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public CmsSite getCmsSite() {
		return this.cmsSite;
	}

	public void setCmsSite(CmsSite cmsSite) {
		this.cmsSite = cmsSite;
	}

}