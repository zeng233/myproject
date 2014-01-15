package com.myspring.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.stereotype.Repository;

import com.myspring.model.Student;

/**
 * @description: TODO
 * 
 * @createTime: 2014年1月15日 下午11:00:59
 * 
 * @author zenghua
 * 
 * @version 1.0
 */
@Repository
public class JdbcDao {
	private Log log = LogFactory.getLog(JdbcDao.class);
	private JdbcTemplate jdbcTemplate;
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Autowired
	public void setDataSource(DataSource jdbcDataSource) {
		this.jdbcTemplate = new JdbcTemplate(jdbcDataSource);
		this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(jdbcDataSource);
	}

	
	public void updateStudentById() {
		jdbcTemplate.update("update student set name='ddd' where id=1");
	}

	public void batchInsertStudent() {
		List<Student> list = new ArrayList<Student>();
		for (int i = 1; i < 1000; i++) {
			Student s = new Student();
			s.setName("a" + i);
			list.add(s);
		}
		
		long beginTime = System.currentTimeMillis(); 
		SqlParameterSource[] batch = SqlParameterSourceUtils.createBatch(list.toArray());
		int[] updateCounts = namedParameterJdbcTemplate.batchUpdate("insert into student(id, name) values(null, :name)", batch);
		log.info("批量插入共执行了：" + updateCounts.length + "行");
		System.out.println("执行行数：" + updateCounts.length);
		long endTime = System.currentTimeMillis();
		log.info("执行了：" + (endTime-beginTime) + "毫秒");
		System.out.println("批量插入共执行：" + (endTime-beginTime) + "毫秒");
	}
	
	public void perInsertStudent() {
		int count = 0;
		List<Student> list = new ArrayList<Student>();
		for (int i = 1; i < 1000; i++) {
			Student s = new Student();
			s.setName("b" + i);
			list.add(s);
		}
		
		long beginTime = System.currentTimeMillis(); 
		for (Student t : list) {
			count++;
			jdbcTemplate.update("insert into student(id,name) values(null,'" + t.getName() + "')");
		}
		long endTime = System.currentTimeMillis();
		System.out.println("perInsertStudent插入行数：" + count);
		System.out.println("单个插入共执行：" + (endTime-beginTime) + "毫秒");
	} 
}
