package com.yunkuo.cms.entity.main.base.tmp;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cms_channel_user database table.
 * 
 */
@Entity
@Table(name="cms_channel_user")
public class CmsChannelUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CmsChannelUserPK id;

	//bi-directional many-to-one association to BaseChannel
	@ManyToOne
	@JoinColumn(name="channel_id")
	private BaseChannel cmsChannel;

	public CmsChannelUser() {
	}

	public CmsChannelUserPK getId() {
		return this.id;
	}

	public void setId(CmsChannelUserPK id) {
		this.id = id;
	}

	public BaseChannel getCmsChannel() {
		return this.cmsChannel;
	}

	public void setCmsChannel(BaseChannel cmsChannel) {
		this.cmsChannel = cmsChannel;
	}

}