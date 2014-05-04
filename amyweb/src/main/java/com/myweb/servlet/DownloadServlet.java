package com.myweb.servlet;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * description: 文件下载
 *
 * createtime: 2013-4-27 下午03:58:27
 *
 * @author zenghua
 * @version 1.0
 */
@WebServlet("/user/downloadServlet")
public class DownloadServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8284022175112293816L;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		String filePath = request.getParameter("imageUrl");
		response.setContentType("image/jpg");   
		//attachment设置浏览器不在线打开文件，response.encodeURL(filePath)，“attachment”设置以对话框形式下载
		response.setHeader("Content-Disposition", "attachment ;filename=" + filePath );
//		response.addHeader( " Content-Length " ,  ""   +  file.length());  
//		response.setContentType( " application/octet-stream " );  
		String path = request.getServletContext().getRealPath("static\\images\\regist\\" + filePath);
		
		try {
			this.downloadLocal(path, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 在浏览器中打开
	 * @param path
	 * @param response
	 * @throws Exception
	 */
	public void download(String path, HttpServletResponse response) throws Exception {
		InputStream in = new BufferedInputStream(new FileInputStream(path));
		byte[] buffer = new byte[in.available()];
		in.read(buffer);
		in.close();
		response.reset();
		OutputStream out = new BufferedOutputStream(response.getOutputStream());
		out.write(buffer);
		out.flush();
		out.close();
	}
	
	public void downloadLocal(String path, HttpServletResponse response) {
		try {
			InputStream input = new FileInputStream(path);
			byte[] buffer = new byte[1024];
			response.reset();  
//	        response.setContentType( " bin " );  
//	        response.addHeader( " Content-Disposition " ,  " attachment; filename=\ ""  + fileName +  " \ "" );  
	        int length = 0;
	        while ((length=input.read(buffer)) > -1) {
	        	response.getOutputStream().write(buffer, 0, length);
	        }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
