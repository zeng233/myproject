package com.myspring.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.myspring.dao.user.UserDao;
import com.myspring.model.Room;
import com.myspring.model.User;

/**
 * @description: TODO
 * 
 * @createTime: 2014年5月11日 下午11:30:13
 * 
 * @author zenghua
 * 
 * @version 1.0
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	/**
	 * http://www.ibm.com/developerworks/cn/java/j-ts1.html
	 * 只读标志只是对数据库的一个提示，并且一条基于 ORM 框架的指令将对象缓存的 flush 模式设置为 NEVER
	 */
	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	@Override
	public void save(User user) {
		userDao.save(user);
	}

	@Override
	public List<Room> query() {
		return userDao.query();
	}

	/**
	 * 如果配置好jdbc事务管理，readOnly=true不能写数据，抛出异常连接是readOnly，不能写数据
	 */
	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	@Override
	public void insertUserByJdbc() {
		userDao.insertUserByJdbc();
		throw new RuntimeException();// 抛出一个RuntimeException,配置好jdbc事务会回滚，如果是checkedEXception不会回滚？？TODO
	}

	@Transactional(readOnly = false, propagation = Propagation.NEVER)
	@Override
	public List<User> getUser() {
		List<User> list = userDao.getUser();
		return list;
	}

}
