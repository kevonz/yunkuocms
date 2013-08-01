package com.yunkuo.cms.entity.main.base;

import com.yunkuo.cms.entity.main.Content;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the cms_content_txt database table.
 * 
 */

@MappedSuperclass
public abstract class BaseContentTxt  implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="content_id")
    @GenericGenerator(name="foreignKey", strategy="foreign", parameters=@Parameter(name="property", value="content"))
    @GeneratedValue(generator="foreignKey", strategy=GenerationType.IDENTITY)
	private Integer id;

	@Lob
	private String txt;

	@Lob
	private String txt1;

	@Lob
	private String txt2;

	@Lob
	private String txt3;

	// one to one
	//private com.yunkuo.cms.entity.main.Content content;
	//bi-directional one-to-one association to CmsContent
	@OneToOne
	@JoinColumn(name="content_id")
	private Content content;
	
	public Content getContent() {
		return content;
	}

	public void setContent(Content content) {
		this.content = content;
	}

	public BaseContentTxt() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTxt() {
		return this.txt;
	}

	public void setTxt(String txt) {
		this.txt = txt;
	}

	public String getTxt1() {
		return this.txt1;
	}

	public void setTxt1(String txt1) {
		this.txt1 = txt1;
	}

	public String getTxt2() {
		return this.txt2;
	}

	public void setTxt2(String txt2) {
		this.txt2 = txt2;
	}

	public String getTxt3() {
		return this.txt3;
	}

	public void setTxt3(String txt3) {
		this.txt3 = txt3;
	}
	
	/**
	 * Constructor for primary key
	 */
	public BaseContentTxt (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}
	
	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.yunkuo.cms.entity.main.ContentTxt)) return false;
		else {
			com.yunkuo.cms.entity.main.ContentTxt contentTxt = (com.yunkuo.cms.entity.main.ContentTxt) obj;
			if (null == this.getId() || null == contentTxt.getId()) return false;
			else return (this.getId().equals(contentTxt.getId()));
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