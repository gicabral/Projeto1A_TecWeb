package br.edu.insper;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		DAO dao = new DAO();
		
		String usuario = request.getParameter("usuario");
		String senha = request.getParameter("senha");
		String confirmarsenha = request.getParameter("confirmarsenha");
		
		if (senha.contentEquals(confirmarsenha)) {
			try {
				System.out.println("Entrou");
				dao.register(usuario, senha);
				PrintWriter out = response.getWriter();
				out.print("<style>");
				out.print("a {\r\n" + 
						"  background: #1c8adb;\r\n" + 
						"  color: #fff;\r\n" + 
						"  padding: 5px 5px;\r\n" + 
						"  height:30px;\r\n" + 
						"  width:100px;\r\n" + 
						"  text-align: center;\r\n" + 
						"  text-decoration: none;\r\n" + 
						"  display: inline-block;\r\n" + 
						"  border-radius:10px;\r\n" + 
						"}\r\n" + 
						"\r\n" + 
						"a:hover, a:active {\r\n" + 
						"  cursor: pointer;\r\n" + 
						"  background: #39dc79;\r\n" + 
						"  color:#000;\r\n" + 
						"}");
				out.print("</style>");
				out.print("<body>");
				out.print("<div style='height: 100%; font-family:sans-serif; font-size:22px; display: flex; flex-direction: column; justify-content:center; align-items: center;'>");
				out.print("<body>");
				out.print("<h3>Registrado com sucesso.</h3>");
				out.print("<a href='/Projeto1/'>Voltar</a>");
				out.print("</div>");
				out.print("</body>");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				PrintWriter out = response.getWriter();
				out.print("<body>");
				out.print("<h3>Senha não colocada.</h3>");
				out.print("<a href='/Projeto1/'>Voltar</a>");
				out.print("</body>");
							}	
		} else {
			PrintWriter out = response.getWriter();
			out.print("<style>");
			out.print("a {\r\n" + 
					"  background: #1c8adb;\r\n" + 
					"  color: #fff;\r\n" + 
					"  padding: 5px 5px;\r\n" + 
					"  height:30px;\r\n" + 
					"  width:100px;\r\n" + 
					"  text-align: center;\r\n" + 
					"  text-decoration: none;\r\n" + 
					"  display: inline-block;\r\n" + 
					"  border-radius:10px;\r\n" + 
					"}\r\n" + 
					"\r\n" + 
					"a:hover, a:active {\r\n" + 
					"  cursor: pointer;\r\n" + 
					"  background: #39dc79;\r\n" + 
					"  color:#000;\r\n" + 
					"}");
			out.print("</style>");
			out.print("<body>");
			out.print("<div style='height: 100%; font-family:sans-serif; font-size:22px; display: flex; flex-direction: column; justify-content:center; align-items: center;'>");
			out.print("<body>");
			out.print("<h3>Senhas diferentes.</h3>");
			out.print("<a href='/Projeto1/'>Voltar</a>");
			out.print("</div>");
			out.print("</body>");
		}
		
	}

}
