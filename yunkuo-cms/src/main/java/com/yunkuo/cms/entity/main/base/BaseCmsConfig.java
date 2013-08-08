package com.yunkuo.cms.entity.main.base;

import com.yunkuo.cms.entity.main.CmsSite;
import com.yunkuo.cms.entity.main.EmailConfig;
import com.yunkuo.cms.entity.main.MarkConfig;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.hql.ast.tree.MapValueNode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * The persistent class for the cms_config database table.
 * 
 */
/*@Entity
@Table(name="cms_config")*/
@MappedSuperclass
public class BaseCmsConfig implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="config_id")
	private Integer id;

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
	private Integer downloadTime;

	@Column(name="email_encoding")
	private String emailEncoding;

	@Column(name="email_host")
	private String host;

	@Column(name="email_password")
	private String password;

	@Column(name="email_personal")
	private String personal;

	@Column(name="email_username")
	private String username;

	@Column(name="email_validate")
	private Boolean emailValidate;

	@Column(name="is_upload_to_db")
	private Boolean uploadToDb;

	@Column(name="login_url")
	private String loginUrl;

	@Column(name="mark_alpha")
	private Integer alpha;

	@Column(name="mark_color")
	private String color;

	@Column(name="mark_content")
	private String content;

	@Column(name="mark_height")
	private Integer minHeight;

	@Column(name="mark_image")
	private String imagePath;

	@Column(name="mark_offset_x")
	private Integer offsetX;

	@Column(name="mark_offset_y")
	private Integer offsetY;

	@Column(name="mark_on")
	private Boolean on;

	@Column(name="mark_position")
	private Integer pos;

	@Column(name="mark_size")
	private Integer size;

	@Column(name="mark_width")
	private Integer minWidth;

	private Integer port;

	@Column(name="process_url")
	private String processUrl;

	@Column(name="servlet_point")
	private String servletPoint;

	//bi-directional many-to-one association to CmsConfigAttr
	//@OneToMany(mappedBy="cmsConfig")
	//private List<CmsConfigAttr> cmsConfigAttrs;

	//bi-directional many-to-one association to CmsSite
	@OneToMany
	private List<CmsSite> cmsSites;

    @ElementCollection
    @CollectionTable(name="cms_config_attr" , joinColumns = @JoinColumn(name="config_id"))
    @MapKeyColumn(name="attr_name")
    @Column(name="attr_value")
    private Map<String,String> attr = new HashMap<String, String>();

    public MarkConfig getMarkConfig() {
        return markConfig;
    }

    public void setMarkConfig(MarkConfig m_markConfig) {
        this.markConfig = m_markConfig;
    }

    public EmailConfig getEmailConfig() {
        return emailConfig;
    }

    public void setEmailConfig(EmailConfig m_emailConfig) {
        this.emailConfig = m_emailConfig;
    }

    @Embedded
    MarkConfig markConfig;
    @Embedded
    EmailConfig emailConfig;

    // constructors
    public BaseCmsConfig () {
        initialize();
    }

    /**
     * Constructor for primary key
     */
    public BaseCmsConfig (java.lang.Integer id) {
        this.setId(id);
        initialize();
    }

    /**
     * Constructor for required fields
     */
    public BaseCmsConfig (
            java.lang.Integer id,
            java.lang.String dbFileUri,
            java.lang.Boolean uploadToDb,
            java.lang.String defImg,
            java.lang.String loginUrl,
            java.util.Date countClearTime,
            java.util.Date countCopyTime,
            java.lang.String downloadCode,
            java.lang.Integer downloadTime) {

        this.setId(id);
        this.setDbFileUri(dbFileUri);
        this.setUploadToDb(uploadToDb);
        this.setDefImg(defImg);
        this.setLoginUrl(loginUrl);
        this.setCountClearTime(countClearTime);
        this.setCountCopyTime(countCopyTime);
        this.setDownloadCode(downloadCode);
        this.setDownloadTime(downloadTime);
        initialize();
    }

    protected void initialize () {}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer configId) {
		this.id = configId;
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

	public Integer getDownloadTime() {
		return this.downloadTime;
	}

	public void setDownloadTime(Integer downloadTime) {
		this.downloadTime = downloadTime;
	}

	public String getEmailEncoding() {
		return this.emailEncoding;
	}

	public void setEmailEncoding(String emailEncoding) {
		this.emailEncoding = emailEncoding;
	}

	public String getHost() {
		return this.host;
	}

	public void setHost(String emailHost) {
		this.host = emailHost;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String emailPassword) {
		this.password = emailPassword;
	}

	public String getPersonal() {
		return this.personal;
	}

	public void setPersonal(String emailPersonal) {
		this.personal = emailPersonal;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String emailUsername) {
		this.username = emailUsername;
	}

	public Boolean getEmailValidate() {
		return this.emailValidate;
	}

	public void setEmailValidate(Boolean emailValidate) {
		this.emailValidate = emailValidate;
	}

	public Boolean getUploadToDb() {
		return this.uploadToDb;
	}

	public void setUploadToDb(Boolean isUploadToDb) {
		this.uploadToDb = isUploadToDb;
	}

	public String getLoginUrl() {
		return this.loginUrl;
	}

	public void setLoginUrl(String loginUrl) {
		this.loginUrl = loginUrl;
	}

	public Integer getAlpha() {
		return this.alpha;
	}

	public void setAlpha(Integer markAlpha) {
		this.alpha = markAlpha;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String markColor) {
		this.color = markColor;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String markContent) {
		this.content = markContent;
	}

	public Integer getMinHeight() {
		return this.minHeight;
	}

	public void setMinHeight(Integer markHeight) {
		this.minHeight = markHeight;
	}

	public String getImagePath() {
		return this.imagePath;
	}

	public void setImagePath(String markImage) {
		this.imagePath = markImage;
	}

	public Integer getOffsetX() {
		return this.offsetX;
	}

	public void setOffsetX(Integer markOffsetX) {
		this.offsetX = markOffsetX;
	}

	public Integer getOffsetY() {
		return this.offsetY;
	}

	public void setOffsetY(Integer markOffsetY) {
		this.offsetY = markOffsetY;
	}

	public Boolean getOn() {
		return this.on;
	}

	public void setOn(Boolean markOn) {
		this.on = markOn;
	}

	public Integer getPos() {
		return this.pos;
	}

	public void setPos(Integer markPosition) {
		this.pos = markPosition;
	}

	public Integer getSize() {
		return this.size;
	}

	public void setSize(Integer markSize) {
		this.size = markSize;
	}

	public Integer getMinWidth() {
		return this.minWidth;
	}

	public void setMinWidth(Integer markWidth) {
		this.minWidth = markWidth;
	}

	public Integer getPort() {
		return this.port;
	}

	public void setPort(Integer port) {
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

	/*public List<CmsConfigAttr> getCmsConfigAttrs() {
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
	}*/

    public Map<String,String> getAttr() {
        return attr;
    }

    public void setAttr(Map<String,String> attr) {
        this.attr = attr;
    }
}