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

}