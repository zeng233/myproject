package com.myweb.servlet;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.myweb.entity.User;
import com.myweb.service.UserService;

/**
 * description: TODO
 *
 * createtime: 2013-2-20 下午04:22:47
 *
 * @author zenghua
 * @version 1.0
 */

@WebServlet //参考规范
public class UserServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2460304518297666233L;
	
	private UserService userService = new UserService();
	
	@Override
	public void init() throws ServletException {
//		System.out.println("UserServlet start 。。。");
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		String method = request.getParameter("method");
		// 登录
		if (method.equalsIgnoreCase("checkUser")) {
			if (checkUser(userName, password)) {
				HttpSession session = request.getSession();
				String imageUrl = null;
				String path = request.getServletContext().getRealPath("/") + "static\\images\\regist";
				File file = new File(path);
				if (file.exists()) {
					File[] files = file.listFiles();
					for (File f : files) {
						if (f.getName().contains(userName)) {
							session.setAttribute("imageUrl", imageUrl);
						}
					}
				}
 				session.setAttribute("imageUrl", imageUrl);
				RequestDispatcher rd = request.getServletContext().getRequestDispatcher("/pages/user/success.jsp");
				rd.forward(request, response);
			} else {
				//如果不用getServletContext会报空指针异常 TODO 待确认，直接重定向用相对路径，ServletRequest得到的RequestDispatcher可以用相对路径
				//而ServletContext得到的RequestDispatcher只能用绝对路径，参考API文档有解释
				RequestDispatcher rd = request.getRequestDispatcher("/user/error.jsp");
				rd.forward(request, response);
			}
		} else if (method.equalsIgnoreCase("update")) {
			
		} else if (method.equalsIgnoreCase("delete")) {
			
		} else if (method.equalsIgnoreCase("add")) { //用户注册
			User user = new User();
			user.setUserName(userName);
			user.setPassword(password);
			user.setCreateTime(new Date());
			
			if (this.add(user)) {
				// jsp跳转路径
				RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/index.jsp");
				dispatcher.forward(request, response);
			}
		} else if (method.equalsIgnoreCase("initRegist")){
			initRegist(request, response);
		} else {
			//未知页面
		}
	}
	
	public boolean checkUser(String userName, String password) {
		if (userService.checkUser(userName, password)) {
			return true;
		}
		return false;
	}
	
	public boolean add(User user) {
		try {
			userService.save(user);
		} catch (Exception e) {
			// TODO: 自定义异常
			return false;
		}
		return true;
	}
	
	public void initRegist(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String uri = "pages/user/regist.jsp";
		response.setCharacterEncoding("utf-8");
		
		//两种跳转方式，重定向
		response.sendRedirect(response.encodeRedirectURL(request.getContextPath() +"/" +uri)); 
//		System.out.println(request.getContextPath() +"/" +uri);
		
		//
//		RequestDispatcher rd=request.getServletContext().getRequestDispatcher(uri);
//		rd.forward(request, response); 
	}
	
	@Override
	public void destroy() {
		System.out.println("UserServlet destroyed 。。。");
	}
}
