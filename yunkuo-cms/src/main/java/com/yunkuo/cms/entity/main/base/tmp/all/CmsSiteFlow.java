package com.yunkuo.cms.entity.main.base.tmp.all;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the cms_site_flow database table.
 * 
 */
@Entity
@Table(name="cms_site_flow")
public class CmsSiteFlow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="flow_id")
	private int flowId;

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
	private String refererWebsite;

	@Column(name="session_id")
	private String sessionId;

	//bi-directional many-to-one association to CmsSite
	@ManyToOne
	@JoinColumn(name="site_id")
	private CmsSite cmsSite;

	public CmsSiteFlow() {
	}

	public int getFlowId() {
		return this.flowId;
	}

	public void setFlowId(int flowId) {
		this.flowId = flowId;
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

	public String getRefererWebsite() {
		return this.refererWebsite;
	}

	public void setRefererWebsite(String refererWebsite) {
		this.refererWebsite = refererWebsite;
	}

	public String getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public CmsSite getCmsSite() {
		return this.cmsSite;
	}

	public void setCmsSite(CmsSite cmsSite) {
		this.cmsSite = cmsSite;
	}

}