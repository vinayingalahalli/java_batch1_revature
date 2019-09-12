package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.User;

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
		/*
		 * Cookie c1=new Cookie("City", request.getParameter("city")); Cookie c2=new
		 * Cookie("State", request.getParameter("state")); Cookie c3=new
		 * Cookie("Country", request.getParameter("country")); Cookie c4=new
		 * Cookie("Contact", request.getParameter("contact")); response.addCookie(c1);
		 * response.addCookie(c2); response.addCookie(c3); response.addCookie(c4);
		 */
		HttpSession session=request.getSession(false);
		if(session==null) {
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			pw.print("<h3>You are not in active session...</h3>");
			pw.print("<a href='/session_demo'>Click Here</a>");
		}else {
			User user=(User) session.getAttribute("user");
			user.setCity(request.getParameter("city"));
			user.setState(request.getParameter("state"));
			user.setCountry(request.getParameter("country"));
			user.setContact(Long.parseLong(request.getParameter("contact")));
			session.setAttribute("user", user);
			response.sendRedirect("three.html");
		}
		
	}

}