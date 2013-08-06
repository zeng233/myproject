package com.jse.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

/**
 * @description: 几种文件复制测试
 *
 * @createtime: 2013-6-13 下午4:50:20
 *
 * @author zenghua
 *
 * @version 1.0
 */

public class CopyTest {
	private static URL url = null;
	
	public static void main(String[] args) throws Exception {
		url = new URL("http://www.baidu.com/");
		
	}
	
	public void testFileCopy() throws FileNotFoundException {
		InputStream input = new FileInputStream(new File("c:/t.txt"));
		OutputStream out = null;
	}
}
