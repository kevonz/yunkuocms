package com.yunkuo.cms.entity.main.base.tmp.all;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the cms_receiver_message database table.
 * 
 */
@Entity
@Table(name="cms_receiver_message")
public class CmsReceiverMessage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="msg_re_id")
	private int msgReId;

	@Column(name="msg_box")
	private int msgBox;

	@Lob
	@Column(name="msg_content")
	private String msgContent;

	@Column(name="msg_status")
	private byte msgStatus;

	@Column(name="msg_title")
	private String msgTitle;

	@Column(name="send_time")
	private Timestamp sendTime;

	//bi-directional many-to-one association to CmsMessage
	@ManyToOne
	@JoinColumn(name="msg_id")
	private CmsMessage cmsMessage;

	//bi-directional many-to-one association to CmsSite
	@ManyToOne
	@JoinColumn(name="site_id")
	private CmsSite cmsSite;

	//bi-directional many-to-one association to CmsUser
	@ManyToOne
	@JoinColumn(name="msg_receiver_user")
	private CmsUser cmsUser1;

	//bi-directional many-to-one association to CmsUser
	@ManyToOne
	@JoinColumn(name="msg_send_user")
	private CmsUser cmsUser2;

	public CmsReceiverMessage() {
	}

	public int getMsgReId() {
		return this.msgReId;
	}

	public void setMsgReId(int msgReId) {
		this.msgReId = msgReId;
	}

	public int getMsgBox() {
		return this.msgBox;
	}

	public void setMsgBox(int msgBox) {
		this.msgBox = msgBox;
	}

	public String getMsgContent() {
		return this.msgContent;
	}

	public void setMsgContent(String msgContent) {
		this.msgContent = msgContent;
	}

	public byte getMsgStatus() {
		return this.msgStatus;
	}

	public void setMsgStatus(byte msgStatus) {
		this.msgStatus = msgStatus;
	}

	public String getMsgTitle() {
		return this.msgTitle;
	}

	public void setMsgTitle(String msgTitle) {
		this.msgTitle = msgTitle;
	}

	public Timestamp getSendTime() {
		return this.sendTime;
	}

	public void setSendTime(Timestamp sendTime) {
		this.sendTime = sendTime;
	}

	public CmsMessage getCmsMessage() {
		return this.cmsMessage;
	}

	public void setCmsMessage(CmsMessage cmsMessage) {
		this.cmsMessage = cmsMessage;
	}

	public CmsSite getCmsSite() {
		return this.cmsSite;
	}

	public void setCmsSite(CmsSite cmsSite) {
		this.cmsSite = cmsSite;
	}

	public CmsUser getCmsUser1() {
		return this.cmsUser1;
	}

	public void setCmsUser1(CmsUser cmsUser1) {
		this.cmsUser1 = cmsUser1;
	}

	public CmsUser getCmsUser2() {
		return this.cmsUser2;
	}

	public void setCmsUser2(CmsUser cmsUser2) {
		this.cmsUser2 = cmsUser2;
	}

}