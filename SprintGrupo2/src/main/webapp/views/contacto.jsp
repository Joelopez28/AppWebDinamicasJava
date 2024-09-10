<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Contacto</title>
    <link rel="stylesheet" type="text/css" href="css/style2.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
    <header>
        <%@include file="navbar.jsp" %>
    </header>
    <div class="container">
        <h1 class="mt-5">Contacto</h1>

        <!-- Mostrar mensaje de éxito o error si existen -->
        <%
            String mensajeExito = (String) request.getAttribute("mensajeExito");
            String errorMensaje = (String) request.getAttribute("errorMensaje");
            if (mensajeExito != null) {
        %>
            <div class="alert alert-success" role="alert">
                <%= mensajeExito %>
            </div>
        <% } else if (errorMensaje != null) { %>
            <div class="alert alert-danger" role="alert">
                <%= errorMensaje %>
            </div>
        <% } %>

        <!-- Formulario de contacto -->
        <form action="Contacto" method="post">
            <div class="form-group">
                <label for="nombre">Nombre:</label>
                <input type="text" class="form-control" id="nombre" name="nombre" required>
            </div>
            <div class="form-group">
                <label for="correo">Correo:</label>
                <input type="email" class="form-control" id="correo" name="correo" required>
            </div>
            <div class="form-group">
                <label for="consulta">Consulta:</label>
                <textarea class="form-control" id="consulta" name="consulta" required></textarea>
            </div>
            <button type="submit" class="btn btn-primary">Enviar</button>
        </form>
    </div>
    <%@include file="footer.jsp" %>
    <script src="/js/funciones.js"></script>
    <script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
</body>
</html>
