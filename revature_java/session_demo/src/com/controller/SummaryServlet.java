package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.User;

/**
 * Servlet implementation class SummaryServlet
 */
@WebServlet("/summary")
public class SummaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SummaryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		HttpSession session=request.getSession(false);
		if(session==null) {
			pw.print("<h3>You are not in active session...</h3>");
			pw.print("<a href='/session_demo'>Click Here</a>");
		}else {
			User user=(User) session.getAttribute("user");
			user.setAge(Integer.parseInt(request.getParameter("age")));
			user.setEmail(request.getParameter("email"));
			session.setAttribute("user", user);
			pw.print("<h3>Hello "+user.getFname()+"</h3>");
			pw.print("<h4>Your info is below "+user+"</h4>");
			pw.print("<h4>Session Id"+session.getId()+"</h4>");
			pw.print("<h4>Session was created at "+new Date(session.getCreationTime())+"</h4>");
			session.invalidate();// destroys the session
			//session.getm
		}
	}

}