package com.dada.business.message.api.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

/**
 * 
 * Title: RegularExpressionTest Description: 正则表达式测试
 * 
 * @author ssc
 * @date 2016年4月22日 下午4:13:57
 */
public class RegularExpressionTest {

	private static final String REGEX_DESTINATION = "^type:(user|mobile):[a-zA-Z_0-9*]+$";
	private static Pattern PATTERN_DESTINATION = Pattern
			.compile(REGEX_DESTINATION);

	@Test
	public void test() {
		String destination = "type:mobile:*";

		// find方法是部分匹配
		if (!PATTERN_DESTINATION.matcher(destination).find())
			throw new IllegalArgumentException("destination find is invalid.");

		// matches方法是完全匹配
		if (!PATTERN_DESTINATION.matcher(destination).matches())
			throw new IllegalArgumentException(
					"destination matches is invalid.");

		// 获得匹配值
		String temp = "<meta-data android:name=\"appid\" android:value=\"joy\"></meta-data>";
		Pattern pattern = Pattern.compile("android:(name|value)=\"(.+?)\"");
		Matcher matcher = pattern.matcher(temp);
		while (matcher.find()) {
			System.out.println(matcher.group(2));
		}
	}

}
