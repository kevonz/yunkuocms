package com.yunkuo.cms.entity.main;

import com.yunkuo.cms.entity.main.CmsRole;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the cms_role_permission database table.
 * 
 */
@Entity
@Table(name="cms_role_permission")
public class CmsRolePermission implements Serializable {
	private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

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