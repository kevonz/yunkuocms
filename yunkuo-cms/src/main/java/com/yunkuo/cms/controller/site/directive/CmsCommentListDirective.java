package com.yunkuo.cms.controller.site.directive;

import static com.yunkuo.cms.constant.Constants.TPL_STYLE_LIST;
import static com.yunkuo.cms.constant.Constants.TPL_SUFFIX;
import static com.yunkuo.cms.utils.FrontUtils.PARAM_STYLE_LIST;
import static com.yunkuo.common.web.Constants.UTF8;
import static com.yunkuo.common.web.freemarker.DirectiveUtils.OUT_LIST;
import static freemarker.template.ObjectWrapper.DEFAULT_WRAPPER;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.yunkuo.cms.controller.site.directive.abs.AbstractCmsCommentDirective;
import com.yunkuo.cms.entity.assist.CmsComment;
import com.yunkuo.cms.entity.main.CmsSite;
import com.yunkuo.cms.utils.FrontUtils;
import com.yunkuo.common.web.freemarker.DirectiveUtils;
import com.yunkuo.common.web.freemarker.ParamsRequiredException;
import com.yunkuo.common.web.freemarker.DirectiveUtils.InvokeType;

import freemarker.core.Environment;
import freemarker.template.TemplateDirectiveBody;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;

/**
 * 评论列表标签
 * 
*
 * 
 */
public class CmsCommentListDirective extends AbstractCmsCommentDirective {
	/**
	 * 模板名称
	 */
	public static final String TPL_NAME = "comment_list";

	/**
	 * 输入参数，站点ID。
	 */
	public static final String PARAM_SITE_ID = "siteId";

	@SuppressWarnings("unchecked")
	public void execute(Environment env, Map params, TemplateModel[] loopVars,
			TemplateDirectiveBody body) throws TemplateException, IOException {
		CmsSite site = FrontUtils.getSite(env);

		List<CmsComment> list = cmsCommentMng.getListForTag(getSiteId(params),
				getContentId(params), getGreaterThen(params),
				getChecked(params), getRecommend(params), getDesc(params),
				FrontUtils.getCount(params));

		Map<String, TemplateModel> paramWrap = new HashMap<String, TemplateModel>(
				params);
		paramWrap.put(OUT_LIST, DEFAULT_WRAPPER.wrap(list));
		Map<String, TemplateModel> origMap = DirectiveUtils
				.addParamsToVariable(env, paramWrap);
		InvokeType type = DirectiveUtils.getInvokeType(params);
		String listStyle = DirectiveUtils.getString(PARAM_STYLE_LIST, params);
		if (InvokeType.sysDefined == type) {
			if (StringUtils.isBlank(listStyle)) {
				throw new ParamsRequiredException(PARAM_STYLE_LIST);
			}
			env.include(TPL_STYLE_LIST + listStyle + TPL_SUFFIX, UTF8, true);
		} else if (InvokeType.userDefined == type) {
			if (StringUtils.isBlank(listStyle)) {
				throw new ParamsRequiredException(PARAM_STYLE_LIST);
			}
			FrontUtils.includeTpl(TPL_STYLE_LIST, site, env);
		} else if (InvokeType.custom == type) {
			FrontUtils.includeTpl(TPL_NAME, site, params, env);
		} else if (InvokeType.body == type) {
			body.render(env.getOut());
		} else {
			throw new RuntimeException("invoke type not handled: " + type);
		}
		DirectiveUtils.removeParamsFromVariable(env, paramWrap, origMap);
	}

	protected Integer getSiteId(Map<String, TemplateModel> params)
			throws TemplateException {
		return DirectiveUtils.getInt(PARAM_SITE_ID, params);
	}

}
