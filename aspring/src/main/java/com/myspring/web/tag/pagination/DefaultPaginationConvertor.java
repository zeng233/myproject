package com.myspring.web.tag.pagination;

/**
 * 从page中取值。设置html标签
 */
public class DefaultPaginationConvertor implements PaginationConvertor
{

	@Override
	public String convert(Page page)
	{
		StringBuffer sb = new StringBuffer();
		String url = page.getUrl();
		String queryString = page.getQueryString();
		return sb.append(url).append(queryString).toString();
	}

}
