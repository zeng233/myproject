package com.myspring.dataaccess.jdbc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.myspring.commons.BaseIoc;
import com.myspring.dao.JdbcDao;
import com.myspring.dao.MyTemplateDao;

/**
 * @description: TODO
 *
 * @createTime: 2013年12月17日 下午10:18:18
 *
 * @author zenghua
 *
 * @version 1.0
 */
public class TestJdbc extends BaseIoc {
	private static Log log = LogFactory.getLog(TestJdbc.class);
	
	JdbcDao jdbcDao = context.getBean("jdbcDao", JdbcDao.class);
	
	private MyTemplateDao mydao = context.getBean("myTemplateDao", MyTemplateDao.class);
	
	public static void main(String[] args) {
		TestJdbc t = new TestJdbc();
		log.info("test");
//		t.testBatchUpdate();
//		t.testBatchInsert();
//		t.testPerInsert();
		
		t.testMytemplateDao();
	}
	
	public void testMytemplateDao() {
		mydao.getAll();
	}
	
	public void testBatchUpdate() {
		jdbcDao.updateStudentById();
	}
	
	public void testBatchInsert() {
		jdbcDao.batchInsertStudent();
	}
	
	public void testPerInsert() {
		jdbcDao.perInsertStudent();
	}
}
