package com.dlb.demo;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
			//获取类型
			String type=request.getParameter("type");
			System.out.println(type);
			//判断类型
			if("2".equals(type)){//管理员
			request.getRequestDispatcher("/Admin.jsp").forward(request, response);
			}else{
			request.getRequestDispatcher("/manager.jsp").forward(request, response);
			}
}
public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		doGet(request, response);
	}
}


