package com.myspring.web.tag.pagination;

/**
 * 将page对象转换为html
 */
public interface PaginationConvertor
{
	/**
	 * 拼写显示分页的html
	 * @param page
	 * @return
	 */
	String convert(Page page);
}
