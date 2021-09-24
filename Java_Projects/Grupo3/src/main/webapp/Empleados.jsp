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
<h1>Modulo Empleados</h1>
<hr>
<%
//Trae los datos de la consulta y hace una validación
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
//Sirve como una validación de la actualización y del botón crear
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
<form action="Empleado" method="post">
<fieldset>
<legend>Datos del Empleado</legend>
<div><label>Cedula: </label><input type="number" name="cedula_empleado" value="<%=cedula_empleado%>" required <%=estado %>></div>
<input type="hidden" name="ced_empleado" value="<%=cedula_empleado%>">
<div><label>Nombre Completo: </label><input type="text" name="nombre_empleado" value="<%=nombre_empleado%>" required></div>
<div><label>Correo Electronico: </label><input type="text" name="email_empleado" value="<%=email_empleado%>" required></div>
<div><label>Usuario: </label><input type="text" name="empleado" value="<%=empleado%>" required></div>
<div><label>Contrasena: </label><input type="password" name="contrasena" value="<%=contrasena%>" required></div>
<div>
<input type="submit" name="crear" value="Crear">
<input type="submit" name="actualizar" value="Actualizar">
<input type="submit" name="borrar" value="Borrar">
</div>
</fieldset>
</form>

<form action="Empleado" method="post">
<fieldset>
<legend>Consultar</legend>
<div><label>Cedula: </label><input type="number" name="cedula" required></div>
<input type="submit" name="consultar" value="Consultar">
</fieldset>
</form>

</body>
</html>