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
		<h1>Crear expediente</h1>
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
		<div class="well lead">Registrar Paciente  (*)Campos obligatorios</div>
	 	<form:form method="POST" modelAttribute="expediente" class="form-horizontal" action="guardarPaciente">
		 <form:errors path = "*" cssClass = "errorblock" element = "div" />
			<div class="row">
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="curp">CURP</label>
					<div class="col-md-7">
						<form:input type="text" path="curp" id="curp" class="form-control input-sm"/>
						
					</div>
				</div>
			</div>
	        
	        <div class="row">
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="nombre">Nombre(*)</label>
					<div class="col-md-7">
						<form:input type="text" path="nombre" id="nombre" class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="nombre" class="help-inline"/>
						</div>
					</div>
				</div>
			</div>
	        
	        <div class="row">
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="apellidoPaterno">Apellido Paterno(*)</label>
					<div class="col-md-7">
						<form:input type="text" path="apellidoPaterno" id="apellidoPaterno" class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="apellidoPaterno" class="help-inline"/>
						</div>
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
					<label class="col-md-3 control-lable" for="nivelSocioeconomico">Nivel Socioeconómico</label>
					<div class="col-md-7">
						<form:input type="text" path="nivelSocioeconomico" id="nivelSocioeconomico" class="form-control input-sm" />
						
					</div>
				</div>
			</div>
			
			
			<div class="row">
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="vivienda">Vivienda</label>
					<div class="col-md-7">
						<form:input type="text" path="vivienda" id="vivienda
						" class="form-control input-sm" />
						
					</div>
				</div>
			</div>
			
			<div class="row">
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="tipoSangre">Tipo de sangre</label>
					<div class="col-md-7">
						<form:select path="tipoSangre" id="tipoSangre">
					   <form:options items="${tipoSangreMap}" />
						
						
						</form:select>
						
					</div>
				</div>
			</div>
			
			
			<div class="row">
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="discapacidad">Discapacidad</label>
					<div class="col-md-7">
						<form:input type="text" path="discapacidad" id="discapacidad" 
						class="form-control input-sm" />
						
					</div>
				</div>
			</div>
			
			
			<div class="row">
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="grupoEtnico">Grupo Etnico</label>
					<div class="col-md-7">
						<form:input type="text" path="grupoEtnico" id="grupoEtnico" 
						class="form-control input-sm" />
						
					</div>
				</div>
			</div>
			
			<div class="row">
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="religion">Religión</label>
					<div class="col-md-7">
						<form:input type="text" path="religion" id="religion" 
						class="form-control input-sm" />
						
					</div>
				</div>
			</div>
			
	        <div class="row">
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="sexo">Sexo(*)</label>
					<div class="col-md-7">
						<form:input type="text" path="sexo" id="sexo" 
						class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="sexo" class="help-inline"/>
						</div>
					</div>
				</div>
			</div>
			
			
			
			<div class="row">
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="edad">Edad</label>
					<div class="col-md-7">
						<form:input type="text" path="edad" id="edad" 
						class="form-control input-sm" />
						
					</div>
				</div>
			</div>
			
			
			<div class="row">
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="calle">Calle</label>
					<div class="col-md-7">
						<form:input type="text" path="calle" id="calle" 
						class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="calle" class="help-inline"/>
						</div>
					</div>
				</div>
			</div>
			
			
			<div class="row">
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="numeroExterior">Número Exterior(*)</label>
					<div class="col-md-7">
						<form:input type="text" path="numeroExterior" id="numeroExterior" 
						class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="numeroExterior" class="help-inline"/>
						</div>
					</div>
				</div>
			</div>
			
			
			<div class="row">
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="numeroInterior">Número Interior</label>
					<div class="col-md-7">
						<form:input type="text" path="numeroInterior" id="numeroInterior" 
						class="form-control input-sm" />
					</div>
				</div>
			</div>
			
			<div class="row">
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="estado">Estado(*)</label>
					<div class="col-md-7">
						<form:input type="text" path="estado" id="estado" 
						class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="estado" class="help-inline"/>
						</div>
					</div>
				</div>
			</div>
			
			
			<div class="row">
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="municipio">Municipio(*)</label>
					<div class="col-md-7">
						<form:input type="text" path="municipio" id="municipio" 
						class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="municipio" class="help-inline"/>
						</div>
					</div>
				</div>
			</div>
			
			<div class="row">
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="localidad">Localidad</label>
					<div class="col-md-7">
						<form:input type="text" path="localidad" id="localidad" 
						class="form-control input-sm" />
						
					</div>
				</div>
			</div>
			
			
			
			<div class="row">
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="colonia">Colonia(*)</label>
					<div class="col-md-7">
						<form:input type="text" path="colonia" id="colonia" 
						class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="colonia" class="help-inline"/>
						</div>
					</div>
				</div>
			</div>
			
			
			<div class="row">
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="codigoPostal">Código Postal</label>
					<div class="col-md-7">
						<form:input type="text" path="codigoPostal" id="codigoPostal" 
						class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="codigoPostal" class="help-inline"/>
						</div>
					</div>
				</div>
			</div>
			
			
			<div class="row">
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="telefonoFijo">Teléfono Fijo</label>
					<div class="col-md-7">
						<form:input type="text" path="telefonoFijo" id="telefonoFijo" 
						class="form-control input-sm" />
					</div>
				</div>
			</div>
		
			<div class="row">
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="telefonoMovil">Teléfono Movil</label>
					<div class="col-md-7">
						<form:input type="text" path="telefonoMovil" id="telefonoMovil" 
						class="form-control input-sm" />
					</div>
				</div>
			</div>
			
			<hr>
			<h2>Alergías</h2>
			
			
			
			
			
			<div class="row">
				<div class="form-group col-md-7">
					
		<div id='TextBoxesGroup'>
     
         
    
    

</div>
		
					
					
					
					<div class="col-md-7">
		<div><input id="agregarAlergia" type="button" value="Agregar Alergia" class="btn btn-primary btn-sm" /><br>
        <input type="submit" value="Crear expediente" class="btn btn-primary btn-sm"/>
					</div>
				</div>
			</div>
			</div>
			
			
			
			
		</form:form>
		</div>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){



    var counter = 0;

    

    $("#agregarAlergia").click(function () {

            

       
        

        var newTextBoxDiv = $(document.createElement('div')).attr("id", 'TextBoxDiv' + counter);

           /*
          
            newTextBoxDiv.after().html('<label>Textbox #'+ counter + ' : </label>' +

            '<input type="text" name="textbox' + counter + 

            '" id="textbox' + counter + '" value="" >');
           */
        
           newTextBoxDiv.after().html(
' <label class="col-md-3 control-lable" for="alergia'+counter+'">alergia'+counter+
'</label><input id="alergias['+counter+']" name="alergias['+counter+']" type="text" class="form-control input-sm" value="" required />');
        
        
        
        
        newTextBoxDiv.appendTo("#TextBoxesGroup");

            

        counter++;

    });



    

    

  
         
         
});</script>


    <script>window.jQuery || document.write('<script src="js/jquery.min.js"><\/script>')</script>
    <script src="js/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="js/ie10-viewport-bug-workaround.js"></script>

</body>
</html>