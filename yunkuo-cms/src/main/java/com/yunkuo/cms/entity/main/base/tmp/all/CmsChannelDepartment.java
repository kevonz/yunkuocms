package com.yunkuo.cms.entity.main.base.tmp.all;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cms_channel_department database table.
 * 
 */
@Entity
@Table(name="cms_channel_department")
public class CmsChannelDepartment implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CmsChannelDepartmentPK id;

	//bi-directional many-to-one association to BaseChannel
	@ManyToOne
	@JoinColumn(name="channel_id")
	private BaseChannel cmsChannel;

	public CmsChannelDepartment() {
	}

	public CmsChannelDepartmentPK getId() {
		return this.id;
	}

	public void setId(CmsChannelDepartmentPK id) {
		this.id = id;
	}

	public BaseChannel getCmsChannel() {
		return this.cmsChannel;
	}

	public void setCmsChannel(BaseChannel cmsChannel) {
		this.cmsChannel = cmsChannel;
	}

}