package com.yunkuo.cms.entity.main.base;

import com.yunkuo.cms.entity.main.CmsUser;
import com.yunkuo.cms.entity.main.Content;
import com.yunkuo.cms.entity.main.ContentCheck;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the cms_content_check database table.
 * 
 */
/*@Entity
@Table(name="cms_content_check")*/
@MappedSuperclass
public class BaseContentCheck implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="content_id")
    @GenericGenerator(name="foreignKey", strategy="foreign", parameters=@Parameter(name="property", value="content"))
    @GeneratedValue(generator="foreignKey", strategy=GenerationType.IDENTITY)
	private Integer id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="check_date")
	private Date checkDate;

	@Column(name="check_opinion")
	private String checkOpinion;

	@Column(name="check_step")
	private Byte checkStep;

	@Column(name="is_rejected")
	private Boolean rejected;

	//bi-directional one-to-one association to CmsContent
	@OneToOne
	@JoinColumn(name="content_id")
	private Content content;

	//bi-directional many-to-one association to CmsUser
	@ManyToOne
	@JoinColumn(name="reviewer")
	private CmsUser reviewer;

    // constructors
    public BaseContentCheck () {
        initialize();
    }

    /**
     * Constructor for primary key
     */
    public BaseContentCheck (java.lang.Integer id) {
        this.setId(id);
        initialize();
    }

    /**
     * Constructor for required fields
     */
    public BaseContentCheck (
            java.lang.Integer id,
            java.lang.Byte checkStep,
            java.lang.Boolean rejected) {

        this.setId(id);
        this.setCheckStep(checkStep);
        this.setRejected(rejected);
        initialize();
    }

    protected void initialize () {}

    public boolean equals (Object obj) {
        if (null == obj) return false;
        if (!(obj instanceof ContentCheck)) return false;
        else {
            ContentCheck contentCheck = (ContentCheck) obj;
            if (null == this.getId() || null == contentCheck.getId()) return false;
            else return (this.getId().equals(contentCheck.getId()));
        }
    }

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer contentId) {
		this.id = contentId;
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

	public Byte getCheckStep() {
		return this.checkStep;
	}

	public void setCheckStep(Byte checkStep) {
		this.checkStep = checkStep;
	}

	public Boolean getRejected() {
		return this.rejected;
	}

	public void setRejected(Boolean isRejected) {
		this.rejected = isRejected;
	}

	public Content getCmsContent() {
		return this.content;
	}

	public void setContent(Content cmsContent) {
		this.content = cmsContent;
	}

	public CmsUser getReviewer() {
		return this.reviewer;
	}

	public void setReviewer(CmsUser cmsUser) {
		this.reviewer = cmsUser;
	}

}