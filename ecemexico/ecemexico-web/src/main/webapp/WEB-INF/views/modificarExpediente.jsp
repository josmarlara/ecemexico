<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ModificarPaciente</title>
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
		<h1>Modificar expediente</h1>
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
		<div class="well lead">Modificar Paciente  (*)Campos obligatorios</div>
	 	<form:form method="POST" modelAttribute="expediente" class="form-horizontal" action="actualizarPaciente">
		    <div class="row">
				<div class="form-group col-md-7">
					<label for="idUsuario">Expediente: ${pacienteObj.idUsuario}</label>
					<div class="col-md-10">
					<form:hidden path="idUsuario"  value="${pacienteObj.idUsuario}"/> 
						
					</div>
				</div>
			</div>
	        <div class="row">
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="curp">CURP</label>
					<div class="col-md-7">
						<form:input type="text" path="curp" name="curp" id="curp" value="${pacienteObj.curp}" class="form-control input-sm"  />
						
					</div>
				</div>
			</div>
			
			 <div class="row">
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="nombre">Nombre(*)</label>
					<div class="col-md-7">
						<form:input type="text" path="nombre"  id="nombre" value="${pacienteObj.nombre}" class="form-control input-sm"  />
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
						<form:input type="text" path="apellidoPaterno"  id="apellidoPaterno" value="${pacienteObj.apellidoPaterno}" class="form-control input-sm"  />
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
						<form:input type="text" path="apellidoMaterno" name="apellidoMaterno" id="apellidoMaterno" value="${pacienteObj.apellidoMaterno}" class="form-control input-sm" />
						
					</div>
				</div>
			</div>
			
			<div class="row">
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="nivelSocioeconomico">Nivel Socioeconómico</label>
					<div class="col-md-7">
						<form:input type="text" path="nivelSocioeconomico" name="nivelSocioeconomico" id="nivelSocioeconomico" value="${pacienteObj.nivelSocioeconomico}" class="form-control input-sm" />
						
					</div>
				</div>
			</div>
			
			
			<div class="row">
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="vivienda">Vivienda</label>
					<div class="col-md-7">
						<form:input type="text" path="vivienda" id="vivienda" value="${pacienteObj.vivienda}" class="form-control input-sm" />
						
					</div>
				</div>
			</div>
			
			
			<div class="row">
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="tipoSangre">Tipo de sangre</label>
					<div class="col-md-7">
						<select name="tipoSangre" id="tipoSangre"  >
						<c:forEach var="sangre" items="${listCatTipoSangre}">
		               
		               
		               
		               <c:choose>
	                        <c:when test="${catTipoSangreObj.idTipoSangre == sangre.idTipoSangre}">
	                          <option value="${catTipoSangreObj.idTipoSangre}" selected>${catTipoSangreObj.tipoSangre}</option>  
	                      </c:when>
	                  <c:otherwise>
	                    <option value="${sangre.idTipoSangre}" >${sangre.tipoSangre}</option>
	                  </c:otherwise>
	
                      </c:choose>
		          </c:forEach>
					</select>
						
					</div>
				</div>
			</div>
			<div class="row">
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="discapacidad">Discapacidad</label>
					<div class="col-md-7">
						<form:input type="text" path="discapacidad" id="discapacidad" value="${pacienteObj.discapacidad}"
						class="form-control input-sm" />
						
					</div>
				</div>
			</div>
			<div class="row">
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="grupoEtnico">Grupo Etnico</label>
					<div class="col-md-7">
						<form:input type="text" path="grupoEtnico" id="grupoEtnico" value="${pacienteObj.grupoEtnico}" class="form-control input-sm" />
						
					</div>
				</div>
			</div>
			
			<div class="row">
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="religion">Religión</label>
					<div class="col-md-7">
						<form:input type="text" path="religion" id="religion" value="${pacienteObj.religion}"
						class="form-control input-sm" />
						
					</div>
				</div>
			</div>
			
			 <div class="row">
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="sexo">Sexo(*)</label>
					<div class="col-md-7">
						<form:input type="text" path="sexo" id="sexo" value="${pacienteObj.sexo}"
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
						<form:input type="text" path="edad" id="edad" value="${pacienteObj.edad}"
						class="form-control input-sm" />
						
					</div>
				</div>
			</div>
			
			
			<div class="row">
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="calle">Calle(*)</label>
					<div class="col-md-7">
						<form:input type="text" path="calle" id="calle" value="${pacienteObj.calle}"
						class="form-control input-sm"  />
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
						<form:input type="text" path="numeroExterior" id="numeroExterior" value="${pacienteObj.numeroExterior}"
						class="form-control input-sm"/>
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
						<form:input type="text" path="numeroInterior" id="numeroInterior" value="${pacienteObj.numeroInterior}"
						class="form-control input-sm" />
					</div>
				</div>
			</div>
			
			<div class="row">
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="estado">Estado(*)</label>
					<div class="col-md-7">
						<form:input type="text" path="estado" id="estado" value="${pacienteObj.estado}"
						class="form-control input-sm"  />
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
						<form:input type="text" path="municipio" id="municipio" value="${pacienteObj.municipio}"
						class="form-control input-sm"  />
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
						<form:input type="text" path="localidad" id="localidad" value="${pacienteObj.localidad}"
						class="form-control input-sm" />
						
					</div>
				</div>
			</div>
			
			
			<div class="row">
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="colonia">Colonia(*)</label>
					<div class="col-md-7">
						 <form:input type="text" path="colonia" id="colonia" value="${pacienteObj.colonia}"
						class="form-control input-sm"  />
						<div class="has-error">
							<form:errors path="colonia" class="help-inline"/>
						</div>
						
					</div>
				</div>
			</div>
			
			<div class="row">
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="codigoPostal">Código Postal(*)</label>
					<div class="col-md-7">
						<form:input type="text" path="codigoPostal" id="codigoPostal" value="${pacienteObj.codigoPostal}"
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
						<form:input type="text" path="telefonoFijo" id="telefonoFijo" value="${pacienteObj.telefonoFijo}"
						class="form-control input-sm" />
					</div>
				</div>
			</div>
			
			
			<div class="row">
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="telefonoMovil">Teléfono Movil</label>
					<div class="col-md-7">
						<form:input type="text" path="telefonoMovil" id="telefonoMovil" value="${pacienteObj.telefonoMovil}"
						class="form-control input-sm" />
					</div>
				</div>
			</div>
			
			
			<hr>
			<h2>Alergías</h2>
			
			
			<div class="row">
				<div class="form-group col-md-7">
				
				
				<c:forEach var="alergia" items="${alergiaObj.nombres}" varStatus="num">
				<form:input type="text" path="alergias2[${num.count-1}]"  id="alergias2[${num.count}-1]"  value="${alergia}"
						class="form-control input-sm" readonly="readonly" /> <br>
					
				
		
</c:forEach>
				
				<div id='TextBoxesGroup'>		
					

				</div>
			</div>
			
			<div class="col-md-7">
		<div><input id="agregarAlergia" type="button" value="Agregar Alergia" class="btn btn-primary btn-sm" /><br><br>
        <input type="submit" value="Modificar expediente" class="btn btn-primary btn-sm"/>
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