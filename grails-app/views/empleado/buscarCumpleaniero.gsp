<html>

<head>
<asset:javascript src="application.js"/>
</head>

<body>

<table border=1>
		
	Lista de personas que cumplen años este mes
</br>
	<br>
	Dale click al nombre para asignar un regalo o ver su historial

	</br>

		<td>Nombre Empleado</td>  	<td>Fecha de Cumpleaños</td> 
		
	<g:each in="${listaEmpleadosCumple}" var="empleado">
		<tr>
		
 		<!--	<td> <a href="/ProyectoCumple/empleado/elegirRegalo?idEmpleado=${empleado.id}"> ${empleado.nombre} </a>  </td>  -->

 			<td> <a href="${createLink(controller:"empleado", action:"elegirRegalo", id: empleado.id)}"> ${empleado.nombre} </a>  </td> 
			
		
 		<!--	
			<td> <g:link controller="empleado"  action="elegirRegalo" params="${[idEmpleado: empleado.id]}"> ${empleado.nombre} </g:link>  </td> 
		-->

			<td> ${empleado.fechaCumple} </td> 

		</tr>
	</g:each>
		
</table>

</br>
</br>

<label>Busca Empleados por el Nombre a traves de un servicio REST</label>
<br>
	
	<input type="text" id="nombre" name="nombre" value=""/> 
	<input type="button" name="Submit" value="Buscar" onclick="enviar();"/>


<div id ="contenedor">
</div>
<br>
</br>
</br>
</br>
</br>
<label>Formulario de alta por REST</label>
	<br>
	<br>
	<g:form>
		<label>Datos del empleado</label>
		<br>
		<br>
		<label>Nombre:</label>
		<g:field type="text" name="nombre"/>
		<br>
		<label>Apellido:</label>
		<g:field type="text" name="apellido"/>
		<br>
		<label>Fecha de nacimiento</label>
		<g:datePicker precision="day" name="fecha"/>
		<br>
		<br>
		<g:field type="submit" name="confirmar" value="Guardar" onclick="guardar();"/>
	</g:form>

	<td> <g:link controller="Login"  action="logout"> Logout </g:link>  </td> 
</body>


<script>


function enviar(){
	console.log("enviar");
	var nombre = $("#nombre").val();

	console.log("nombre", nombre);

	var request = $.ajax({
  		url: "${createLink(controller: "EmpleadoRest", action: "search")}",
		data: { nombre: nombre }
	});
 
	request.done(function( data ) {
		console.log("done", data);
		var str

			$("#contenedor").empty();
			data.forEach(function(item) {
				str = item.nombre + " " + item.apellido + " " + "<br>";
				$("#contenedor").append(str);
			})
	});
 
	request.fail(function( jqXHR, textStatus ) {
		alert( "Request failed: " + textStatus );
	});
}
</script>
</html>




