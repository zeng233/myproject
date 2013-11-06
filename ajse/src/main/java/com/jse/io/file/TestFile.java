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
	public static void main(String[] args) throws IOException {
		File dir = new File(".");//当前路径
		File file = new File(dir.getCanonicalPath() + File.separator + "TestFile.java");
		System.out.println(dir.getCanonicalPath() + File.separator + "TestFile.java");
	}
}
