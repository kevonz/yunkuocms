package com.yunkuo.cms.entity.main.base;


import com.yunkuo.cms.entity.main.CmsModel;
import com.yunkuo.cms.entity.main.CmsModelItem;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the cms_model_item database table.
 * 
 */
/*@Entity
@Table(name="cms_model_item")*/
@MappedSuperclass
public class BaseCmsModelItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="modelitem_id")
	private Integer id;

	@Column(name="area_cols")
	private String cols;

	@Column(name="area_rows")
	private String rows;

	@Column(name="data_type")
	private Integer dataType;

	@Column(name="def_value")
	private String defValue;

	private String field;

	private String help;

	@Column(name="help_position")
	private String helpPosition;

	@Column(name="is_channel")
	private Boolean channel;

	@Column(name="is_custom")
	private Boolean custom;

	@Column(name="is_display")
	private Boolean display;

	@Column(name="is_single")
	private Boolean single;

	@Column(name="item_label")
	private String label;

	@Column(name="opt_value")
	private String optValue;

	private int priority;

	@Column(name="text_size")
	private String size;

	//bi-directional many-to-one association to CmsModel
	@ManyToOne
	@JoinColumn(name="model_id")
	private CmsModel model;


    // constructors
    public BaseCmsModelItem () {
        initialize();
    }

    /**
     * Constructor for primary key
     */
    public BaseCmsModelItem (java.lang.Integer id) {
        this.setId(id);
        initialize();
    }

    /**
     * Constructor for required fields
     */
    public BaseCmsModelItem (
            java.lang.Integer id,
            CmsModel model,
            java.lang.String field,
            java.lang.String label,
            java.lang.Integer dataType,
            java.lang.Boolean single,
            java.lang.Boolean channel,
            java.lang.Boolean custom,
            java.lang.Boolean display) {

        this.setId(id);
        this.setModel(model);
        this.setField(field);
        this.setLabel(label);
        this.setDataType(dataType);
        this.setSingle(single);
        this.setChannel(channel);
        this.setCustom(custom);
        this.setDisplay(display);
        initialize();
    }

    protected void initialize () {}

    public boolean equals (Object obj) {
        if (null == obj) return false;
        if (!(obj instanceof CmsModelItem)) return false;
        else {
            CmsModelItem cmsModelItem = (CmsModelItem) obj;
            if (null == this.getId() || null == cmsModelItem.getId()) return false;
            else return (this.getId().equals(cmsModelItem.getId()));
        }
    }

    public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCols() {
		return this.cols;
	}

	public void setCols(String areaCols) {
		this.cols = areaCols;
	}

	public String getRows() {
		return this.rows;
	}

	public void setRows(String areaRows) {
		this.rows = areaRows;
	}

	public Integer getDataType() {
		return this.dataType;
	}

	public void setDataType(Integer dataType) {
		this.dataType = dataType;
	}

	public String getDefValue() {
		return this.defValue;
	}

	public void setDefValue(String defValue) {
		this.defValue = defValue;
	}

	public String getField() {
		return this.field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getHelp() {
		return this.help;
	}

	public void setHelp(String help) {
		this.help = help;
	}

	public String getHelpPosition() {
		return this.helpPosition;
	}

	public void setHelpPosition(String helpPosition) {
		this.helpPosition = helpPosition;
	}

	public Boolean getChannel() {
		return this.channel;
	}

	public void setChannel(Boolean isChannel) {
		this.channel = isChannel;
	}

	public Boolean getCustom() {
		return this.custom;
	}

	public void setCustom(Boolean isCustom) {
		this.custom = isCustom;
	}

	public Boolean getDisplay() {
		return this.display;
	}

	public void setDisplay(Boolean isDisplay) {
		this.display = isDisplay;
	}

	public Boolean getSingle() {
		return this.single;
	}

	public void setSingle(Boolean isSingle) {
		this.single = isSingle;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String itemLabel) {
		this.label = itemLabel;
	}

	public String getOptValue() {
		return this.optValue;
	}

	public void setOptValue(String optValue) {
		this.optValue = optValue;
	}

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public String getSize() {
		return this.size;
	}

	public void setSize(String textSize) {
		this.size = textSize;
	}

	public CmsModel getModel() {
		return this.model;
	}

	public void setModel(CmsModel cmsModel) {
		this.model = cmsModel;
	}

}