package com.jse.io.file;

import java.io.File;
import java.io.IOException;

/**
 * @description: TODO
 *
 * @createtime: 2013-11-6 上午9:43:30
 *
 * @author zenghua
 *
 * @version 1.0
 */

public class TestFile {
	public static void main(String[] args) throws Exception {
		TestFile t = new TestFile();
		t.getFilePath();
	}
	
	/**
	 * File路径相关，几个路径常量
	 */
	public void getFilePath() {
//		File f = new File("src\\main\\resources.tostring.txt");\\第一个\表示转义字符
		File dir = new File("src/main/resources/tostring.txt");//当前路径
		System.out.println(dir.getAbsolutePath());
		System.out.println(dir.getPath());
		System.out.println(dir.getParent());
		System.out.println("pathSeparator : " + File.pathSeparator);
		System.out.println("pathSeparatorChar : " + File.pathSeparatorChar);
		System.out.println("separator : " + File.separator);
		System.out.println("separatorChar : " + File.separatorChar);
		
		try {
			File file = new File(dir.getCanonicalPath() + File.separator + "TestFile.java");
			System.out.println(dir.getCanonicalPath() + File.separator + "TestFile.java");
		} catch (IOException e) {
		}
		
	}
}
