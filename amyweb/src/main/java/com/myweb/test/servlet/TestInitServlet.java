package com.myweb.test.servlet;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.time.DateUtils;

import com.myweb.entity.test.Account;

/**
 * @description: TODO
 *
 * @createtime: 2013-7-22 下午3:24:44
 *
 * @author zenghua
 *
 * @version 1.0
 */
//urlPatterns中的路径都是相对于servletcontext中的上下文路径来决定的
@WebServlet(name="testInitServlet", urlPatterns="/test/testInitServlet")
public class TestInitServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2399716734721612690L;
	
	@Override
	public void init() throws ServletException {
		//init方法中可以调用destroy方法，但不会发生任何事情，除非重写了destroy
		this.destroy();
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		Map<String, Object> map = new HashMap<String, Object>();
		Account account1 = new Account();
		account1.setId(1);
		account1.setName("zenghua233@gmail.com");
		account1.setRealname("曾华1");
		account1.setCreateTime(new Date());
		
		Account account2 = new Account();
		account2.setId(2);
		account2.setName("zenghua202@163.com");
		account2.setRealname("曾华2");
		account2.setCreateTime(DateUtils.addDays(new Date(), 1));
		
		map.put("account1", account1);
		map.put("account2", account2);
		
		req.getServletContext().getRequestDispatcher("/pages/test/jsp/skip/face.jsp").forward(req, resp);
	}
	
	@Override
	public void destroy() {
		System.out.println("we can invoke destroy in init method!");
		super.destroy();
	}
}
