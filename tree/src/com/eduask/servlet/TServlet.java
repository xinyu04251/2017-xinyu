package com.eduask.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eduask.bean.TInfo;
import com.eduask.biz.impl.TBizImpl;

@SuppressWarnings("serial")
public class TServlet extends HttpServlet {
	private TBizImpl tbi = new TBizImpl();

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("gbk");
		String method = request.getParameter("method");
		System.out.println(method);
		if("findAll".equals(method)){
			findAll(request,response);
		}else if("findBy".equals(method)){
			findBy(request,response);
		}else if("add".equals(method)){
			add(request,response);
		}else if("findById".equals(method)){
			findById(request,response);
		}else if("update".equals(method)){
			update(request,response);
		}else if("delete".equals(method)){
			delete(request,response);
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);
	}
	public void findAll(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("TINFO", tbi.findAll());
		request.getRequestDispatcher("tFindAll.jsp").forward(request, response);
	}
	public void findById(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int tno = Integer.parseInt(request.getParameter("tNo"));
		request.setAttribute("TINFO", tbi.findById(tno));
		request.getRequestDispatcher("tUpdate.jsp").forward(request, response);
	}
	public void findBy(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String str = request.getParameter("str");
		request.setAttribute("TINFO", tbi.findBy("%"+str+"%"));
		request.getRequestDispatcher("tFindAll.jsp").forward(request, response);
	}
	public void add(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		TInfo ti =new TInfo();
		ti.settId(Integer.parseInt(request.getParameter("tId")));
		ti.settPass(request.getParameter("tPass"));
		ti.settName(request.getParameter("tName"));
		ti.settSex(request.getParameter("tSex"));
		ti.settOri(request.getParameter("tOri"));
		ti.settNat(request.getParameter("tNat"));
		ti.settAge(Integer.parseInt(request.getParameter("tAge")));
		ti.settPhone(request.getParameter("tPhone"));
		ti.setEduBac(request.getParameter("tEduBac"));
		ti.setSubId(Integer.parseInt(request.getParameter("tSubId")));
		ti.setRoleId(Integer.parseInt(request.getParameter("tRoleId")));
		tbi.add(ti);
		request.getRequestDispatcher("tFindAll.jsp").forward(request,response);
	}
	public void update(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		TInfo ti =new TInfo();
		ti.settNo(Integer.parseInt(request.getParameter("tNo")));
		ti.settPass(request.getParameter("tPass"));
		ti.settName(request.getParameter("tName"));
		ti.settSex(request.getParameter("tSex"));
		ti.settOri(request.getParameter("tOri"));
		ti.settNat(request.getParameter("tNat"));
		ti.settAge(Integer.parseInt(request.getParameter("tAge")));
		ti.settPhone(request.getParameter("tPhone"));
		ti.setEduBac(request.getParameter("tEduBac"));
		ti.setSubId(Integer.parseInt(request.getParameter("tSubId")));
		ti.setRoleId(Integer.parseInt(request.getParameter("tRoleId")));
		tbi.update(ti);
		request.getRequestDispatcher("tFindAll.jsp").forward(request,response);
	}
	public void delete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int tno = Integer.parseInt(request.getParameter("tNo"));
		tbi.delete(tno);
		request.getRequestDispatcher("tFindAll.jsp").forward(request,response);
	}
}
