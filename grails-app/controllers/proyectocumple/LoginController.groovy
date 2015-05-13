package proyectocumple
import grails.plugin.springsecurity.SpringSecurityUtils

class LoginController {
	def logout() {
	session.invalidate()
	redirect uri: SpringSecurityUtils.securityConfig.logout.filterProcessesUrl

	}

}