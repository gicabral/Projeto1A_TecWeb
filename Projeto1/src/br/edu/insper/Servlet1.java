package br.edu.insper;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String nome = request.getParameter("nome");
		String curso = request.getParameter("curso");
		String email = request.getParameter("email");
		out.println("<html>");
		out.println("<body>");
		out.println("Nome: " + nome);
		out.println("<br>");
		out.println("Curso: " + curso);
		out.println("<br>");
		out.println("Email: " + email);
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		DAO dao = new DAO();
		String usuario = request.getParameter("usuariologin");
		String senha = request.getParameter("senhalogin");
		try {
			Pessoas usuarioLogin = dao.login(usuario, senha);
				
			
			if (usuarioLogin == null) {
				PrintWriter out2 = response.getWriter();
				out2.print("<style>");
				out2.print("a {\r\n" + 
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
				out2.print("</style>");
				out2.print("<body>");
				out2.print("<div style='height: 100%; font-family:sans-serif; font-size:22px; display: flex; flex-direction: column; justify-content:center; align-items: center;'>");
				out2.print("<h3>Você não está cadastrado ou senha incorreta!</h3>");
				out2.print("<a href='/Projeto1/'>Voltar</a>");
				out2.print("</div>");
				out2.print("</body>");
			} else {
			response.sendRedirect("http://localhost:8080/Projeto1/paginaInicial.jsp");

			}
		} catch (SQLException e) {
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
			out.print("<div style='height: 100%; font-family:sans-serif; font-size:22px; display: flex; flex-direction: column; justify-content:center; align-items: center;'>");
			out.print("<body>");
			out.print("<h3>Você não está cadastrado!</h3>");
			out.print("<a href='/Projeto1/'>Voltar</a>");
			out.print("</div>");
			out.print("</body>");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
