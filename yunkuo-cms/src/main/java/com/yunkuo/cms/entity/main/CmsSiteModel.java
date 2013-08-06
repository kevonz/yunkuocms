package com.yunkuo.cms.entity.main;

import javax.persistence.*;
import java.io.Serializable;


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
	private Integer id;

	@Column(name="area_cols")
	private String cols;

	@Column(name="area_rows")
	private String rows;

	@Column(name="data_type")
	private int dataType;
	private String field;

    private String label;

    private int priority;
	private String help;

	@Column(name="help_position")
	private String helpPosition;

	@Column(name="is_single")
	private Boolean single;



	@Column(name="text_size")
	private String size;

	@Column(name="upload_path")
	private String uploadPath;

    protected void initialize () {}
    // constructors
    public CmsSiteModel () {
        initialize();
    }

    /**
     * Constructor for primary key
     */
    public CmsSiteModel (java.lang.Integer id) {
        this.setId(id);
        initialize();
    }

    /**
     * Constructor for required fields
     */
    public CmsSiteModel (
            java.lang.Integer id,
            java.lang.String field,
            java.lang.String label,
            java.lang.Integer priority) {

        this.setId(id);
        this.setField(field);
        this.setLabel(label);
        this.setPriority(priority);
        initialize();
    }



	public Integer getId() {
		return this.id;
	}

	public void setId(int modelId) {
		this.id = modelId;
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

	public Boolean getSingle() {
		return this.single;
	}

	public void setSingle(Boolean isSingle) {
		this.single = isSingle;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String modelLabel) {
		this.label = modelLabel;
	}

	public int getPriority() {
		return this.priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getSize() {
		return this.size;
	}

	public void setSize(String textSize) {
		this.size = textSize;
	}

	public String getUploadPath() {
		return this.uploadPath;
	}

	public void setUploadPath(String uploadPath) {
		this.uploadPath = uploadPath;
	}

}