package com.yunkuo.cms.entity.main.base.tmp.all;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the cms_content_check database table.
 * 
 */
@Entity
@Table(name="cms_content_check")
public class CmsContentCheck implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="content_id")
	private int contentId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="check_date")
	private Date checkDate;

	@Column(name="check_opinion")
	private String checkOpinion;

	@Column(name="check_step")
	private byte checkStep;

	@Column(name="is_rejected")
	private byte isRejected;

	//bi-directional one-to-one association to CmsContent
	@OneToOne
	@JoinColumn(name="content_id")
	private CmsContent cmsContent;

	//bi-directional many-to-one association to CmsUser
	@ManyToOne
	@JoinColumn(name="reviewer")
	private CmsUser cmsUser;

	public CmsContentCheck() {
	}

	public int getContentId() {
		return this.contentId;
	}

	public void setContentId(int contentId) {
		this.contentId = contentId;
	}

	public Date getCheckDate() {
		return this.checkDate;
	}

	public void setCheckDate(Date checkDate) {
		this.checkDate = checkDate;
	}

	public String getCheckOpinion() {
		return this.checkOpinion;
	}

	public void setCheckOpinion(String checkOpinion) {
		this.checkOpinion = checkOpinion;
	}

	public byte getCheckStep() {
		return this.checkStep;
	}

	public void setCheckStep(byte checkStep) {
		this.checkStep = checkStep;
	}

	public byte getIsRejected() {
		return this.isRejected;
	}

	public void setIsRejected(byte isRejected) {
		this.isRejected = isRejected;
	}

	public CmsContent getCmsContent() {
		return this.cmsContent;
	}

	public void setCmsContent(CmsContent cmsContent) {
		this.cmsContent = cmsContent;
	}

	public CmsUser getCmsUser() {
		return this.cmsUser;
	}

	public void setCmsUser(CmsUser cmsUser) {
		this.cmsUser = cmsUser;
	}

}