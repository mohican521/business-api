package com.dada.business.user.api.common;

/**
 * 
 * Title: UserVersion Description: 用户模块版本管理
 * 
 * @author ssc
 * @date 2016年5月12日 下午5:03:12
 */
public class UserVersion {

	// TODO 每次发布用户模块版本都要修改此处版本号
	public static final int CURRENT_VERSION = Version.V0_0_1_SNAPSHOT.ordinal();

	public static String getVersionDesc(int value) {
		try {
			Version version = Version.values()[value];
			return version.name();
		} catch (Exception e) {
		}
		return "HigherVersion";
	}

	public static Version value2Version(int value) {
		return Version.values()[value];
	}

	public static enum Version {
		V0_0_1_SNAPSHOT,
	}

}
