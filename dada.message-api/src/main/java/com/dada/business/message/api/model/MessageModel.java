package com.dada.business.message.api.model;

import java.io.Serializable;
import java.util.Date;

import com.dada.business.common.api.util.Extras;

/**
 * 
 * Title: MessageModel Description: 消息实体
 * 
 * @author ssc
 * @date 2016年4月15日 下午2:56:55
 */
public class MessageModel extends BaseModel implements Serializable {

	private static final long serialVersionUID    = 1L;

	public static final Integer MODE_UNICAST      = 1; 				// 单播
	public static final Integer MODE_MULTICAST    = 2; 				// 组播
	public static final Integer MODE_BROADCAST    = 3; 				// 广播
	public static final Integer[] MODES = { MODE_UNICAST, MODE_MULTICAST,
			MODE_BROADCAST };

	public static final Integer CHANNEL_SMS       = 1; 				// 短信
	public static final Integer CHANNEL_PUSH      = 2; 				// 推送
	public static final Integer CHANNEL_ONSITE    = 3; 				// 站内信
	public static final Integer[] CHANNELS = { CHANNEL_SMS, CHANNEL_PUSH,
			CHANNEL_ONSITE };

	public static final Integer TYPE_SYSTEM       = 1; 				// 系统
	public static final Integer TYPE_MARKETIING   = 2; 				// 营销
	public static final Integer[] TYPES = { TYPE_SYSTEM, TYPE_MARKETIING };

	public static final Integer STATUS_SUCCESS    = 1; 				// 成功
	public static final Integer STATUS_FAIL       = 2; 				// 失败
	public static final Integer STATUS_PROCESSING = 3; 				// 进行中

	private Long templateId; 										// 模板id
	private String templateName; 									// 模板名称
	private String title; 											// 消息标题
	private String content; 										// 消息内容
	private String url; 											// 消息跳转的url
	private Integer mode; 											// 消息模式[单播, 组播, 广播]
	private Integer channel; 										// 消息通道[短信, 推送, 站内]
	private Integer type; 											// 消息类型[系统, 营销]
	private String track; 											// 消息追踪轨迹[唯一]
	private String origin; 											// 消息发送方
	private String destination; 									// 消息接收方
	private Date validDate; 										// 消息生效时间
	private Date invalidDate; 										// 消息失效时间
	private String application; 									// 对应应用
	private Extras extras; 											// 额外补充信息
	private Integer status; 										// 消息状态
	private String statusMessage; 									// 消息发送描述
	private String providerName; 									// 第三方服务商名称
	private String providerMessageId; 								// 第三方服务对应的消息ID

	public Long getTemplateId() {
		return templateId;
	}

	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
	}

	public String getTemplateName() {
		return templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getMode() {
		return mode;
	}

	public void setMode(Integer mode) {
		if (!contains(MODES, mode)) {
			throw new IllegalArgumentException("mode is invalid.");
		}
		this.mode = mode;
	}

	public Integer getChannel() {
		return channel;
	}

	public void setChannel(Integer channel) {
		if (!contains(CHANNELS, channel)) {
			throw new IllegalArgumentException("channel is invalid.");
		}
		this.channel = channel;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		if (!contains(TYPES, type)) {
			throw new IllegalArgumentException("type is invalid.");
		}
		this.type = type;
	}

	public String getTrack() {
		return track;
	}

	public void setTrack(String track) {
		this.track = track;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getValidDate() {
		return validDate;
	}

	public void setValidDate(Date validDate) {
		this.validDate = validDate;
	}

	public Date getInvalidDate() {
		return invalidDate;
	}

	public void setInvalidDate(Date invalidDate) {
		this.invalidDate = invalidDate;
	}

	public String getApplication() {
		return application;
	}

	public void setApplication(String application) {
		this.application = application;
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

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public String getProviderMessageId() {
		return providerMessageId;
	}

	public void setProviderMessageId(String providerMessageId) {
		this.providerMessageId = providerMessageId;
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

	/**
	 * 
	 * @Title: contains
	 * @Description: set给对象赋值时校验参数是否合法
	 * @param @param array
	 * @param @param obj
	 * @param @return 设定文件
	 * @return boolean 返回类型
	 * @throws
	 */
	private boolean contains(Object[] array, Object obj) {
		for (Object o : array) {
			if (o.equals(obj)) {
				return true;
			}
		}
		return false;
	}

}
