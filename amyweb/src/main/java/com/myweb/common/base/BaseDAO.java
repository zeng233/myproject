package com.myweb.common.base;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.myweb.common.util.DbUtil;

/**
 * description: 操作数据库,分页，单例模式获取连接
 *
 * createtime: 2013-1-23 上午09:51:54
 *
 * @author zenghua
 * @version 1.0
 */

public abstract class BaseDAO {
	//继承抽象类 子类要重写构造函数？？？ TODO
//	private BaseDAO() {}
	
	//防止sql参数注入，参考SQL Injection Attacks and Defense
	
	public void commonMethod(String sql, Object... objs) {
		Connection conn = DbUtil.createConn("1");
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			if (objs != null) {
				for (int i = 0; i < objs.length; i++) {
//					if (objs[i] == null) {
//						continue;
//					}
					pstmt.setObject(i+1, objs[i]);
				}
			}
			pstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.close(null, pstmt, conn);
		}
	}
	
	//关闭连接
	public void close(ResultSet rs, Statement stmt, Connection conn) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
