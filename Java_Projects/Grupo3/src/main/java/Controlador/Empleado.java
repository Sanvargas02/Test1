package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import Modelo.EmpleadoDAO;
import Modelo.EmpleadoDTO;

/**
 * Servlet implementation class Empleado
 */
@WebServlet("/Empleado")
public class Empleado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Empleado() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
		EmpleadoDAO empDao = new EmpleadoDAO();
		
		if(request.getParameter("crear")!=null) {
			long cedula_empleado;
			String nombre_empleado, email_empleado, empleado, contrasena;
			
			cedula_empleado = Long.parseLong(request.getParameter("cedula_empleado"));
			nombre_empleado = request.getParameter("nombre_empleado");
			email_empleado = request.getParameter("email_empleado");
			empleado = request.getParameter("empleado");
			contrasena = request.getParameter("contrasena");
			EmpleadoDTO empDto = new EmpleadoDTO(cedula_empleado, email_empleado, nombre_empleado, contrasena, empleado);
			if(empDao.Insertar_Empleado(empDto)) {
				JOptionPane.showMessageDialog(null, "Empleado registrado exitosamente");
				response.sendRedirect("Empleados.jsp?men=Empleado registrado exitosamente");
			}else {
				JOptionPane.showMessageDialog(null, "El empleado NO se registro");
				response.sendRedirect("Empleados.jsp?men=El empleado NO se registro");
			}
		}
		
	}

}
