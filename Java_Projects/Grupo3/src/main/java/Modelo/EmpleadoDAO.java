package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controlador.Conexion;

public class EmpleadoDAO {
	Conexion cnn = new Conexion();
	Connection con = cnn.Conectar();
	PreparedStatement ps = null;
	ResultSet res = null;
	
	public boolean Insertar_Empleado(EmpleadoDTO empl) {
		boolean resul = false;
		try {
			String sql = "insert into empleados values(?,?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setLong(1, empl.getCedula_empleado());
			ps.setString(2, empl.getEmail_empleado());
			ps.setString(3, empl.getNombre_empleado());
			ps.setString(4, empl.getContrasena());
			ps.setString(5, empl.getEmpleado());
			resul = ps.executeUpdate()>0;
		}catch(SQLException ex) {
			JOptionPane.showMessageDialog(null, "error al insertar: " + ex);
		}
		return resul;
	}
	
	
}
