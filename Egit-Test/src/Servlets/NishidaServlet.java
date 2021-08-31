package Servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//実はこれサーブレット出来てないドヤァ
/**
 * Servlet implementation class NishidaServlet
 */
@WebServlet("/NishidaServlet")
public class NishidaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NishidaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    
        protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
            req.setCharacterEncoding("Windows-31J");

            RequestDispatcher dis=req.getRequestDispatcher("nishidaresult");
            dis.forward(req,res);
        }
    }

