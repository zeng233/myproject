package com.myspring.web.tag.pagination;


public class Page
{
	private static final int DEFAULT_PAGE_SIZE = 5;
	private static final int DEFAULT_CURRENT_PAGE = 1;
	
	private String url;
	private String queryString;//查询参数
	private int count;//总条数
	private int pageCount;//总页数
	private int currentPage;//当前页
	private int pageSize;//每页显示条数
//	private int nextPage;//下一页
	/**
	 * 跳转页码，如：1 2 3 4 5 6 7 8 9 10
	 */
//	private int skipSize;
//	private int currentSkip;//当前跳转页码
	
	//记录条数的逻辑位置
	private int begin;
	private int end;
	
	//分页查询参数
//	private String pageSizeParam;
//	private String currentPageParam;
	
	public Page() {
		if (pageSize <= 0) {
			this.pageSize = DEFAULT_PAGE_SIZE;
		}
		if (currentPage <= 0) {
			this.currentPage = DEFAULT_CURRENT_PAGE;
		}
		
		this.currentPage = DEFAULT_CURRENT_PAGE;
		this.pageSize = DEFAULT_PAGE_SIZE;
	}

	/**
	 * 设置总条数
	 * @param count
	 */
	public void setCount(int count)
	{
		if (count < 0) {
			return;
		}
		this.count = count;
		this.pageCount = count / pageSize + (count % pageSize == 0 ? 0 : 1);
		this.begin = (currentPage - 1) * pageSize;
		this.end = currentPage * pageSize;
//		this.currentSkip = this.currentPage + 1;
	}
	
//	public int[] getSkipNumbers() {
//		int count = skipSize;
//		//查询总页数小于10，就显示小于10的页码
//		if (currentSkip + skipSize > pageCount) {
//			count = pageCount - currentSkip + 1;
//		}
//		int[] nums = new int[count];
//		for (int i = 0; i < count; i++) {
//			nums[i] = currentSkip + i;
//		}
//		return nums;
//	}
	
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

	public boolean isFirst() {
		return this.currentPage > 1;
	}
	
	public boolean isLast() {
		return this.currentPage < this.pageCount;
	}
	
	public boolean isNext() {
		return this.currentPage < this.pageCount;
	}
	
	public boolean isPrevious() {
		return this.currentPage > 1;
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

	public int getBegin()
	{
		return begin;
	}

	public void setBegin(int begin)
	{
		this.begin = begin;
	}

	public int getEnd()
	{
		return end;
	}

	public void setEnd(int end)
	{
		this.end = end;
	}
}
