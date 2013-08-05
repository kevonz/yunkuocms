package com.yunkuo.cms.entity.main.base.tmp.all;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cms_content_share_check database table.
 * 
 */
@Entity
@Table(name="cms_content_share_check")
public class CmsContentShareCheck implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="share_check_id")
	private int shareCheckId;

	@Column(name="check_opinion")
	private String checkOpinion;

	@Column(name="check_status")
	private byte checkStatus;

	@Column(name="share_valid")
	private byte shareValid;

	//bi-directional many-to-one association to BaseChannel
	@ManyToOne
	@JoinColumn(name="channel_id")
	private BaseChannel cmsChannel;

	//bi-directional many-to-one association to CmsContent
	@ManyToOne
	@JoinColumn(name="content_id")
	private CmsContent cmsContent;

	public CmsContentShareCheck() {
	}

	public int getShareCheckId() {
		return this.shareCheckId;
	}

	public void setShareCheckId(int shareCheckId) {
		this.shareCheckId = shareCheckId;
	}

	public String getCheckOpinion() {
		return this.checkOpinion;
	}

	public void setCheckOpinion(String checkOpinion) {
		this.checkOpinion = checkOpinion;
	}

	public byte getCheckStatus() {
		return this.checkStatus;
	}

	public void setCheckStatus(byte checkStatus) {
		this.checkStatus = checkStatus;
	}

	public byte getShareValid() {
		return this.shareValid;
	}

	public void setShareValid(byte shareValid) {
		this.shareValid = shareValid;
	}

	public BaseChannel getCmsChannel() {
		return this.cmsChannel;
	}

	public void setCmsChannel(BaseChannel cmsChannel) {
		this.cmsChannel = cmsChannel;
	}

	public CmsContent getCmsContent() {
		return this.cmsContent;
	}

	public void setCmsContent(CmsContent cmsContent) {
		this.cmsContent = cmsContent;
	}

}