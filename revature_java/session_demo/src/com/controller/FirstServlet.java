package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.User;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/first")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * Cookie c1=new Cookie("FirstName", request.getParameter("fname")); Cookie
		 * c2=new Cookie("LastName", request.getParameter("lname"));
		 * response.addCookie(c1); response.addCookie(c2);
		 */
		
		HttpSession session=request.getSession();
		//getSession()/getSession(boolean) -> if you use getSession(0 or getSession(true) it will
		// create a new session. -> if we use getSession(false) it wont create new session, it looks for
		// participating in existing session created by some other page... if getSession(false)-> if the session
		//is not found it will return null.
		
		User user =new User();
		user.setFname(request.getParameter("fname"));
		user.setLname(request.getParameter("lname"));
		
		session.setAttribute("user", user);
		
		response.sendRedirect("two.html");
		
	}

}
