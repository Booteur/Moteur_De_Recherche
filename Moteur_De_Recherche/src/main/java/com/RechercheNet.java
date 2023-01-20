package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RechercheNet
 */
@WebServlet("/RechercheNet")
public class RechercheNet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String critere =request.getParameter("query");
		String browser =request.getParameter("browser");
		if(browser.equals("g")) {
			response.sendRedirect(("https://www.google.com/search?q="+critere));
			}else {
				response.sendRedirect("https://search.yahoo.com/search?p="+critere);
			}
	}

}
