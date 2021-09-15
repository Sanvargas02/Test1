package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Usuario, Password;
		
		if(request.getParameter("enviar") != null) {
			Usuario = request.getParameter("usuario");
			Password = request.getParameter("password");
			
			if(Usuario.equals("admininicial") && Password.equals("admin123456")) {
				response.sendRedirect("AdminMenu.jsp?nom=" + Usuario);
			} else {
				JOptionPane.showMessageDialog(null, "Datos incorrectos");
				response.sendRedirect("Login.jsp");
			}
		}
	}

}
