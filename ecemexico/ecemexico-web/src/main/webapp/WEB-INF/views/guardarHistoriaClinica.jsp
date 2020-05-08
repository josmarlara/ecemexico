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
		<h1>Agregar Historia Clínica</h1>
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
		<div class="well lead">Registrar Historia Clínica  (*)Campos obligatorios</div>
	 	<form:form method="POST" modelAttribute="historia" class="form-horizontal" action="agregarHistoriaClinica">
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
					<label class="col-md-3 control-lable" for="interrogatorio">Tipo de Interrogatorio</label>
					<div class="col-md-7">
						<form:select path="interrogatorio" 
						data-toggle="tooltip" data-placement="right" title="Seleccione tipo de interrogatorio">
						<form:option value="directo"></form:option>
						<form:option value="indirecto"></form:option>
						</form:select>
					
					</div>
				</div>
			
			
			   <div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="ocupacion">Ocupación</label>
					<div class="col-md-7">
						<form:input type="text" path="ocupacion" id="ocupacion" class="form-control input-sm"
						data-toggle="tooltip" data-placement="right" title="Anotar oficio ,profesion o actividad del paciente" />
						
					</div>
				</div>
				
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="tutor">Padre o tutor</label>
					<div class="col-md-7">
						<form:input type="text" path="tutor" id="tutor" class="form-control input-sm"
						data-toggle="tooltip" data-placement="right" title="En caso de ser menor de edad o incapacitado" />
						
					</div>
				</div>
				
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="parentesco">Parentesco</label>
					<div class="col-md-7">
						<form:input type="text" path="parentesco" id="parentesco" class="form-control input-sm"
						data-toggle="tooltip" data-placement="right" title="Parentesco del tutor" />
						
					</div>
				</div>
				
				
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="enfermedadesHereditarias">Antecedentes heredo familiares</label>
					<div class="col-md-7">
						<form:textarea path="enfermedadesHereditarias"  id="enfermedadesHereditarias" 
						data-toggle="tooltip" data-placement="right" title="Preguntar enfermedades hereditarias que a
						padecido la familia" />
						
					</div>
				</div>
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="antecedentesPersonalesNoPatologicos">Antecedentes personales no patológicos</label>
					<div class="col-md-7">
						<form:textarea path="antecedentesPersonalesNoPatologicos"  id="antecedentesPersonalesNoPatologicos" 
						data-toggle="tooltip" data-placement="right" title="Anotar datos referentes a vivienda escolaridad
						alimentación, estado civil, etc." />
						
					</div>
				</div>
				
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="antecedentesPersonalesPatologicos">Antecedentes personales patológicos</label>
					<div class="col-md-7">
						<form:textarea path="antecedentesPersonalesPatologicos"  id="antecedentesPersonalesPatologicos" 
						data-toggle="tooltip" data-placement="right" title="Anotar los padecimientos que presentado el
						paciente hasta el momento actual" />
						
					</div>
				</div>
				
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="antecedentesGinecoObstetricos">Antecedentes gineco-obstétricos</label>
					<div class="col-md-7">
						<form:textarea path="antecedentesGinecoObstetricos"  id="antecedentesGinecoObstetricos" 
						data-toggle="tooltip" data-placement="right" title="Anotar los antecedentes que ha presentado la paciente
						relacionado con su aparato reproductor" />
						
					</div>
				</div>
				
				
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="padecimientoActual">Padecimiento actual</label>
					<div class="col-md-7">
						<form:textarea path="padecimientoActual"  id="padecimientoActual" 
						data-toggle="tooltip" data-placement="right" title="Anotar la sintomatología que presenta el
						paciente en la unidad médica, el motivo de la consulta y la descripción del mismo" />
						
					</div>
				</div>
			  
			    
			  
			  
			  <div class="form-group col-md-7">
					<hr />
					<div class="col-md-7">
						<h4>Interrogatorio por aparatos</h4>
						
					</div>
				</div>
			  
			  
			  <div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="sintomasCardiovasculares">Cardiovascular:</label>
					<div class="col-md-7">
						<form:textarea path="sintomasCardiovasculares"  id="sintomasCardiovasculares" 
						data-toggle="tooltip" data-placement="right" title="Anotar los sintomas cardiovasculares que refiere el paciente." />
						
					</div>
				</div>
			  
			  <div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="sintomasRespiratorios">Respiratorio:</label>
					<div class="col-md-7">
						<form:textarea path="sintomasRespiratorios"  id="sintomasRespiratorios" 
						data-toggle="tooltip" data-placement="right" title="Anotar los sintomas respiratorios que refiere el paciente." />
						
					</div>
				</div>
				
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="sintomasGastrointestinal">Gastrointestinal:</label>
					<div class="col-md-7">
						<form:textarea path="sintomasGastrointestinal"  id="sintomasGastrointestinal" 
						data-toggle="tooltip" data-placement="right" title="Anotar los sintomas gastrointestinales
						 que refiere el paciente." />
						
					</div>
				</div>
				
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="sintomasGenitourinarios">Genitourinario:</label>
					<div class="col-md-7">
						<form:textarea path="sintomasGenitourinarios"  id="sintomasGenitourinarios" 
						data-toggle="tooltip" data-placement="right" title="Anotar los sintomas genotourinarios
						 que refiere el paciente." />
						
					</div>
				</div>
				
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="sintomasHematicoLinfatico">Hemático y linfático:</label>
					<div class="col-md-7">
						<form:textarea path="sintomasHematicoLinfatico"  id="sintomasHematicoLinfatico" 
						data-toggle="tooltip" data-placement="right" title="Anotar los sintomas hemáticos y linfáticos
						 que refiere el paciente." />
						
					</div>
				</div>
				
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="sintomasEndocrinos">Endócrino:</label>
					<div class="col-md-7">
						<form:textarea path="sintomasEndocrinos"  id="sintomasEndocrinos" 
						data-toggle="tooltip" data-placement="right" title="Anotar los sintomas endócrinos
						 que refiere el paciente." />
						
					</div>
				</div>
				
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="sintomasSistemaNervioso">Nervioso:</label>
					<div class="col-md-7">
						<form:textarea path="sintomasSistemaNervioso"  id="sintomasSistemaNervioso" 
						data-toggle="tooltip" data-placement="right" title="Anotar los sintomas del sistema nervioso
						 que refiere el paciente." />
						
					</div>
				</div>
				
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="sintomasMusculoEsqueleticos">Musculoesquelético:</label>
					<div class="col-md-7">
						<form:textarea path="sintomasMusculoEsqueleticos"  id="sintomasMusculoEsqueleticos" 
						data-toggle="tooltip" data-placement="right" title="Anotar los sintomas musculo-esqueléticos
						 que refiere el paciente." />
						
					</div>
				</div>
				
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="sintomasPielMucosasAnexos">Piel, muscosas y anexo:</label>
					<div class="col-md-7">
						<form:textarea path="sintomasPielMucosasAnexos"  id="sintomasPielMucosasAnexos" 
						data-toggle="tooltip" data-placement="right" title="Anotar los sintomas que presenta en piel y mucosas
						 que refiere el paciente." />
						
					</div>
				</div>
			  <div class="form-group col-md-7">
					<hr />
					<div class="col-md-7">
						<h4>Signos vitales</h4>
						
					</div>
				</div>
			  
			  <div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="tensionArterial">Tensión Arterial</label>
					<div class="col-md-2">
						<form:input type="text" path="tensionArterial" id="tensionArterial" class="form-control input-sm"
						data-toggle="tooltip" data-placement="right" title="tensión arterial" />
						
					</div>
					<label class="col-md-3 control-lable" for="temperatura">Temperatura</label>
					<div class="col-md-2">
						<form:input type="text" path="temperatura" id="temperatura" class="form-control input-sm"
						data-toggle="tooltip" data-placement="right" title="temperatura" />
						
					</div>
					<label class="col-md-3 control-lable" for="frecuenciaCardiaca">Frecuencia cardiaca</label>
					<div class="col-md-2">
						<form:input type="text" path="frecuenciaCardiaca" id="frecuenciaCardiaca" class="form-control input-sm"
						data-toggle="tooltip" data-placement="right" title="frecuencia cardiaca" />
						
					</div>
					<label class="col-md-3 control-lable" for="frecuenciaRespiratoria">Frecuencia respiratoria</label>
					<div class="col-md-2">
						<form:input type="text" path="frecuenciaRespiratoria" id="frecuenciaRespiratoria" class="form-control input-sm"
						data-toggle="tooltip" data-placement="right" title="frecuencia respiratoria" />
						
					</div>
					<label class="col-md-3 control-lable" for="peso">Peso</label>
					<div class="col-md-2">
						<form:input type="text" path="peso" id="peso" class="form-control input-sm"
						data-toggle="tooltip" data-placement="right" title="peso" />
						
					</div>
					<label class="col-md-3 control-lable" for="talla">Talla</label>
					<div class="col-md-2">
						<form:input type="text" path="talla" id="talla" class="form-control input-sm"
						data-toggle="tooltip" data-placement="right" title="talla" />
						
					</div>
					<label class="col-md-3 control-lable" for="glucosa">Glucosa</label>
					<div class="col-md-2">
						<form:input type="text" path="glucosa" id="glucosa" class="form-control input-sm"
						data-toggle="tooltip" data-placement="right" title="talla" />
						
					</div>
			</div>
			<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="exploracionFisica">Exploración física:</label>
					<div class="col-md-7">
						<form:textarea path="exploracionFisica"  id="exploracionFisica" 
						data-toggle="tooltip" data-placement="right" title="Describa la apariencia externa que muestra el paciente." />
						
					</div>
				</div>
			  <div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="resultadosAntActLaboratorio">Resultados previos y actuales de laboratorio, gabinete y otros:</label>
					<div class="col-md-7">
						<form:textarea path="resultadosAntActLaboratorio"  id="resultadosAntActLaboratorio" 
						data-toggle="tooltip" data-placement="right" title="Anotar resultados anteriores y actuales de los
						diferentes estudios de laboratorio y gabinete, y todos que le hayan practicado 
						al paciente." />
						
					</div>
				</div>
			  <div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="diagnostico">Diagnóstico o problemas físicos:</label>
					<div class="col-md-7">
						<form:textarea path="diagnostico"  id="diagnostico" 
						data-toggle="tooltip" data-placement="right" title="Describa el diagnóstico o los problemas y
						dificultades clínicas que presenta el paciente" />
						
					</div>
				</div>
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="farmacologico">Farmacológico:</label>
					<div class="col-md-7">
						<form:textarea path="farmacologico"  id="farmacologico" 
						data-toggle="tooltip" data-placement="right" title="Señalar la dosis, vía periocidad y duración
						de los medicamentos recetados así como el tratamiento y respuesta al mismo" />
						
					</div>
				</div>
				
				
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="pronostico">Pronóstico:</label>
					<div class="col-md-7">
						<form:textarea path="pronostico"  id="pronostico" 
						data-toggle="tooltip" data-placement="right" title="Juicio que emite el doctor respecto a la
						evolución de la enfermedad" />
						
					</div>
				</div>
				
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="nombreMedico">Nombre del médico</label>
					<div class="col-md-7">
						<form:input type="text" path="nombreMedico" id="nombreMedico" class="form-control input-sm"
						data-toggle="tooltip" data-placement="right" title="Nombre del médico que genero la historia" />
						
					</div>
				</div>
				
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="cargo">Cargo</label>
					<div class="col-md-7">
						<form:input type="text" path="cargo" id="cargo" class="form-control input-sm"
						data-toggle="tooltip" data-placement="right" title="Cargo del médico" />
						
					</div>
				</div>
				
				<div class="form-group col-md-7">
					
					<div class="col-md-7">
						<input type="submit" value="Agregar Historia" class="btn btn-primary btn-sm"/>
						
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