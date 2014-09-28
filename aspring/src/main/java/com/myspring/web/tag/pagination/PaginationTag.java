package com.myspring.web.tag.pagination;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyTagSupport;

public class PaginationTag extends BodyTagSupport
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1944440623550259204L;
	
	private Page page;

	@Override
	public int doStartTag() throws JspException
	{
		PaginationConvertor convertor = new DefaultPaginationConvertor();
		JspWriter writer = this.pageContext.getOut();
		try {
			writer.print(convertor.convert(page));
		} catch (IOException e) {
			return EVAL_BODY_INCLUDE;
		}

		return EVAL_BODY_INCLUDE;
	}

	@Override
	public int doEndTag() throws JspException
	{
		this.release();
		return super.doEndTag();
	}

	public Page getPage()
	{
		return page;
	}

	public void setPage(Page page)
	{
		this.page = page;
	}
}
