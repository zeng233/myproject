package com.myweb.dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.myweb.common.base.BaseDAO;
import com.myweb.common.util.DbUtil;
import com.myweb.entity.User;

/**
 * description: TODO
 *
 * createtime: 2013-1-23 上午10:23:16
 *
 * @author zenghua
 * @version 1.0
 */

public class UserDAO extends BaseDAO {
	public void save (User user) {
		String sql = "insert into user values(?, ?, ?, ?, ?)";
		Object[] objs = new Object[] {null, user.getUserName(), user.getPassword(), user.getCreateTime(), user.getImageUrl()};
		this.commonMethod(sql, objs);
	}
	
	public String getPassword(String userName) {
		//获取链接设置为2，不能进行连接
		Connection conn = DbUtil.getConn("1");
		ResultSet rs = null;
		String sql = "select password from user where userName=?";
		String password = null;
		try {
			PreparedStatement pstmt =  conn.prepareStatement(sql);
			pstmt.setString(1, userName);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				password = rs.getString("password");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return password;
	}
	
	/**
	 * @param id
	 * @return
	 */
	public User findUserById(Serializable id) {
		User user = null;
		String sql = "select * from user where id=?";
		Connection conn = DbUtil.getConn("1");
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setObject(1, id);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				user = new User();
				user.setId(rs.getInt("id"));
				user.setUserName(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				user.setCreateTime(rs.getDate("createTime"));
				user.setImageUrl(rs.getString("imageUrl"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return user;
	}
}
