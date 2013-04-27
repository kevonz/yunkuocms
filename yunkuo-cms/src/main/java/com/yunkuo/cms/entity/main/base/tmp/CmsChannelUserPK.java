package com.yunkuo.cms.entity.main.base.tmp;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the cms_channel_user database table.
 * 
 */
@Embeddable
public class CmsChannelUserPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="channel_id")
	private int channelId;

	@Column(name="user_id")
	private int userId;

	public CmsChannelUserPK() {
	}
	public int getChannelId() {
		return this.channelId;
	}
	public void setChannelId(int channelId) {
		this.channelId = channelId;
	}
	public int getUserId() {
		return this.userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CmsChannelUserPK)) {
			return false;
		}
		CmsChannelUserPK castOther = (CmsChannelUserPK)other;
		return 
			(this.channelId == castOther.channelId)
			&& (this.userId == castOther.userId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.channelId;
		hash = hash * prime + this.userId;
		
		return hash;
	}
}