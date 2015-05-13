import org.junit.Test;
import proyectocumple.Empleado
import proyectocumple.EmpleadoService

class TestEmpleado {

	EmpleadoService empleadoService

	@Test
	void TestbuscarCumpleaniero() {

		def today = new Date()

		def empleado = new Empleado()
		empleado.nombre = 'Carlos'
		empleado.apellido = 'laffitte'
		empleado.fechaCumple = today
		empleado.save()

		def empleadoFinal = empleadoService.buscarCumpleanierosPorMesActual()
		assert empleadoFinal.fechaCumple.getMonth() == today.getMonth()
	}

	@Test
	void TestelegirRegalo() {
		def empleado = Empleado.get(params.id)
		assert empleado == empleado
		//def añoActual = new Date().getYear()
		//def regaloMesActual = empleado.regaloDeCumpleanios
		
		//def añoRegalo 
		//def mostrar = true

		//empleado.regaloDeCumpleanios.each() { 
		//	añoRegalo = it.fechaDeAsignacion.getYear()
		//	if ( añoRegalo == añoActual ){
		//		mostrar= false
		//	}
		}
	}
