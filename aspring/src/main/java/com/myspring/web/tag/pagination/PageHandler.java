package com.myspring.web.tag.pagination;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;

/**
 * 解析参数时，给page对象赋值
 */
public class PageHandler
{
	public HttpServletRequest request;
	
	public PageHandler(HttpServletRequest request) {
		this.request = request;
	}
	
	public Page parse() throws UnsupportedEncodingException {
		Page page = new Page();
		StringBuffer queryString = new StringBuffer();
		
		String url = request.getRequestURI();
		page.setUrl(url);
		Enumeration<String> paramNames = request.getParameterNames();
		Map<String, String[]> paramMap = request.getParameterMap();
		String encode = request.getCharacterEncoding();
		if (StringUtils.isBlank(encode)) {
			encode = "UTF-8";
		}
		
		if (paramNames != null) {
			while (paramNames.hasMoreElements()) {
				String paramName = paramNames.nextElement();
				String[] paramValue = paramMap.get(paramName);
				if (paramName.equals("url")) {
					page.setUrl(paramValue[0]);
				} else if (paramName.equals("currentPage")) {
					page.setCurrentPage(Integer.parseInt(paramValue[0]));
				} else {
					for (int i = 0; i < paramValue.length; i++) {
						String key = URLEncoder.encode(paramValue[i], encode);
						queryString.append(paramName).append("=").append(key).append("&");
						System.out.println(queryString);
					}
				}
			}
		}
		return null;
	}
}
