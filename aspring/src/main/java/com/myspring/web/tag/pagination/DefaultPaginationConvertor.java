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
	
	private static final int SHOW_NUM = 4;

	@Override
	public String convert(Page page)
	{
		return this.createSimplePage(page);
	}
	
	public String createSimplePage(Page page) {
		StringBuffer htmlPage = new StringBuffer();
		String url = page.getUrl();
		int currentPage = page.getCurrentPage();
		int pageCount = page.getPageCount();
		String queryString = page.getQueryString();
		
//		if (StringUtils.isBlank(queryString)) {
//			queryString = "";
//		} else {
//			url += "?" + queryString + "&";
//		}
		
		url += "?";
		if (StringUtils.isNotBlank(queryString)) {
			url += queryString + "&";
		}
		
		url += "pageSize=" + page.getPageSize() + "&currentPage=";
		
		htmlPage.append("<ul class=\"pagination\">");//总条数
		if (page.isPrevious()) {
			htmlPage.append("<li><a href=\"" + url + (currentPage - 1) + "\">上一页</a></li>");
		} else {
			htmlPage.append("<li><a href=\"" + VOID_HREF + "\">上一页</a></li>");
		}
		
		//显示页码标签
//		int[] nums = page.getSkipNumbers();
//		for (int i = 0; i < nums.length; i++) {
//			htmlPage.append("<li><a href=\"" + url + nums[i] + "\">" + nums[i] +"</a></li>");
//		}
		
		/**
		 * 页码
		 */
		int startNum = (currentPage-SHOW_NUM) > 1 ? (currentPage-SHOW_NUM) : 1;
		int endNum = (currentPage + SHOW_NUM) > pageCount ? pageCount
				: (currentPage + SHOW_NUM);
		for (int num = startNum; num <= endNum; num++) {
			//如果有多个页码第一页要显示超链接 TODO
			if (num == currentPage) {
				htmlPage.append("<li><a>" + num + "</a></li>");
			} else {
				htmlPage.append("<li><a href=\"" + url + num + "\">" + num + "</a></li>");
			}
		}

		/**
		 * 省略
		 */
		if (endNum < pageCount) {
			htmlPage.append("<li><a>...</a></li>");
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
