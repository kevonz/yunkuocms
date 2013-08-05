package com.yunkuo.cms.entity.main.base.tmp.all;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cms_site_txt database table.
 * 
 */
@Entity
@Table(name="cms_site_txt")
public class CmsSiteTxt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="txt_name")
	private String txtName;

	@Lob
	@Column(name="txt_value")
	private String txtValue;

	//bi-directional many-to-one association to CmsSite
	@ManyToOne
	@JoinColumn(name="site_id")
	private CmsSite cmsSite;

	public CmsSiteTxt() {
	}

	public String getTxtName() {
		return this.txtName;
	}

	public void setTxtName(String txtName) {
		this.txtName = txtName;
	}

	public String getTxtValue() {
		return this.txtValue;
	}

	public void setTxtValue(String txtValue) {
		this.txtValue = txtValue;
	}

	public CmsSite getCmsSite() {
		return this.cmsSite;
	}

	public void setCmsSite(CmsSite cmsSite) {
		this.cmsSite = cmsSite;
	}

}