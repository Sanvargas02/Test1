<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ejemplo Grupo 31</title>
</head>
<body>
<form action="ContEjerc1" method="post">
<div><label>Lado A: </label><input type="number" name="ladoA"></div>
<div><label>Lado B: </label><input type="number" name="ladoB"></div>
<div><label>Lado C: </label><input type="number" name="ladoC"></div>
<div><input type="submit" name="enviar"></div>
</form>
<hr>
<% 
String res= request.getParameter("t");
%>
<div>Respuesta: <%=res %> </div>
</body>
</html>