package com.yunkuo.cms.entity.main.base.tmp.all;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cms_model_item database table.
 * 
 */
@Entity
@Table(name="cms_model_item")
public class CmsModelItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="modelitem_id")
	private int modelitemId;

	@Column(name="area_cols")
	private String areaCols;

	@Column(name="area_rows")
	private String areaRows;

	@Column(name="data_type")
	private int dataType;

	@Column(name="def_value")
	private String defValue;

	private String field;

	private String help;

	@Column(name="help_position")
	private String helpPosition;

	@Column(name="is_channel")
	private byte isChannel;

	@Column(name="is_custom")
	private byte isCustom;

	@Column(name="is_display")
	private byte isDisplay;

	@Column(name="is_single")
	private byte isSingle;

	@Column(name="item_label")
	private String itemLabel;

	@Column(name="opt_value")
	private String optValue;

	private int priority;

	@Column(name="text_size")
	private String textSize;

	//bi-directional many-to-one association to CmsModel
	@ManyToOne
	@JoinColumn(name="model_id")
	private CmsModel cmsModel;

	public CmsModelItem() {
	}

	public int getModelitemId() {
		return this.modelitemId;
	}

	public void setModelitemId(int modelitemId) {
		this.modelitemId = modelitemId;
	}

	public String getAreaCols() {
		return this.areaCols;
	}

	public void setAreaCols(String areaCols) {
		this.areaCols = areaCols;
	}

	public String getAreaRows() {
		return this.areaRows;
	}

	public void setAreaRows(String areaRows) {
		this.areaRows = areaRows;
	}

	public int getDataType() {
		return this.dataType;
	}

	public void setDataType(int dataType) {
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

	public byte getIsChannel() {
		return this.isChannel;
	}

	public void setIsChannel(byte isChannel) {
		this.isChannel = isChannel;
	}

	public byte getIsCustom() {
		return this.isCustom;
	}

	public void setIsCustom(byte isCustom) {
		this.isCustom = isCustom;
	}

	public byte getIsDisplay() {
		return this.isDisplay;
	}

	public void setIsDisplay(byte isDisplay) {
		this.isDisplay = isDisplay;
	}

	public byte getIsSingle() {
		return this.isSingle;
	}

	public void setIsSingle(byte isSingle) {
		this.isSingle = isSingle;
	}

	public String getItemLabel() {
		return this.itemLabel;
	}

	public void setItemLabel(String itemLabel) {
		this.itemLabel = itemLabel;
	}

	public String getOptValue() {
		return this.optValue;
	}

	public void setOptValue(String optValue) {
		this.optValue = optValue;
	}

	public int getPriority() {
		return this.priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getTextSize() {
		return this.textSize;
	}

	public void setTextSize(String textSize) {
		this.textSize = textSize;
	}

	public CmsModel getCmsModel() {
		return this.cmsModel;
	}

	public void setCmsModel(CmsModel cmsModel) {
		this.cmsModel = cmsModel;
	}

}