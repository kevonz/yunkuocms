package com.yunkuo.cms.entity.assist;

import com.yunkuo.cms.entity.assist.base.BaseCmsMessage;
import com.yunkuo.common.util.StrUtils;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="cms_message")
public class CmsMessage extends BaseCmsMessage {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public CmsMessage () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CmsMessage (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public CmsMessage (
		java.lang.Integer id,
		com.yunkuo.cms.entity.main.CmsUser msgReceiverUser,
		com.yunkuo.cms.entity.main.CmsUser msgSendUser,
		com.yunkuo.cms.entity.main.CmsSite site,
		java.lang.String msgTitle,
		java.lang.Boolean msgStatus,
		java.lang.Integer msgBox) {

		super (
			id,
			msgReceiverUser,
			msgSendUser,
			site,
			msgTitle,
			msgStatus,
			msgBox);
	}
	public String getTitleHtml() {
		return StrUtils.txt2htm(getMsgTitle());
	}
	public String getContentHtml() {
		return StrUtils.txt2htm(getMsgContent());
	}


/*[CONSTRUCTOR MARKER END]*/


}