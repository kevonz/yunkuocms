package com.yunkuo.cms.entity.main.base.tmp.all;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cms_sensitivity database table.
 * 
 */
@Entity
@Table(name="cms_sensitivity")
public class CmsSensitivity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="sensitivity_id")
	private int sensitivityId;

	private String replacement;

	private String search;

	public CmsSensitivity() {
	}

	public int getSensitivityId() {
		return this.sensitivityId;
	}

	public void setSensitivityId(int sensitivityId) {
		this.sensitivityId = sensitivityId;
	}

	public String getReplacement() {
		return this.replacement;
	}

	public void setReplacement(String replacement) {
		this.replacement = replacement;
	}

	public String getSearch() {
		return this.search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

}