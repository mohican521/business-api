package com.dada.business.user.api.service;

import com.dada.business.user.api.model.UserOAuthModel;

/**
 * 
 * Title: UserOAuthService Description: 用户验证模型服务接口
 * 
 * @author ssc
 * @date 2016年5月13日 下午3:53:57
 */
public interface UserOAuthService {

	public abstract UserOAuthModel getUserOAuth(Long userId);

}
