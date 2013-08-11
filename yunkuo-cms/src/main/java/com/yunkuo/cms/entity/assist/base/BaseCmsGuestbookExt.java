package com.yunkuo.cms.entity.assist.base;

import com.yunkuo.cms.entity.assist.CmsGuestbook;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the cms_guestbook_ext database table.
 * 
 */
/*@Entity
@Table(name="cms_guestbook_ext")*/
@MappedSuperclass
public class BaseCmsGuestbookExt implements Serializable {
	private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="guestbook_id")
    @GenericGenerator(name="foreignKey", strategy="foreign", parameters=@Parameter(name="property", value="guestbook"))
    @GeneratedValue(generator="foreignKey", strategy=GenerationType.IDENTITY)
    private Integer id;

	@Lob
	private String content;

	private String email;

	private String phone;

	private String qq;

	@Lob
	private String reply;

	private String title;

	//bi-directional many-to-one association to CmsGuestbook
	//@ManyToOne
    @OneToOne
	@JoinColumn(name="guestbook_id")
	private CmsGuestbook guestbook;

    // constructors
    public BaseCmsGuestbookExt () {
        initialize();
    }

    /**
     * Constructor for primary key
     */
    public BaseCmsGuestbookExt (java.lang.Integer id) {
        this.setId(id);
        initialize();
    }

    protected void initialize () {}
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getReply() {
		return this.reply;
	}

	public void setReply(String reply) {
		this.reply = reply;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public CmsGuestbook getGuestbook() {
		return this.guestbook;
	}

	public void setGuestbook(CmsGuestbook cmsGuestbook) {
		this.guestbook = cmsGuestbook;
	}

}