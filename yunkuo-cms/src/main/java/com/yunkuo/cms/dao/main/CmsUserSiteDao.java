package com.yunkuo.cms.dao.main;

import com.yunkuo.cms.entity.main.CmsUserSite;
import com.yunkuo.common.hibernate3.Updater;

public interface CmsUserSiteDao {
	public CmsUserSite findById(Integer id);

	public CmsUserSite save(CmsUserSite bean);

	public CmsUserSite updateByUpdater(Updater<CmsUserSite> updater);

	public int deleteBySiteId(Integer siteId);

	public CmsUserSite deleteById(Integer id);

	public void delete(CmsUserSite entity);
}