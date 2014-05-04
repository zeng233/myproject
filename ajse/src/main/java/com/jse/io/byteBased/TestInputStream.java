package com.jse.io.byteBased;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

import org.apache.commons.io.IOUtils;

/**
 * @description: TODO
 *
 * @createTime: 2014年4月28日 下午11:13:25
 *
 * @author zenghua
 *
 * @version 1.0
 */
public class TestInputStream {
	private File inFile = new File("src/main/resources/io/tostring.txt");
	private File outFile = new File("src/main/resources/io/out.txt");
	
	public static void main(String[] args) {
		TestInputStream t = new TestInputStream();
//		t.testInputStream();
//		t.readFileByBufferedReader();
		t.copyFile();
	}
	
	/**
	 * 将InputStream转换为String
	 */
	public void testInputStream() {
		InputStream in = null;
		try {
			
			File pathFile = inFile.getAbsoluteFile();
			in = new FileInputStream(pathFile);
			String s = IOUtils.toString(in, "UTF-8");
			System.out.println(s);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 缓存流读取文件
	 */
	public void readFileByBufferedReader() {
		File pathFile = inFile.getAbsoluteFile();
		File outPathFile = outFile.getAbsoluteFile(); 
		InputStream in = null;
		BufferedReader br = null;
		OutputStream out = null;
		
		try {
			in = new FileInputStream(pathFile);
			out = new FileOutputStream(outPathFile);
			br = new BufferedReader(new InputStreamReader(in));
			String s = null;
			//每读一次流，对应的位置会发生变化，必须用一个临时变量储存上次读取的内容
			System.out.println("=============BufferedReader============");
			while ((s = br.readLine()) != null) {
				System.out.println(s);
				out.write(s.getBytes());
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				in.close();
				br.close();
				out.close();
			} catch (Exception e2) {
				
			}
		}
	}
	
	/**
	 * 复制文件
	 */
	public void copyFile() {
		File inFilePath = inFile.getAbsoluteFile();
		File file = new File("src/main/resources/io/copyOut.txt");
		File outFile = file.getAbsoluteFile();
		
		InputStream in = null;
		OutputStream out = null;
		
		try {
			in = new FileInputStream(inFilePath);
			out = new FileOutputStream(outFile);
			byte[] buffer = new byte[1024];
			int length = 0;
			while ((length = in.read(buffer)) != -1) {
				System.out.println(11111);
				out.write(buffer, 0, length);
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				in.close();
				out.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
