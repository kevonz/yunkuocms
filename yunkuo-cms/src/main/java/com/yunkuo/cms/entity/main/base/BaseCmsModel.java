package com.yunkuo.cms.entity.main.base;

import com.yunkuo.cms.entity.main.CmsModel;
import com.yunkuo.cms.entity.main.CmsModelItem;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


/**
 * The persistent class for the cms_model database table.
 * 
 */
/*@Entity
@Table(name="cms_model")*/
@MappedSuperclass
public class BaseCmsModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="model_id")
	private Integer id;

	@Column(name="content_img_height")
	private Integer contentImgHeight;

	@Column(name="content_img_width")
	private Integer contentImgWidth;

	@Column(name="has_content")
	private Boolean hasContent;

	@Column(name="is_def")
	private Boolean def;

	@Column(name="is_disabled")
	private Boolean disabled;

	@Column(name="model_name")
	private String name;

	@Column(name="model_path")
	private String path;

	private Integer priority;

	@Column(name="title_img_height")
	private Integer titleImgHeight;

	@Column(name="title_img_width")
	private Integer titleImgWidth;

	@Column(name="tpl_channel_prefix")
	private String tplChannelPrefix;

	@Column(name="tpl_content_prefix")
	private String tplContentPrefix;

	//bi-directional many-to-one association to BaseChannel

	/*@OneToMany(mappedBy="cmsModel")
	private List<Channel> cmsChannels;*/

	//bi-directional many-to-one association to CmsModelItem
	@OneToMany(mappedBy= "model")
	private List<CmsModelItem> cmsModelItems;

    // constructors
    public BaseCmsModel () {
        initialize();
    }

    /**
     * Constructor for primary key
     */
    public BaseCmsModel (java.lang.Integer id) {
        this.setId(id);
        initialize();
    }

    /**
     * Constructor for required fields
     */
    public BaseCmsModel (
            java.lang.Integer id,
            java.lang.String name,
            java.lang.String path,
            java.lang.Integer titleImgWidth,
            java.lang.Integer titleImgHeight,
            java.lang.Integer contentImgWidth,
            java.lang.Integer contentImgHeight,
            java.lang.Integer priority,
            java.lang.Boolean hasContent,
            java.lang.Boolean disabled,
            java.lang.Boolean def) {

        this.setId(id);
        this.setName(name);
        this.setPath(path);
        this.setTitleImgWidth(titleImgWidth);
        this.setTitleImgHeight(titleImgHeight);
        this.setContentImgWidth(contentImgWidth);
        this.setContentImgHeight(contentImgHeight);
        this.setPriority(priority);
        this.setHasContent(hasContent);
        this.setDisabled(disabled);
        this.setDef(def);
        initialize();
    }

    protected void initialize () {}
    public boolean equals (Object obj) {
        if (null == obj) return false;
        if (!(obj instanceof CmsModel)) return false;
        else {
            CmsModel cmsModel = (CmsModel) obj;
            if (null == this.getId() || null == cmsModel.getId()) return false;
            else return (this.getId().equals(cmsModel.getId()));
        }
    }



    public Integer getId() {
		return this.id;
	}

	public void setId(Integer modelId) {
		this.id = modelId;
	}

	public Integer getContentImgHeight() {
		return this.contentImgHeight;
	}

	public void setContentImgHeight(Integer contentImgHeight) {
		this.contentImgHeight = contentImgHeight;
	}

	public Integer getContentImgWidth() {
		return this.contentImgWidth;
	}

	public void setContentImgWidth(Integer contentImgWidth) {
		this.contentImgWidth = contentImgWidth;
	}

	public Boolean getHasContent() {
		return this.hasContent;
	}

	public void setHasContent(Boolean hasContent) {
		this.hasContent = hasContent;
	}

	public Boolean getDef() {
		return this.def;
	}

	public void setDef(Boolean isDef) {
		this.def = isDef;
	}

	public Boolean getDisabled() {
		return this.disabled;
	}

	public void setDisabled(Boolean isDisabled) {
		this.disabled = isDisabled;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String modelName) {
		this.name = modelName;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String modelPath) {
		this.path = modelPath;
	}

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Integer getTitleImgHeight() {
		return this.titleImgHeight;
	}

	public void setTitleImgHeight(Integer titleImgHeight) {
		this.titleImgHeight = titleImgHeight;
	}

	public Integer getTitleImgWidth() {
		return this.titleImgWidth;
	}

	public void setTitleImgWidth(Integer titleImgWidth) {
		this.titleImgWidth = titleImgWidth;
	}

	public String getTplChannelPrefix() {
		return this.tplChannelPrefix;
	}

	public void setTplChannelPrefix(String tplChannelPrefix) {
		this.tplChannelPrefix = tplChannelPrefix;
	}

	public String getTplContentPrefix() {
		return this.tplContentPrefix;
	}

	public void setTplContentPrefix(String tplContentPrefix) {
		this.tplContentPrefix = tplContentPrefix;
	}

	/*public List<Channel> getCmsChannels() {
		return this.cmsChannels;
	}

	public void setCmsChannels(List<Channel> cmsChannels) {
		this.cmsChannels = cmsChannels;
	}

	public BaseChannel addCmsChannel(BaseChannel cmsChannel) {
		getCmsChannels().add((Channel)cmsChannel);
		cmsChannel.setModel((CmsModel) this);

		return cmsChannel;
	}

	public BaseChannel removeCmsChannel(BaseChannel cmsChannel) {
		getCmsChannels().remove(cmsChannel);
		cmsChannel.setModel(null);

		return cmsChannel;
	}*/

	public List<CmsModelItem> getCmsModelItems() {
		return this.cmsModelItems;
	}

	public void setCmsModelItems(List<CmsModelItem> cmsModelItems) {
		this.cmsModelItems = cmsModelItems;
	}

	public CmsModelItem addCmsModelItem(CmsModelItem cmsModelItem) {
		getCmsModelItems().add(cmsModelItem);
		cmsModelItem.setModel((CmsModel) this);

		return cmsModelItem;
	}

	public CmsModelItem removeCmsModelItem(CmsModelItem cmsModelItem) {
		getCmsModelItems().remove(cmsModelItem);
		cmsModelItem.setModel(null);

		return cmsModelItem;
	}

}