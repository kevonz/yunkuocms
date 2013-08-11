package com.yunkuo.cms.entity.assist.base;

import com.yunkuo.cms.entity.assist.CmsGuestbookCtg;
import com.yunkuo.cms.entity.assist.CmsGuestbookExt;
import com.yunkuo.cms.entity.main.CmsSite;
import com.yunkuo.cms.entity.main.CmsUser;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * The persistent class for the cms_guestbook database table.
 * 
 */
/*@Entity
@Table(name="cms_guestbook")*/
@MappedSuperclass
public class BaseCmsGuestbook implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="guestbook_id")
	private Integer id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	private String ip;

	@Column(name="is_checked")
	private Boolean checked;

	@Column(name="is_recommend")
	private Boolean recommend;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="replay_time")
	private Date replayTime;

	//bi-directional many-to-one association to CmsGuestbookCtg
	@ManyToOne
	@JoinColumn(name="guestbookctg_id")
	private CmsGuestbookCtg ctg;

	//bi-directional many-to-one association to CmsUser
	@ManyToOne
	@JoinColumn(name="admin_id")
	private CmsUser admin;

	//bi-directional many-to-one association to CmsUser
	@ManyToOne
	@JoinColumn(name="member_id")
	private CmsUser member;

	//bi-directional many-to-one association to CmsSite
	@ManyToOne
	@JoinColumn(name="site_id")
	private CmsSite site;

	//bi-directional many-to-one association to CmsGuestbookExt
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name="guestbook_id")
    //@OnDelete(action= OnDeleteAction.CASCADE)
	private CmsGuestbookExt ext;

    // constructors
    public BaseCmsGuestbook () {
        initialize();
    }

    /**
     * Constructor for primary key
     */
    public BaseCmsGuestbook (java.lang.Integer id) {
        this.setId(id);
        initialize();
    }

    /**
     * Constructor for required fields
     */
    public BaseCmsGuestbook (
            java.lang.Integer id,
            com.yunkuo.cms.entity.main.CmsSite site,
            com.yunkuo.cms.entity.assist.CmsGuestbookCtg ctg,
            java.lang.String ip,
            java.util.Date createTime,
            java.lang.Boolean checked,
            java.lang.Boolean recommend) {

        this.setId(id);
        this.setSite(site);
        this.setCtg(ctg);
        this.setIp(ip);
        this.setCreateTime(createTime);
        this.setChecked(checked);
        this.setRecommend(recommend);
        initialize();
    }

    protected void initialize () {}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer guestbookId) {
		this.id = guestbookId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Boolean getChecked() {
		return this.checked;
	}

	public void setChecked(Boolean isChecked) {
		this.checked = isChecked;
	}

	public Boolean getRecommend() {
		return this.recommend;
	}

	public void setRecommend(Boolean isRecommend) {
		this.recommend = isRecommend;
	}

	public Date getReplayTime() {
		return this.replayTime;
	}

	public void setReplayTime(Date replayTime) {
		this.replayTime = replayTime;
	}

	public CmsGuestbookCtg getCtg() {
		return this.ctg;
	}

	public void setCtg(CmsGuestbookCtg cmsGuestbookCtg) {
		this.ctg = cmsGuestbookCtg;
	}

	public CmsUser getAdmin() {
		return this.admin;
	}

	public void setAdmin(CmsUser admin) {
		this.admin = admin;
	}

	public CmsUser getMember() {
		return this.member;
	}

	public void setMember(CmsUser member) {
		this.member = member;
	}

	public CmsSite getSite() {
		return this.site;
	}

	public void setSite(CmsSite cmsSite) {
		this.site = cmsSite;
	}

	public CmsGuestbookExt getExt() {
		return this.ext;
	}

	public void setExt(CmsGuestbookExt ext) {
		this.ext = ext;
	}

	/*public CmsGuestbookExt addCmsGuestbookExt(CmsGuestbookExt cmsGuestbookExt) {
		getExt().add(cmsGuestbookExt);
		cmsGuestbookExt.setCmsGuestbook(this);

		return cmsGuestbookExt;
	}

	public CmsGuestbookExt removeCmsGuestbookExt(CmsGuestbookExt cmsGuestbookExt) {
		getExt().remove(cmsGuestbookExt);
		cmsGuestbookExt.setCmsGuestbook(null);

		return cmsGuestbookExt;
	}*/

}