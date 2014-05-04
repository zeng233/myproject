package com.myweb.servlet.freemarker;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myweb.entity.User;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

/**
 * @description: TODO
 *
 * @createtime: 2013-8-14 下午8:42:43
 *
 * @author zenghua
 *
 * @version 1.0
 */

@WebServlet(name="freeMarkerServlet", urlPatterns="/freeMarkerServlet")
public class FreeMarkerServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1742149183182207151L;
	
	private Configuration cfg;
	
	@Override
	public void init() throws ServletException {
		cfg = new Configuration();
		cfg.setServletContextForTemplateLoading(getServletContext(), "static/ftl");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		User user1 = new User();
		user1.setId(1);
		user1.setUserName("zhangsan");
		User user2 = new User();
		user2.setId(2);
		user2.setUserName("lisi");
		
		List<User> users = new ArrayList<User>();
		users.add(user1);
		users.add(user2);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("message", "hello world freemarker!");
		map.put("users", users);
//		Template t = cfg.getTemplate("helloworld.ftl");
		Template t = cfg.getTemplate("test.html");
		resp.setContentType("text/html; charset=" + t.getEncoding());
		PrintWriter out = resp.getWriter();
		try {
			t.process(map, out);
		} catch (TemplateException e) {
			e.printStackTrace();
		}
	}
}
