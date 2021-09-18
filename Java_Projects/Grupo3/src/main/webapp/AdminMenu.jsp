<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Menu</title>
</head>
<body>
	<h1>Menu Principal</h1>
    <%
    String nombre= request.getParameter("nom");
    %>
    <h2>Bienvenido: <%=nombre %></h2>
    <ul>
        <li><a href="Empleados.jsp">Empleados</a></li>
        <li>Clientes</li>
        <li>Proveedores</li>
        <li>Productos</li>
        <li>Ventas</li>
        <li>Reportes</li>
    </ul>
</body>
</html>