package com.yunkuo.cms.entity.main.base.tmp;

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

	@Column(name="config_id")
	private int configId;

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

	public int getConfigId() {
		return this.configId;
	}

	public void setConfigId(int configId) {
		this.configId = configId;
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

}