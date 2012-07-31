class UrlMappings {

	static mappings = {
		"/$controller/$id?"(controller: "todos") {
			action = [PUT: "edit", DELETE: "delete", POST: "save"]
		}
		
		"/"(uri:"/index.html")
		"500"(view:'/error')
	}
}
