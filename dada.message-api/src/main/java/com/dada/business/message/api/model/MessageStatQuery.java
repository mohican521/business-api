package com.dada.business.message.api.model;

import com.dada.business.common.api.model.PageQuery;

/**
 * 
 * Title: MessageStatQuery Description: 分页查询消息统计实体
 * 
 * @author ssc
 * @date 2016年4月18日 下午5:57:56
 */
public class MessageStatQuery extends PageQuery<MessageStatQuery> {

	private static final long serialVersionUID = 1L;

	private long messageId; 										// 消息ID

	public long getMessageId() {
		return messageId;
	}

	public void setMessageId(long messageId) {
		this.messageId = messageId;
	}

}
