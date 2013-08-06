package com.yunkuo.cms.entity.main;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the cms_channel_attr database table.
 * 
 */
@Entity
@Table(name="cms_channel_attr")
public class CmsChannelAttr implements Serializable {
	private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private java.lang.Integer id;

	@Column(name="attr_name")
	private String attrName;

	@Column(name="attr_value")
	private String attrValue;

	//bi-directional many-to-one association to BaseChannel
	@ManyToOne
	@JoinColumn(name="channel_id")
	private Channel cmsChannel;

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

	public Channel getCmsChannel() {
		return this.cmsChannel;
	}

	public void setCmsChannel(Channel cmsChannel) {
		this.cmsChannel = cmsChannel;
	}

}