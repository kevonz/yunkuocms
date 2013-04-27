package com.yunkuo.cms.entity.main.base.tmp;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cms_channel_txt database table.
 * 
 */
@Entity
@Table(name="cms_channel_txt")
public class CmsChannelTxt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="channel_id")
	private int channelId;

	@Lob
	private String txt;

	@Lob
	private String txt1;

	@Lob
	private String txt2;

	@Lob
	private String txt3;

	//bi-directional one-to-one association to BaseChannel
	@OneToOne
	@JoinColumn(name="channel_id")
	private BaseChannel cmsChannel;

	public CmsChannelTxt() {
	}

	public int getChannelId() {
		return this.channelId;
	}

	public void setChannelId(int channelId) {
		this.channelId = channelId;
	}

	public String getTxt() {
		return this.txt;
	}

	public void setTxt(String txt) {
		this.txt = txt;
	}

	public String getTxt1() {
		return this.txt1;
	}

	public void setTxt1(String txt1) {
		this.txt1 = txt1;
	}

	public String getTxt2() {
		return this.txt2;
	}

	public void setTxt2(String txt2) {
		this.txt2 = txt2;
	}

	public String getTxt3() {
		return this.txt3;
	}

	public void setTxt3(String txt3) {
		this.txt3 = txt3;
	}

	public BaseChannel getCmsChannel() {
		return this.cmsChannel;
	}

	public void setCmsChannel(BaseChannel cmsChannel) {
		this.cmsChannel = cmsChannel;
	}

}