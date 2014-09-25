package com.myspring.web.tag.pagination;

/**
 * 将page对象转换为html
 */
public interface PaginationConvertor
{
	String convert(Page page);
}
