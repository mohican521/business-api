package com.dada.business.message.api.service;

import java.util.Date;
import java.util.List;

import com.dada.business.common.api.util.PageList;
import com.dada.business.message.api.model.MessageModel;
import com.dada.business.message.api.model.MessageQuery;

/**
 * 
 * Title: MessageService Description: 消息实体服务接口
 * 
 * @author ssc
 * @date 2016年4月18日 下午6:37:35
 */
public interface MessageService {

	/**
	 * 
	 * @Title: addMessage
	 * @Description: 添加一个消息
	 * @param @param message 设定文件
	 * @return void 返回类型
	 * @throws
	 */
	public abstract void addMessage(MessageModel message);

	/**
	 * 
	 * @Title: queryMessages
	 * @Description: 根据查询条件, 查询消息
	 * @param @param query
	 * @param @return 设定文件
	 * @return PageList<MessageModel> 返回类型
	 * @throws
	 */
	public abstract PageList<MessageModel> queryMessages(MessageQuery query);

	/**
	 * 
	 * @Title: queryMessagesByDestination
	 * @Description: 根据查询条件, 查询消息，其中destionation是必要条件
	 * @param @param query
	 * @param @return 设定文件
	 * @return PageList<MessageModel> 返回类型
	 * @throws
	 */
	public abstract PageList<MessageModel> queryMessagesByDestination(
			MessageQuery query);

	/**
	 * 
	 * @Title: getMessageByTrack
	 * @Description: 根据唯一追踪轨迹, 查询消息
	 * @param @param track
	 * @param @return 设定文件
	 * @return MessageModel 返回类型
	 * @throws
	 */
	public abstract MessageModel getMessageByTrack(String track);

	/**
	 * 
	 * @Title: getMessagesByChannelAndDate
	 * @Description: 根据渠道和有效时间, 查询消息
	 * @param @param channel
	 * @param @param start
	 * @param @param end
	 * @param @return 设定文件
	 * @return List<MessageModel> 返回类型
	 * @throws
	 */
	public abstract List<MessageModel> getMessagesByChannelAndDate(
			Integer channel, Date start, Date end);

	/**
	 * 
	 * @Title: updateMessage
	 * @Description: 修改一个消息
	 * @param @param messageModel 设定文件
	 * @return void 返回类型
	 * @throws
	 */
	public void updateMessage(MessageModel messageModel);

}
