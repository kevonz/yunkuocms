package com.yunkuo.core.manager;

import java.util.List;

import com.yunkuo.core.entity.Ftp;

public interface FtpMng {
	public List<Ftp> getList();

	public Ftp findById(Integer id);

	public Ftp save(Ftp bean);

	public Ftp update(Ftp bean);

	public Ftp deleteById(Integer id);

	public Ftp[] deleteByIds(Integer[] ids);
}