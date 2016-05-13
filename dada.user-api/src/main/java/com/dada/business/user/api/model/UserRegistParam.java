package com.dada.business.user.api.model;

import java.io.Serializable;

/**
 * 
 * Title: UserRegistParam Description: 注册用户模型
 * 
 * @author ssc
 * @date 2016年5月13日 下午4:01:28
 */
public class UserRegistParam implements Serializable {

	private static final long serialVersionUID = 1L;

	private String mobile; // 用户手机号
	private String password; // 用户登录密码
	private String code; // 用户验证码
	private String appVersion; // app版本号
	private String source; // 用户来源

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

}
