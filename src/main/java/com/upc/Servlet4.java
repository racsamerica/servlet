package com.upc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet(urlPatterns = { "/Servlet4" }, initParams = { @WebInitParam(name = "inicio", value = "0") })
@WebServlet("/Servlet4")
public class Servlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int contador;
//
//	public void init(ServletConfig config) throws ServletException {
//		contador = Integer.parseInt(config.getInitParameter("inicio"));
//	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println(contador);
		contador++;
		out.close();
	}

}
