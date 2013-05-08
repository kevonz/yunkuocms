package com.yunkuo.cms.entity.main.base.tmp;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the cms_log database table.
 * 
 */
@Entity
@Table(name="cms_log")
public class CmsLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="log_id")
	private int logId;

	private int category;

	private String content;

	private String ip;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="log_time")
	private Date logTime;

	private String title;

	private String url;

	//bi-directional many-to-one association to CmsSite
	@ManyToOne
	@JoinColumn(name="site_id")
	private CmsSite cmsSite;

	//bi-directional many-to-one association to CmsUser
	@ManyToOne
	@JoinColumn(name="user_id")
	private CmsUser cmsUser;

	public CmsLog() {
	}

	public int getLogId() {
		return this.logId;
	}

	public void setLogId(int logId) {
		this.logId = logId;
	}

	public int getCategory() {
		return this.category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Date getLogTime() {
		return this.logTime;
	}

	public void setLogTime(Date logTime) {
		this.logTime = logTime;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public CmsSite getCmsSite() {
		return this.cmsSite;
	}

	public void setCmsSite(CmsSite cmsSite) {
		this.cmsSite = cmsSite;
	}

	public CmsUser getCmsUser() {
		return this.cmsUser;
	}

	public void setCmsUser(CmsUser cmsUser) {
		this.cmsUser = cmsUser;
	}

}