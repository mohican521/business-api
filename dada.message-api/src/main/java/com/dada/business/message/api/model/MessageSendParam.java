package com.dada.business.message.api.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.dada.business.common.api.util.Extras;

/**
 * 
 * Title: MessageSendParam Description: 发送消息实体
 * 
 * @author ssc
 * @date 2016年4月18日 下午2:03:40
 */
public class MessageSendParam implements Serializable {

	private static final long serialVersionUID  = 1L;

	public static final Integer MODE_UNICAST    = 1; 				// 单播
	public static final Integer MODE_MULTICAST  = 2; 				// 组播
	public static final Integer MODE_BROADCAST  = 3; 				// 广播
	public static final Integer[] MODES = { MODE_UNICAST, MODE_MULTICAST,
			MODE_BROADCAST };

	public static final Integer CHANNEL_SMS     = 1; 				// 短信
	public static final Integer CHANNEL_PUSH    = 2; 				// 推送
	public static final Integer CHANNEL_ONSITE  = 3; 				// 站内信
	public static final Integer[] CHANNELS = { CHANNEL_SMS, CHANNEL_PUSH,
			CHANNEL_ONSITE };

	public static final Integer TYPE_SYSTEM     = 1; 				// 系统
	public static final Integer TYPE_MARKETIING = 2; 				// 营销
	public static final Integer[] TYPES = { TYPE_SYSTEM, TYPE_MARKETIING };

	private String templateName; 									// 模板名称
	private Integer mode; 											// 消息模式[单播, 组播, 广播]
	private Integer channel; 										// 消息通道[短信, 推送, 站内]
	private Integer type; 											// 消息类型[系统, 营销]
	private String track; 											// 消息追踪轨迹[唯一]
	private String origin; 											// 消息发送方
	private String destination; 									// 消息接收方
	private String[] targets; 										// 消息详细接收方[营销短信拉新专用]
	private Date validDate; 										// 消息生效时间
	private Date invalidDate; 										// 消息失效时间
	private String application; 									// 对应应用
	private Extras extras; 											// 额外补充信息
	private Map<String, String> attributes; 						// 消息模板对应的属性

	public String getTemplateName() {
		return templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public Integer getMode() {
		return mode;
	}

	public void setMode(Integer mode) {
		if (!contains(MODES, mode))
			throw new IllegalArgumentException("mode is invalid.");
	}

	public Integer getChannel() {
		return channel;
	}

	public void setChannel(Integer channel) {
		if (!contains(CHANNELS, channel))
			throw new IllegalArgumentException("channel is invalid.");
		this.channel = channel;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		if (!contains(TYPES, type))
			throw new IllegalArgumentException("type is invalid.");
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

	public String[] getTargets() {
		return targets;
	}

	public void setTargets(String[] targets) {
		this.targets = targets;
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

	public Map<String, String> getAttributes() {
		if (attributes == null) {
			attributes = new HashMap<>();
		}
		return attributes;
	}

	public void setAttributes(Map<String, String> attributes) {
		this.attributes = attributes;
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
	 * @Title: getAttribute
	 * @Description: 根据key获取value
	 * @param @param key
	 * @param @return 设定文件
	 * @return String 返回类型
	 * @throws
	 */
	public String getAttribute(String key) {
		return getExtras().get(key);
	}

	/**
	 * 
	 * @Title: addAttribute
	 * @Description: 添加key/value键值对
	 * @param @param key
	 * @param @param value 设定文件
	 * @return void 返回类型
	 * @throws
	 */
	public void addAttribute(String key, String value) {
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
