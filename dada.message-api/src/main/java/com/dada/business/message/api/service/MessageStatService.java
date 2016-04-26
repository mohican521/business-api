package com.dada.business.message.api.service;

import java.util.List;

import com.dada.business.message.api.model.MessageStatModel;

/**
 * 
 * Title: MessageStatService Description: 消息统计实体服务接口
 * 
 * @author ssc
 * @date 2016年4月19日 上午11:27:31
 */
public interface MessageStatService {

	/**
	 * 
	 * @Title: addMessageStat
	 * @Description: 添加消息统计信息
	 * @param @param messageStatModel 设定文件
	 * @return void 返回类型
	 * @throws
	 */
	public abstract void addMessageStat(MessageStatModel messageStatModel);

	/**
	 * 
	 * @Title: updateMessageStat
	 * @Description: 更新消息统计信息
	 * @param @param messageStatModel 设定文件
	 * @return void 返回类型
	 * @throws
	 */
	public abstract void updateMessageStat(MessageStatModel messageStatModel);

	/**
	 * 
	 * @Title: getMessageStat
	 * @Description: 根据消息ID查询消息统计信息
	 * @param @param messageId
	 * @param @return 设定文件
	 * @return MessageStatModel 返回类型
	 * @throws
	 */
	public abstract MessageStatModel getMessageStat(Long messageId);

	/**
	 * 
	 * @Title: getMessageStats
	 * @Description: 批量查询消息统计信息
	 * @param @param messageIds
	 * @param @return 设定文件
	 * @return List<MessageStatModel> 返回类型
	 * @throws
	 */
	public abstract List<MessageStatModel> getMessageStats(Long[] messageIds);

}
