package com.yunkuo.cms.entity.assist.base;

import com.yunkuo.cms.entity.assist.CmsMessage;
import com.yunkuo.cms.entity.main.CmsSite;
import com.yunkuo.cms.entity.main.CmsUser;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the cms_receiver_message database table.
 * 
 */
/*@Entity
@Table(name="cms_receiver_message")*/
@MappedSuperclass
public class BaseCmsReceiverMessage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="msg_re_id")
	private Integer id;

	@Column(name="msg_box")
	private int msgBox;

	@Lob
	@Column(name="msg_content")
	private String msgContent;

	@Column(name="msg_status")
	private Boolean msgStatus;

	@Column(name="msg_title")
	private String msgTitle;

	@Column(name="send_time")
	private Date sendTime;

	//bi-directional many-to-one association to CmsMessage
	@ManyToOne
	@JoinColumn(name="msg_id")
	private CmsMessage message;

	//bi-directional many-to-one association to CmsSite
	@ManyToOne
	@JoinColumn(name="site_id")
	private CmsSite site;

	//bi-directional many-to-one association to CmsUser
	@ManyToOne
	@JoinColumn(name="msg_receiver_user")
	private CmsUser msgReceiverUser;

	//bi-directional many-to-one association to CmsUser
	@ManyToOne
	@JoinColumn(name="msg_send_user")
	private CmsUser msgSendUser;

    // constructors
    public BaseCmsReceiverMessage () {
        initialize();
    }

    /**
     * Constructor for primary key
     */
    public BaseCmsReceiverMessage (java.lang.Integer id) {
        this.setId(id);
        initialize();
    }

    /**
     * Constructor for required fields
     */
    public BaseCmsReceiverMessage (
            java.lang.Integer id,
            com.yunkuo.cms.entity.main.CmsUser msgReceiverUser,
            com.yunkuo.cms.entity.main.CmsUser msgSendUser,
            com.yunkuo.cms.entity.main.CmsSite site,
            java.lang.String msgTitle,
            java.lang.String msgContent,
            java.util.Date sendTime,
            boolean msgStatus,
            java.lang.Integer msgBox) {

        this.setId(id);
        this.setMsgReceiverUser(msgReceiverUser);
        this.setMsgSendUser(msgSendUser);
        this.setSite(site);
        this.setMsgTitle(msgTitle);
        this.setMsgContent(msgContent);
        this.setSendTime(sendTime);
        this.setMsgStatus(msgStatus);
        this.setMsgBox(msgBox);
        initialize();
    }

    protected void initialize () {}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer msgReId) {
		this.id = msgReId;
	}

	public Integer getMsgBox() {
		return this.msgBox;
	}

	public void setMsgBox(Integer msgBox) {
		this.msgBox = msgBox;
	}

	public String getMsgContent() {
		return this.msgContent;
	}

	public void setMsgContent(String msgContent) {
		this.msgContent = msgContent;
	}

	public Boolean getMsgStatus() {
		return this.msgStatus;
	}

	public void setMsgStatus(Boolean msgStatus) {
		this.msgStatus = msgStatus;
	}

	public String getMsgTitle() {
		return this.msgTitle;
	}

	public void setMsgTitle(String msgTitle) {
		this.msgTitle = msgTitle;
	}

	public Date getSendTime() {
		return this.sendTime;
	}

	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}

	public CmsMessage getMessage() {
		return this.message;
	}

	public void setMessage(CmsMessage cmsMessage) {
		this.message = cmsMessage;
	}

	public CmsSite getSite() {
		return this.site;
	}

	public void setSite(CmsSite cmsSite) {
		this.site = cmsSite;
	}

	public CmsUser getMsgReceiverUser() {
		return this.msgReceiverUser;
	}

	public void setMsgReceiverUser(CmsUser cmsUser1) {
		this.msgReceiverUser = cmsUser1;
	}

	public CmsUser getMsgSendUser() {
		return this.msgSendUser;
	}

	public void setMsgSendUser(CmsUser cmsUser2) {
		this.msgSendUser = cmsUser2;
	}

}