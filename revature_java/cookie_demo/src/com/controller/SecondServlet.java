package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/second")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie c1=new Cookie("City", request.getParameter("city"));
		Cookie c2=new Cookie("State", request.getParameter("state"));
		Cookie c3=new Cookie("Country", request.getParameter("country"));
		Cookie c4=new Cookie("Contact", request.getParameter("contact"));
		response.addCookie(c1);
		response.addCookie(c2);
		response.addCookie(c3);
		response.addCookie(c4);
		response.sendRedirect("three.html");
	}

}
