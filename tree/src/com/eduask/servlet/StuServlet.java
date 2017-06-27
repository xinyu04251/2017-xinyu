package com.eduask.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eduask.bean.StuInfo;
import com.eduask.biz.impl.StuBizImpl;

@SuppressWarnings("serial")
public class StuServlet extends HttpServlet {
	private StuBizImpl sbi = new StuBizImpl();

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("gbk");
		String method = request.getParameter("method");
		System.out.println(method);
		if ("findAll".equals(method)) {
			findAll(request, response);
		} else if ("findBy".equals(method)) {
			findBy(request, response);
		} else if ("add".equals(method)) {
			add(request, response);
		} else if ("findById".equals(method)) {
			findById(request, response);
		} else if ("update".equals(method)) {
			update(request, response);
		} else if ("delete".equals(method)) {
			delete(request, response);
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	public void findAll(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("STUINFO", sbi.findAll());
		request.getRequestDispatcher("stuFindAll.jsp").forward(request,
				response);
	}

	public void findById(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int sno = Integer.parseInt(request.getParameter("stuNo"));
		request.setAttribute("STUINFO", sbi.findById(sno));
		request.getRequestDispatcher("stuUpdate.jsp")
				.forward(request, response);
	}

	public void findBy(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String str = request.getParameter("str");
		request.setAttribute("STUINFO", sbi.findBy("%" + str + "%"));
		request.getRequestDispatcher("stuFindAll.jsp").forward(request,
				response);
	}

	public void add(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		StuInfo si = new StuInfo();
		si.setStuId(request.getParameter("stuId"));
		si.setStuPass(request.getParameter("stuPass"));
		si.setStuName(request.getParameter("stuName"));
		si.setStuSex(request.getParameter("stuSex"));
		si.setStuOri(request.getParameter("stuOri"));
		si.setStuNat(request.getParameter("stuNat"));
		si.setStuAge(Integer.parseInt(request.getParameter("stuAge")));
		si.setStuPhone(request.getParameter("stuPhone"));
		si.setClassId(Integer.parseInt(request.getParameter("classId")));
		sbi.add(si);
		request.getRequestDispatcher("stuFindAll.jsp").forward(request,
				response);
	}

	public void update(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		StuInfo si = new StuInfo();
		si.setStuNo(Integer.parseInt(request.getParameter("stuNo")));
		si.setStuId(request.getParameter("stuId"));
		si.setStuPass(request.getParameter("stuPass"));
		si.setStuName(request.getParameter("stuName"));
		si.setStuSex(request.getParameter("stuSex"));
		si.setStuOri(request.getParameter("stuOri"));
		si.setStuNat(request.getParameter("stuNat"));
		si.setStuAge(Integer.parseInt(request.getParameter("stuAge")));
		si.setStuPhone(request.getParameter("stuPhone"));
		si.setClassId(Integer.parseInt(request.getParameter("classId")));
		si.setStuState(Integer.parseInt(request.getParameter("stuState")));
		sbi.update(si);
		request.getRequestDispatcher("stuFindAll.jsp").forward(request,
				response);
	}

	public void delete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int sno = Integer.parseInt(request.getParameter("stuNo"));
		sbi.delete(sno);
		request.getRequestDispatcher("stuFindAll.jsp").forward(request,
				response);
	}

}
