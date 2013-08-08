package com.yunkuo.cms.entity.main.base;

import com.yunkuo.cms.entity.assist.CmsMessage;
import com.yunkuo.cms.entity.assist.CmsReceiverMessage;
import com.yunkuo.cms.entity.main.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;


/**
 * The persistent class for the cms_user database table.
 * 
 */
/*@Entity
@Table(name="cms_user")*/
@MappedSuperclass
public class BaseCmsUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id")
	private Integer id;

	private String email;

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public Boolean getSelfAdmin() {
        return selfAdmin;
    }

    public void setSelfAdmin(Boolean selfAdmin) {
        this.selfAdmin = selfAdmin;
    }

    public Boolean getViewonlyAdmin() {
        return viewonlyAdmin;
    }

    public void setViewonlyAdmin(Boolean viewonlyAdmin) {
        this.viewonlyAdmin = viewonlyAdmin;
    }

    public Set<Channel> getChannels() {
        return channels;
    }

    public void setChannels(Set<Channel> channels) {
        this.channels = channels;
    }

    @Column(name="is_admin")
	private Boolean admin;

	@Column(name="is_disabled")
	private Boolean disabled;

	@Column(name="is_self_admin")
	private Boolean selfAdmin;

	@Column(name="is_viewonly_admin")
	private Boolean viewonlyAdmin;

	@Column(name="last_login_ip")
	private String lastLoginIp;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_login_time")
	private Date lastLoginTime;

	@Column(name="login_count")
	private Integer loginCount;

	private Integer rank;

	@Column(name="register_ip")
	private String registerIp;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="register_time")
	private Date registerTime;

	@Temporal(TemporalType.DATE)
	@Column(name="upload_date")
	private Date uploadDate;

	@Column(name="upload_size")
	private Integer uploadSize;

	@Column(name="upload_total")
	private Long uploadTotal;

	private String username;



    //bi-directional many-to-one association to CmsGroup
    @ManyToOne
    @JoinColumn(name="group_id")
    private CmsGroup group;

    //bi-directional one-to-one association to CmsUserExt
    @OneToMany
    @JoinColumn(name="user_id")
    private Set<CmsUserExt> userExtSet;

    //bi-directional many-to-one association to CmsUserSite
    @OneToMany
    @JoinColumn(name="user_id")
    private Set<CmsUserSite> userSites;

    //bi-directional many-to-many association to CmsRole
    @ManyToMany
    @JoinTable(
            name="cms_user_role"
            , joinColumns={
            @JoinColumn(name="user_id")
    }
            , inverseJoinColumns={
            @JoinColumn(name="role_id")
    }
    )
    private Set<CmsRole> roles;


    //bi-directional many-to-many association to Channel
    @ManyToMany
    @JoinTable(
            name="cms_channel_user"
            , joinColumns={
            @JoinColumn(name="user_id")
    }
            , inverseJoinColumns={
            @JoinColumn(name="channel_id")
    }
    )
    private Set<Channel> channels;



    //bi-directional many-to-many association to CmsContent
    @ManyToMany
    @JoinTable(
            name="cms_user_collection"
            , joinColumns={
            @JoinColumn(name="user_id")
    }
            , inverseJoinColumns={
            @JoinColumn(name="content_id")
    }
    )
    private Set<Content> collectContents;


    //bi-directional many-to-one association to CmsMessage
    @OneToMany
    @JoinColumn(name = "msg_send_user")
    private List<CmsMessage> sendMessages;

    //bi-directional many-to-one association to CmsMessage
    @OneToMany
    @JoinColumn(name = "msg_receiver_user")
    private List<CmsMessage> receivMessages;


    //bi-directional many-to-one association to CmsReceiverMessage
    @OneToMany
    @JoinColumn(name = "msg_send_user")
    private List<CmsReceiverMessage> sendReceiverMessages;

    //bi-directional many-to-one association to CmsReceiverMessage
    @OneToMany
    @JoinColumn(name = "msg_receiver_user")
    private List<CmsReceiverMessage> receivReceiverMessages;








