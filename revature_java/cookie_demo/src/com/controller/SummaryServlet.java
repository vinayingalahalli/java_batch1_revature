package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		Cookie cookies[]=request.getCookies();
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.print("<h2 style='text-decoration:underline;'>User Details</h2>");
		pw.print("<table border='1px'>");
		for(Cookie cookie:cookies) {
			pw.print("<tr>");
			pw.print("<th>"+cookie.getName()+"</th>");
			pw.print("<td>"+cookie.getValue()+"</td>");
		}
		pw.print("<tr>");
		pw.print("<th>Age</th>");
		pw.print("<td>"+request.getParameter("age")+"</td>");
		pw.print("<tr>");
		pw.print("<th>Email</th>");
		pw.print("<td>"+request.getParameter("email")+"</td>");
			pw.print("</table>");
	}

}
