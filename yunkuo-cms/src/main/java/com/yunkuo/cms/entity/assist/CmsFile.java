package com.yunkuo.cms.entity.assist;

import com.yunkuo.cms.entity.assist.base.BaseCmsFile;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="cms_file")
public class CmsFile extends BaseCmsFile {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public CmsFile () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CmsFile (java.lang.String filePath) {
		super(filePath);
	}

	/**
	 * Constructor for required fields
	 */
	public CmsFile (
		java.lang.String filePath,
		boolean fileIsvalid) {

		super (
			filePath,
			fileIsvalid);
	}
	
	public Boolean getFileIsvalid(){
		return super.getFileIsvalid();
	}

/*[CONSTRUCTOR MARKER END]*/


}