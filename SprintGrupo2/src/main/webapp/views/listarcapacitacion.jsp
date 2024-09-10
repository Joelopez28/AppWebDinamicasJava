<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="modelo.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Listado de Capacitaciones</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="style.css">
</head>
<body>
	<header>
	<%@include file="navbar.jsp" %>
	</header>
	
    <div class="container mt-5">
        <h1 class="text-center">Listado de Capacitaciones</h1>
        <table class="table table-striped mt-4">
            <thead class="thead-dark">
                <tr>
                    <th>Tema</th>
                    <th>Descripción</th>
                </tr>
            </thead>
            
            <tbody>
		
		<c:forEach var="p" items="${capacitaciones}" >		
			<tr>
				<td><c:out value="${p.getNombreCapacitacion()}"></c:out></td>
				<td><c:out value="${p.getDetalle()}"></c:out></td>
			</tr>
		</c:forEach>
		
		
		
		</tbody>
        </table>
    </div>
      <%@include file="footer.jsp" %>
</body>
</html>