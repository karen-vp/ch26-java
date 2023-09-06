package org.generation.saludo.app.controller;

import org.springframework.web.bind.annotation.*;

/*
 * @RestController indica que la clase será un controlador
 * API REST(Representational State Transfer), y también indica
 * que va a ser serilizable,
 * esta anotacion combina @Controller y @ResponseBody
 * 
 * @Controller Indica la clase como un controlador MVC
 * (Model-View-Controller).
 * Esta clase se encarga de manejar las solicitudes HTTP
 * y devuelve una respuesta.
 * 
 * @ResponseBody Indica que los métodos devuelven la respuesta
 * en el cuerpo de la respuesta HTTP. Los objetos devueltos
 * por los métodos se serializan automaticamente en el
 * formato deseado. Por default la respuesta es en JSON.
 * 
 * @RequestMapping mapea una solicitud HTTP en la url indicada
 * Se puede aplicar a nivel de clase o método.
 * A nivel de clase define el prefijo común de la URL para todas
 * las rutas de los métodos.
 */

@RestController
@RequestMapping("api/saludo") // http://localhost:8080/api/saludo
public class SaludoController {
	/*
	 * @GetMapping mapea solicitudes HTTP GET
	 * entre parentesís se indica la ruta donde se mapeará.
	 * A esta ruta se incluye el prefijo definido con 
	 * @RequestMapping en la clase.
	 * 
	 */
	
	@GetMapping("ch26") // http://localhost:8080/api/saludo/ch26
	public String saludoCh26() {
		return "Hola mundo y Ch26";
	}
	
	/*
	 * No se pueden tener metodos iguales sobre la misma
	 * ruta, no se puede tener dos métodos get en una
	 * misma ruta, porque no va a saber cuál método tomar
	 * es, decir ponerle solo @GetMapping sin una ruta especifica
	 */

	
}
