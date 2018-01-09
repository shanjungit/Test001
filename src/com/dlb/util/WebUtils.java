package com.dlb.util;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

public class WebUtils {
	/**
	 * @author shanjun
	 * ��Request�����е����������װ��bean��
	 */
	
	public static<T> T request2Bean(HttpServletRequest request,Class<T> clazz) {
		try {
			T bean = clazz.newInstance();
			Enumeration<String> e = request.getParameterNames();
			while(e.hasMoreElements()) {
				String name = String.valueOf(e.nextElement());
				String value = request.getParameter(name);
			}
			return bean;
		}catch(Exception e) {
			
		}
		return null;
	}
}
