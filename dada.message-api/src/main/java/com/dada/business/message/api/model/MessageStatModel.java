package com.dada.business.message.api.model;

import java.io.Serializable;

/**
 * 
 * Title: MessageStatModel Description: 消息统计实体
 * 
 * @author ssc
 * @date 2016年4月18日 下午1:49:36
 */
public class MessageStatModel extends BaseModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long messageId; 										// 消息Id
	private Long total; 											// 消息总数
	private Long ack; 												// 消息到达数量
	private Integer ackRate; 										// 消息到达比率
	private Long open; 												// 消息打开数量
	private Integer openRate; 										// 消息打开比率

	public Long getMessageId() {
		return messageId;
	}

	public void setMessageId(Long messageId) {
		this.messageId = messageId;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public Long getAck() {
		return ack;
	}

	public void setAck(Long ack) {
		this.ack = ack;
	}

	public Integer getAckRate() {
		return ackRate;
	}

	public void setAckRate(Integer ackRate) {
		this.ackRate = ackRate;
	}

	public Long getOpen() {
		return open;
	}

	public void setOpen(Long open) {
		this.open = open;
	}

	public Integer getOpenRate() {
		return openRate;
	}

	public void setOpenRate(Integer openRate) {
		this.openRate = openRate;
	}

}
