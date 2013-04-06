package com.yunkuo.core.entity;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import java.util.Date;
import java.sql.Timestamp;

/**
 * The persistent class for the yk_authentication database table.
 * 
 */
@Entity
@Table(name="yk_authentication")
public class Authentication implements Serializable {
	private static final long serialVersionUID = 1L;
	
//	private int hashCode = Integer.MIN_VALUE;

	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Column(name="authentication_id")
	private String id;

	private String email;

	@Column(name="login_ip")
	private String loginIp;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="login_time")
	private Date loginTime;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="update_time")
	private Date updateTime;

	private int userId;

	private String username;

	public Authentication() {
	}

	public void init() {
		Date now = new Timestamp(System.currentTimeMillis());
		setLoginTime(now);
		setUpdateTime(now);
	}
	
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		//this.hashCode = Integer.MIN_VALUE;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLoginIp() {
		return this.loginIp;
	}

	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}

	public Date getLoginTime() {
		return this.loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	

	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.yunkuo.core.entity.Authentication)) return false;
		else {
			com.yunkuo.core.entity.Authentication authentication = (com.yunkuo.core.entity.Authentication) obj;
			if (null == this.getId() || null == authentication.getId()) return false;
			else return (this.getId().equals(authentication.getId()));
		}
	}

	/*public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getId()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getId().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}*/


	public String toString () {
		return super.toString();
	}
}