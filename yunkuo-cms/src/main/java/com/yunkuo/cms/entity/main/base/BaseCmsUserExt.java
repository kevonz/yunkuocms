package com.yunkuo.cms.entity.main.base;

import com.yunkuo.cms.entity.main.CmsUser;
import com.yunkuo.cms.entity.main.CmsUserExt;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the cms_user_ext database table.
 * 
 */
/*@Entity
@Table(name="cms_user_ext")*/
@MappedSuperclass
public class BaseCmsUserExt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
    @GenericGenerator(name="foreignKey", strategy="foreign", parameters=@Parameter(name="property", value="user"))
    @GeneratedValue(generator="foreignKey", strategy=GenerationType.IDENTITY)
	@Column(name="user_id")
	private Integer id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date birthday;

	private String comefrom;

	private Boolean gender;

	private String intro;

	private String mobile;

	private String msn;

	private String phone;

	private String qq;

	private String realname;

	@Column(name="user_img")
	private String userImg;

	@Column(name="user_signature")
	private String userSignature;

	//bi-directional one-to-one association to CmsUser
	@OneToOne
	@JoinColumn(name="user_id")
	private CmsUser user;

    // constructors
    public BaseCmsUserExt () {
        initialize();
    }

    /**
     * Constructor for primary key
     */
    public BaseCmsUserExt (java.lang.Integer id) {
        this.setId(id);
        initialize();
    }

    protected void initialize () {}
    public boolean equals (Object obj) {
        if (null == obj) return false;
        if (!(obj instanceof com.yunkuo.cms.entity.main.CmsUserExt)) return false;
        else {
            CmsUserExt cmsUserExt = (CmsUserExt) obj;
            if (null == this.getId() || null == cmsUserExt.getId()) return false;
            else return (this.getId().equals(cmsUserExt.getId()));
        }
    }


	public Integer getId() {
		return this.id;
	}

	public void setId(Integer userId) {
		this.id = userId;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getComefrom() {
		return this.comefrom;
	}

	public void setComefrom(String comefrom) {
		this.comefrom = comefrom;
	}

	public Boolean getGender() {
		return this.gender;
	}

	public void setGender(Boolean gender) {
		this.gender = gender;
	}

	public String getIntro() {
		return this.intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getMsn() {
		return this.msn;
	}

	public void setMsn(String msn) {
		this.msn = msn;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getRealname() {
		return this.realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getUserImg() {
		return this.userImg;
	}

	public void setUserImg(String userImg) {
		this.userImg = userImg;
	}

	public String getUserSignature() {
		return this.userSignature;
	}

	public void setUserSignature(String userSignature) {
		this.userSignature = userSignature;
	}

	public CmsUser getUser() {
		return this.user;
	}

	public void setUser(CmsUser cmsUser) {
		this.user = cmsUser;
	}

}