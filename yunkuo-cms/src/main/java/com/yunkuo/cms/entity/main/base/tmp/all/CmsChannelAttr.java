package com.yunkuo.cms.entity.main.base.tmp.all;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cms_channel_attr database table.
 * 
 */
@Entity
@Table(name="cms_channel_attr")
public class CmsChannelAttr implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="attr_name")
	private String attrName;

	@Column(name="attr_value")
	private String attrValue;

	//bi-directional many-to-one association to BaseChannel
	@ManyToOne
	@JoinColumn(name="channel_id")
	private BaseChannel cmsChannel;

	public CmsChannelAttr() {
	}

	public String getAttrName() {
		return this.attrName;
	}

	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}

	public String getAttrValue() {
		return this.attrValue;
	}

	public void setAttrValue(String attrValue) {
		this.attrValue = attrValue;
	}

	public BaseChannel getCmsChannel() {
		return this.cmsChannel;
	}

	public void setCmsChannel(BaseChannel cmsChannel) {
		this.cmsChannel = cmsChannel;
	}

}