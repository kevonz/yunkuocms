package com.yunkuo.core.entity.base;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the yk_config database table.
 * 
 */
@MappedSuperclass
public abstract class BaseConfig implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cfg_key")
	private String cfgKey;

	@Column(name="cfg_value")
	private String cfgValue;

	public BaseConfig() {
	}

	public String getCfgKey() {
		return this.cfgKey;
	}

	public void setCfgKey(String cfgKey) {
		this.cfgKey = cfgKey;
	}

	public String getCfgValue() {
		return this.cfgValue;
	}

	public void setCfgValue(String cfgValue) {
		this.cfgValue = cfgValue;
	}

}