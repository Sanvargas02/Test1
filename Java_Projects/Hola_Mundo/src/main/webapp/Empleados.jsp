<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Modulo Empleados</h1>
<hr>
<form action="Empleado" method="post">
<div><label>Cedula: </label><input type="number" name="cedula_empleado"></div>
<div><label>Nombre Completo: </label><input type="text" name="nombre_empleado"></div>
<div><label>Correo Electronico: </label><input type="text" name="email_empleado"></div>
<div><label>Usuario: </label><input type="text" name="empleado"></div>
<div><label>Contrasena: </label><input type="text" name="contrasena"></div>
<div><input type="submit" name="crear" value="Crear">
<input type="submit" name="consultar" value="Consultar">
<input type="submit" name="actualizar" value="Actualizar">
<input type="submit" name="borrar" value="Borrar">
</div>
</form>
</body>
</html>