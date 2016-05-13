package com.dada.business.common.api.util;

/**
 * 
 * Title: ValidateStaticParam Description: 校验静态变量
 * 
 * @author ssc
 * @date 2016年5月13日 下午5:57:06
 */
public class ValidateStaticParam {

	/**
	 * 
	 * @Title: contains @Description: set给对象赋值时校验参数是否合法 @param @param
	 *         array @param @param obj @param @return 设定文件 @return boolean
	 *         返回类型 @throws
	 */
	public static boolean contains(Object[] array, Object obj) {
		for (Object o : array) {
			if (o.equals(obj)) {
				return true;
			}
		}
		return false;
	}

}
