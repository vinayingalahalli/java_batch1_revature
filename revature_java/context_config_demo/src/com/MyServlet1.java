package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet1
 */
public class MyServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		ServletConfig config=getServletConfig();
		out.print("<h2>Accessing config params of MyServlet1 in MyServlet1</h2>");
		out.print("<h2>Sql1 : "+config.getInitParameter("sql1")+"</h2>");
		out.print("<h2>Sql2 : "+config.getInitParameter("sql2")+"</h2>");
		out.print("<h2>Sql3 : "+config.getInitParameter("sql3")+"</h2><br/><br/>");
		
		ServletContext context=getServletContext();
		out.print("<h2>Accessing context params in MyServlet1</h2>");
		out.print("<h2>Driver : "+context.getInitParameter("driver")+"</h2>");
		out.print("<h2>URL : "+context.getInitParameter("url")+"</h2>");
		out.print("<h2>Username : "+context.getInitParameter("username")+"</h2>");
	}

}
