package com.dada.business.user.api.service;

import com.dada.business.user.api.model.UserModel;

/**
 * 
 * Title: UserService Description: 用户模型服务接口
 * 
 * @author ssc
 * @date 2016年5月13日 下午3:52:12
 */
public interface UserService {

	public abstract UserModel getUserByMobile(String mobile);

}
