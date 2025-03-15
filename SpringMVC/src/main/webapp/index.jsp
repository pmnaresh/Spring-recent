<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Spring MVC project</title>
</head>
<body>

<%for(int i=1;i<=10;i++){ %>
<% out.print(1+ " * "+i+" = "+i*1); %>
<br>
<%} %>

</body>
</html>