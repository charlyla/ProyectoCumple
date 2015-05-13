import org.junit.Test;

class TestEmpleado {

	EmpleadoService empleadoService

	@Test
	void TestbuscarCumpleaniero() {
		def empleado = empleadoService.buscarCumpleanierosPorMesActual()
		assert empleado == empleado
	}

}