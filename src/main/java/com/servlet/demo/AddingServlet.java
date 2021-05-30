package com.servlet.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
public class AddingServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		int sum = num1 + num2;
		
		PrintWriter out = res.getWriter();
//		res.sendRedirect("square?sum="+sum);	//URL Rewriting
		
	/*	HttpSession session = req.getSession();
		session.setAttribute("sumValue", sum);			// HttpSession example
		res.sendRedirect("square");
	*/
		
		Cookie cookie = new Cookie("sumValue", sum+"");
		res.addCookie(cookie);
//		res.sendRedirect("square");
		
		
//		ServletContext sctx = req.getServletContext();
//		String name = sctx.getInitParameter("name");
//		out.print("hi "+ name);
		
		ServletConfig con = getServletConfig();
		String name = con.getInitParameter("name");
		out.print("hi "+name);
		
//		
//		req.setAttribute("addValue", sum);
//		RequestDispatcher rd = req.getRequestDispatcher("/square");
//		rd.forward(req, res);
//		
	}

}
