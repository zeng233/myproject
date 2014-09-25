package com.myspring.web.tag.pagination;

public class DefaultPaginationConvertor implements PaginationConvertor
{

	@Override
	public String convert(Page page)
	{
		String url = page.getUrl();
		String queryString = page.getQueryString();
		return null;
	}

}
