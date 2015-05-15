class UrlMappings {

	static mappings = {
		"/serviciosrest"(resources: "EmpleadoRest")
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

   //     "/"(view:"/index")
   //     "/"(view:"/empleado/buscarCumpleaniero")

        "/" {
            controller = "empleado"
            action = "buscarCumpleaniero"
        }

        "500"(view:'/error')
	}
}
