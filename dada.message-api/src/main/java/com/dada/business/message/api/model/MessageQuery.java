package com.dada.business.message.api.model;

import java.util.Date;

import com.dada.business.common.api.model.PageQuery;

/**
 * 
 * Title: MessageQuery Description: 分页查询消息实体
 * 
 * @author ssc
 * @date 2016年4月18日 下午5:14:08
 */
public class MessageQuery extends PageQuery<MessageQuery> {

	private static final long serialVersionUID = 1L;

	private String type; 											// 消息类型
	private Integer mode; 											// 消息模式 [单播, 组播, 广播]
	private Integer channel; 										// 消息通道 [短信, 推送, 站内]
	private String origin; 											// 消息发送方
	private Integer status; 										// 消息发送状态
	private String keyWords; 										// 消息内容关键字
	private String destination; 									// 消息接收者
	private Date startDate; 										// 查询起始日期
	private Date endDate; 											// 查询结束日期

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getMode() {
		return mode;
	}

	public void setMode(Integer mode) {
		this.mode = mode;
	}

	public Integer getChannel() {
		return channel;
	}

	public void setChannel(Integer channel) {
		this.channel = channel;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getKeyWords() {
		return keyWords;
	}

	public void setKeyWords(String keyWords) {
		this.keyWords = keyWords;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
