package com.example.api;

import java.util.List;

import com.example.model.TipoSangre;
import com.example.service.ITipoSangreService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tipo-sangre") /*se identifica con url haciendo un mapeo de esta forma*/
public class TipoSangreRest {

	
	@Autowired /*hacemos inyeccion de servicio*/
	private ITipoSangreService service;  /*instanciamos el servicio de tipo de sangre*/
	
	@GetMapping("") /*indicamos que es tipo get y se identifica vacio, simplemente basta con el requestMapping*/ 
	public List<TipoSangre> listarTodos(){
		return service.listarTodos();
	}
}