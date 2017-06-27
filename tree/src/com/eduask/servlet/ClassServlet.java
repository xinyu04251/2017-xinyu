package com.eduask.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eduask.biz.impl.ClassBizImpl;

@SuppressWarnings("serial")
public class ClassServlet extends HttpServlet {
	ClassBizImpl cbi = new ClassBizImpl();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("gbk");
		String method = request.getParameter("method");
		if("findAll".equals(method)){
			findAll(request,response);
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);
	}
	
	public void findAll(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("CLASSLIST", cbi.findAll());
		request.getRequestDispatcher("clatree.jsp").forward(request, response);
	}

}
