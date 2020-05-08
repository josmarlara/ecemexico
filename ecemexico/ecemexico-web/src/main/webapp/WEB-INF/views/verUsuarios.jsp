<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ECEMEXICO</title>
<link href="css/bootstrap.css"  rel="stylesheet"></link>
		<link href="css/navbar.css" rel="stylesheet"></link>
		<link rel="stylesheet" type="text/css" href="//cdnjs.cloudflare.com/ajax/libs/font-awesome/4.2.0/css/font-awesome.css" />
       
</head>
<body>
 <div class="container">

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
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Usuario<span class="caret"></span></a>
                <ul class="dropdown-menu">
                  <li><a href="registrarUsuarioForm">Crear Usuario</a></li>
                  <li><a href="buscarUsuarioForm">Buscar Usuario</a></li>
                 </ul>
              </li>
              <li><a href="<c:url value="/logout" />">Salir</a></li>
            </ul>
           
          </div><!--/.nav-collapse -->
        </div><!--/.container-fluid -->
      </nav>

      <!-- Main component for a primary marketing message or call to action -->
      <div class="jumbotron">
  
  <form action="buscarUsuario" >
            	<div class="row">
				<div class="form-group col-md-7">	
					  
					    <label for="email">Email</label>
                      <div class="col-md-7">
                       <input type='text' name='email' id='email'  class="form-control input-sm" required  />  
                     <button class="btn btn-primary btn-sm" type="submit" name="action">Buscar usuario</button>
					  </div>
				</div>
			</div>	  
					  
					  
					 
            	</form>
  
  
  
  
  
  
  
     
     <table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">Cedula</th>
      <th scope="col">CURP</th>
      <th scope="col">Nombre</th>
      <th scope="col">Apellido Paterno</th>
      <th scope="col">Apellido Materno</th>
      <th scope="col">Especialidad</th>
      <th scope="col">Sub Especialidad</th>
      <th scope="col">CLUES</th>
      <th scope="col">Email</th>
      <th scope="col">Rol</th>
      <th scope="col">Actualizar</th>
       <th scope="col">Eliminar</th>
    </tr>
  </thead>
  <tbody>
  
  
    <tr>
     
      <td>${usuario.cedula}</td>
      <td>${usuario.curp}</td>
      <td>${usuario.nombre}</td>
      <td>${usuario.apellidoPaterno}</td>
      <td>${usuario.apellidoMaterno}</td>
      <td>${usuario.especialidad}</td>
      <td>${usuario.subEspecialidad}</td>
      <td>${usuario.clues}</td>
      <td>${usuario.email}</td>
      <td>${usuario.rol}</td>
      <td><a href="actualizarUsuarioForm?email=<c:out value='${usuario.email}'/>"  class="btn btn-success custom-width" >Actualizar</a></td>
      <td><a href="eliminarUsuario?email=<c:out value='${usuario.email}'/>" class="btn btn-danger custom-width"  >Eliminar</a></td>
    </tr>
  
  </tbody>
</table>
     
     
     
     
     
     
     

    </div> <!-- /container -->






<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>

    <script>window.jQuery || document.write('<script src="js/jquery.min.js"><\/script>')</script>
    <script src="js/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="js/ie10-viewport-bug-workaround.js"></script>

</body>
</html>