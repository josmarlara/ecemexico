<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>mostrar expediente</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link href="css/navbar.css" rel="stylesheet"></link>
		<link rel="stylesheet" type="text/css" href="//cdnjs.cloudflare.com/ajax/libs/font-awesome/4.2.0/css/font-awesome.css" />
<link href="css/app.css" rel="stylesheet"></link>

</head>
<body>

<div class="container">
		<h1>Fecha: ${historia.fecha}</h1>
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
		<a href="mostrarHistoriaClinica?idPaciente=<c:out value='${historia.idPaciente}'/>" class='btn btn-block btn-primary btn-default'>HistoriaClinica</a> 
		</div>
	 	<div class="panel panel-default">
                <!-- Default panel contents -->
              <div class="panel-heading"><span class="lead">${historia.idPaciente}</span></div>
              <div class="tablecontainer">
                  <table class="table table-hover">
                      
                      <tbody>
                          <tr>
                              <td>Unidad médica:</td> <td>${historia.unidadMedica}</td>
                          </tr>
                           <tr>
                              <td>Interrogatorio:</td> <td>${historia.interrogatorio}</td>
                          </tr>
                          <tr>
                              <td>Ocupación:</td> <td>${historia.ocupacion}</td>
                          </tr>
                          <tr>
                              <td>Tutor:</td> <td>${historia.tutor}</td>
                          </tr>
                          <tr>
                              <td>Parentesco:</td> <td>${historia.parentesco}</td>
                          </tr>
                          <tr>
                              <td>Enfermedades hereditarias:</td> <td>${historia.enfermedadesHereditarias}</td>
                          </tr>
                          <tr>
                              <td>Antecedentes personales no patológicos:</td> <td>${historia.antecedentesPersonalesNoPatologicos}</td>
                          </tr>
                          <tr>
                              <td>Antecedentes personales  patológicos:</td> <td>${historia.antecedentesPersonalesPatologicos}</td>
                          </tr>
                          <tr>
                              <td>Antecedentes Gineco-Obstétricos:</td> <td>${historia.antecedentesGinecoObstetricos}</td>
                          </tr>
                          <tr>
                              <td>Padecimiento actual:</td> <td>${historia.padecimientoActual}</td>
                          </tr>
                           <tr>
                              <td>Sintomas cardiovasculares:</td> <td>${historia.sintomasCardiovasculares}</td>
                          </tr>
                          <tr>
                              <td>Sintomas respiratorios:</td> <td>${historia.sintomasRespiratorios}</td>
                          </tr>
                          <tr>
                              <td>Sintomas gastrointestinales:</td> <td>${historia.sintomasGastrointestinal}</td>
                          </tr>
                          <tr>
                              <td>Sintomas genitourinarios:</td> <td>${historia.sintomasGenitourinarios}</td>
                          </tr>
                           <tr>
                              <td>Sintomas hemático y linfaticos:</td> <td>${historia.sintomasHematicoLinfatico}</td>
                          </tr>
                          <tr>
                              <td>Sintomas endocrinos:</td> <td>${historia.sintomasEndocrinos}</td>
                          </tr>
                          <tr>
                              <td>Sintomas sistema nervioso:</td> <td>${historia.sintomasSistemaNervioso}</td>
                          </tr>
                          <tr>
                              <td>Sintomas musculo-esqueléticos:</td> <td>${historia.sintomasMusculoEsqueleticos}</td>
                          </tr>
                          <tr>
                              <td>Sintomas piel,mucosa y anexos:</td> <td>${historia.sintomasPielMucosasAnexos}</td>
                          </tr>
                          <tr>
                              <td colspan="2">Tensión arterial: ${historia.tensionArterial} Temperatura: ${historia.temperatura}  </td>
                          </tr>
                          <tr>
                              <td colspan="2">Frecuencia cardiaca: ${historia.frecuenciaCardiaca} Frecuencia respiratoria: ${historia.frecuenciaRespiratoria}  </td>
                          </tr>
                          <tr>
                              <td colspan="2">Peso: ${historia.peso} Talla: ${historia.talla}  </td>
                          </tr>
                          <tr>
                              <td colspan="2">Glucosa: ${historia.glucosa} </td>
                          </tr>
                          <tr>
                              <td>Exploración físca:</td> <td>${historia.exploracionFisica}</td>
                          </tr>
                          <tr>
                              <td>Resultados de laboratorio:</td> <td>${historia.resultadosAntActLaboratorio}</td>
                          </tr>
                          <tr>
                              <td>Diagnostico:</td> <td>${historia.diagnostico}</td>
                          </tr>
                          <tr>
                              <td>Farmacologico:</td> <td>${historia.farmacologico}</td>
                          </tr>
                          <tr>
                              <td>Pronostico:</td> <td>${historia.pronostico}</td>
                          </tr>
                          <tr>
                              <td>Nombre Médico:</td> <td>${historia.nombreMedico}</td>
                          </tr>
                          <tr>
                              <td>Cargo:</td> <td>${historia.cargo}</td>
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