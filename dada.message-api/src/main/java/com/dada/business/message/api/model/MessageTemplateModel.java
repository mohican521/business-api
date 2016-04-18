package com.dada.business.message.api.model;

import java.io.Serializable;

/**
 * 
 * Title: MessageTemplateModel Description: 消息模板实体
 * 
 * @author ssc
 * @date 2016年4月15日 下午2:31:15
 */
public class MessageTemplateModel extends BaseModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name; 											// 消息模板名称[唯一]
	private String title; 											// 消息模板标题
	private String content; 										// 消息模板内容
	private Integer type; 											// 消息模板类型
	private String url; 											// 跳转的url
	private String attributes; 										// 消息模板支持的属性内容

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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getAttributes() {
		return attributes;
	}

	public void setAttributes(String attributes) {
		this.attributes = attributes;
	}

}
