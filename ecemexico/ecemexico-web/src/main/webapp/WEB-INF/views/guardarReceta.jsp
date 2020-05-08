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
		<h1>Generar Receta M�dica</h1>
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
		<a href="mostrarRecetas?idPaciente=<c:out value='${idPaciente}'/>" class='btn btn-block btn-primary btn-default'>Recetas M�dicas</a> 
		</div>
		<div class="well lead">Generar Receta M�dica  (*)Campos obligatorios</div>
	 	<form:form method="POST" modelAttribute="receta" class="form-horizontal" action="generarReceta" onsubmit="this.form.reset();">
		 <form:errors path = "*" cssClass = "errorblock" element = "div" />
			<div class="row">
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="curp">Expediente</label>
					<div class="col-md-7">
						<form:input type="text" path="idPaciente" id="idPaciente" class="form-control input-sm"  readonly="true"
						 value="${idPaciente}"/>
						
					</div>
				</div>
			</div>
			<div class="row">
				<div class="form-group col-md-7">
					<label class="col-md-3 control-lable" for="nombreDoctor">M�dico</label>
					<div class="col-md-7">
						<form:input type="text" path="nombreDoctor" id="nombreDoctor" class="form-control input-sm"  />
					</div>
				</div>
			</div>	
			<div class="row">
				<div class="form-group col-md-7">
			
					<div class="col-md-7">
						<input id="agregarMedicamento" type="button" value="Agregar Medicamento" class="btn btn-primary btn-sm" />
					    	<input type="submit" value="Generar Receta" class="btn btn-primary btn-sm"   />
					</div>
				</div>
			</div>
				
				<div id='TextBoxesGroup'>
				
				
				</div>
			  
		</form:form>
		</div>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){



    var counter = 0;

    

    $("#agregarMedicamento").click(function () {

            

       
        

        var newTextBoxDiv = $(document.createElement('div')).attr("id", 'TextBoxDiv' + counter);

           /*
          
            newTextBoxDiv.after().html('<label>Textbox #'+ counter + ' : </label>' +

            '<input type="text" name="textbox' + counter + 

            '" id="textbox' + counter + '" value="" >');
           */
        
           newTextBoxDiv.after().html(
' <label class="col-md-3 control-lable" for="medicamento'+counter+'">Medicamento'+counter+
'</label><input id="medicamento['+counter+']" name="medicamento['+counter+']" type="text" class="form-control input-sm" value="" required />'+
'<label class="col-md-3 control-lable" for="dosis'+counter+'">Dosis'+counter+
'</label><input id="dosis['+counter+']" name="dosis['+counter+']" type="text" class="form-control input-sm" value="" required />'+
' <label class="col-md-3 control-lable" for="duracion'+counter+'">Duraci�n'+counter+
'</label><input id="duracion['+counter+']" name="duracion['+counter+']" type="text" class="form-control input-sm" value="" required />'+
' <label class="col-md-3 control-lable" for="notas'+counter+'">Notas'+counter+
'</label><input id="notas['+counter+']" name="notas['+counter+']" type="text" class="form-control input-sm" value=""  />');

        
        
        
        
        newTextBoxDiv.appendTo("#TextBoxesGroup");

            

        counter++;

    });



    

    

  
         
         
});</script>


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