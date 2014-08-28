package com.myspring.web.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

import com.myspring.model.User;

/**
 * @author zenghua233@gmail.com
 *
 * @createtime 2014年7月21日 下午5:23:26
 *
 * @version 1.0
 */

public class UserTag extends TagSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2717575387913379662L;

	private User user;

	@Override
	public int doStartTag() throws JspException {
		try {
			JspWriter out = this.pageContext.getOut();
			if (user == null) {
				out.println("No UserInfo Found...");
				return SKIP_BODY;
			}
			out.println("<table width='500px' border='1' align='center'>");
			out.println("<tr>");
			out.println("<td width='20%'>Username:</td>");
			out.println("<td>" + user.getUserName() + "</td>");
			out.println("</tr>");
			out.println("<tr>");
			out.println("<td>password:</td>");
			out.println("<td>" + user.getPassword() + "</td>");
			out.println("</tr>");
			out.println("<tr>");
			out.println("<td>Email:</td>");
			out.println("<td>" + user.getId() + "</td>");
			out.println("</tr>");
			out.println("</table>");
		} catch (Exception e) {
			throw new JspException(e.getMessage());
		}

		return SKIP_BODY;
	}

	@Override
	public int doEndTag() throws JspException {
		return EVAL_PAGE;
	}

	@Override
	public void release() {
		super.release();
		this.user = null;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
