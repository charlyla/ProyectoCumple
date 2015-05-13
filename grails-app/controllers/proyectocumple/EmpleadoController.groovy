package proyectocumple

import org.springframework.web.servlet.ModelAndView

class EmpleadoController {

	EmpleadoService empleadoService

	def scaffold = true

//	static allowedMethods = [elegirRegalo: 'POST',
//							 asignarRegalo: 'POST']


	def buscarCumpleaniero() {
		def listaEmpleadosCumple = empleadoService.buscarCumpleanierosPorMesActual()
		[listaEmpleadosCumple: listaEmpleadosCumple]
	//	return new ModelAndView ('/proyectocumplevista/cumpleDelMes', [listaEmpleadosCumple: listaEmpleadosCumple])
	}


	def elegirRegalo() {
		def empleado = Empleado.get(params.id)

		def añoActual = new Date().getYear()
		def regaloMesActual = empleado.regaloDeCumpleanios
		
		def añoRegalo 
		def mostrar = true

		empleado.regaloDeCumpleanios.each() { 
			añoRegalo = it.fechaDeAsignacion.getYear()
			if ( añoRegalo == añoActual ){
				mostrar= false
			}
		}

		[empleado: empleado, mostrar: mostrar, añoRegalo: añoRegalo, añoActual: añoActual]


	}


	def asignarRegalo() {
		
		def idEmpleado = params.idEmpleado
		def idRegalo = params.idRegalo

		def empleado = empleadoService.guardarRegaloEnEmpleado(idEmpleado,idRegalo)
		[empleado: empleado]

	}

	def asignarRegaloPost() {
		
		def idEmpleado = params.idEmpleado
		def idRegalo = params.idRegalo



		def empleado = Empleado.get(idEmpleado)

		// empleado.regaloDeCumpleanios.add(regalo)



		[empleado: empleado,idRegalo: idRegalo]
	//	return new ModelAndView ('/proyectocumplevista/mostrarRegaloAsignado', [empleado: empleado])

	}

	def confirmacionDeGuardado() {
		
		def idEmpleado = params.idEmpleado
		def idRegalo = params.idRegalo

		def empleado = empleadoService.guardarRegaloEnEmpleado(idEmpleado,idRegalo)
		
		[empleado: empleado]
	//	return new ModelAndView ('/proyectocumplevista/mostrarRegaloAsignado', [empleado: empleado])

	}


}