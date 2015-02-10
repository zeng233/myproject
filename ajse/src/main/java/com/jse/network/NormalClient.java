package com.jse.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 客户端不关闭流会有哪些影响 TODO
 * 
 * 
 * @author zenghua233@gmail.com
 *
 * @createtime 2014年9月4日 下午3:07:11
 *
 * @version 1.0
 */

public class NormalClient
{
	public static void main(String[] args)
	{
		try {
			Socket socket = new Socket("127.0.0.1", 99);
			OutputStream output = socket.getOutputStream();
			  
			output.write("hello world!".getBytes());
			output.flush();
			InputStream input = socket.getInputStream();
			String serverMessage = getInput(input);
			System.out.println("server message is : " + serverMessage);
			
//			PrintWriter pw=new PrintWriter(output);
//			pw.print("client");
//			input.close();
//			output.close();
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 读取流
	 * @param input
	 * @return
	 */
	public static String getInput(InputStream input) {
		int count = 1024;
		
		if (input != null) {
			try {
//				while (count == 0) {
//					count = input.available();
//				}
				byte[] buffer = new byte[count];
				input.read(buffer);
//				input.close();
				return new String(buffer).toString();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return null;
	}
}
