<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!String mensaje=""; 
long cedula_empleado=0;
String nombre_empleado="", email_empleado="", empleado="", contrasena="", estado="";
%>
<h1>Modulo Proveedores</h1>
<hr>
<%
//Sirve como una validación del botón Consultar
if(request.getParameter("cedula_empleado")!=null){
cedula_empleado = Long.parseLong(request.getParameter("cedula_empleado"));
nombre_empleado = request.getParameter("nombre_empleado");
email_empleado = request.getParameter("email_empleado");
empleado = request.getParameter("empleado");
contrasena = request.getParameter("contrasena");
estado = "disabled";
}
%>
<%
//Sirve como una validación del botón crear, actualizar y eliminar
if(request.getParameter("men")!=null){
cedula_empleado = 0;
nombre_empleado = "";
email_empleado = "";
empleado = "";
contrasena = "";
estado = "";
mensaje= request.getParameter("men");
out.print("<script>alert('"+mensaje+"');</script>");//Mensaje con alert js
}
%>
<form action="Proveedor" method="post">
<fieldset>
<legend>Datos del Empleado</legend>
<div><label>NIT: </label><input type="number" name="nitproveedor" value="<%=cedula_empleado%>" required <%=estado %>></div>
<input type="hidden" name="ced_empleado" value="<%=cedula_empleado%>">
<div><label>Nombre Proveedor: </label><input type="text" name="nombre_proveedor" value="<%=nombre_empleado%>" required></div>
<div><label>Direccion: </label><input type="text" name="direccion_proveedor" value="<%=email_empleado%>" required></div>
<div><label>Telefono: </label><input type="text" name="telefono_proveedor" value="<%=empleado%>" required></div>
<div><label>Ciudad: </label><input type="text" name="ciudad_proveedor" value="<%=contrasena%>" required></div>
<div>
<input type="submit" name="crear" value="Crear">
<input type="submit" name="actualizar" value="Actualizar">
<input type="submit" name="borrar" value="Borrar">
</div>
</fieldset>
</form>

<form action="Proveedor" method="post">
<fieldset>
<legend>Consultar</legend>
<div><label>Cedula: </label><input type="number" name="cedula" required></div>
<input type="submit" name="consultar" value="Consultar">
</fieldset>
</form>

</body>
</html>