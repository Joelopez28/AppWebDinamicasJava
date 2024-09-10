<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Creación Profesional</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <header>
        <%@ include file="navbar.jsp" %>
    </header>
    <div class="container mt-5">
        <h1 class="text-center">Crear Profesional</h1>
        <form action="guardarProfesional" method="post" class="mt-4">
            <div class="form-group">
                <label for="nombre">Titulo:</label>
                <input type="text" id="titulo" name=""titulo"" class="form-control" required>
            </div>
            <div class="form-group">
                <label for="apellidoCliente">Fecha de Ingreso:</label>
                <input type="text" id="fechaIngreso" name=""fechaIngreso"" class="form-control" required>
            </div>
            <div class="mt-3">
                <button type="submit" class="btn btn-primary">Guardar Profesional</button>
                <a href="formulariousr" class="btn btn-secondary">Volver</a>
            </div>
        </form>
    </div>
    <%@ include file="footer.jsp" %>
    <script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.7/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"></script>
</body>
</html>
