package com.yunkuo.core.entity;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.yunkuo.core.entity.base.BaseAuthentication;
@Entity
@Table(name="yk_authentication")
public class Authentication extends BaseAuthentication {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void init() {
		Date now = new Timestamp(System.currentTimeMillis());
		setLoginTime(now);
		setUpdateTime(now);
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
