package com.yunkuo.cms.entity.main;

import com.yunkuo.cms.entity.main.base.BaseContentPicture;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="cms_content_picture")
public class ContentPicture extends BaseContentPicture {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public ContentPicture () {
		super();
	}

	/**
	 * Constructor for required fields
	 */
	public ContentPicture (
		java.lang.String imgPath) {

		super (
			imgPath);
	}

/*[CONSTRUCTOR MARKER END]*/


}