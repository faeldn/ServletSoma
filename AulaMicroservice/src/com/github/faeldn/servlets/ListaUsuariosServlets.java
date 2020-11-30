package com.github.faeldn.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet (
		name = "ListaUsuario",
		urlPatterns = "/usuario"
)

public class ListaUsuariosServlets extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
// metodos do http (API REST)
// GET 	=> Quer um recurso
// POST	=> Quer cadastrar um recurso
// PUT	=> Alterar um recurso
// DELETE	=> Excluir um recurso
 
 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		writer.write("Metodo chamado GET");
		
		int num1 = Integer.parseInt(req.getParameter("num1"));
 		int num2 = Integer.parseInt(req.getParameter("num2"));
 		 		
 		writer.write("Metodo chamado GET <br>");
 		
 		writer.write("Resultado: " + (num1 + num2));
		writer.close();
	}
	
 	@Override
 	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
 		PrintWriter writer = resp.getWriter();
 		
 		int num1 = Integer.parseInt(req.getParameter("num1"));
 		int num2 = Integer.parseInt(req.getParameter("num2"));
 		 		
 		writer.write("Metodo chamado POST <br>");
 		
 		writer.write("Resultado: " + (num1 + num2));
		writer.close();
 	}
 	
 	@Override
 	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
 		PrintWriter writer = resp.getWriter();
 		writer.write("Metodo chamado PUT");
		
		int num1 = Integer.parseInt(req.getParameter("num1"));
 		int num2 = Integer.parseInt(req.getParameter("num2"));
 		 		
 		writer.write("Metodo chamado PUT <br>");
 		
 		writer.write("Resultado: " + (num1 + num2));
		writer.close();
 	}
 	
 	@Override
 	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
 		PrintWriter writer = resp.getWriter();
 		writer.write("Metodo chamado DELETE");
		
		int num1 = Integer.parseInt(req.getParameter("num1"));
 		int num2 = Integer.parseInt(req.getParameter("num2"));
 		 		
 		writer.write("Metodo chamado DELETE <br>");
 		
 		writer.write("Resultado: " + (num1 + num2));
		writer.close();
 	}

}
