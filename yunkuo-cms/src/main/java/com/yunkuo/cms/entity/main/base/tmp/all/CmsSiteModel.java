package com.yunkuo.cms.entity.main.base.tmp.all;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cms_site_model database table.
 * 
 */
@Entity
@Table(name="cms_site_model")
public class CmsSiteModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="model_id")
	private int modelId;

	@Column(name="area_cols")
	private String areaCols;

	@Column(name="area_rows")
	private String areaRows;

	@Column(name="data_type")
	private int dataType;

	private String field;

	private String help;

	@Column(name="help_position")
	private String helpPosition;

	@Column(name="is_single")
	private byte isSingle;

	@Column(name="model_label")
	private String modelLabel;

	private int priority;

	@Column(name="text_size")
	private String textSize;

	@Column(name="upload_path")
	private String uploadPath;

	public CmsSiteModel() {
	}

	public int getModelId() {
		return this.modelId;
	}

	public void setModelId(int modelId) {
		this.modelId = modelId;
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

	public byte getIsSingle() {
		return this.isSingle;
	}

	public void setIsSingle(byte isSingle) {
		this.isSingle = isSingle;
	}

	public String getModelLabel() {
		return this.modelLabel;
	}

	public void setModelLabel(String modelLabel) {
		this.modelLabel = modelLabel;
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

	public String getUploadPath() {
		return this.uploadPath;
	}

	public void setUploadPath(String uploadPath) {
		this.uploadPath = uploadPath;
	}

}