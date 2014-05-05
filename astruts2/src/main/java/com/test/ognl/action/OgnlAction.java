package com.test.ognl.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;
import com.test.model.Student;

public class OgnlAction extends ActionSupport {
	private String message;
	private String[] array;
	private Student student;
	private List<Student> list;
	private Map<String, Student> map;
	private Map<String, List<Student>> map1;
	
	@Override
	public String execute() throws Exception {
		student = new Student();
		student.setName("zenghua");
		Student s1 = new Student();
		s1.setName("zhangsan");
		Student s2 = new Student();
		s2.setName("lisi");
		
		list = new ArrayList<Student>();
		list.add(student);
		list.add(s1);
		list.add(s2);
		
		map = new HashMap<String, Student>();
		map.put("s", student);
		map.put("s1", s1);
		map.put("s2", s2);
		return SUCCESS;
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

	public List<Student> getList() {
		return list;
	}

	public void setList(List<Student> list) {
		this.list = list;
	}

	public Map<String, Student> getMap() {
		return map;
	}

	public void setMap(Map<String, Student> map) {
		this.map = map;
	}

	public String[] getArray() {
		return array;
	}

	public void setArray(String[] array) {
		this.array = array;
	}

	public Map<String, List<Student>> getMap1() {
		return map1;
	}

	public void setMap1(Map<String, List<Student>> map1) {
		this.map1 = map1;
	}
}
