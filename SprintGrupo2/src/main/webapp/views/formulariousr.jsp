<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Usuario</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <header>
        <%@include file="navbar.jsp" %>
    </header>
    <div class="container mt-5">
        <h1 class="text-center">Crear Usuario</h1>
        <form action="formulariousr" method="post" class="mt-4">
            <div class="form-group">
                <label for="nombre">Nombre del Usuario:</label>
                <input type="text" id="nombre" name="nombre" class="form-control" required>
            </div>
            <div class="form-group">
                <label for="fechaNacimiento">Fecha de Nacimiento:</label>
                <input type="text" id="fechaNacimiento" name="fechaNacimiento" class="form-control" required>
            </div>
            <div class="form-group">
                <label for="run">RUN:</label>
                <input type="text" id="run" name="run" class="form-control" required>
            </div>

            <!-- Selección del tipo de usuario -->
            <div class="form-group mt-3">
                <label for="userType">Selecciona Tipo de Usuario:</label>
                <div class="dropdown">
                    <button class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenuButton" data-bs-toggle="dropdown" aria-expanded="false">
                        Seleccionar
                    </button>
                    <ul class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                        <li><a class="dropdown-item" href="#" onclick="selectUserType('Cliente')">Cliente</a></li>
                        <li><a class="dropdown-item" href="#" onclick="selectUserType('Administrativo')">Administrativo</a></li>
                        <li><a class="dropdown-item" href="#" onclick="selectUserType('Profesional')">Profesional</a></li>
                    </ul>
                </div>
                <input type="hidden" id="userType" name="userType" required>
            </div>

            <button type="submit" class="btn btn-success mt-4">Crear</button>
        </form>
    </div>

    <%@include file="footer.jsp" %>
    <script>
        function selectUserType(type) {
            document.getElementById('dropdownMenuButton').innerText = type;
            document.getElementById('userType').value = type;
        }
    </script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.7/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"></script>
    <script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
</body>
</html>
