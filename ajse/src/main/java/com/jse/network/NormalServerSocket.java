package com.jse.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 * @author zenghua233@gmail.com
 *
 * @createtime 2014年9月4日 下午3:06:40
 *
 * @version 1.0
 */

public class NormalServerSocket
{
	public static void main(String[] args)
	{
		try {
			ServerSocket server = new ServerSocket(99);
			Socket socket;
			
			while (true) {
				socket = server.accept();
//				InputStream input = socket.getInputStream();
				OutputStream output = socket.getOutputStream();
				
//				String clientMessage = getInput(input);
//				System.out.println("clientMessage is : " + clientMessage);
				System.out.println(output);
				output.write(("server has received message!" + new Date().toString()).getBytes());
//				output.close();
				
				Thread.sleep(3000);
			}
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
		int count = 0;
		
		if (input != null) {
			try {
				while (count == 0) {
					count = input.available();
				}
				byte[] buffer = new byte[count];
				input.read(buffer);
				input.close();
				return new String(buffer).toString();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return null;
	}
}
