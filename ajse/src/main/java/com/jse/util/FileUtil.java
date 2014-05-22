package com.jse.util;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;

/**
 * @description: TODO
 *
 * @createtime: 2014-5-22 上午11:42:09
 *
 * @author zenghua
 *
 * @version 1.0
 */

public class FileUtil {
	public static void main(String[] args) throws Exception {
		FileUtil f = new FileUtil();
		f.readFileString("F:/sap.txt");
		
		
//		List<String> list = FileUtils.readLines(new File("g:/a.txt"));
//		System.out.println(list.size());
		
		
//		f.t();
	}
	
	
	public void readFileString(String path) throws Exception {
//		String s = FileUtils.readFileToString(new File(path));
		List<String> list = FileUtils.readLines(new File(path));
		StringBuffer sb = new StringBuffer();
		for (String id : list) {
			String s = "'" + id + "',";
			sb.append(s);
		}
//		FileUtils.write(new File("g:/channelItem.txt"), sb);
		System.out.println(sb.toString());
//		return s;
	}
}
