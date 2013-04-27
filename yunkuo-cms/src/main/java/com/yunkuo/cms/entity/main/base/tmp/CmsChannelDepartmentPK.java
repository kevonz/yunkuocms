package com.yunkuo.cms.entity.main.base.tmp;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the cms_channel_department database table.
 * 
 */
@Embeddable
public class CmsChannelDepartmentPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="channel_id")
	private int channelId;

	@Column(name="department_id")
	private int departmentId;

	public CmsChannelDepartmentPK() {
	}
	public int getChannelId() {
		return this.channelId;
	}
	public void setChannelId(int channelId) {
		this.channelId = channelId;
	}
	public int getDepartmentId() {
		return this.departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CmsChannelDepartmentPK)) {
			return false;
		}
		CmsChannelDepartmentPK castOther = (CmsChannelDepartmentPK)other;
		return 
			(this.channelId == castOther.channelId)
			&& (this.departmentId == castOther.departmentId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.channelId;
		hash = hash * prime + this.departmentId;
		
		return hash;
	}
}