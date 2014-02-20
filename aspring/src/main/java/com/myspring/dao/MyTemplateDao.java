package com.myspring.dao;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.myspring.model.Student;

/**
 * @description: TODO
 * 
 * @createTime: 2014年2月20日 下午10:06:51
 * 
 * @author zenghua
 * 
 * @version 1.0
 */
@Repository
public class MyTemplateDao {
	private JdbcTemplate mytemplate;

	public List<Student> getAll() {
		List<Student> list = mytemplate.query(
				"select * from student s where s.id=?", new Object[] { 2000 },
				new BeanPropertyRowMapper<Student>(Student.class));
		for (Student s : list) {
			System.out.println("id:" +s.getId() + ", name:" + s.getName());
		}
		return list;
	}

	//通过配置文件注入，类中的field属性mytemplate要与容器中的id一样,而不是set方法中的参数一样
	public void setMytemplate(JdbcTemplate template) {
		this.mytemplate = template;
	}
}
