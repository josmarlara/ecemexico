<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="_csrf" content="${_csrf.token}"/>
<meta name="_csrf_header" content="${_csrf.headerName}"/>
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
               <li><a href="<c:url value="/logout" />">Salir</a></li>
            </ul>
           
          </div><!--/.nav-collapse -->
        </div><!--/.container-fluid -->
      </nav>

      <!-- Main component for a primary marketing message or call to action -->
      <div class="jumbotron">
      <h1>Selecciona el criterio de búsqueada</h1>
      <form action="buscarExpediente.jsp" method="post">
      <select id="status" name="status" onChange="mostrar(this.value);">
       <option value="">Selecciona opción</option>
        <option value="Expediente">Número de expediente</option>
        <option value="CURP">CURP</option>
        <option value="Nombre">Nombre Completo</option>
      </select>
      </form>
      <div id="Expediente"  style="display: none;" >
      <h2>Criterio de búsqueda por número de expediente</h2>
      <form id="buscar">
      <table>
      
      <tr><td>Número expediente:</td><td><input type="text"  id="usuario"  size="40" /></td></tr>
      <tr><td colspan="2"><input type="submit" value="Buscar Expediente"class="btn btn-block btn-primary btn-default"  />
     </td></tr>
      
      </table>
      </form>
      <div id="paciente">
      
      
      </div>
      
      
      </div>
      <div id="CURP" style="display: none;">
      <h2>Criterio de búsqueda por CURP</h2>
      <form id="buscarCurp">
      <table>
      
      <tr><td>Curp:</td><td><input type="text"  id="curp"  size="40" /></td></tr>
      <tr><td colspan="2"><input type="submit" value="Buscar Expediente"class="btn btn-block btn-primary btn-default"  />
     </td></tr>
      
      </table>
      
      
      </form>
      
      
     
      <div id="pacienteCurp">
      
      
      </div>
      
      
      
      
      
      </div>
      <div id="Nombre" style="display: none;">
      <h2>Criterio de búsqueda por nombre completo</h2>
      
      <form id="buscarNombre">
      <table>
      
      <tr><td>Nombre:</td><td><input type="text"  id="nombre"  size="40" /></td></tr>
      <tr><td>Apellido Paterno:</td><td><input type="text"  id="apellidoPaterno"  size="40" /></td></tr>
      <tr><td>Apellido Materno:</td><td><input type="text"  id="apellidoMaterno"  size="40" /></td></tr>
      <tr><td colspan="2"><input type="submit" value="Buscar Expediente"class="btn btn-block btn-primary btn-default"  />
     </td></tr>
      
      </table>
      
      
      </form>
      
      
      <div id="pacienteNombre">
      
      
      </div>
      
      
      
      </div>
      
      
      
      
      </div>

    </div> <!-- /container -->






