package com.test.el.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.test.model.Student;

/** 
 * <p>Title: ElAction.java</p>
 * <p>Description: 测试EL表达式</p>
 * <p>Copyright：Copyright(c)2011</p>
 * <p>Company: 成都四方信息技术有限公司</p>
 * <p>CreateTime：2011-12-21 上午11:27:56</p>
 * @author zenghua
 * @version 1.0
 */

public class ElAction extends ActionSupport {
	private static final long serialVersionUID = -4312275974255015258L;
	private String message;
	private Student student;
	private List<Student> students;
	
	@Override
	public String execute() throws Exception {
		student = new Student();
		student.setNumber(0);
		student.setName("test");
		HttpServletRequest request = (HttpServletRequest)ServletActionContext.getRequest();
		request.setAttribute("hello", "hello");
		HttpSession session = request.getSession();
		session.setAttribute("s", student);
		
		students = new ArrayList<Student>();
		for (int i = 0; i < 10; i++) {
			Student s1 = new Student();
			s1.setNumber(i);
			s1.setName("学僧-----" + i);
		}
		return SUCCESS;
	}
	
	public static String foo() {
		return "foo";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
}