/*


    //bi-directional many-to-one association to CmsLog
	@OneToMany(mappedBy="cmsUser")
	private List<CmsLog> cmsLogs;

	//bi-directional many-to-one association to CmsAcquisition
	@OneToMany(mappedBy="cmsUser")
	private List<CmsAcquisition> cmsAcquisitions;

	//bi-directional many-to-many association to BaseChannel
	@ManyToMany(mappedBy="cmsUsers")
	private List<BaseChannel> cmsChannels;

	//bi-directional many-to-one association to CmsComment
	@OneToMany(mappedBy="cmsUser1")
	private List<CmsComment> cmsComments1;

	//bi-directional many-to-one association to CmsComment
	@OneToMany(mappedBy="cmsUser2")
	private List<CmsComment> cmsComments2;

	//bi-directional many-to-one association to Content
	@OneToMany(mappedBy="cmsUser")
	private List<Content> cmsContents1;

	//bi-directional many-to-one association to ContentCheck
	@OneToMany(mappedBy="cmsUser")
	private List<CmsContentCheck> cmsContentChecks;

	//bi-directional many-to-one association to CmsGuestbook
	@OneToMany(mappedBy="cmsUser1")
	private List<CmsGuestbook> cmsGuestbooks1;

	//bi-directional many-to-one association to CmsGuestbook
	@OneToMany(mappedBy="cmsUser2")
	private List<CmsGuestbook> cmsGuestbooks2;



	//bi-directional many-to-many association to CmsDepartment
	@ManyToMany(mappedBy="cmsUsers")
	private List<CmsDepartment> cmsDepartments;


	//bi-directional many-to-one association to CmsVoteRecord
	@OneToMany(mappedBy="cmsUser")
	private List<CmsVoteRecord> cmsVoteRecords;
*/

    // constructors
    public BaseCmsUser () {
        initialize();
    }

    /**
     * Constructor for primary key
     */
    public BaseCmsUser (java.lang.Integer id) {
        this.setId(id);
        initialize();
    }
    /**
     * Constructor for required fields
     */
    public BaseCmsUser (
            java.lang.Integer id,
            com.yunkuo.cms.entity.main.CmsGroup group,
            java.lang.String username,
            java.util.Date registerTime,
            java.lang.String registerIp,
            java.lang.Integer loginCount,
            java.lang.Integer rank,
            java.lang.Long uploadTotal,
            java.lang.Integer uploadSize,
            java.lang.Boolean admin,
            java.lang.Boolean viewonlyAdmin,
            java.lang.Boolean selfAdmin,
            java.lang.Boolean disabled) {

        this.setId(id);
        this.setGroup(group);
        this.setUsername(username);
        this.setRegisterTime(registerTime);
        this.setRegisterIp(registerIp);
        this.setLoginCount(loginCount);
        this.setRank(rank);
        this.setUploadTotal(uploadTotal);
        this.setUploadSize(uploadSize);
        this.setAdmin(admin);
        this.setViewonlyAdmin(viewonlyAdmin);
        this.setSelfAdmin(selfAdmin);
        this.setDisabled(disabled);
        initialize();
    }

    protected void initialize () {}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer userId) {
		this.id = userId;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getLastLoginIp() {
		return this.lastLoginIp;
	}

	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	public Date getLastLoginTime() {
		return this.lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public Integer getLoginCount() {
		return this.loginCount;
	}

	public void setLoginCount(Integer loginCount) {
		this.loginCount = loginCount;
	}

	public Integer getRank() {
		return this.rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public String getRegisterIp() {
		return this.registerIp;
	}

	public void setRegisterIp(String registerIp) {
		this.registerIp = registerIp;
	}

	public Date getRegisterTime() {
		return this.registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	public Date getUploadDate() {
		return this.uploadDate;
	}

	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}

	public Integer getUploadSize() {
		return this.uploadSize;
	}

	public void setUploadSize(Integer uploadSize) {
		this.uploadSize = uploadSize;
	}

	public Long getUploadTotal() {
		return this.uploadTotal;
	}

	public void setUploadTotal(Long uploadTotal) {
		this.uploadTotal = uploadTotal;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
/*
	public List<CmsLog> getCmsLogs() {
		return this.cmsLogs;
	}

	public void setCmsLogs(List<CmsLog> cmsLogs) {
		this.cmsLogs = cmsLogs;
	}

	public CmsLog addCmsLog(CmsLog cmsLog) {
		getCmsLogs().add(cmsLog);
		cmsLog.setCmsUser(this);

		return cmsLog;
	}

	public CmsLog removeCmsLog(CmsLog cmsLog) {
		getCmsLogs().remove(cmsLog);
		cmsLog.setCmsUser(null);

		return cmsLog;
	}


	public List<CmsAcquisition> getCmsAcquisitions() {
		return this.cmsAcquisitions;
	}

	public void setCmsAcquisitions(List<CmsAcquisition> cmsAcquisitions) {
		this.cmsAcquisitions = cmsAcquisitions;
	}

	public CmsAcquisition addCmsAcquisition(CmsAcquisition cmsAcquisition) {
		getCmsAcquisitions().add(cmsAcquisition);
		cmsAcquisition.setCmsUser(this);

		return cmsAcquisition;
	}

	public CmsAcquisition removeCmsAcquisition(CmsAcquisition cmsAcquisition) {
		getCmsAcquisitions().remove(cmsAcquisition);
		cmsAcquisition.setCmsUser(null);

		return cmsAcquisition;
	}

	public List<BaseChannel> getCmsChannels() {
		return this.cmsChannels;
	}

	public void setCmsChannels(List<BaseChannel> cmsChannels) {
		this.cmsChannels = cmsChannels;
	}

	public List<CmsComment> getCmsComments1() {
		return this.cmsComments1;
	}

	public void setCmsComments1(List<CmsComment> cmsComments1) {
		this.cmsComments1 = cmsComments1;
	}

	public CmsComment addCmsComments1(CmsComment cmsComments1) {
		getCmsComments1().add(cmsComments1);
		cmsComments1.setCmsUser1(this);

		return cmsComments1;
	}

	public CmsComment removeCmsComments1(CmsComment cmsComments1) {
		getCmsComments1().remove(cmsComments1);
		cmsComments1.setCmsUser1(null);

		return cmsComments1;
	}

	public List<CmsComment> getCmsComments2() {
		return this.cmsComments2;
	}

	public void setCmsComments2(List<CmsComment> cmsComments2) {
		this.cmsComments2 = cmsComments2;
	}

	public CmsComment addCmsComments2(CmsComment cmsComments2) {
		getCmsComments2().add(cmsComments2);
		cmsComments2.setCmsUser2(this);

		return cmsComments2;
	}

	public CmsComment removeCmsComments2(CmsComment cmsComments2) {
		getCmsComments2().remove(cmsComments2);
		cmsComments2.setCmsUser2(null);

		return cmsComments2;
	}

	public List<CmsContent> getCmsContents1() {
		return this.cmsContents1;
	}

	public void setCmsContents1(List<CmsContent> cmsContents1) {
		this.cmsContents1 = cmsContents1;
	}

	public CmsContent addCmsContents1(CmsContent cmsContents1) {
		getCmsContents1().add(cmsContents1);
		cmsContents1.setCmsUser(this);

		return cmsContents1;
	}

	public CmsContent removeCmsContents1(CmsContent cmsContents1) {
		getCmsContents1().remove(cmsContents1);
		cmsContents1.setCmsUser(null);

		return cmsContents1;
	}

	public List<CmsContentCheck> getCmsContentChecks() {
		return this.cmsContentChecks;
	}

	public void setCmsContentChecks(List<CmsContentCheck> cmsContentChecks) {
		this.cmsContentChecks = cmsContentChecks;
	}

	public CmsContentCheck addCmsContentCheck(CmsContentCheck cmsContentCheck) {
		getCmsContentChecks().add(cmsContentCheck);
		cmsContentCheck.setCmsUser(this);

		return cmsContentCheck;
	}

	public CmsContentCheck removeCmsContentCheck(CmsContentCheck cmsContentCheck) {
		getCmsContentChecks().remove(cmsContentCheck);
		cmsContentCheck.setCmsUser(null);

		return cmsContentCheck;
	}

	public List<CmsGuestbook> getCmsGuestbooks1() {
		return this.cmsGuestbooks1;
	}

	public void setCmsGuestbooks1(List<CmsGuestbook> cmsGuestbooks1) {
		this.cmsGuestbooks1 = cmsGuestbooks1;
	}

	public CmsGuestbook addCmsGuestbooks1(CmsGuestbook cmsGuestbooks1) {
		getCmsGuestbooks1().add(cmsGuestbooks1);
		cmsGuestbooks1.setCmsUser1(this);

		return cmsGuestbooks1;
	}

	public CmsGuestbook removeCmsGuestbooks1(CmsGuestbook cmsGuestbooks1) {
		getCmsGuestbooks1().remove(cmsGuestbooks1);
		cmsGuestbooks1.setCmsUser1(null);

		return cmsGuestbooks1;
	}

	public List<CmsGuestbook> getCmsGuestbooks2() {
		return this.cmsGuestbooks2;
	}

	public void setCmsGuestbooks2(List<CmsGuestbook> cmsGuestbooks2) {
		this.cmsGuestbooks2 = cmsGuestbooks2;
	}

	public CmsGuestbook addCmsGuestbooks2(CmsGuestbook cmsGuestbooks2) {
		getCmsGuestbooks2().add(cmsGuestbooks2);
		cmsGuestbooks2.setCmsUser2(this);

		return cmsGuestbooks2;
	}

	public CmsGuestbook removeCmsGuestbooks2(CmsGuestbook cmsGuestbooks2) {
		getCmsGuestbooks2().remove(cmsGuestbooks2);
		cmsGuestbooks2.setCmsUser2(null);

		return cmsGuestbooks2;
	}
*/

	public List<CmsMessage> getSendMessages() {
		return this.sendMessages;
	}

	public void setSendMessages(List<CmsMessage> cmsMessages1) {
		this.sendMessages = cmsMessages1;
	}
/*

	public CmsMessage addCmsMessages1(CmsMessage cmsMessages1) {
		getSendMessages().add(cmsMessages1);
		cmsMessages1.setCmsUser1(this);

		return cmsMessages1;
	}

	public CmsMessage removeCmsMessages1(CmsMessage cmsMessages1) {
		getSendMessages().remove(cmsMessages1);
		cmsMessages1.setCmsUser1(null);

		return cmsMessages1;
	}
*/

	public List<CmsMessage> getReceivMessages() {
		return this.receivMessages;
	}

	public void setReceivMessages(List<CmsMessage> cmsMessages2) {
		this.receivMessages = cmsMessages2;
	}

	/*public CmsMessage addCmsMessages2(CmsMessage cmsMessages2) {
		getReceivMessages().add(cmsMessages2);
		cmsMessages2.setCmsUser2(this);

		return cmsMessages2;
	}

	public CmsMessage removeCmsMessages2(CmsMessage cmsMessages2) {
		getReceivMessages().remove(cmsMessages2);
		cmsMessages2.setCmsUser2(null);

		return cmsMessages2;
	}
*/
	public List<CmsReceiverMessage> getSendReceiverMessages() {
		return this.sendReceiverMessages;
	}

	public void setSendReceiverMessages(List<CmsReceiverMessage> cmsReceiverMessages1) {
		this.sendReceiverMessages = cmsReceiverMessages1;
	}

	/*public CmsReceiverMessage addCmsReceiverMessages1(CmsReceiverMessage cmsReceiverMessages1) {
		getSendReceiverMessages().add(cmsReceiverMessages1);
		cmsReceiverMessages1.setCmsUser1(this);

		return cmsReceiverMessages1;
	}

	public CmsReceiverMessage removeCmsReceiverMessages1(CmsReceiverMessage cmsReceiverMessages1) {
		getSendReceiverMessages().remove(cmsReceiverMessages1);
		cmsReceiverMessages1.setCmsUser1(null);

		return cmsReceiverMessages1;
	}
*/
	public List<CmsReceiverMessage> getReceivReceiverMessages() {
		return this.receivReceiverMessages;
	}

	public void setReceivReceiverMessages(List<CmsReceiverMessage> cmsReceiverMessages2) {
		this.receivReceiverMessages = cmsReceiverMessages2;
	}

	/*public CmsReceiverMessage addCmsReceiverMessages2(CmsReceiverMessage cmsReceiverMessages2) {
		getReceivReceiverMessages().add(cmsReceiverMessages2);
		cmsReceiverMessages2.setCmsUser2(this);

		return cmsReceiverMessages2;
	}

	public CmsReceiverMessage removeCmsReceiverMessages2(CmsReceiverMessage cmsReceiverMessages2) {
		getReceivReceiverMessages().remove(cmsReceiverMessages2);
		cmsReceiverMessages2.setCmsUser2(null);

		return cmsReceiverMessages2;
	}
*/
	public CmsGroup getGroup() {
		return this.group;
	}

	public void setGroup(CmsGroup cmsGroup) {
		this.group = cmsGroup;
	}

	public Set<Content> getCollectContents() {
		return this.collectContents;
	}

	public void setCollectContents(Set<Content> cmsContents2) {
		this.collectContents = cmsContents2;
	}

/*	public List<CmsDepartment> getCmsDepartments() {
		return this.cmsDepartments;
	}

	public void setCmsDepartments(List<CmsDepartment> cmsDepartments) {
		this.cmsDepartments = cmsDepartments;
	}*/

	public Set<CmsUserExt> getUserExtSet() {
		return this.userExtSet;
	}

	public void setUserExtSet(Set<CmsUserExt> cmsUserExt) {
		this.userExtSet = cmsUserExt;
	}

	public Set<CmsRole> getRoles() {
		return this.roles;
	}

	public void setRoles(Set<CmsRole> cmsRoles) {
		this.roles = cmsRoles;
	}

	public Set<CmsUserSite> getUserSites() {
		return this.userSites;
	}

	public void setUserSites(Set<CmsUserSite> cmsUserSites) {
		this.userSites = cmsUserSites;
	}

	/*public CmsUserSite addCmsUserSite(CmsUserSite cmsUserSite) {
		getUserSites().add(cmsUserSite);
		cmsUserSite.setCmsUser(this);

		return cmsUserSite;
	}

	public CmsUserSite removeCmsUserSite(CmsUserSite cmsUserSite) {
		getUserSites().remove(cmsUserSite);
		cmsUserSite.setCmsUser(null);

		return cmsUserSite;
	}

	public List<CmsVoteRecord> getCmsVoteRecords() {
		return this.cmsVoteRecords;
	}

	public void setCmsVoteRecords(List<CmsVoteRecord> cmsVoteRecords) {
		this.cmsVoteRecords = cmsVoteRecords;
	}

	public CmsVoteRecord addCmsVoteRecord(CmsVoteRecord cmsVoteRecord) {
		getCmsVoteRecords().add(cmsVoteRecord);
		cmsVoteRecord.setCmsUser(this);

		return cmsVoteRecord;
	}

	public CmsVoteRecord removeCmsVoteRecord(CmsVoteRecord cmsVoteRecord) {
		getCmsVoteRecords().remove(cmsVoteRecord);
		cmsVoteRecord.setCmsUser(null);

		return cmsVoteRecord;
	}
*/
}