package com.yunkuo.cms.entity.assist.base;

import com.yunkuo.cms.entity.main.CmsSite;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the cms_site_flow database table.
 * 
 */
/*@Entity
@Table(name="cms_site_flow")*/
@MappedSuperclass
public class BaseCmsSiteFlow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="flow_id")
	private Integer id;

	@Column(name="access_date")
	private String accessDate;

	@Column(name="access_ip")
	private String accessIp;

	@Column(name="access_page")
	private String accessPage;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="access_time")
	private Date accessTime;

	private String area;

	@Column(name="referer_keyword")
	private String refererKeyword;

	@Column(name="referer_page")
	private String refererPage;

	@Column(name="referer_website")
	private String refererWebSite;

	@Column(name="session_id")
	private String sessionId;

	//bi-directional many-to-one association to CmsSite
	@ManyToOne
	@JoinColumn(name="site_id")
	private CmsSite site;

    // constructors
    public BaseCmsSiteFlow () {
        initialize();
    }

    /**
     * Constructor for primary key
     */
    public BaseCmsSiteFlow (java.lang.Integer id) {
        this.setId(id);
        initialize();
    }

    /**
     * Constructor for required fields
     */
    public BaseCmsSiteFlow (
            java.lang.Integer id,
            com.yunkuo.cms.entity.main.CmsSite site,
            java.lang.String accessIp,
            java.lang.String accessDate,
            java.lang.String accessPage,
            java.lang.String sessionId) {

        this.setId(id);
        this.setSite(site);
        this.setAccessIp(accessIp);
        this.setAccessDate(accessDate);
        this.setAccessPage(accessPage);
        this.setSessionId(sessionId);
        initialize();
    }

    protected void initialize () {}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer flowId) {
		this.id = flowId;
	}

	public String getAccessDate() {
		return this.accessDate;
	}

	public void setAccessDate(String accessDate) {
		this.accessDate = accessDate;
	}

	public String getAccessIp() {
		return this.accessIp;
	}

	public void setAccessIp(String accessIp) {
		this.accessIp = accessIp;
	}

	public String getAccessPage() {
		return this.accessPage;
	}

	public void setAccessPage(String accessPage) {
		this.accessPage = accessPage;
	}

	public Date getAccessTime() {
		return this.accessTime;
	}

	public void setAccessTime(Date accessTime) {
		this.accessTime = accessTime;
	}

	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getRefererKeyword() {
		return this.refererKeyword;
	}

	public void setRefererKeyword(String refererKeyword) {
		this.refererKeyword = refererKeyword;
	}

	public String getRefererPage() {
		return this.refererPage;
	}

	public void setRefererPage(String refererPage) {
		this.refererPage = refererPage;
	}

	public String getRefererWebSite() {
		return this.refererWebSite;
	}

	public void setRefererWebSite(String refererWebsite) {
		this.refererWebSite = refererWebsite;
	}

	public String getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public CmsSite getSite() {
		return this.site;
	}

	public void setSite(CmsSite cmsSite) {
		this.site = cmsSite;
	}

}