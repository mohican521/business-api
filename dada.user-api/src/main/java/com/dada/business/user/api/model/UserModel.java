package com.dada.business.user.api.model;

import com.dada.business.common.api.util.ValidateStaticParam;

/**
 * 
 * Title: UserModel Description: 用户模型
 * 
 * @author ssc
 * @date 2016年5月12日 下午7:32:57
 */
public class UserModel extends BaseModel {

	private static final long serialVersionUID = 1L;

	public static final Integer SEX_MAN 	   = 1; 				// 男
	public static final Integer SEX_WOMAN 	   = 2; 				// 女
	public static final Integer[] SEX = { SEX_MAN, SEX_WOMAN };

	public static final Integer STATUS_ENABLE  = 1; 				// 可用
	public static final Integer STATUS_DISABLE = 2; 				// 不可用
	public static final Integer STATUS_DELETE  = 3; 				// 删除
	public static final Integer[] STATUS = { STATUS_ENABLE, STATUS_DISABLE, STATUS_DELETE };

	private String username; 										// 用户名(手机号或第三方账号)
	private String mobile; 											// 用户手机号
	private String nick; 											// 用户昵称
	private String email; 											// 用户邮箱
	private String channel; 										// 用户来源
	private Integer sex; 											// 用户性别
	private Integer status; 										// 用户状态
	private String avatar; 											// 用户头像

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		if (!ValidateStaticParam.contains(SEX, sex))
			throw new IllegalArgumentException("sex is invalid.");
		this.sex = sex;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		if (!ValidateStaticParam.contains(STATUS, status))
			throw new IllegalArgumentException("status is invalid.");
		this.status = status;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

}
