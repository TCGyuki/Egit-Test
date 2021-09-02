package Servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MiyashitaServlet
 */
@WebServlet("/MiyashitaServlet")

public class MiyashitaServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		req.setCharacterEncoding("Windows-31J");

		String u = req.getParameter("name");

		req.setAttribute("name", u);

		RequestDispatcher dispatcher=
			req.getRequestDispatcher("Miyashitash");

		dispatcher.forward(req, res);
	}
}

