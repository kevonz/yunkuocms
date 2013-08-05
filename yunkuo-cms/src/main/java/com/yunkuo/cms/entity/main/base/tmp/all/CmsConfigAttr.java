package com.yunkuo.cms.entity.main.base.tmp.all;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cms_config_attr database table.
 * 
 */
@Entity
@Table(name="cms_config_attr")
public class CmsConfigAttr implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="attr_name")
	private String attrName;

	@Column(name="attr_value")
	private String attrValue;

	//bi-directional many-to-one association to CmsConfig
	@ManyToOne
	@JoinColumn(name="config_id")
	private CmsConfig cmsConfig;

	public CmsConfigAttr() {
	}

	public String getAttrName() {
		return this.attrName;
	}

	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}

	public String getAttrValue() {
		return this.attrValue;
	}

	public void setAttrValue(String attrValue) {
		this.attrValue = attrValue;
	}

	public CmsConfig getCmsConfig() {
		return this.cmsConfig;
	}

	public void setCmsConfig(CmsConfig cmsConfig) {
		this.cmsConfig = cmsConfig;
	}

}