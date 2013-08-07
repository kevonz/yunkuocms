package com.yunkuo.cms.entity.main.base;
import com.yunkuo.cms.entity.main.CmsRole;
import com.yunkuo.cms.entity.main.CmsRolePermission;
import com.yunkuo.cms.entity.main.CmsSite;
import com.yunkuo.cms.entity.main.CmsUser;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


/**
 * The persistent class for the cms_role database table.
 * 
 */
/*@Entity
@Table(name="cms_role")*/
@MappedSuperclass
public class BaseCmsRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="role_id")
	private Integer id;

	@Column(name="is_super")
	private Boolean isSuper;

	private Integer priority;

	@Column(name="role_name")
	private String name;

	//bi-directional many-to-one association to CmsSite
	@ManyToOne
	@JoinColumn(name="site_id")
	private CmsSite site;

	//bi-directional many-to-one association to CmsRolePermission
	@OneToMany(mappedBy="cmsRole")
	private List<CmsRolePermission> perms;

	//bi-directional many-to-many association to CmsUser
	@ManyToMany
	@JoinTable(
		name="cms_user_role"
		, joinColumns={
			@JoinColumn(name="role_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="user_id")
			}
		)
	private List<CmsUser> cmsUsers;

    // constructors
    public BaseCmsRole () {
        initialize();
    }

    /**
     * Constructor for primary key
     */
    public BaseCmsRole (java.lang.Integer id) {
        this.setId(id);
        initialize();
    }

    /**
     * Constructor for required fields
     */
    public BaseCmsRole (
            java.lang.Integer id,
            java.lang.String name,
            java.lang.Integer priority,
            java.lang.Boolean m_super) {

        this.setId(id);
        this.setName(name);
        this.setPriority(priority);
        this.setSuper(m_super);
        initialize();
    }

    protected void initialize () {}


    public boolean equals (Object obj) {
        if (null == obj) return false;
        if (!(obj instanceof com.yunkuo.cms.entity.main.CmsRole)) return false;
        else {
            CmsRole cmsRole = (CmsRole) obj;
            if (null == this.getId() || null == cmsRole.getId()) return false;
            else return (this.getId().equals(cmsRole.getId()));
        }
    }

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer roleId) {
		this.id = roleId;
	}

	public Boolean getSuper() {
		return this.isSuper;
	}

	public void setSuper(Boolean isSuper) {
		this.isSuper = isSuper;
	}

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String roleName) {
		this.name = roleName;
	}

	public CmsSite getSite() {
		return this.site;
	}

	public void setSite(CmsSite cmsSite) {
		this.site = cmsSite;
	}

	public List<CmsRolePermission> getPerms() {
		return this.perms;
	}

	public void setPerms(List<CmsRolePermission> cmsRolePermissions) {
		this.perms = cmsRolePermissions;
	}

	public CmsRolePermission addCmsRolePermission(CmsRolePermission cmsRolePermission) {
		getPerms().add(cmsRolePermission);
		cmsRolePermission.setCmsRole((CmsRole) this);

		return cmsRolePermission;
	}

	public CmsRolePermission removeCmsRolePermission(CmsRolePermission cmsRolePermission) {
		getPerms().remove(cmsRolePermission);
		cmsRolePermission.setCmsRole(null);

		return cmsRolePermission;
	}

	public List<CmsUser> getCmsUsers() {
		return this.cmsUsers;
	}

	public void setCmsUsers(List<CmsUser> cmsUsers) {
		this.cmsUsers = cmsUsers;
	}

}