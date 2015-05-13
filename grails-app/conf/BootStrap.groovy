import proyectocumple.Rol
import proyectocumple.Usuario
import proyectocumple.UsuarioRol
class BootStrap {
   def init = { servletContext ->
      def adminRole = new Rol(authority: 'ROLE_ADMIN').save(flush: true)
      def userRole = new Rol(authority: 'ROLE_USER').save(flush: true)
      def testUser = new Usuario(username: 'guille', password: 'campoy')
      def testUser2 = new Usuario(username: 'pepe', password: '123456')
      testUser.save(flush: true)
      testUser2.save(flush: true)
      UsuarioRol.create testUser, adminRole, true
      UsuarioRol.create testUser2, userRole, true
    
   }
}