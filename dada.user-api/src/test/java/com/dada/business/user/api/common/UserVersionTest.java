package com.dada.business.user.api.common;

import org.junit.Test;

/**
 * 
 * Title: UserVersionTest
 * Description: 用户模块版本管理测试
 * @author ssc
 * @date 2016年5月12日 下午5:12:00
 */
public class UserVersionTest {

	@Test
	public void test(){
		
		String version = UserVersion.getVersionDesc(0);
		System.out.println(version);
		
		int versionCode = UserVersion.CURRENT_VERSION;
		System.out.println(versionCode);
		
	}
	
}
