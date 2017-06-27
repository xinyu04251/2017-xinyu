package com.eduask.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eduask.biz.impl.GraBizImpl;

@SuppressWarnings("serial")
public class GraServlet extends HttpServlet {
	GraBizImpl gbi = new GraBizImpl();

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
		request.setAttribute("GRALIST", gbi.findAll());
		request.getRequestDispatcher("gratree.jsp").forward(request, response);
	}
}
