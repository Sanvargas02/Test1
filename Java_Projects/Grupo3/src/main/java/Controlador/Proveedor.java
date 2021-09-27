package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import Modelo.ProveedorDAO;
import Modelo.ProveedorDTO;

/**
 * Servlet implementation class Proveedor
 */
@WebServlet("/Proveedor")
public class Proveedor extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Proveedor() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ProveedorDAO provDAO = new ProveedorDAO();

		// Validación al pulsar el botón crear en la intefáz, lo cual inserta un valor a
		// la tabla
		if (request.getParameter("crear") != null) {
			long nitproveedor;
			String ciudad_proveedor, direccion_proveedor, nombre_proveedor, telefono_proveedor;

			nitproveedor = Long.parseLong(request.getParameter("nitproveedor"));
			nombre_proveedor = request.getParameter("nombre_proveedor");
			direccion_proveedor = request.getParameter("direccion_proveedor");
			telefono_proveedor = request.getParameter("telefono_proveedor");
			ciudad_proveedor = request.getParameter("ciudad_proveedor");
			ProveedorDTO provDto = new ProveedorDTO(nitproveedor, ciudad_proveedor, direccion_proveedor, 
					nombre_proveedor, telefono_proveedor);
			if (provDAO.Insertar_Proveedor(provDto)) {
				JOptionPane.showMessageDialog(null, "Proveedor registrado exitosamente");
				response.sendRedirect("Proveedores.jsp?men=Proveedor registrado exitosamente");
			} else {
				JOptionPane.showMessageDialog(null, "El Proveedor NO se registro");
				response.sendRedirect("Proveedores.jsp?men=El Proveedor NO se registro");
			}
		}

	}

}
