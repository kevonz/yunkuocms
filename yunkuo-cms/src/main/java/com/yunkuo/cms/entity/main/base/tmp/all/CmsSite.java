package com.yunkuo.cms.entity.main.base.tmp.all;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the cms_site database table.
 * 
 */
@Entity
@Table(name="cms_site")
public class CmsSite implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="site_id")
	private int siteId;

	@Column(name="after_check")
	private byte afterCheck;

	private String domain;

	@Column(name="domain_alias")
	private String domainAlias;

	@Column(name="domain_redirect")
	private String domainRedirect;

	@Column(name="dynamic_suffix")
	private String dynamicSuffix;

	@Column(name="final_step")
	private byte finalStep;

	@Column(name="ftp_upload_id")
	private int ftpUploadId;

	@Column(name="is_index_to_root")
	private String isIndexToRoot;

	@Column(name="is_master")
	private byte isMaster;

	@Column(name="is_recycle_on")
	private String isRecycleOn;

	@Column(name="is_relative_path")
	private String isRelativePath;

	@Column(name="is_static_index")
	private String isStaticIndex;

	@Column(name="locale_admin")
	private String localeAdmin;

	@Column(name="locale_front")
	private String localeFront;

	private String protocol;

	@Column(name="short_name")
	private String shortName;

	@Column(name="site_name")
	private String siteName;

	@Column(name="site_path")
	private String sitePath;

	@Column(name="static_dir")
	private String staticDir;

	@Column(name="static_suffix")
	private String staticSuffix;

	@Column(name="tpl_solution")
	private String tplSolution;

	//bi-directional many-to-one association to BaseChannel
	@OneToMany(mappedBy="cmsSite")
	private List<BaseChannel> cmsChannels;

	//bi-directional many-to-one association to CmsLog
	@OneToMany(mappedBy="cmsSite")
	private List<CmsLog> cmsLogs;

	//bi-directional many-to-one association to CmsAcquisition
	@OneToMany(mappedBy="cmsSite")
	private List<CmsAcquisition> cmsAcquisitions;

	//bi-directional many-to-one association to CmsAcquisitionTemp
	@OneToMany(mappedBy="cmsSite")
	private List<CmsAcquisitionTemp> cmsAcquisitionTemps;

	//bi-directional many-to-one association to CmsAdvertising
	@OneToMany(mappedBy="cmsSite")
	private List<CmsAdvertising> cmsAdvertisings;

	//bi-directional many-to-one association to CmsAdvertisingSpace
	@OneToMany(mappedBy="cmsSite")
	private List<CmsAdvertisingSpace> cmsAdvertisingSpaces;

	//bi-directional many-to-one association to CmsComment
	@OneToMany(mappedBy="cmsSite")
	private List<CmsComment> cmsComments;

	//bi-directional many-to-one association to CmsContent
	@OneToMany(mappedBy="cmsSite")
	private List<CmsContent> cmsContents;

	//bi-directional many-to-one association to CmsDepartment
	@OneToMany(mappedBy="cmsSite")
	private List<CmsDepartment> cmsDepartments;

	//bi-directional many-to-one association to CmsFriendlink
	@OneToMany(mappedBy="cmsSite")
	private List<CmsFriendlink> cmsFriendlinks;

	//bi-directional many-to-one association to CmsFriendlinkCtg
	@OneToMany(mappedBy="cmsSite")
	private List<CmsFriendlinkCtg> cmsFriendlinkCtgs;

	//bi-directional many-to-one association to CmsGuestbook
	@OneToMany(mappedBy="cmsSite")
	private List<CmsGuestbook> cmsGuestbooks;

	//bi-directional many-to-one association to CmsGuestbookCtg
	@OneToMany(mappedBy="cmsSite")
	private List<CmsGuestbookCtg> cmsGuestbookCtgs;

	//bi-directional many-to-one association to CmsKeyword
	@OneToMany(mappedBy="cmsSite")
	private List<CmsKeyword> cmsKeywords;

	//bi-directional many-to-one association to CmsMessage
	@OneToMany(mappedBy="cmsSite")
	private List<CmsMessage> cmsMessages;

	//bi-directional many-to-one association to CmsReceiverMessage
	@OneToMany(mappedBy="cmsSite")
	private List<CmsReceiverMessage> cmsReceiverMessages;

	//bi-directional many-to-one association to CmsRole
	@OneToMany(mappedBy="cmsSite")
	private List<CmsRole> cmsRoles;

	//bi-directional many-to-one association to CmsConfig
	@ManyToOne
	@JoinColumn(name="config_id")
	private CmsConfig cmsConfig;

	//bi-directional many-to-one association to CmsSiteAttr
	@OneToMany(mappedBy="cmsSite")
	private List<CmsSiteAttr> cmsSiteAttrs;

	//bi-directional many-to-one association to CmsSiteCfg
	@OneToMany(mappedBy="cmsSite")
	private List<CmsSiteCfg> cmsSiteCfgs;

	//bi-directional many-to-one association to CmsSiteFlow
	@OneToMany(mappedBy="cmsSite")
	private List<CmsSiteFlow> cmsSiteFlows;

	//bi-directional many-to-one association to CmsSiteTxt
	@OneToMany(mappedBy="cmsSite")
	private List<CmsSiteTxt> cmsSiteTxts;

	//bi-directional many-to-one association to CmsUserSite
	@OneToMany(mappedBy="cmsSite")
	private List<CmsUserSite> cmsUserSites;

	//bi-directional many-to-one association to CmsVoteTopic
	@OneToMany(mappedBy="cmsSite")
	private List<CmsVoteTopic> cmsVoteTopics;

	public CmsSite() {
	}

	public int getSiteId() {
		return this.siteId;
	}

	public void setSiteId(int siteId) {
		this.siteId = siteId;
	}

	public byte getAfterCheck() {
		return this.afterCheck;
	}

	public void setAfterCheck(byte afterCheck) {
		this.afterCheck = afterCheck;
	}

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getDomainAlias() {
		return this.domainAlias;
	}

	public void setDomainAlias(String domainAlias) {
		this.domainAlias = domainAlias;
	}

	public String getDomainRedirect() {
		return this.domainRedirect;
	}

	public void setDomainRedirect(String domainRedirect) {
		this.domainRedirect = domainRedirect;
	}

	public String getDynamicSuffix() {
		return this.dynamicSuffix;
	}

	public void setDynamicSuffix(String dynamicSuffix) {
		this.dynamicSuffix = dynamicSuffix;
	}

	public byte getFinalStep() {
		return this.finalStep;
	}

	public void setFinalStep(byte finalStep) {
		this.finalStep = finalStep;
	}

	public int getFtpUploadId() {
		return this.ftpUploadId;
	}

	public void setFtpUploadId(int ftpUploadId) {
		this.ftpUploadId = ftpUploadId;
	}

	public String getIsIndexToRoot() {
		return this.isIndexToRoot;
	}

	public void setIsIndexToRoot(String isIndexToRoot) {
		this.isIndexToRoot = isIndexToRoot;
	}

	public byte getIsMaster() {
		return this.isMaster;
	}

	public void setIsMaster(byte isMaster) {
		this.isMaster = isMaster;
	}

	public String getIsRecycleOn() {
		return this.isRecycleOn;
	}

	public void setIsRecycleOn(String isRecycleOn) {
		this.isRecycleOn = isRecycleOn;
	}

	public String getIsRelativePath() {
		return this.isRelativePath;
	}

	public void setIsRelativePath(String isRelativePath) {
		this.isRelativePath = isRelativePath;
	}

	public String getIsStaticIndex() {
		return this.isStaticIndex;
	}

	public void setIsStaticIndex(String isStaticIndex) {
		this.isStaticIndex = isStaticIndex;
	}

	public String getLocaleAdmin() {
		return this.localeAdmin;
	}

	public void setLocaleAdmin(String localeAdmin) {
		this.localeAdmin = localeAdmin;
	}

	public String getLocaleFront() {
		return this.localeFront;
	}

	public void setLocaleFront(String localeFront) {
		this.localeFront = localeFront;
	}

	public String getProtocol() {
		return this.protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getShortName() {
		return this.shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getSiteName() {
		return this.siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	public String getSitePath() {
		return this.sitePath;
	}

	public void setSitePath(String sitePath) {
		this.sitePath = sitePath;
	}

	public String getStaticDir() {
		return this.staticDir;
	}

	public void setStaticDir(String staticDir) {
		this.staticDir = staticDir;
	}

	public String getStaticSuffix() {
		return this.staticSuffix;
	}

	public void setStaticSuffix(String staticSuffix) {
		this.staticSuffix = staticSuffix;
	}

	public String getTplSolution() {
		return this.tplSolution;
	}

	public void setTplSolution(String tplSolution) {
		this.tplSolution = tplSolution;
	}

	public List<BaseChannel> getCmsChannels() {
		return this.cmsChannels;
	}

	public void setCmsChannels(List<BaseChannel> cmsChannels) {
		this.cmsChannels = cmsChannels;
	}

	public BaseChannel addCmsChannel(BaseChannel cmsChannel) {
		getCmsChannels().add(cmsChannel);
		cmsChannel.setCmsSite(this);

		return cmsChannel;
	}

	public BaseChannel removeCmsChannel(BaseChannel cmsChannel) {
		getCmsChannels().remove(cmsChannel);
		cmsChannel.setCmsSite(null);

		return cmsChannel;
	}

	public List<CmsLog> getCmsLogs() {
		return this.cmsLogs;
	}

	public void setCmsLogs(List<CmsLog> cmsLogs) {
		this.cmsLogs = cmsLogs;
	}

	public CmsLog addCmsLog(CmsLog cmsLog) {
		getCmsLogs().add(cmsLog);
		cmsLog.setCmsSite(this);

		return cmsLog;
	}

	public CmsLog removeCmsLog(CmsLog cmsLog) {
		getCmsLogs().remove(cmsLog);
		cmsLog.setCmsSite(null);

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
		cmsAcquisition.setCmsSite(this);

		return cmsAcquisition;
	}

	public CmsAcquisition removeCmsAcquisition(CmsAcquisition cmsAcquisition) {
		getCmsAcquisitions().remove(cmsAcquisition);
		cmsAcquisition.setCmsSite(null);

		return cmsAcquisition;
	}

	public List<CmsAcquisitionTemp> getCmsAcquisitionTemps() {
		return this.cmsAcquisitionTemps;
	}

	public void setCmsAcquisitionTemps(List<CmsAcquisitionTemp> cmsAcquisitionTemps) {
		this.cmsAcquisitionTemps = cmsAcquisitionTemps;
	}

	public CmsAcquisitionTemp addCmsAcquisitionTemp(CmsAcquisitionTemp cmsAcquisitionTemp) {
		getCmsAcquisitionTemps().add(cmsAcquisitionTemp);
		cmsAcquisitionTemp.setCmsSite(this);

		return cmsAcquisitionTemp;
	}

	public CmsAcquisitionTemp removeCmsAcquisitionTemp(CmsAcquisitionTemp cmsAcquisitionTemp) {
		getCmsAcquisitionTemps().remove(cmsAcquisitionTemp);
		cmsAcquisitionTemp.setCmsSite(null);

		return cmsAcquisitionTemp;
	}

	public List<CmsAdvertising> getCmsAdvertisings() {
		return this.cmsAdvertisings;
	}

	public void setCmsAdvertisings(List<CmsAdvertising> cmsAdvertisings) {
		this.cmsAdvertisings = cmsAdvertisings;
	}

	public CmsAdvertising addCmsAdvertising(CmsAdvertising cmsAdvertising) {
		getCmsAdvertisings().add(cmsAdvertising);
		cmsAdvertising.setCmsSite(this);

		return cmsAdvertising;
	}

	public CmsAdvertising removeCmsAdvertising(CmsAdvertising cmsAdvertising) {
		getCmsAdvertisings().remove(cmsAdvertising);
		cmsAdvertising.setCmsSite(null);

		return cmsAdvertising;
	}

	public List<CmsAdvertisingSpace> getCmsAdvertisingSpaces() {
		return this.cmsAdvertisingSpaces;
	}

	public void setCmsAdvertisingSpaces(List<CmsAdvertisingSpace> cmsAdvertisingSpaces) {
		this.cmsAdvertisingSpaces = cmsAdvertisingSpaces;
	}

	public CmsAdvertisingSpace addCmsAdvertisingSpace(CmsAdvertisingSpace cmsAdvertisingSpace) {
		getCmsAdvertisingSpaces().add(cmsAdvertisingSpace);
		cmsAdvertisingSpace.setCmsSite(this);

		return cmsAdvertisingSpace;
	}

	public CmsAdvertisingSpace removeCmsAdvertisingSpace(CmsAdvertisingSpace cmsAdvertisingSpace) {
		getCmsAdvertisingSpaces().remove(cmsAdvertisingSpace);
		cmsAdvertisingSpace.setCmsSite(null);

		return cmsAdvertisingSpace;
	}

	public List<CmsComment> getCmsComments() {
		return this.cmsComments;
	}

	public void setCmsComments(List<CmsComment> cmsComments) {
		this.cmsComments = cmsComments;
	}

	public CmsComment addCmsComment(CmsComment cmsComment) {
		getCmsComments().add(cmsComment);
		cmsComment.setCmsSite(this);

		return cmsComment;
	}

	public CmsComment removeCmsComment(CmsComment cmsComment) {
		getCmsComments().remove(cmsComment);
		cmsComment.setCmsSite(null);

		return cmsComment;
	}

	public List<CmsContent> getCmsContents() {
		return this.cmsContents;
	}

	public void setCmsContents(List<CmsContent> cmsContents) {
		this.cmsContents = cmsContents;
	}

	public CmsContent addCmsContent(CmsContent cmsContent) {
		getCmsContents().add(cmsContent);
		cmsContent.setCmsSite(this);

		return cmsContent;
	}

	public CmsContent removeCmsContent(CmsContent cmsContent) {
		getCmsContents().remove(cmsContent);
		cmsContent.setCmsSite(null);

		return cmsContent;
	}

	public List<CmsDepartment> getCmsDepartments() {
		return this.cmsDepartments;
	}

	public void setCmsDepartments(List<CmsDepartment> cmsDepartments) {
		this.cmsDepartments = cmsDepartments;
	}

	public CmsDepartment addCmsDepartment(CmsDepartment cmsDepartment) {
		getCmsDepartments().add(cmsDepartment);
		cmsDepartment.setCmsSite(this);

		return cmsDepartment;
	}

	public CmsDepartment removeCmsDepartment(CmsDepartment cmsDepartment) {
		getCmsDepartments().remove(cmsDepartment);
		cmsDepartment.setCmsSite(null);

		return cmsDepartment;
	}

	public List<CmsFriendlink> getCmsFriendlinks() {
		return this.cmsFriendlinks;
	}

	public void setCmsFriendlinks(List<CmsFriendlink> cmsFriendlinks) {
		this.cmsFriendlinks = cmsFriendlinks;
	}

	public CmsFriendlink addCmsFriendlink(CmsFriendlink cmsFriendlink) {
		getCmsFriendlinks().add(cmsFriendlink);
		cmsFriendlink.setCmsSite(this);

		return cmsFriendlink;
	}

	public CmsFriendlink removeCmsFriendlink(CmsFriendlink cmsFriendlink) {
		getCmsFriendlinks().remove(cmsFriendlink);
		cmsFriendlink.setCmsSite(null);

		return cmsFriendlink;
	}

	public List<CmsFriendlinkCtg> getCmsFriendlinkCtgs() {
		return this.cmsFriendlinkCtgs;
	}

	public void setCmsFriendlinkCtgs(List<CmsFriendlinkCtg> cmsFriendlinkCtgs) {
		this.cmsFriendlinkCtgs = cmsFriendlinkCtgs;
	}

	public CmsFriendlinkCtg addCmsFriendlinkCtg(CmsFriendlinkCtg cmsFriendlinkCtg) {
		getCmsFriendlinkCtgs().add(cmsFriendlinkCtg);
		cmsFriendlinkCtg.setCmsSite(this);

		return cmsFriendlinkCtg;
	}

	public CmsFriendlinkCtg removeCmsFriendlinkCtg(CmsFriendlinkCtg cmsFriendlinkCtg) {
		getCmsFriendlinkCtgs().remove(cmsFriendlinkCtg);
		cmsFriendlinkCtg.setCmsSite(null);

		return cmsFriendlinkCtg;
	}

	public List<CmsGuestbook> getCmsGuestbooks() {
		return this.cmsGuestbooks;
	}

	public void setCmsGuestbooks(List<CmsGuestbook> cmsGuestbooks) {
		this.cmsGuestbooks = cmsGuestbooks;
	}

	public CmsGuestbook addCmsGuestbook(CmsGuestbook cmsGuestbook) {
		getCmsGuestbooks().add(cmsGuestbook);
		cmsGuestbook.setCmsSite(this);

		return cmsGuestbook;
	}

	public CmsGuestbook removeCmsGuestbook(CmsGuestbook cmsGuestbook) {
		getCmsGuestbooks().remove(cmsGuestbook);
		cmsGuestbook.setCmsSite(null);

		return cmsGuestbook;
	}

	public List<CmsGuestbookCtg> getCmsGuestbookCtgs() {
		return this.cmsGuestbookCtgs;
	}

	public void setCmsGuestbookCtgs(List<CmsGuestbookCtg> cmsGuestbookCtgs) {
		this.cmsGuestbookCtgs = cmsGuestbookCtgs;
	}

	public CmsGuestbookCtg addCmsGuestbookCtg(CmsGuestbookCtg cmsGuestbookCtg) {
		getCmsGuestbookCtgs().add(cmsGuestbookCtg);
		cmsGuestbookCtg.setCmsSite(this);

		return cmsGuestbookCtg;
	}

	public CmsGuestbookCtg removeCmsGuestbookCtg(CmsGuestbookCtg cmsGuestbookCtg) {
		getCmsGuestbookCtgs().remove(cmsGuestbookCtg);
		cmsGuestbookCtg.setCmsSite(null);

		return cmsGuestbookCtg;
	}

	public List<CmsKeyword> getCmsKeywords() {
		return this.cmsKeywords;
	}

	public void setCmsKeywords(List<CmsKeyword> cmsKeywords) {
		this.cmsKeywords = cmsKeywords;
	}

	public CmsKeyword addCmsKeyword(CmsKeyword cmsKeyword) {
		getCmsKeywords().add(cmsKeyword);
		cmsKeyword.setCmsSite(this);

		return cmsKeyword;
	}

	public CmsKeyword removeCmsKeyword(CmsKeyword cmsKeyword) {
		getCmsKeywords().remove(cmsKeyword);
		cmsKeyword.setCmsSite(null);

		return cmsKeyword;
	}

	public List<CmsMessage> getCmsMessages() {
		return this.cmsMessages;
	}

	public void setCmsMessages(List<CmsMessage> cmsMessages) {
		this.cmsMessages = cmsMessages;
	}

	public CmsMessage addCmsMessage(CmsMessage cmsMessage) {
		getCmsMessages().add(cmsMessage);
		cmsMessage.setCmsSite(this);

		return cmsMessage;
	}

	public CmsMessage removeCmsMessage(CmsMessage cmsMessage) {
		getCmsMessages().remove(cmsMessage);
		cmsMessage.setCmsSite(null);

		return cmsMessage;
	}

	public List<CmsReceiverMessage> getCmsReceiverMessages() {
		return this.cmsReceiverMessages;
	}

	public void setCmsReceiverMessages(List<CmsReceiverMessage> cmsReceiverMessages) {
		this.cmsReceiverMessages = cmsReceiverMessages;
	}

	public CmsReceiverMessage addCmsReceiverMessage(CmsReceiverMessage cmsReceiverMessage) {
		getCmsReceiverMessages().add(cmsReceiverMessage);
		cmsReceiverMessage.setCmsSite(this);

		return cmsReceiverMessage;
	}

	public CmsReceiverMessage removeCmsReceiverMessage(CmsReceiverMessage cmsReceiverMessage) {
		getCmsReceiverMessages().remove(cmsReceiverMessage);
		cmsReceiverMessage.setCmsSite(null);

		return cmsReceiverMessage;
	}

	public List<CmsRole> getCmsRoles() {
		return this.cmsRoles;
	}

	public void setCmsRoles(List<CmsRole> cmsRoles) {
		this.cmsRoles = cmsRoles;
	}

	public CmsRole addCmsRole(CmsRole cmsRole) {
		getCmsRoles().add(cmsRole);
		cmsRole.setCmsSite(this);

		return cmsRole;
	}

	public CmsRole removeCmsRole(CmsRole cmsRole) {
		getCmsRoles().remove(cmsRole);
		cmsRole.setCmsSite(null);

		return cmsRole;
	}

	public CmsConfig getCmsConfig() {
		return this.cmsConfig;
	}

	public void setCmsConfig(CmsConfig cmsConfig) {
		this.cmsConfig = cmsConfig;
	}

	public List<CmsSiteAttr> getCmsSiteAttrs() {
		return this.cmsSiteAttrs;
	}

	public void setCmsSiteAttrs(List<CmsSiteAttr> cmsSiteAttrs) {
		this.cmsSiteAttrs = cmsSiteAttrs;
	}

	public CmsSiteAttr addCmsSiteAttr(CmsSiteAttr cmsSiteAttr) {
		getCmsSiteAttrs().add(cmsSiteAttr);
		cmsSiteAttr.setCmsSite(this);

		return cmsSiteAttr;
	}

	public CmsSiteAttr removeCmsSiteAttr(CmsSiteAttr cmsSiteAttr) {
		getCmsSiteAttrs().remove(cmsSiteAttr);
		cmsSiteAttr.setCmsSite(null);

		return cmsSiteAttr;
	}

	public List<CmsSiteCfg> getCmsSiteCfgs() {
		return this.cmsSiteCfgs;
	}

	public void setCmsSiteCfgs(List<CmsSiteCfg> cmsSiteCfgs) {
		this.cmsSiteCfgs = cmsSiteCfgs;
	}

	public CmsSiteCfg addCmsSiteCfg(CmsSiteCfg cmsSiteCfg) {
		getCmsSiteCfgs().add(cmsSiteCfg);
		cmsSiteCfg.setCmsSite(this);

		return cmsSiteCfg;
	}

	public CmsSiteCfg removeCmsSiteCfg(CmsSiteCfg cmsSiteCfg) {
		getCmsSiteCfgs().remove(cmsSiteCfg);
		cmsSiteCfg.setCmsSite(null);

		return cmsSiteCfg;
	}

	public List<CmsSiteFlow> getCmsSiteFlows() {
		return this.cmsSiteFlows;
	}

	public void setCmsSiteFlows(List<CmsSiteFlow> cmsSiteFlows) {
		this.cmsSiteFlows = cmsSiteFlows;
	}

	public CmsSiteFlow addCmsSiteFlow(CmsSiteFlow cmsSiteFlow) {
		getCmsSiteFlows().add(cmsSiteFlow);
		cmsSiteFlow.setCmsSite(this);

		return cmsSiteFlow;
	}

	public CmsSiteFlow removeCmsSiteFlow(CmsSiteFlow cmsSiteFlow) {
		getCmsSiteFlows().remove(cmsSiteFlow);
		cmsSiteFlow.setCmsSite(null);

		return cmsSiteFlow;
	}

	public List<CmsSiteTxt> getCmsSiteTxts() {
		return this.cmsSiteTxts;
	}

	public void setCmsSiteTxts(List<CmsSiteTxt> cmsSiteTxts) {
		this.cmsSiteTxts = cmsSiteTxts;
	}

	public CmsSiteTxt addCmsSiteTxt(CmsSiteTxt cmsSiteTxt) {
		getCmsSiteTxts().add(cmsSiteTxt);
		cmsSiteTxt.setCmsSite(this);

		return cmsSiteTxt;
	}

	public CmsSiteTxt removeCmsSiteTxt(CmsSiteTxt cmsSiteTxt) {
		getCmsSiteTxts().remove(cmsSiteTxt);
		cmsSiteTxt.setCmsSite(null);

		return cmsSiteTxt;
	}

	public List<CmsUserSite> getCmsUserSites() {
		return this.cmsUserSites;
	}

	public void setCmsUserSites(List<CmsUserSite> cmsUserSites) {
		this.cmsUserSites = cmsUserSites;
	}

	public CmsUserSite addCmsUserSite(CmsUserSite cmsUserSite) {
		getCmsUserSites().add(cmsUserSite);
		cmsUserSite.setCmsSite(this);

		return cmsUserSite;
	}

	public CmsUserSite removeCmsUserSite(CmsUserSite cmsUserSite) {
		getCmsUserSites().remove(cmsUserSite);
		cmsUserSite.setCmsSite(null);

		return cmsUserSite;
	}

	public List<CmsVoteTopic> getCmsVoteTopics() {
		return this.cmsVoteTopics;
	}

	public void setCmsVoteTopics(List<CmsVoteTopic> cmsVoteTopics) {
		this.cmsVoteTopics = cmsVoteTopics;
	}

	public CmsVoteTopic addCmsVoteTopic(CmsVoteTopic cmsVoteTopic) {
		getCmsVoteTopics().add(cmsVoteTopic);
		cmsVoteTopic.setCmsSite(this);

		return cmsVoteTopic;
	}

	public CmsVoteTopic removeCmsVoteTopic(CmsVoteTopic cmsVoteTopic) {
		getCmsVoteTopics().remove(cmsVoteTopic);
		cmsVoteTopic.setCmsSite(null);

		return cmsVoteTopic;
	}

}