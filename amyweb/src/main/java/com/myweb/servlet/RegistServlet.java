package com.myweb.servlet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.lang3.StringUtils;

import com.myweb.entity.User;
import com.myweb.service.UserService;

/**
 * description: 注册上传头像
 *
 * createtime: 2013-4-17 下午02:30:56
 *
 * @author zenghua
 * @version 1.0
 */
@WebServlet(name="registServlet", urlPatterns="/registServlet")
public class RegistServlet extends HttpServlet {
	private UserService userService = new UserService();

	/**
	 * 
	 */
	private static final long serialVersionUID = 6857927225137793230L;
	
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		User user = new User();
		//JSP页面中form中enctype="multipart/form-data"，那表单里面的内容都是二进制的，这样不能取值
//		user.setUserName(request.getParameter("userName"));
//		user.setPassword(request.getParameter("password"));
//		user.setCreateTime(new Date());
		String newFileName = null;
		FileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload upload = new ServletFileUpload(factory);
		upload.setHeaderEncoding("UTF-8");
		
		try {
			//新建上传头像的保存路径，为什么是\\，用/打印的结果是\webapps\amyweb\images/regist TODO
			String path = request.getServletContext().getRealPath("/") + "static\\images\\regist";
			File file = new File(path);
			if (!file.exists()) {
				file.mkdir();
			}
			
			List<FileItem> fileItems = upload.parseRequest(request);
			if (CollectionUtils.isNotEmpty(fileItems)) {
				user.setUserName(fileItems.get(1).getString());
				user.setPassword(fileItems.get(2).getString());
				user.setCreateTime(new Date());
				
				for (FileItem fileItem : fileItems) {
					//fileItem表示一个文件或者一个表单子项，有可能不是一个文件，所以注册的时候有3个fileitem
//					System.out.println("fieldName : " + fileItem.getFieldName());
//					System.out.println("name : " + fileItem.getName());
					if (!fileItem.isFormField() && StringUtils.isNotBlank(fileItem.getName())) {
						//获取上传文件输出流，查看文档，如果是大文件很多个G的，读取速度非常困难
						InputStream inputStream = fileItem.getInputStream();
						// 获取WebContent下的全部文件夹
//						System.out.println("ResourcePaths : " + request.getServletContext().getResourcePaths("/"));
						//上传文件新的文件名后缀
						String fileSuffix = fileItem.getName().substring(fileItem.getName().indexOf("."));
						StringBuffer sb = new StringBuffer();
//						newFileName = sb.append(UUID.randomUUID().toString().substring(0, 5))
//												.append(fileSuffix).toString();
						newFileName = sb.append(fileItems.get(1).getString()).append(fileSuffix).toString();
						OutputStream outputStream = new FileOutputStream(path + "\\" + newFileName);
						//研究下IOUtils
//						IOUtils.copy(inputStream, outputStream);
//						IOUtils.copyLarge(inputStream, outputStream);
						
						byte[] buffer = new byte[1024];
						int length = 0;
						while (-1 != (length = inputStream.read(buffer)) ) {
							outputStream.write(buffer, 0, length);
						}
						inputStream.close();
						outputStream.close();
					}
				}
			}
			
			user.setImageUrl(newFileName);
			userService.save(user);
			request.getSession().setAttribute("imageUrl", newFileName);
			request.getServletContext().getRequestDispatcher("/pages/user/success.jsp").forward(request, response);
		} catch (FileUploadException e) {
			e.printStackTrace();
		}
	}
}
