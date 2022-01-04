<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index Page</title>
</head>
<body>
     Welcome to EMS !!!
     
     <a href="${pageContext.request.contextPath}/EC?action=LIST">List Employees</a>
     <a href="employee-form.jsp">Add Employee</a>
</body>
</html>