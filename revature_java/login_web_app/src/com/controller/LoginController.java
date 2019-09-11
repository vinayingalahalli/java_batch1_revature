package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.exceptions.BusinessException;
import com.model.User;
import com.service.LoginService;
import com.service.impl.LoginServiceImpl;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		User user = new User();
		//System.out.println("COntroller");
		user.setUserName(request.getParameter("userName"));
		user.setPassword(request.getParameter("password"));
		LoginService service=new LoginServiceImpl();
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		RequestDispatcher rd=null;
		try {
			if(service.isValidUser(user)) {
				//success - forward
			//	System.out.println("If");
				rd=request.getRequestDispatcher("success");
				rd.forward(request, response);
			}
		} catch (BusinessException e) {
			//failure - include
			//System.out.println("catch");
			rd=request.getRequestDispatcher("login.html");
			rd.include(request, response);
			out.print("<center><span style='color:red;'>"+e.getMessage()+"</span></center>");
		}
	}

}
