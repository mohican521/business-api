package com.dada.business.message.api.model;

import com.dada.business.common.api.model.PageQuery;

/**
 * 
 * Title: MessageDetailQuery Description: 分页查询消息详情实体
 * 
 * @author ssc
 * @date 2016年4月18日 下午5:21:01
 */
public class MessageDetailQuery extends PageQuery<MessageDetailQuery> {

	private static final long serialVersionUID = 1L;

	private long messageId;											// 消息ID
	private String destination;										// 消息接收者
	private Integer act;											// 消息是否到达
	private Integer open;											// 消息是否打开

	public long getMessageId() {
		return messageId;
	}

	public void setMessageId(long messageId) {
		this.messageId = messageId;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Integer getAct() {
		return act;
	}

	public void setAct(Integer act) {
		this.act = act;
	}

	public Integer getOpen() {
		return open;
	}

	public void setOpen(Integer open) {
		this.open = open;
	}

}
