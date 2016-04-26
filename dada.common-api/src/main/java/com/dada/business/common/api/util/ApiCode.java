package com.dada.business.common.api.util;

/**
 * 
 * Title: ApiCode Description: 公共基础错误码
 * 
 * @author ssc
 * @date 2016年4月19日 下午4:14:59
 */
public interface ApiCode {

	String getApiCode();

	String getApiMessage(Object... params) throws ApiCodeException;

	public static class ApiCodeException extends RuntimeException {

		private static final long serialVersionUID = 1L;

		public ApiCodeException(String message) {
			super(message);
		}

	}

}
