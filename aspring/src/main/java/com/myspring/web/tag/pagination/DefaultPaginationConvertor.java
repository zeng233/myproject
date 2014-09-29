package com.myspring.web.tag.pagination;

import org.apache.commons.lang3.StringUtils;

/**
 * 从page中取值。设置html标签，分页样式基于bootstrap3
 * 
 * 如果要形成其他的分页HTML，直接实现PaginationConvertor即可
 */
public class DefaultPaginationConvertor implements PaginationConvertor
{
	private static final String VOID_HREF = "javascript:void(0)";

	@Override
	public String convert(Page page)
	{
		return this.createSimplePage(page);
	}
	
	public String createSimplePage(Page page) {
		StringBuffer htmlPage = new StringBuffer();
		String url = page.getUrl();
		int currentPage = page.getCurrentPage();
		String queryString = page.getQueryString();
		
		if (StringUtils.isBlank(queryString)) {
			queryString = "";
		} else {
			url += "?" + queryString + "&";
		}
		url += "pageSize=" + page.getPageSize() + "&currentPage=";
		
		htmlPage.append("<ul class=\"pagination\">");//总条数
		if (page.isPrevious()) {
			htmlPage.append("<li><a href=\"" + url + (currentPage - 1) + "\">上一页</a></li>");
		} else {
			htmlPage.append("<li><a href=\"" + VOID_HREF + "\">上一页</a></li>");
		}
		
		//显示页码标签
		int[] nums = page.getSkipNumbers();
		for (int i = 0; i < nums.length; i++) {
			htmlPage.append("<li><a href=\"" + url + nums[i] + "\">" + nums[i] +"</a></li>");
		}
		
		if (page.isNext()) {
			htmlPage.append("<li><a href=\"" + url + (currentPage + 1) + "\">下一页</a></li>");
		} else {
			htmlPage.append("<li><a href=\"" + VOID_HREF + "\">下一页</a></li>");
		}
		
		htmlPage.append("</ul>");
		return htmlPage.toString();
	}
}
