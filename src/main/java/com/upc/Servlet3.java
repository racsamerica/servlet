package com.upc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(
		urlPatterns = { "/Servlet3" }, 
		initParams = { 
				@WebInitParam(name = "nombre", value = "Web"), 
				@WebInitParam(name = "ciclo", value = "2018-02"), 
				@WebInitParam(name = "seccion", value = "SX61")
		})
public class Servlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre=request.getParameter("nombre");
		String ciclo=request.getParameter("ciclo");
		String seccion=request.getParameter("seccion");
//		if(nombre==null && ciclo==null && seccion==null) {
//			nombre=this.getInitParameter("nombre");
//			ciclo=this.getInitParameter("ciclo");
//			seccion=this.getInitParameter("seccion");
//		}
		response.getWriter().write("  El nombre es: "+nombre);
		response.getWriter().write("  El ciclo es: "+ciclo);
		response.getWriter().write("  La sección es: "+seccion);
	}

}
