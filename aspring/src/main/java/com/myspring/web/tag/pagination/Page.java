package com.myspring.web.tag.pagination;

public class Page
{
	private static final int DEFAULT_PAGE_SIZE = 15;
	private static final int DEFAULT_CURRENT_PAGE = 1;
	private static final int DEFAULT_SKIP_SIZE = 10;
	private static final int DEFAULT_CURRENT_SKIP = 1;
	
	private String url;
	private String queryString;//查询参数
	private int count;
	private int pageCount;//总页数
	private int pageSize;//总条数
	private int currentPage;
	private int nextPage;
	
	/**
	 * 跳转页码，如：1 2 3 4 5 6 7 8 9 10
	 */
	private int skipSize;
	private int currentSkip;//当前跳转页码
	//分页查询参数
	private String pageSizeParam;
	private String currentPageParam;
	
	public Page() {
		if (pageSize <= 0) {
			this.pageSize = DEFAULT_PAGE_SIZE;
		}
		if (currentPage <= 0) {
			this.currentPage = DEFAULT_CURRENT_PAGE;
		}
		if (skipSize <= 0) {
			this.skipSize = DEFAULT_SKIP_SIZE;
		}
		this.pageSize = DEFAULT_PAGE_SIZE;
		this.currentPage = DEFAULT_CURRENT_PAGE;
		this.skipSize = DEFAULT_SKIP_SIZE;
	}

	public String getUrl()
	{
		return url;
	}

	public void setUrl(String url)
	{
		this.url = url;
	}

	public String getQueryString()
	{
		return queryString;
	}

	public void setQueryString(String queryString)
	{
		this.queryString = queryString;
	}

	public int getCount()
	{
		return count;
	}

	/**
	 * 设置
	 * @param count
	 */
	public void setCount(int count)
	{
		if (count < 0) {
			return;
		}
		this.count = count;
		this.pageCount = count / pageSize + (count % pageSize == 0 ? 0 : 1);
	}
	
	public boolean isFirst() {
		return this.currentPage > 1;
	}
	
	public boolean isNext() {
		return this.currentPage > 1;
	}
	
	public boolean isPrevious() {
		return this.currentPage < this.pageCount;
	}
	
	public boolean isLast() {
		return this.currentPage < this.pageCount;
	}

	public int getPageCount()
	{
		return pageCount;
	}

	public void setPageCount(int pageCount)
	{
		this.pageCount = pageCount;
	}

	public int getPageSize()
	{
		return pageSize;
	}

	public void setPageSize(int pageSize)
	{
		this.pageSize = pageSize;
	}

	public int getCurrentPage()
	{
		return currentPage;
	}

	public void setCurrentPage(int currentPage)
	{
		this.currentPage = currentPage;
	}

	public int getNextPage()
	{
		return nextPage;
	}

	public void setNextPage(int nextPage)
	{
		this.nextPage = nextPage;
	}

	public String getPageSizeParam()
	{
		return pageSizeParam;
	}

	public void setPageSizeParam(String pageSizeParam)
	{
		this.pageSizeParam = pageSizeParam;
	}

	public String getCurrentPageParam()
	{
		return currentPageParam;
	}

	public void setCurrentPageParam(String currentPageParam)
	{
		this.currentPageParam = currentPageParam;
	}
}
