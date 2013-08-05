package com.yunkuo.cms.entity.main.base.tmp.all;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the cms_config database table.
 * 
 */
@Entity
@Table(name="cms_config")
public class CmsConfig implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="config_id")
	private int configId;

	@Column(name="context_path")
	private String contextPath;

	@Temporal(TemporalType.DATE)
	@Column(name="count_clear_time")
	private Date countClearTime;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="count_copy_time")
	private Date countCopyTime;

	@Column(name="db_file_uri")
	private String dbFileUri;

	@Column(name="def_img")
	private String defImg;

	@Column(name="download_code")
	private String downloadCode;

	@Column(name="download_time")
	private int downloadTime;

	@Column(name="email_encoding")
	private String emailEncoding;

	@Column(name="email_host")
	private String emailHost;

	@Column(name="email_password")
	private String emailPassword;

	@Column(name="email_personal")
	private String emailPersonal;

	@Column(name="email_username")
	private String emailUsername;

	@Column(name="email_validate")
	private byte emailValidate;

	@Column(name="is_upload_to_db")
	private byte isUploadToDb;

	@Column(name="login_url")
	private String loginUrl;

	@Column(name="mark_alpha")
	private int markAlpha;

	@Column(name="mark_color")
	private String markColor;

	@Column(name="mark_content")
	private String markContent;

	@Column(name="mark_height")
	private int markHeight;

	@Column(name="mark_image")
	private String markImage;

	@Column(name="mark_offset_x")
	private int markOffsetX;

	@Column(name="mark_offset_y")
	private int markOffsetY;

	@Column(name="mark_on")
	private byte markOn;

	@Column(name="mark_position")
	private int markPosition;

	@Column(name="mark_size")
	private int markSize;

	@Column(name="mark_width")
	private int markWidth;

	private int port;

	@Column(name="process_url")
	private String processUrl;

	@Column(name="servlet_point")
	private String servletPoint;

	//bi-directional many-to-one association to CmsConfigAttr
	@OneToMany(mappedBy="cmsConfig")
	private List<CmsConfigAttr> cmsConfigAttrs;

	//bi-directional many-to-one association to CmsSite
	@OneToMany(mappedBy="cmsConfig")
	private List<CmsSite> cmsSites;

	public CmsConfig() {
	}

	public int getConfigId() {
		return this.configId;
	}

	public void setConfigId(int configId) {
		this.configId = configId;
	}

	public String getContextPath() {
		return this.contextPath;
	}

	public void setContextPath(String contextPath) {
		this.contextPath = contextPath;
	}

	public Date getCountClearTime() {
		return this.countClearTime;
	}

	public void setCountClearTime(Date countClearTime) {
		this.countClearTime = countClearTime;
	}

	public Date getCountCopyTime() {
		return this.countCopyTime;
	}

	public void setCountCopyTime(Date countCopyTime) {
		this.countCopyTime = countCopyTime;
	}

	public String getDbFileUri() {
		return this.dbFileUri;
	}

	public void setDbFileUri(String dbFileUri) {
		this.dbFileUri = dbFileUri;
	}

	public String getDefImg() {
		return this.defImg;
	}

	public void setDefImg(String defImg) {
		this.defImg = defImg;
	}

	public String getDownloadCode() {
		return this.downloadCode;
	}

	public void setDownloadCode(String downloadCode) {
		this.downloadCode = downloadCode;
	}

	public int getDownloadTime() {
		return this.downloadTime;
	}

	public void setDownloadTime(int downloadTime) {
		this.downloadTime = downloadTime;
	}

	public String getEmailEncoding() {
		return this.emailEncoding;
	}

	public void setEmailEncoding(String emailEncoding) {
		this.emailEncoding = emailEncoding;
	}

	public String getEmailHost() {
		return this.emailHost;
	}

	public void setEmailHost(String emailHost) {
		this.emailHost = emailHost;
	}

	public String getEmailPassword() {
		return this.emailPassword;
	}

	public void setEmailPassword(String emailPassword) {
		this.emailPassword = emailPassword;
	}

	public String getEmailPersonal() {
		return this.emailPersonal;
	}

	public void setEmailPersonal(String emailPersonal) {
		this.emailPersonal = emailPersonal;
	}

	public String getEmailUsername() {
		return this.emailUsername;
	}

	public void setEmailUsername(String emailUsername) {
		this.emailUsername = emailUsername;
	}

	public byte getEmailValidate() {
		return this.emailValidate;
	}

	public void setEmailValidate(byte emailValidate) {
		this.emailValidate = emailValidate;
	}

	public byte getIsUploadToDb() {
		return this.isUploadToDb;
	}

	public void setIsUploadToDb(byte isUploadToDb) {
		this.isUploadToDb = isUploadToDb;
	}

	public String getLoginUrl() {
		return this.loginUrl;
	}

	public void setLoginUrl(String loginUrl) {
		this.loginUrl = loginUrl;
	}

	public int getMarkAlpha() {
		return this.markAlpha;
	}

	public void setMarkAlpha(int markAlpha) {
		this.markAlpha = markAlpha;
	}

	public String getMarkColor() {
		return this.markColor;
	}

	public void setMarkColor(String markColor) {
		this.markColor = markColor;
	}

	public String getMarkContent() {
		return this.markContent;
	}

	public void setMarkContent(String markContent) {
		this.markContent = markContent;
	}

	public int getMarkHeight() {
		return this.markHeight;
	}

	public void setMarkHeight(int markHeight) {
		this.markHeight = markHeight;
	}

	public String getMarkImage() {
		return this.markImage;
	}

	public void setMarkImage(String markImage) {
		this.markImage = markImage;
	}

	public int getMarkOffsetX() {
		return this.markOffsetX;
	}

	public void setMarkOffsetX(int markOffsetX) {
		this.markOffsetX = markOffsetX;
	}

	public int getMarkOffsetY() {
		return this.markOffsetY;
	}

	public void setMarkOffsetY(int markOffsetY) {
		this.markOffsetY = markOffsetY;
	}

	public byte getMarkOn() {
		return this.markOn;
	}

	public void setMarkOn(byte markOn) {
		this.markOn = markOn;
	}

	public int getMarkPosition() {
		return this.markPosition;
	}

	public void setMarkPosition(int markPosition) {
		this.markPosition = markPosition;
	}

	public int getMarkSize() {
		return this.markSize;
	}

	public void setMarkSize(int markSize) {
		this.markSize = markSize;
	}

	public int getMarkWidth() {
		return this.markWidth;
	}

	public void setMarkWidth(int markWidth) {
		this.markWidth = markWidth;
	}

	public int getPort() {
		return this.port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getProcessUrl() {
		return this.processUrl;
	}

	public void setProcessUrl(String processUrl) {
		this.processUrl = processUrl;
	}

	public String getServletPoint() {
		return this.servletPoint;
	}

	public void setServletPoint(String servletPoint) {
		this.servletPoint = servletPoint;
	}

	public List<CmsConfigAttr> getCmsConfigAttrs() {
		return this.cmsConfigAttrs;
	}

	public void setCmsConfigAttrs(List<CmsConfigAttr> cmsConfigAttrs) {
		this.cmsConfigAttrs = cmsConfigAttrs;
	}

	public CmsConfigAttr addCmsConfigAttr(CmsConfigAttr cmsConfigAttr) {
		getCmsConfigAttrs().add(cmsConfigAttr);
		cmsConfigAttr.setCmsConfig(this);

		return cmsConfigAttr;
	}

	public CmsConfigAttr removeCmsConfigAttr(CmsConfigAttr cmsConfigAttr) {
		getCmsConfigAttrs().remove(cmsConfigAttr);
		cmsConfigAttr.setCmsConfig(null);

		return cmsConfigAttr;
	}

	public List<CmsSite> getCmsSites() {
		return this.cmsSites;
	}

	public void setCmsSites(List<CmsSite> cmsSites) {
		this.cmsSites = cmsSites;
	}

	public CmsSite addCmsSite(CmsSite cmsSite) {
		getCmsSites().add(cmsSite);
		cmsSite.setCmsConfig(this);

		return cmsSite;
	}

	public CmsSite removeCmsSite(CmsSite cmsSite) {
		getCmsSites().remove(cmsSite);
		cmsSite.setCmsConfig(null);

		return cmsSite;
	}

}