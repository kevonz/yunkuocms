package com.yunkuo.cms.entity.assist.base;


import com.yunkuo.cms.entity.assist.CmsComment;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the cms_comment_ext database table.
 * 
 */
/*@Entity
@Table(name="cms_comment_ext")*/
@MappedSuperclass
public class BaseCmsCommentExt implements Serializable {
	private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Id
   @Column(name = "comment_id")
   @GenericGenerator(name="foreignKey", strategy="foreign", parameters=@Parameter(name="property", value="comment"))
    @GeneratedValue(generator="foreignKey", strategy=GenerationType.IDENTITY)
//  @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

	private String ip;

	@Lob
	private String reply;

	@Lob
	private String text;

	//bi-directional many-to-one association to CmsComment
	@OneToOne
	@JoinColumn(name="comment_id")
	private CmsComment comment;

    // constructors
    public BaseCmsCommentExt () {
        initialize();
    }

    /**
     * Constructor for primary key
     */
    public BaseCmsCommentExt (java.lang.Integer id) {
        this.setId(id);
        initialize();
    }

    protected void initialize () {}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getReply() {
		return this.reply;
	}

	public void setReply(String reply) {
		this.reply = reply;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public CmsComment getComment() {
		return this.comment;
	}

	public void setComment(CmsComment cmsComment) {
		this.comment = cmsComment;
	}

}