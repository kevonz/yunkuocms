package com.yunkuo.cms.entity.assist.base;

import com.yunkuo.cms.entity.assist.CmsReceiverMessage;
import com.yunkuo.cms.entity.main.CmsSite;
import com.yunkuo.cms.entity.main.CmsUser;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the cms_message database table.
 * 
 */
/*@Entity
@Table(name="cms_message")*/
@MappedSuperclass
public class BaseCmsMessage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="msg_id")
	private Integer id;

	@Column(name="msg_box")
	private Integer msgBox;

	@Lob
	@Column(name="msg_content")
	private String msgContent;

	@Column(name="msg_status")
	private Boolean msgStatus;

	@Column(name="msg_title")
	private String msgTitle;

	@Column(name="send_time")
	private Date sendTime;

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

	//bi-directional many-to-one association to CmsReceiverMessage
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name="msg_id")
	private Set<CmsReceiverMessage> receiverMsgs;

    // constructors
    public BaseCmsMessage () {
        initialize();
    }

    /**
     * Constructor for primary key
     */
    public BaseCmsMessage (java.lang.Integer id) {
        this.setId(id);
        initialize();
    }

    /**
     * Constructor for required fields
     */
    public BaseCmsMessage (
            java.lang.Integer id,
            com.yunkuo.cms.entity.main.CmsUser msgReceiverUser,
            com.yunkuo.cms.entity.main.CmsUser msgSendUser,
            com.yunkuo.cms.entity.main.CmsSite site,
            java.lang.String msgTitle,
            java.lang.Boolean msgStatus,
            java.lang.Integer msgBox) {

        this.setId(id);
        this.setMsgReceiverUser(msgReceiverUser);
        this.setMsgSendUser(msgSendUser);
        this.setSite(site);
        this.setMsgTitle(msgTitle);
        this.setMsgStatus(msgStatus);
        this.setMsgBox(msgBox);
        initialize();
    }

    protected void initialize () {}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer msgId) {
		this.id = msgId;
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

	public Set<CmsReceiverMessage> getReceiverMsgs() {
		return this.receiverMsgs;
	}

	public void setReceiverMsgs(Set<CmsReceiverMessage> cmsReceiverMessages) {
		this.receiverMsgs = cmsReceiverMessages;
	}

/*	public CmsReceiverMessage addCmsReceiverMessage(CmsReceiverMessage cmsReceiverMessage) {
		getReceiverMsgs().add(cmsReceiverMessage);
		cmsReceiverMessage.setCmsMessage(this);

		return cmsReceiverMessage;
	}

	public CmsReceiverMessage removeCmsReceiverMessage(CmsReceiverMessage cmsReceiverMessage) {
		getReceiverMsgs().remove(cmsReceiverMessage);
		cmsReceiverMessage.setCmsMessage(null);

		return cmsReceiverMessage;
	}*/

}