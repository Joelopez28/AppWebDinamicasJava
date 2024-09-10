<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Listado de Usuario</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="style.css">
</head>
<body>
	<header>
	<%@include file="navbar.jsp" %>
	</header>
	
    <div class="container mt-4">
        <h2 class="mb-4">Lista de Usuarios</h2>
        <table class="table table-striped table-bordered">
            <thead class="thead-dark">
                <tr>
                    <th>Nombre</th>
                    <th>Fecha de Nacimiento</th>
                    <th>Run</th>
                    <th>Tipo</th>
                    <th>Acciones</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="usuarios" items="${listUsuarios}">
                    <tr>
                        <td>${usuario.nombre}</td>
                        <td>${usuario.fechaNacimiento}</td>
                        <td>${usuario.run}</td>
                        <td>${usuario.tipo}</td>
                        <td>
                            <a href="ClienteServlet?action=edit&id=${usuario.id}" class="btn btn-warning btn-sm">Editar</a>
                            <a href="ClienteServlet?action=delete&id=${usuario.id}" class="btn btn-danger btn-sm" onclick="return confirm('¿Estás seguro de que deseas eliminar este cliente?');">Eliminar</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
      <%@include file="footer.jsp" %>
</body>
</html>