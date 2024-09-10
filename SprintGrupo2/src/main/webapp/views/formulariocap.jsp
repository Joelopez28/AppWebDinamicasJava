<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Capacitación</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
	<link rel="stylesheet" href="css/style.css">
	<link rel="stylesheet" href="js/funciones.js">
</head>
<body>
	<header>
		<%@ include file="navbar.jsp" %>
	</header>
    <div class="container mt-5">
        <h1 class="text-center">Crear Capacitación</h1>
        <form action="formulariocap" method="post" class="mt-4">
            <div class="form-group">
                <label for="tema">Tema de la Capacitación:</label>
                <input type="text" id="tema" name="tema" class="form-control" required>
            </div>
            <div class="form-group">
                <label for="descripcion">Descripción:</label>
                <textarea id="descripcion" name="descripcion" class="form-control" rows="5" required></textarea>
            </div>
            <button type="submit" class="btn btn-success btn-block">Crear</button>
        </form>
    </div>
    <%@ include file="footer.jsp" %>
    <script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
</body>
</html>
