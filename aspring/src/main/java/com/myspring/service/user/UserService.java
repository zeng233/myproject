package com.myspring.service.user;

import java.util.List;

import com.myspring.model.Room;
import com.myspring.model.User;

/**
 * @description: TODO
 *
 * @createTime: 2014年5月11日 下午11:29:06
 *
 * @author zenghua
 *
 * @version 1.0
 */
public interface UserService {
	void save(User user);
	List<Room> query();
	void insertUserByJdbc();
}
