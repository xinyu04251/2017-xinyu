package com.eduask.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eduask.biz.impl.StuBizImpl;

@SuppressWarnings("serial")
public class StuServlet extends HttpServlet {
	private StuBizImpl sbi = new StuBizImpl();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("gbk");
		findAll(request,response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}
	
	public void findAll(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("STUINFO", sbi.findAll());
		request.getRequestDispatcher("stuFindAll.jsp").forward(request, response);
	}

}
