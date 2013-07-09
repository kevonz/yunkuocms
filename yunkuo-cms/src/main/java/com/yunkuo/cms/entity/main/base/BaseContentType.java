package com.yunkuo.cms.entity.main.base;

import javax.persistence.*;
import java.io.Serializable;



@MappedSuperclass
public class BaseContentType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="type_id")
	private int typeId;

	@Column(name="has_image")
	private boolean hasImage;

	@Column(name="img_height")
	private int imgHeight;

	@Column(name="img_width")
	private int imgWidth;

	@Column(name="is_disabled")
	private boolean disabled;

	@Column(name="type_name")
	private String typeName;

	public BaseContentType() {
	}
	public BaseContentType(int typeId) {
		this.typeId = typeId;
	}

	public int getId() {
		return this.typeId;
	}

	public void setId(int typeId) {
		this.typeId = typeId;
	}

	public boolean getHasImage() {
		return this.hasImage;
	}

	public void setHasImage(boolean hasImage) {
		this.hasImage = hasImage;
	}

	public int getImgHeight() {
		return this.imgHeight;
	}

	public void setImgHeight(int imgHeight) {
		this.imgHeight = imgHeight;
	}

	public int getImgWidth() {
		return this.imgWidth;
	}

	public void setImgWidth(int imgWidth) {
		this.imgWidth = imgWidth;
	}

	public boolean getDisabled() {
		return this.disabled;
	}

	public void setDisabled(boolean isDisabled) {
		this.disabled = isDisabled;
	}

	public String getName() {
		return this.typeName;
	}

	public void setName(String typeName) {
		this.typeName = typeName;
	}

}