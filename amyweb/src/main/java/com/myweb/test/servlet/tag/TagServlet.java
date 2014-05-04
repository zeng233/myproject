package com.myweb.test.servlet.tag;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myweb.entity.User;

/**
 * @description: TODO
 *
 * @createtime: 2014-3-18 上午11:32:51
 *
 * @author zenghua
 *
 * @version 1.0
 */
@WebServlet(name="TagServlet", urlPatterns="/test/tagServlet")
public class TagServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3906810494208154662L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		List<User> users = new ArrayList<User>();
		for (int i =0; i<10; i++) {
			User user = new User();
			user.setId(i);
			user.setUserName("a" + i);
			user.setCreateTime(new Date());
			users.add(user);
		}
		req.setAttribute("users", users);
		
		RequestDispatcher rd = req.getRequestDispatcher("/pages/jstl/foreach.jsp");
		rd.forward(req, resp);
	}
}
