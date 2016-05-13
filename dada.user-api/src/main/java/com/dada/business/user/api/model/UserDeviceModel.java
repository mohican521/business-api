package com.dada.business.user.api.model;

import com.dada.business.common.api.util.ValidateStaticParam;

/**
 * 
 * Title: UserDeviceModel Description: 用户设备模型
 * 
 * @author ssc
 * @date 2016年5月13日 下午4:39:25
 */
public class UserDeviceModel extends BaseModel {

	private static final long serialVersionUID = 1L;

	public static final Integer TYPE_ANDROID   = 1; 				// 安卓
	public static final Integer TYPE_IOS 	   = 2; 				// 苹果
	public static final Integer TYPE_OTHER 	   = 3; 				// 其他
	public static final Integer[] TYPE = { TYPE_ANDROID, TYPE_IOS, TYPE_OTHER };

	private Long userId; 											// 用户ID
	private Integer sysType; 										// 系统类型
	private String sysVersion; 										// 系统版本
	private String model; 											// 设备型号
	private String uuid; 											// 设备唯一号

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Integer getSysType() {
		return sysType;
	}

	public void setSysType(Integer sysType) {
		if (!ValidateStaticParam.contains(TYPE, sysType))
			throw new IllegalArgumentException("sysType is invalid.");
		this.sysType = sysType;
	}

	public String getSysVersion() {
		return sysVersion;
	}

	public void setSysVersion(String sysVersion) {
		this.sysVersion = sysVersion;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

}
