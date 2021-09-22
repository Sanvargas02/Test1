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
	
	//Método para insertar valores a la tabla
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
	
	//Método para Consultar los valores de la tabla
	public EmpleadoDTO Buscar_Empleado(long cedula_empleado) {
		
		EmpleadoDTO emp = null;
		try {
			String sql = "select * from tienda_generica.empleados where cedula_empleado=?";
			ps = con.prepareStatement(sql);
			ps.setLong(1, cedula_empleado);
			res = ps.executeQuery();
			while(res.next()) {
				emp = new EmpleadoDTO(res.getLong(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5));
			}
		}catch(SQLException e) {
			JOptionPane.showMessageDialog(null, "Error al Consultar " + e);
		}
		
		return emp;
		
	}
	
	
}
