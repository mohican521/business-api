package com.dada.business.message.api.model;

import java.io.Serializable;
import java.util.Date;

import com.dada.business.common.api.util.Extras;

/**
 * 
 * Title: MessageDetailModel Description: 消息详情实体
 * 
 * @author ssc
 * @date 2016年4月18日 上午11:43:03
 */
public class MessageDetailModel extends BaseModel implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final Integer ACK_TRUE       = 1; 				// 已到达
	public static final Integer ACK_FALSE      = 0; 				// 未到达
	public static final Integer ACK_UNKNOWN    = -1; 				// 未知
	public static final Integer OPEN_TRUE      = 1; 				// 已打开
	public static final Integer OPEN_FALSE     = 0; 				// 未打开
	public static final Integer OPEN_UNKNOWN   = -1; 				// 未知

	private Long messageId; 										// 消息ID
	private String destination; 									// 消息接受者
	private Integer ack; 											// 消息是否到达
	private Integer open; 											// 消息是否打开
	private Date ackDate; 											// 消息到达时间
	private Date openDate; 											// 消息打开时间
	private Extras extras; 											// 额外补充信息

	public Long getMessageId() {
		return messageId;
	}

	public void setMessageId(Long messageId) {
		this.messageId = messageId;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Integer getAck() {
		return ack;
	}

	public void setAck(Integer ack) {
		this.ack = ack;
	}

	public Integer getOpen() {
		return open;
	}

	public void setOpen(Integer open) {
		this.open = open;
	}

	public Date getAckDate() {
		return ackDate;
	}

	public void setAckDate(Date ackDate) {
		this.ackDate = ackDate;
	}

	public Date getOpenDate() {
		return openDate;
	}

	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}

	public Extras getExtras() {
		if (extras == null) {
			extras = new Extras();
		}
		return extras;
	}

	public void setExtras(Extras extras) {
		this.extras = extras;
	}

	/**
	 * 
	 * @Title: getExtra
	 * @Description: 根据key获取value
	 * @param @param key
	 * @param @return 设定文件
	 * @return String 返回类型
	 * @throws
	 */
	public String getExtra(String key) {
		return getExtras().get(key);
	}

	/**
	 * 
	 * @Title: addExtra
	 * @Description: 添加key/value键值对
	 * @param @param key
	 * @param @param value 设定文件
	 * @return void 返回类型
	 * @throws
	 */
	public void addExtra(String key, String value) {
		getExtras().put(key, value);
	}

}
