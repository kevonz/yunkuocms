package com.yunkuo.cms.entity.main.base.tmp.all;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cms_role_permission database table.
 * 
 */
@Entity
@Table(name="cms_role_permission")
public class CmsRolePermission implements Serializable {
	private static final long serialVersionUID = 1L;

	private String uri;

	//bi-directional many-to-one association to CmsRole
	@ManyToOne
	@JoinColumn(name="role_id")
	private CmsRole cmsRole;

	public CmsRolePermission() {
	}

	public String getUri() {
		return this.uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public CmsRole getCmsRole() {
		return this.cmsRole;
	}

	public void setCmsRole(CmsRole cmsRole) {
		this.cmsRole = cmsRole;
	}

}