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
String nombre_empleado="", email_empleado="", empleado="", contrasena="";
%>
<h1>Modulo Empleados</h1>
<hr>
<%
if(request.getParameter("cedula_empleado")!=null){
cedula_empleado = Long.parseLong(request.getParameter("cedula_empleado"));
nombre_empleado = request.getParameter("nombre_empleado");
email_empleado = request.getParameter("email_empleado");
empleado = request.getParameter("empleado");
contrasena = request.getParameter("contrasena");
}
%>
<form action="Empleado" method="post">
<div><label>Cedula: </label><input type="number" name="cedula_empleado" value="<%=cedula_empleado%>"></div>
<div><label>Nombre Completo: </label><input type="text" name="nombre_empleado" value="<%=nombre_empleado%>"></div>
<div><label>Correo Electronico: </label><input type="text" name="email_empleado" value="<%=email_empleado%>"></div>
<div><label>Usuario: </label><input type="text" name="empleado" value="<%=empleado%>"></div>
<div><label>Contrasena: </label><input type="password" name="contrasena" value="<%=contrasena%>"></div>
<div>
<input type="submit" name="crear" value="Crear">
<input type="submit" name="consultar" value="Consultar">
<input type="submit" name="actualizar" value="Actualizar">
<input type="submit" name="borrar" value="Borrar">
</div>
</form>
<% 
if(request.getParameter("men")!=null){
mensaje= request.getParameter("men");
}
%>
<h2><%=mensaje %></h2>
</body>
</html>