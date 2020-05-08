<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Receta</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link href="css/navbar.css" rel="stylesheet"></link>
		<link rel="stylesheet" type="text/css" href="//cdnjs.cloudflare.com/ajax/libs/font-awesome/4.2.0/css/font-awesome.css" />
<link href="css/app.css" rel="stylesheet"></link>

</head>
<body>

<div class="container">
		<h1>Fecha: ${receta.fecha}</h1>
       <!-- Static navbar -->
      <!-- Static navbar -->
      <nav class="navbar navbar-default">
        <div class="container-fluid">
          <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">ECEMEXICO</a>
          </div>
          <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
              <li class="active"><a href="menu">Home</a></li>
              <li><a href="#">Contacto</a></li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Expediente<span class="caret"></span></a>
                <ul class="dropdown-menu">
                  <li><a href="registrarPaciente">Crear expediente</a></li>
                  <li><a href="buscarExpediente">Buscar Expediente</a></li>
                  <li><a href="#"></a></li>
                  <li role="separator" class="divider"></li>
                  <li class="dropdown-header">Especialidades</li>
                  <li><a href="#"></a></li>
                  <li><a href="#"></a></li>
                </ul>
              </li>
               <li><a href="<c:url value="/logout" />">Salir</a></li>
            </ul>
           
          </div><!--/.nav-collapse -->
        </div><!--/.container-fluid -->
      </nav>
		<div class="well lead">
		<a href="mostrarRecetas?idPaciente=<c:out value='${receta.idPaciente}'/>" class='btn btn-block btn-primary btn-default'>
		Regresar a recetas</a> 
		</div>
	 	<div class="panel panel-default">
                <!-- Default panel contents -->
              <div class="panel-heading"><span class="lead">${receta.idPaciente}</span></div>
              <div class="tablecontainer">
                  <table class="table table-hover">
                      
                      <tbody>
                          <tr>
                              <td>No. Receta:</td> <td>${receta.numeroReceta}</td>
                          </tr>
                           <tr>
                              <td>Nombre Doctor:</td> <td>${receta.nombreDoctor}</td>
                          </tr>
                          <tr>
                              <td>Fecha:</td> <td>${receta.fecha}</td>
                          </tr>
                          <tr>
                              <td>Medicamento:</td> <td>
                              <c:forEach var="medicamento" items="${receta.medicamento}">
		                        <c:out value="${medicamento}"></c:out><br>
	                          </c:forEach></td>
                          </tr>
                          <tr>
                              <td>Dosis:</td> <td>
                              <c:forEach var="dosis" items="${receta.dosis}">
		                        <c:out value="${dosis}"></c:out><br>
	                          </c:forEach></td>
                          </tr>
                          <tr>
                              <td>Duración:</td> <td>
                              <c:forEach var="duracion" items="${receta.duracion}">
		                        <c:out value="${duracion}"></c:out><br>
	                          </c:forEach></td>                          
	                          </tr>
	                          <tr>
                              <td>Notas:</td> <td>
                              <c:forEach var="nota" items="${receta.notas}">
		                        <c:out value="${nota}"></c:out><br>
	                          </c:forEach></td>                          
	                          </tr>
                      
                      
                      </tbody>
                  </table>
              </div>
          </div>
	 	
	 	
	 	
	 	
		</div>




    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="js/jquery.min.js"><\/script>')</script>
    <script src="js/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="js/ie10-viewport-bug-workaround.js"></script>

</body>
</html>