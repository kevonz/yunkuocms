package com.yunkuo.cms.entity.main.base.tmp;

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

	@Column(name="group_id")
	private int groupId;

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

	public int getGroupId() {
		return this.groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
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

}