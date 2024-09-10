<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Página de Inicio Empresa de Asesorías</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>

    <!-- Ruta ajustada al archivo CSS -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
 <header>
 <%@include file="navbar.jsp" %>
 </header>
    <div class="container text-center --bs-primary">
         <h1 class="display-4">Bienvenido al Portal de Prevención de Riesgos</h1>
         <p class="lead">Aquí encontrarás información relevante sobre los proyectos en curso.</p>
    </div>

<div id="carouselExampleIndicators" class="carousel slide" data-bs-ride="carousel">
  <ol class="carousel-indicators">
    <li data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active"></li>
    <li data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1"></li>
    <li data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2"></li>
  </ol>
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="https://www.blog-qhse.com/hs-fs/hubfs/AdobeStock_118020918%20(2).jpeg?width=3025&name=AdobeStock_118020918%20(2).jpeg" class="d-block w-100" alt="Primera imagen">
    </div>
    <div class="carousel-item">
      <img src="https://enlinea.santotomas.cl/web/wp-content/uploads/sites/2/2015/07/prevencion.jpg" class="d-block w-100" alt="Segunda imagen">
    </div>
    <div class="carousel-item">
      <img src="https://www.cftsanagustin.cl/wp-content/uploads/2019/09/IMG_1030-Enhanced-NR_LQ-para-web-1536x1024.jpg" class="d-block w-100" alt="Tercera imagen">
    </div>
  </div>
  <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-bs-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Anterior</span>
  </a>
  <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-bs-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Siguiente</span>
  </a>
</div> 

    <%@include file="footer.jsp" %>
    
<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>