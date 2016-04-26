package com.dada.business.message.api.service;

import java.util.List;

import com.dada.business.message.api.model.MessageSendParam;

/**
 * 
 * Title: MessageSendService Description: 消息发送服务接口(同步)
 * 
 * @author ssc
 * @date 2016年4月19日 上午11:35:50
 */
public interface SyncMessageSendService {

	/**
	 * <pre>
	 * 发送消息
	 * 必须: 消息模板, 发送模式, 发送渠道
	 * 可选: 消息发送者
	 * 可选: 消息有效期
	 * 可选: 消息追踪轨迹
	 * 可选: 消息对应应用
	 * </pre>
	 * 
	 * @Title: sendMessage
	 * @Description: 发送单条消息
	 * @param @param messageSendParam 设定文件
	 * @return void 返回类型
	 * @throws
	 */
	public abstract void sendMessage(MessageSendParam messageSendParam);

	/**
	 * 
	 * @Title: sendMessages
	 * @Description: 批量发送消息
	 * @param @param messageSendParams 设定文件
	 * @return void 返回类型
	 * @throws
	 */
	public abstract void sendMessages(List<MessageSendParam> messageSendParams);

}
