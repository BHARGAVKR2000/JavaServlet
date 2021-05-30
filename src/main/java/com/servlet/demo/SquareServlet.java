package com.servlet.demo;

import java.io.IOException;

import java.io.PrintWriter;


import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
public class SquareServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		Cookie cookies[] = req.getCookies();
		int value = 0;
		for(Cookie c : cookies) {
			if(c.getName().equals("sumValue")) {
				value = Integer.parseInt(c.getValue());
			}
		}
		
		
		
		PrintWriter out = res.getWriter();
//		int value = Integer.parseInt(req.getParameter("sum"));
//		out.println("the result is"+value);
		
//		HttpSession session = req.getSession();
//		int value = (int)session.getAttribute("sumValue");
		
//		PrintWriter out = res.getWriter();
//		int value = (int)req.getAttribute("addValue");
		out.println("the Sum is:"+value);
//		int square = value*value;
//		out.println("the square is :"+square);
	}

}
