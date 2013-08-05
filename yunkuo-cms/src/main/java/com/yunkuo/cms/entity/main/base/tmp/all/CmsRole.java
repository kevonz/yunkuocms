package com.yunkuo.cms.entity.main.base.tmp.all;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the cms_role database table.
 * 
 */
@Entity
@Table(name="cms_role")
public class CmsRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="role_id")
	private int roleId;

	@Column(name="is_super")
	private String isSuper;

	private int priority;

	@Column(name="role_name")
	private String roleName;

	//bi-directional many-to-one association to CmsSite
	@ManyToOne
	@JoinColumn(name="site_id")
	private CmsSite cmsSite;

	//bi-directional many-to-one association to CmsRolePermission
	@OneToMany(mappedBy="cmsRole")
	private List<CmsRolePermission> cmsRolePermissions;

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

	public CmsRole() {
	}

	public int getRoleId() {
		return this.roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getIsSuper() {
		return this.isSuper;
	}

	public void setIsSuper(String isSuper) {
		this.isSuper = isSuper;
	}

	public int getPriority() {
		return this.priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public CmsSite getCmsSite() {
		return this.cmsSite;
	}

	public void setCmsSite(CmsSite cmsSite) {
		this.cmsSite = cmsSite;
	}

	public List<CmsRolePermission> getCmsRolePermissions() {
		return this.cmsRolePermissions;
	}

	public void setCmsRolePermissions(List<CmsRolePermission> cmsRolePermissions) {
		this.cmsRolePermissions = cmsRolePermissions;
	}

	public CmsRolePermission addCmsRolePermission(CmsRolePermission cmsRolePermission) {
		getCmsRolePermissions().add(cmsRolePermission);
		cmsRolePermission.setCmsRole(this);

		return cmsRolePermission;
	}

	public CmsRolePermission removeCmsRolePermission(CmsRolePermission cmsRolePermission) {
		getCmsRolePermissions().remove(cmsRolePermission);
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