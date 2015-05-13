package proyectocumple

class Empleado {
	
	int id
	String nombre
	String apellido
	Date fechaCumple
//	String regaloDeCumpleanios
	static hasMany = [regaloDeCumpleanios: Regalo]

    
	
}