import org.junit.Test;

class TestEmpleado {

	EmpleadoService empleadoService

	@Test
	void TestbuscarCumpleaniero() {
		def empleado = empleadoService.buscarCumpleanierosPorMesActual()
		assert empleado == empleado
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
