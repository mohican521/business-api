package com.dada.business.message.api.service;

import java.util.List;

import com.dada.business.common.api.util.PageList;
import com.dada.business.message.api.model.MessageTemplateModel;
import com.dada.business.message.api.model.MessageTemplateQuery;

/**
 * 
 * Title: MessageTemplateService Description: 消息模板实体服务接口
 * 
 * @author ssc
 * @date 2016年4月19日 上午11:20:16
 */
public interface MessageTemplateService {

	/**
	 * 
	 * @Title: addMessageTemplate
	 * @Description: 添加一个消息模板
	 * @param @param messageTemplateModel 设定文件
	 * @return void 返回类型
	 * @throws
	 */
	public abstract void addMessageTemplate(
			MessageTemplateModel messageTemplateModel);

	/**
	 * 
	 * @Title: updateMessageTemplate
	 * @Description: 更新消息模板
	 * @param @param messageTemplateModel 设定文件
	 * @return void 返回类型
	 * @throws
	 */
	public abstract void updateMessageTemplate(
			MessageTemplateModel messageTemplateModel);

	/**
	 * 
	 * @Title: getMessageTemplateByName
	 * @Description: 根据唯一消息模板名, 查询消息模板
	 * @param @param name
	 * @param @return 设定文件
	 * @return MessageTemplateModel 返回类型
	 * @throws
	 */
	public abstract MessageTemplateModel getMessageTemplateByName(String name);

	/**
	 * 
	 * @Title: getMessageTemplateByVagueType
	 * @Description: 根据消息模板类型模糊查询
	 * @param @param vagueTypeName
	 * @param @return 设定文件
	 * @return List<MessageTemplateModel> 返回类型
	 * @throws
	 */
	public abstract List<MessageTemplateModel> getMessageTemplateByVagueType(
			String vagueTypeName);

	/**
	 * 
	 * @Title: queryMessageTemplates
	 * @Description: 根据查询条件, 查询消息模板
	 * @param @param messageTemplateQuery
	 * @param @return 设定文件
	 * @return PageList<MessageTemplateModel> 返回类型
	 * @throws
	 */
	public abstract PageList<MessageTemplateModel> queryMessageTemplates(
			MessageTemplateQuery messageTemplateQuery);

}
