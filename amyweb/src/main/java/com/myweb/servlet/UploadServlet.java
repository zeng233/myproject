package com.myweb.servlet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.IOUtils;

/**
 * @description: TODO
 *
 * @createtime: 2013-8-12 下午3:32:04
 *
 * @author zenghua
 *
 * @version 1.0
 */

@WebServlet(name="uploadServlet", urlPatterns="/uploadServlet")
public class UploadServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5852962124355747539L;
	
	@Override
	public void init() throws ServletException {
		super.init();
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//uploadByFile(req);
		
		this.uploadByZip(req);
	}
	
	public void uploadByFile(HttpServletRequest req) throws IOException {
		FileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload upload = new ServletFileUpload(factory);
		upload.setHeaderEncoding("UTF-8");
		
		InputStream inputStream = null;
		OutputStream outputStream = null;
		String path = "c:\\httpclient\\a.jpg";
		File file = new File(path);
		if (!file.exists()) {
			file.mkdir();
		}
		try {
			List<FileItem> fileItems = upload.parseRequest(req);
			if(fileItems != null) {
				for (FileItem fileItem : fileItems) {
					if(fileItem.isFormField()) {
						String paramName = fileItem.getFieldName(); 
                        String paramValue = fileItem.getString(); 
                        System.out.println(paramName + ":" + paramValue); 
					} else {
						inputStream = fileItem.getInputStream();
						outputStream = new FileOutputStream(path);
						IOUtils.copyLarge(inputStream, outputStream);
					}
				}
			}
			
		} catch (FileUploadException e) {
			e.printStackTrace();
		} finally {
			inputStream.close();
			outputStream.close();
		}
		
	}
	
	
	public void uploadByZip(HttpServletRequest req) throws IOException {
		FileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload upload = new ServletFileUpload(factory);
		upload.setHeaderEncoding("UTF-8");
		
		InputStream inputStream = null;
		OutputStream outputStream = null;
		String path = "c:\\httpclient\\test.zip";
		File file = new File(path);
		if (!file.exists()) {
			file.mkdir();
		}
		try {
			List<FileItem> fileItems = upload.parseRequest(req);
			if(fileItems != null) {
				for (FileItem fileItem : fileItems) {
					if(fileItem.isFormField()) {
						String paramName = fileItem.getFieldName(); 
                        String paramValue = fileItem.getString(); 
                        System.out.println(paramName + ":" + paramValue); 
					} else {
						inputStream = fileItem.getInputStream();
						outputStream = new FileOutputStream(path);
						IOUtils.copyLarge(inputStream, outputStream);
					}
				}
			}
			
		} catch (FileUploadException e) {
			e.printStackTrace();
		} finally {
			inputStream.close();
			outputStream.close();
		}
		
//		req.getServletContext().getRequestDispatcher("/index.jsp");
	}
}
