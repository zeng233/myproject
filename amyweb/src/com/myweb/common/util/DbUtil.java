package com.myweb.common.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/**
 * description: 操作数据库相关的工具类
 *
 * createtime: 2013-1-23 上午09:35:28
 *
 * @author zenghua
 * @version 1.0
 */

public class DbUtil {
	private static InputStream input = DbUtil.class.getClassLoader().getResourceAsStream("jdbc.properties");
//	private static InputStream input = ClassLoader.getSystemResourceAsStream("jdbc.properties");
	private static Properties properties = new Properties();
	static {
		try {
			properties.load(input);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private static String user = properties.getProperty("jdbc.username");
	private static String password = properties.getProperty("jdbc.password");
	private static String url = properties.getProperty("jdbc.url");
	private static String driver = properties.getProperty("jdbc.driver");
	private static ConcurrentHashMap<String, Connection> connections = new ConcurrentHashMap<String, Connection>();
	
	public static Connection createConn(String key) {
		Connection conn = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			connections.put(key, conn);
//			conn = DriverManager.getConnection(key, properties);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static Connection getConn(String key) {
		if (connections.containsKey(key)) {
			return connections.get(key);
		}
		Connection conn = DbUtil.createConn(key);
		
//		Connection realConn = connections.put(key, conn);
		// TODO createConn(key)方法怎么做的？
		Connection realConn = connections.putIfAbsent(key, conn);
//		System.out.println("real:" + realConn);
//		if (realConn != null) {
//			try {
//				conn.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
		return realConn;
	}
	
}
