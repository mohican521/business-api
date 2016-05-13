package com.dada.business.user.api.model;

import java.util.Date;

import com.dada.business.common.api.util.ValidateStaticParam;

/**
 * 
 * Title: UserOAuthModel Description: 用户验证模型
 * 
 * @author ssc
 * @date 2016年5月13日 下午3:44:47
 */
public class UserOAuthModel extends BaseModel {

	private static final long serialVersionUID = 1L;

	public static final Integer STATUS_UNUSE   = 1;					// 未使用
	public static final Integer STATUS_USED    = 2; 				// 已使用
	public static final Integer[] STATUS = { STATUS_UNUSE, STATUS_USED };

	private Long userId;											// 用户ID
	private String mobile; 											// 用户手机号
	private String password; 										// 用户密码
	private String code; 											// 验证码
	private Date deadline; 											// 验证码过期时间
	private Integer status; 										// 验证码状态[未使用, 已使用]
	
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

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

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		if (!ValidateStaticParam.contains(STATUS, status))
			throw new IllegalArgumentException("status is invalid.");
		this.status = status;
	}

}
