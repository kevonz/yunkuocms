package com.yunkuo.cms.dao.main;

import net.sf.ehcache.Ehcache;

import com.yunkuo.cms.entity.main.ContentCount;
import com.yunkuo.common.hibernate3.Updater;

public interface ContentCountDao {
	public int clearCount(boolean week, boolean month);

	public int copyCount();

	public int freshCacheToDB(Ehcache cache);

	public ContentCount findById(Integer id);

	public ContentCount save(ContentCount bean);

	public ContentCount updateByUpdater(Updater<ContentCount> updater);
}