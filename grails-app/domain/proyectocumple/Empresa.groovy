package proyectocumple

class Empresa {
        String nombreempresa
        static hasMany = [empleado: Empleado, usuario: Usuario]
       

}
