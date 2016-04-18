package com.dada.business.message.api.model;

import com.dada.business.common.api.model.PageQuery;

/**
 * 
 * Title: MessageTemplateQuery Description: 分页查询消息模板实体
 * 
 * @author ssc
 * @date 2016年4月18日 下午6:04:31
 */
public class MessageTemplateQuery extends PageQuery<MessageTemplateQuery> {

	private static final long serialVersionUID = 1L;

	private String name; 											// 消息模板名称[唯一]
	private String title; 											// 消息模板标题

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
