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
	 * File路径相关
	 */
	public void getFilePath() {
		File dir = new File(".");//当前路径
		System.out.println("pathSeparator : " + dir.pathSeparator);
		System.out.println("pathSeparatorChar : " + dir.pathSeparatorChar);
		System.out.println("separator : " + dir.separator);
		System.out.println("separatorChar : " + dir.separatorChar);
		
		try {
			File file = new File(dir.getCanonicalPath() + File.separator + "TestFile.java");
			System.out.println(dir.getCanonicalPath() + File.separator + "TestFile.java");
		} catch (IOException e) {
		}
		
	}
}
