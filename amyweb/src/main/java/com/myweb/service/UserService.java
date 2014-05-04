package com.myweb.service;

import com.myweb.dao.UserDAO;
import com.myweb.entity.User;

/**
 * description: TODO
 *
 * createtime: 2013-1-23 上午10:23:31
 *
 * @author zenghua
 * @version 1.0
 */

public class UserService {
	private UserDAO userDAO = new UserDAO();
	public void save(User user) {
		userDAO.save(user);
	}
	
	public boolean checkUser(String userName, String password) {
		String realPassword = userDAO.getPassword(userName);
		if (password.equals(realPassword)) {
			return true;
		}
		return false;
	}
}
