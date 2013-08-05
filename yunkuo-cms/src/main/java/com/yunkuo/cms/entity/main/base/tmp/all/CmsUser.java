package com.yunkuo.cms.entity.main.base.tmp.all;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the cms_user database table.
 * 
 */
@Entity
@Table(name="cms_user")
public class CmsUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id")
	private int userId;

	private String email;

	@Column(name="is_admin")
	private byte isAdmin;

	@Column(name="is_disabled")
	private byte isDisabled;

	@Column(name="is_self_admin")
	private byte isSelfAdmin;

	@Column(name="is_viewonly_admin")
	private byte isViewonlyAdmin;

	@Column(name="last_login_ip")
	private String lastLoginIp;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_login_time")
	private Date lastLoginTime;

	@Column(name="login_count")
	private int loginCount;

	private int rank;

	@Column(name="register_ip")
	private String registerIp;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="register_time")
	private Date registerTime;

	@Temporal(TemporalType.DATE)
	@Column(name="upload_date")
	private Date uploadDate;

	@Column(name="upload_size")
	private int uploadSize;

	@Column(name="upload_total")
	private BigInteger uploadTotal;

	private String username;

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

	//bi-directional many-to-one association to CmsContent
	@OneToMany(mappedBy="cmsUser")
	private List<CmsContent> cmsContents1;

	//bi-directional many-to-one association to CmsContentCheck
	@OneToMany(mappedBy="cmsUser")
	private List<CmsContentCheck> cmsContentChecks;

	//bi-directional many-to-one association to CmsGuestbook
	@OneToMany(mappedBy="cmsUser1")
	private List<CmsGuestbook> cmsGuestbooks1;

	//bi-directional many-to-one association to CmsGuestbook
	@OneToMany(mappedBy="cmsUser2")
	private List<CmsGuestbook> cmsGuestbooks2;

	//bi-directional many-to-one association to CmsMessage
	@OneToMany(mappedBy="cmsUser1")
	private List<CmsMessage> cmsMessages1;

	//bi-directional many-to-one association to CmsMessage
	@OneToMany(mappedBy="cmsUser2")
	private List<CmsMessage> cmsMessages2;

	//bi-directional many-to-one association to CmsReceiverMessage
	@OneToMany(mappedBy="cmsUser1")
	private List<CmsReceiverMessage> cmsReceiverMessages1;

	//bi-directional many-to-one association to CmsReceiverMessage
	@OneToMany(mappedBy="cmsUser2")
	private List<CmsReceiverMessage> cmsReceiverMessages2;

	//bi-directional many-to-one association to CmsGroup
	@ManyToOne
	@JoinColumn(name="group_id")
	private CmsGroup cmsGroup;

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
	private List<CmsContent> cmsContents2;

	//bi-directional many-to-many association to CmsDepartment
	@ManyToMany(mappedBy="cmsUsers")
	private List<CmsDepartment> cmsDepartments;

	//bi-directional one-to-one association to CmsUserExt
	@OneToOne(mappedBy="cmsUser")
	private CmsUserExt cmsUserExt;

	//bi-directional many-to-many association to CmsRole
	@ManyToMany(mappedBy="cmsUsers")
	private List<CmsRole> cmsRoles;

	//bi-directional many-to-one association to CmsUserSite
	@OneToMany(mappedBy="cmsUser")
	private List<CmsUserSite> cmsUserSites;

	//bi-directional many-to-one association to CmsVoteRecord
	@OneToMany(mappedBy="cmsUser")
	private List<CmsVoteRecord> cmsVoteRecords;

	public CmsUser() {
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public byte getIsAdmin() {
		return this.isAdmin;
	}

	public void setIsAdmin(byte isAdmin) {
		this.isAdmin = isAdmin;
	}

	public byte getIsDisabled() {
		return this.isDisabled;
	}

	public void setIsDisabled(byte isDisabled) {
		this.isDisabled = isDisabled;
	}

	public byte getIsSelfAdmin() {
		return this.isSelfAdmin;
	}

	public void setIsSelfAdmin(byte isSelfAdmin) {
		this.isSelfAdmin = isSelfAdmin;
	}

	public byte getIsViewonlyAdmin() {
		return this.isViewonlyAdmin;
	}

	public void setIsViewonlyAdmin(byte isViewonlyAdmin) {
		this.isViewonlyAdmin = isViewonlyAdmin;
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

	public int getLoginCount() {
		return this.loginCount;
	}

	public void setLoginCount(int loginCount) {
		this.loginCount = loginCount;
	}

	public int getRank() {
		return this.rank;
	}

	public void setRank(int rank) {
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

	public int getUploadSize() {
		return this.uploadSize;
	}

	public void setUploadSize(int uploadSize) {
		this.uploadSize = uploadSize;
	}

	public BigInteger getUploadTotal() {
		return this.uploadTotal;
	}

	public void setUploadTotal(BigInteger uploadTotal) {
		this.uploadTotal = uploadTotal;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

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

	public List<CmsMessage> getCmsMessages1() {
		return this.cmsMessages1;
	}

	public void setCmsMessages1(List<CmsMessage> cmsMessages1) {
		this.cmsMessages1 = cmsMessages1;
	}

	public CmsMessage addCmsMessages1(CmsMessage cmsMessages1) {
		getCmsMessages1().add(cmsMessages1);
		cmsMessages1.setCmsUser1(this);

		return cmsMessages1;
	}

	public CmsMessage removeCmsMessages1(CmsMessage cmsMessages1) {
		getCmsMessages1().remove(cmsMessages1);
		cmsMessages1.setCmsUser1(null);

		return cmsMessages1;
	}

	public List<CmsMessage> getCmsMessages2() {
		return this.cmsMessages2;
	}

	public void setCmsMessages2(List<CmsMessage> cmsMessages2) {
		this.cmsMessages2 = cmsMessages2;
	}

	public CmsMessage addCmsMessages2(CmsMessage cmsMessages2) {
		getCmsMessages2().add(cmsMessages2);
		cmsMessages2.setCmsUser2(this);

		return cmsMessages2;
	}

	public CmsMessage removeCmsMessages2(CmsMessage cmsMessages2) {
		getCmsMessages2().remove(cmsMessages2);
		cmsMessages2.setCmsUser2(null);

		return cmsMessages2;
	}

	public List<CmsReceiverMessage> getCmsReceiverMessages1() {
		return this.cmsReceiverMessages1;
	}

	public void setCmsReceiverMessages1(List<CmsReceiverMessage> cmsReceiverMessages1) {
		this.cmsReceiverMessages1 = cmsReceiverMessages1;
	}

	public CmsReceiverMessage addCmsReceiverMessages1(CmsReceiverMessage cmsReceiverMessages1) {
		getCmsReceiverMessages1().add(cmsReceiverMessages1);
		cmsReceiverMessages1.setCmsUser1(this);

		return cmsReceiverMessages1;
	}

	public CmsReceiverMessage removeCmsReceiverMessages1(CmsReceiverMessage cmsReceiverMessages1) {
		getCmsReceiverMessages1().remove(cmsReceiverMessages1);
		cmsReceiverMessages1.setCmsUser1(null);

		return cmsReceiverMessages1;
	}

	public List<CmsReceiverMessage> getCmsReceiverMessages2() {
		return this.cmsReceiverMessages2;
	}

	public void setCmsReceiverMessages2(List<CmsReceiverMessage> cmsReceiverMessages2) {
		this.cmsReceiverMessages2 = cmsReceiverMessages2;
	}

	public CmsReceiverMessage addCmsReceiverMessages2(CmsReceiverMessage cmsReceiverMessages2) {
		getCmsReceiverMessages2().add(cmsReceiverMessages2);
		cmsReceiverMessages2.setCmsUser2(this);

		return cmsReceiverMessages2;
	}

	public CmsReceiverMessage removeCmsReceiverMessages2(CmsReceiverMessage cmsReceiverMessages2) {
		getCmsReceiverMessages2().remove(cmsReceiverMessages2);
		cmsReceiverMessages2.setCmsUser2(null);

		return cmsReceiverMessages2;
	}

	public CmsGroup getCmsGroup() {
		return this.cmsGroup;
	}

	public void setCmsGroup(CmsGroup cmsGroup) {
		this.cmsGroup = cmsGroup;
	}

	public List<CmsContent> getCmsContents2() {
		return this.cmsContents2;
	}

	public void setCmsContents2(List<CmsContent> cmsContents2) {
		this.cmsContents2 = cmsContents2;
	}

	public List<CmsDepartment> getCmsDepartments() {
		return this.cmsDepartments;
	}

	public void setCmsDepartments(List<CmsDepartment> cmsDepartments) {
		this.cmsDepartments = cmsDepartments;
	}

	public CmsUserExt getCmsUserExt() {
		return this.cmsUserExt;
	}

	public void setCmsUserExt(CmsUserExt cmsUserExt) {
		this.cmsUserExt = cmsUserExt;
	}

	public List<CmsRole> getCmsRoles() {
		return this.cmsRoles;
	}

	public void setCmsRoles(List<CmsRole> cmsRoles) {
		this.cmsRoles = cmsRoles;
	}

	public List<CmsUserSite> getCmsUserSites() {
		return this.cmsUserSites;
	}

	public void setCmsUserSites(List<CmsUserSite> cmsUserSites) {
		this.cmsUserSites = cmsUserSites;
	}

	public CmsUserSite addCmsUserSite(CmsUserSite cmsUserSite) {
		getCmsUserSites().add(cmsUserSite);
		cmsUserSite.setCmsUser(this);

		return cmsUserSite;
	}

	public CmsUserSite removeCmsUserSite(CmsUserSite cmsUserSite) {
		getCmsUserSites().remove(cmsUserSite);
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

}