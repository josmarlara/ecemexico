<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AgregarPaciente</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link href="css/navbar.css" rel="stylesheet"></link>
		<link rel="stylesheet" type="text/css" href="//cdnjs.cloudflare.com/ajax/libs/font-awesome/4.2.0/css/font-awesome.css" />
<link href="css/app.css" rel="stylesheet"></link>
<style>
    
      .errorblock {
         color: #000;
         background-color: #ffEEEE;
         border: 3px solid #ff0000;
         padding: 8px;
         margin: 16px;
      }
   </style>
</head>
<body>

<div class="container">
		<h1>Crear Usuario</h1>
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
		<div class="well lead">Registrar Usuario  (*)Campos obligatorios</div>
	 	<form:form method="POST" modelAttribute="usuario" class="form-horizontal" action="guardarUsuario">
		 <form:errors path = "*" cssClass = "errorblock" element = "div" />
			<div class="row">
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="cedula">Cédula</label>
					<div class="col-md-7">
						<form:input type="text" path="cedula" id="cedula" class="form-control input-sm"/>
						
					</div>
				</div>
			</div>
	        
	        <div class="row">
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="curp">CURP</label>
					<div class="col-md-7">
						<form:input type="text" path="curp" id="curp" class="form-control input-sm" />
					</div>
				</div>
			</div>
			
			
			<div class="row">
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="nombre">Nombre</label>
					<div class="col-md-7">
						<form:input type="text" path="nombre" id="nombre" class="form-control input-sm" />
					</div>
				</div>
			</div>
			
			
	        
	        <div class="row">
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="apellidoPaterno">Apellido Paterno</label>
					<div class="col-md-7">
						<form:input type="text" path="apellidoPaterno" id="apellidoPaterno" class="form-control input-sm" />
					</div>
				</div>
			</div>
	        
	        <div class="row">
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="apellidoMaterno">Apellido Materno</label>
					<div class="col-md-7">
						<form:input type="text" path="apellidoMaterno" id="apellidoMaterno" class="form-control input-sm" />
						
					</div>
				</div>
			</div>
			
			
			<div class="row">
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="especialidad">Especialidad</label>
					<div class="col-md-7">
						<form:input type="text" path="especialidad" id="especialidad" class="form-control input-sm" />
						
					</div>
				</div>
			</div>
			
			
			<div class="row">
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="subEspecialidad">Subespecialidad</label>
					<div class="col-md-7">
						<form:input type="text" path="subEspecialidad" id="subEspecialidad
						" class="form-control input-sm" />
						
					</div>
				</div>
			</div>
			
		
			
			
			<div class="row">
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="clues">CLUES</label>
					<div class="col-md-7">
						<form:input type="text" path="clues" id="clues" 
						class="form-control input-sm" />
						
					</div>
				</div>
			</div>
			
			
			<div class="row">
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="email">Email</label>
					<div class="col-md-7">
						<form:input type="text" path="email" id="email" 
						class="form-control input-sm" />
						
					</div>
				</div>
			</div>
			
			<div class="row">
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="password">Password</label>
					<div class="col-md-7">
				<form:password path="password"/>
						
					</div>
				</div>
			</div>
			
			<div class="row">
	       <div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="rol">Rol</label>
					<div class="col-md-7">
						<form:select path="rol" 
						data-toggle="tooltip" data-placement="right" title="Seleccione tipo del rol">
						<form:option value="USER"></form:option>
						<form:option value="ADMIN"></form:option>
						</form:select>
					
					</div>
				</div>
			</div>
			
			
				<div class="row">	
					
					<div class="col-md-7">
		<div>        <input type="submit" value="Crear usuario" class="btn btn-primary btn-sm"/>
					</div>
				</div>
			</div>
			
			
			
			
			
		</form:form>
		</div>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>



    <script>window.jQuery || document.write('<script src="js/jquery.min.js"><\/script>')</script>
    <script src="js/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="js/ie10-viewport-bug-workaround.js"></script>
    <script type="text/javascript">
    $(function () {
  	  $('[data-toggle="tooltip"]').tooltip()
  	})
</script>

</body>
</html>