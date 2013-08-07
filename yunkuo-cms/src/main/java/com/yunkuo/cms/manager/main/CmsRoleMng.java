package com.yunkuo.cms.manager.main;

import java.util.List;
import java.util.Set;

import com.yunkuo.cms.entity.main.CmsRole;
import com.yunkuo.cms.entity.main.CmsRolePermission;

public interface CmsRoleMng {
	public List<CmsRole> getList();

	public CmsRole findById(Integer id);

	public CmsRole save(CmsRole bean, List<CmsRolePermission> perms);

	public CmsRole update(CmsRole bean, List<CmsRolePermission> perms);

	public CmsRole deleteById(Integer id);

	public CmsRole[] deleteByIds(Integer[] ids);
}