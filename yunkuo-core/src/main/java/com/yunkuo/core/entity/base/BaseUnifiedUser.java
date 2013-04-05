package com.yunkuo.core.entity.base;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the yk_user database table.
 * 
 */
@Entity
@Table(name="yk_user")
public class BaseUnifiedUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id")
	private int userId;

	private boolean activation;

	@Column(name="activation_code")
	private String activationCode;

	private String email;

	@Column(name="error_count")
	private int errorCount;

	@Column(name="error_ip")
	private String errorIp;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="error_time")
	private Date errorTime;

	@Column(name="last_login_ip")
	private String lastLoginIp;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_login_time")
	private Date lastLoginTime;

	@Column(name="login_count")
	private int loginCount;

	private String password;

	@Column(name="register_ip")
	private String registerIp;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="register_time")
	private Date registerTime;

	@Column(name="reset_key")
	private String resetKey;

	@Column(name="reset_pwd")
	private String resetPwd;

	private String username;

	public BaseUnifiedUser() {
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public boolean getActivation() {
		return this.activation;
	}

	public void setActivation(boolean activation) {
		this.activation = activation;
	}

	public String getActivationCode() {
		return this.activationCode;
	}

	public void setActivationCode(String activationCode) {
		this.activationCode = activationCode;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getErrorCount() {
		return this.errorCount;
	}

	public void setErrorCount(int errorCount) {
		this.errorCount = errorCount;
	}

	public String getErrorIp() {
		return this.errorIp;
	}

	public void setErrorIp(String errorIp) {
		this.errorIp = errorIp;
	}

	public Date getErrorTime() {
		return this.errorTime;
	}

	public void setErrorTime(Date errorTime) {
		this.errorTime = errorTime;
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

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getResetKey() {
		return this.resetKey;
	}

	public void setResetKey(String resetKey) {
		this.resetKey = resetKey;
	}

	public String getResetPwd() {
		return this.resetPwd;
	}

	public void setResetPwd(String resetPwd) {
		this.resetPwd = resetPwd;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
}