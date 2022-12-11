package com.example.api;

import java.util.List;

import com.example.model.TipoIdentificacion;
import com.example.service.ITipoIdentificacionServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/* Por cada modelo que necesitemos exponer como servicio web creamos una clase*/


/*cuando queramos exponer una clase como servicio web ponemos RestController*/
@RestController


@RequestMapping("/api/tipo-identificacion") /*DE que manera por url accedo a esta clase para llamar a los metodos*/

public class TipoIdentificacionRest {
	
	/*Cada uno de los servicios web que queramos exponer*/
	
	@Autowired
	private ITipoIdentificacionServices service;
	
	@GetMapping("")
	public List<TipoIdentificacion> listarTodos(){
		
		return service.listarTodos();
	}

}
