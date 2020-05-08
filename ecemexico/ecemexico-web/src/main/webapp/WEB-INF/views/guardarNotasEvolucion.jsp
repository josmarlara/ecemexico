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
		<h1>Agregar Nota de Evolución</h1>
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
		<div class="well lead">Registrar Nota de Evolución  (*)Campos obligatorios</div>
	 	<form:form method="POST" modelAttribute="nota" class="form-horizontal" action="agregarNotaEvolucion">
		 <form:errors path = "*" cssClass = "errorblock" element = "div" />
			<div class="row">
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="curp">Expediente</label>
					<div class="col-md-7">
						<form:input type="text" path="idPaciente" id="idPaciente" class="form-control input-sm"  readonly="true"
						 value="${idPaciente}"/>
						
					</div>
				</div>
			
	        <div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="unidadMedica">Unidad Médica</label>
					<div class="col-md-7">
						<form:input type="text" path="unidadMedica" id="unidadMedica" class="form-control input-sm"
						data-toggle="tooltip" data-placement="right" title="Anotar el nombre completo de la unidad" />
						
					</div>
				</div>
			
	       
			
			
			   <div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="edad">Edad</label>
					<div class="col-md-3">
						<form:input type="text" path="edad" id="edad" class="form-control input-sm"
						data-toggle="tooltip" data-placement="right" title="Preguntar edad del paciente" />
						
					</div>
				</div>
				
				
				
				
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="notasEvolucion">Nota de Evolución</label>
					<div class="col-md-7">
						<form:textarea path="notasEvolucion"  id="notasEvolucion" 
						data-toggle="tooltip" data-placement="right" title="Agregar la evolución del paciente" />
						
					</div>
				</div>
				
				
				<div class="form-group col-md-7">
					
					<div class="col-md-7">
						<input type="submit" value="Agregar Nota" class="btn btn-primary btn-sm"/>
						
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