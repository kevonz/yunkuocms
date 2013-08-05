package com.yunkuo.cms.entity.main.base.tmp.all;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the cms_content_picture database table.
 * 
 */
@Embeddable
public class CmsContentPicturePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="content_id")
	private int contentId;

	private int priority;

	public CmsContentPicturePK() {
	}
	public int getContentId() {
		return this.contentId;
	}
	public void setContentId(int contentId) {
		this.contentId = contentId;
	}
	public int getPriority() {
		return this.priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CmsContentPicturePK)) {
			return false;
		}
		CmsContentPicturePK castOther = (CmsContentPicturePK)other;
		return 
			(this.contentId == castOther.contentId)
			&& (this.priority == castOther.priority);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.contentId;
		hash = hash * prime + this.priority;
		
		return hash;
	}
}