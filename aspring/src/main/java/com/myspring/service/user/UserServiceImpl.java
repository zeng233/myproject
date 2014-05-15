package com.myspring.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
@Service(value="userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public void save(User user) {
		userDao.save(user);
	}

	@Override
	public List<Room> query() {
		return userDao.query();
	}

	
}
