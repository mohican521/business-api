package com.dada.business.message.api.service;

import com.dada.business.common.api.util.PageList;
import com.dada.business.message.api.model.MessageDetailModel;

/**
 * 
 * Title: MessageDetailService Description: 消息详情实体服务接口
 * 
 * @author ssc
 * @date 2016年4月19日 上午11:10:46
 */
public interface MessageDetailService {

	/**
	 * 
	 * @Title: addMessageDetail
	 * @Description: 添加一个消息详情
	 * @param @param messageDetailModel 设定文件
	 * @return void 返回类型
	 * @throws
	 */
	public abstract void addMessageDetail(MessageDetailModel messageDetailModel);

	/**
	 * 
	 * @Title: updateMessageDetail
	 * @Description: 更新消息详情
	 * @param @param messageDetailModel 设定文件
	 * @return void 返回类型
	 * @throws
	 */
	public abstract void updateMessageDetail(
			MessageDetailModel messageDetailModel);

	/**
	 * 
	 * @Title: getMessageDetail
	 * @Description: 根据消息接受者和消息ID查询消息详情
	 * @param @param messageId
	 * @param @param destination
	 * @param @return 设定文件
	 * @return MessageDetailModel 返回类型
	 * @throws
	 */
	public abstract MessageDetailModel getMessageDetail(Long messageId,
			String destination);

	/**
	 * 
	 * @Title: getMessageDetails
	 * @Description: 根据消息ID分页查询消息详情
	 * @param @param messageId
	 * @param @param page
	 * @param @param itemPerPage
	 * @param @return 设定文件
	 * @return PageList<MessageDetailModel> 返回类型
	 * @throws
	 */
	public abstract PageList<MessageDetailModel> getMessageDetails(
			Long messageId, int page, int itemPerPage);

}
