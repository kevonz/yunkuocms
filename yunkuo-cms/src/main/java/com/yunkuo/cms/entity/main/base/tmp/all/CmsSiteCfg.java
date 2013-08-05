package com.yunkuo.cms.entity.main.base.tmp.all;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cms_site_cfg database table.
 * 
 */
@Entity
@Table(name="cms_site_cfg")
public class CmsSiteCfg implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="cfg_name")
	private String cfgName;

	@Column(name="cfg_value")
	private String cfgValue;

	//bi-directional many-to-one association to CmsSite
	@ManyToOne
	@JoinColumn(name="site_id")
	private CmsSite cmsSite;

	public CmsSiteCfg() {
	}

	public String getCfgName() {
		return this.cfgName;
	}

	public void setCfgName(String cfgName) {
		this.cfgName = cfgName;
	}

	public String getCfgValue() {
		return this.cfgValue;
	}

	public void setCfgValue(String cfgValue) {
		this.cfgValue = cfgValue;
	}

	public CmsSite getCmsSite() {
		return this.cmsSite;
	}

	public void setCmsSite(CmsSite cmsSite) {
		this.cmsSite = cmsSite;
	}

}