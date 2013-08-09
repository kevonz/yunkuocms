package com.yunkuo.cms.entity.main.base;

import com.yunkuo.cms.entity.main.Content;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the cms_content_picture database table.
 * 
 */
/*@Entity
@Table(name="cms_content_picture")*/
@MappedSuperclass
public class BaseContentPicture implements Serializable {
	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    /*@Id
    @Column(name="content_id")
    @GenericGenerator(name="foreignKey", strategy="foreign", parameters=@Parameter(name="property", value="content"))
    @GeneratedValue(generator="foreignKey", strategy=GenerationType.IDENTITY)
    private Integer id;*/

	private String description;

	@Column(name="img_path")
	private String imgPath;

	//bi-directional many-to-one association to CmsContent

   /* @JoinTable(name = "cms_content"
            , joinColumns = {
            @JoinColumn(name = "content_id")
    })*/
    @ManyToOne
    @JoinColumn(name="content_id")
    private Content cmsContent;

	public BaseContentPicture() {
	}
    /**
     * Constructor for required fields
     */
    public BaseContentPicture (
            java.lang.String imgPath) {

        this.setImgPath(imgPath);
        initialize();
    }

    protected void initialize () {}
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImgPath() {
		return this.imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}


	public Content getCmsContent() {
		return this.cmsContent;
	}

	public void setCmsContent(Content cmsContent) {
		this.cmsContent = cmsContent;
	}


}