<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="js/jquery.min.js"><\/script>')</script>
     
  <script type="text/javascript">

  jQuery(document).ready(function($) {

		$("#buscar").submit(function(event) {

			// Disble the search button
		// Prevent the form from submitting via the browser.
			event.preventDefault();

			busquedaViaId();

		});

		$("#buscarCurp").submit(function(event) {

			// Disble the search button
		// Prevent the form from submitting via the browser.
			event.preventDefault();

			busquedaViaCurp();

		});


		$("#buscarNombre").submit(function(event) {

			// Disble the search button
		// Prevent the form from submitting via the browser.
			event.preventDefault();

			busquedaViaNombre();

		});

		

	});

  function busquedaViaId() {
	    var token = $("meta[name='_csrf']").attr("content");
	    var header = $("meta[name='_csrf_header']").attr("content");
		
		var idUsuario = $("#usuario").val();
		
		var curp =$("#curp").val();
		
		
		$.ajax({
			type : "GET",
			contentType : "application/json",
			url : "${pageContext.request.contextPath}/buscarExpedienteId/"+idUsuario,
			timeout : 100000,
			beforeSend : function (xhr){
	        	 xhr.setRequestHeader(header, token);
	         },
			success : function(data) {
				var respContent = ""
	                respContent +="<table id='person-list' class='table table-striped table-hover' style='width: 35%'>";
	                respContent +="<tr>";
	                respContent +="<th>ID  Expediente</th><th>Nombre</th>";
	                respContent +="<th>Apellido Paterno</th><th>Apellido Materno</th>";
	                respContent +="<th>CURP</th><th>Edad</th><th>Buscar Expediente</th>";
	                respContent +="</tr><tr>";
	                respContent +="<td>"+data.idUsuario+"</td>";
	                respContent +="<td>"+data.nombre+"</td>";
	                respContent +="<td>"+data.apellidoPaterno+"</td>";
	                respContent +="<td>"+data.apellidoMaterno+"</td>";
	                respContent +="<td>"+data.curp+"</td>";
	                respContent +="<td>"+data.edad+"</td>";
	                respContent +="<td><a href='mostrarExpediente?idUsuario="+data.idUsuario+"' class='btn btn-block btn-primary btn-default'>Mostrar Expediente</a></td>";
	                respContent +="</tr></table>";
	                
	                $("#paciente").html(respContent);   
			}
		});

	}

  function busquedaViaCurp() {
	    var token = $("meta[name='_csrf']").attr("content");
	    var header = $("meta[name='_csrf_header']").attr("content");
		
		
		
		var curp =$("#curp").val();
		
		
		$.ajax({
			type : "GET",
			contentType : "application/json",
			url : "${pageContext.request.contextPath}/buscarExpedienteCurp/"+curp,
			timeout : 100000,
			beforeSend : function (xhr){
	        	 xhr.setRequestHeader(header, token);
	         },
			success : function(datas) {
				var respContent = ""
	                respContent +="<table id='person-list' class='table table-striped table-hover' style='width: 35%'>";
	                respContent +="<tr>";
	                respContent +="<th>ID  Expediente</th><th>Nombre</th>";
	                respContent +="<th>Apellido Paterno</th><th>Apellido Materno</th>";
	                respContent +="<th>CURP</th><th>Edad</th><th>Buscar Expediente</th>";
	                respContent +="</tr>";
	                datas.forEach(function(data,index){
	                respContent +="<tr><td>"+data.idUsuario+"</td>";
	                respContent +="<td>"+data.nombre+"</td>";
	                respContent +="<td>"+data.apellidoPaterno+"</td>";
	                respContent +="<td>"+data.apellidoMaterno+"</td>";
	                respContent +="<td>"+data.curp+"</td>";
	                respContent +="<td>"+data.edad+"</td>";
	                respContent +="<td><a href='mostrarExpediente?idUsuario="+data.idUsuario+"' class='btn btn-block btn-primary btn-default'>Mostrar Expediente</a></td>";
	                respContent +="</tr>";
	                });
	                respContent +="</table>";
	                
	                $("#pacienteCurp").html(respContent);   
			}
		});

	}
  function busquedaViaNombre() {
	    var token = $("meta[name='_csrf']").attr("content");
	    var header = $("meta[name='_csrf_header']").attr("content");
		
		
		
		var nombre =$("#nombre").val();
		var apellidoPaterno =$("#apellidoPaterno").val();
		var apellidoMaterno=$("#apellidoMaterno").val();

		var data = JSON.stringify({"nombre":nombre,"apellidoPaterno":apellidoPaterno,"apellidoMaterno":apellidoMaterno});
		
		
		$.ajax({
			type : "POST",
			contentType : "application/json",
			url : "${pageContext.request.contextPath}/buscarExpedienteNombre",
			timeout : 100000,
			beforeSend : function (xhr){
	        	 xhr.setRequestHeader(header, token);
	         },
	        data : data,
			success : function(datas) {
				var respContent = ""
	                respContent +="<table id='person-list' class='table table-striped table-hover' style='width: 35%'>";
	                respContent +="<tr>";
	                respContent +="<th>ID  Expediente</th><th>Nombre</th>";
	                respContent +="<th>Apellido Paterno</th><th>Apellido Materno</th>";
	                respContent +="<th>CURP</th><th>Edad</th><th>Buscar Expediente</th>";
	                respContent +="</tr>";
	                datas.forEach(function(data,index){
	                respContent +="<tr><td>"+data.idUsuario+"</td>";
	                respContent +="<td>"+data.nombre+"</td>";
	                respContent +="<td>"+data.apellidoPaterno+"</td>";
	                respContent +="<td>"+data.apellidoMaterno+"</td>";
	                respContent +="<td>"+data.curp+"</td>";
	                respContent +="<td>"+data.edad+"</td>";
	                respContent +="<td><a href='mostrarExpediente?idUsuario="+data.idUsuario+"' class='btn btn-block btn-primary btn-default'>Mostrar Expediente</a></td>";
	                respContent +="</tr>";
	                });
	                respContent +="</table>";
	                
	                $("#pacienteNombre").html(respContent);   
			}
		});

	}
  function mostrar(id) {
      if (id == "Expediente") {
          $("#Expediente").show();
          $("#CURP").hide();
          $("#Nombre").hide();
          
      }

      if (id == "CURP") {
          $("#Expediente").hide();
          $("#CURP").show();
          $("#Nombre").hide();
          
      }

      if (id == "Nombre") {
          $("#Expediente").hide();
          $("#CURP").hide();
          $("#Nombre").show();
          
      }

  
  
  }    
  
  
  
  
  
  </script>
    <script src="js/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="js/ie10-viewport-bug-workaround.js"></script>
   
</body>
</html>