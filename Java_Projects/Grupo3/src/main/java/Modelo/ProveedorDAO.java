package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controlador.Conexion;

public class ProveedorDAO {
	
	Conexion cnn2 = new Conexion();
	Connection con2 = cnn2.Conectar();
	PreparedStatement ps2 = null;
	ResultSet res2 = null;
	
	//Método para insertar valores a la tabla
		public boolean Insertar_Proveedor(ProveedorDTO prov) {
			boolean resul = false;
			try {
				String sql = "insert into proveedores values(?,?,?,?,?)";
				ps2 = con2.prepareStatement(sql);
				ps2.setLong(1, prov.getNitproveedor());
				ps2.setString(2, prov.getCiudad_proveedor());
				ps2.setString(3, prov.getDireccion_proveedor());
				ps2.setString(4, prov.getNombre_proveedor());
				ps2.setString(5, prov.getTelefono_proveedor());
				resul = ps2.executeUpdate()>0;
			}catch(SQLException ex) {
				JOptionPane.showMessageDialog(null, "error al insertar: " + ex);
			}
			return resul;
		}
}
