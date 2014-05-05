package com.test.el.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.test.model.Student;

/**
 * Servlet implementation class ElServlet
 */
public class ElServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String username = request.getParameter("username");
//		request.setAttribute("username", username);
		
//		String[] usernames = request.getParameterValues("sex");
//		request.setAttribute("usernames", usernames);
		HttpSession session = request.getSession();
		
		Student student = new Student();
		student.setNumber(0);
		student.setName("test");
		session.setAttribute("student", student);
		
		//数组类型
		String[] words = {"参加培训", "人人有责"};
		request.setAttribute("words", words);
		
		//-------------------集合类型---------------------------------------------
		//Map类型
		Map<Long, String> map = new HashMap<Long, String>();
		map.put(0L, "hello");
		map.put(1L, "world");
		session.setAttribute("map", map);
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(0, "int0");
		map1.put(1, "int1");
		request.setAttribute("map1", map1);
		Map<String, String> roles = new HashMap<String, String>();
		roles.put("admin", "管理员");
		roles.put("coder", "程序猿");
		roles.put("user", "普通用户");
		request.setAttribute("roles", roles);
		for(Map.Entry<String, String> role : roles.entrySet()) {
			System.out.println(role.getKey() + "：" + role.getValue());
		}
		
		//List类型
		List<Student> students = new ArrayList<Student>();
		Student student1 = new Student();
		student1.setName("学生1");
		Student student2 = new Student();
		student2.setName("学生2");
		students.add(student);
		students.add(student1);
		students.add(student2);
		request.setAttribute("students", students);
		
//		response.sendRedirect("/success.jsp");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/el.jsp");
		dispatcher.forward(request, response);
	}
	
	enum Color {
		red,yellow,blue
	}
}
