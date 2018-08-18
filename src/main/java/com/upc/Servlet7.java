package com.upc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet7
 */
@WebServlet(
		urlPatterns = { "/Servlet7" }, 
		initParams = { 
				@WebInitParam(name = "curso", value = "ADAE"), 
				@WebInitParam(name = "ciclo", value = "7"), 
				@WebInitParam(name = "grupo", value = "AX81")
		})
public class Servlet7 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
