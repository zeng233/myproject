package com.myspring.web.tag.pagination;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
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
		//参数集合，string[]表示参数相同的参数值（如传checkbox）
		Map<String, String[]> paramMap = request.getParameterMap();
		String encode = request.getCharacterEncoding();
		if (StringUtils.isBlank(encode)) {
			encode = "UTF-8";
		}
		
		//拼接查询参数
		for(Map.Entry<String, String[]> entry : paramMap.entrySet()) {
			if (entry.getValue() != null) {
				if ("currentPage".equals(entry.getKey())) {
					page.setCurrentPage(Integer.parseInt(entry.getValue()[0]));
				} else if ("pageSize".equals(entry.getKey())) {
					page.setPageSize(Integer.parseInt(entry.getValue()[0]));
				} else {
					String[] paramValues = entry.getValue();
					for (int i = 0; i < paramValues.length; i++) {
						String paramValue = URLEncoder.encode(paramValues[i], encode);
						queryString.append(entry.getKey()).append("=").append(paramValue).append("&");
					}
				}
 			}
		}
		
		if (queryString.length() > 1) {
			queryString.deleteCharAt(queryString.length() - 1);
			page.setQueryString(queryString.toString());
		}
		return page;
	}
}
