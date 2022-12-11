package com.example.api;

import java.util.List;

import com.example.model.Estudiante;
import com.example.service.IEstudianteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/estudiante")
public class EstudianteRest  {
	
	@Autowired
	private IEstudianteService service;
	
	@GetMapping("")
	public List<Estudiante> ListarTodos(){
	
		return service.listarTodos();
		
	}
	

	@GetMapping("{id}")
	public Estudiante listarPorId(@PathVariable int id) {  /*Le ponemos la anotacion pathVariable para indicarle que ese id es el de la url*/
		return service.listarPorId(id);
	}

    @PostMapping("")
	public void registrar(@RequestBody Estudiante entidad) {
	
		service.registrar(entidad);
	}

	@PutMapping("")
	public void actualizar(@RequestBody Estudiante entidad) {
	
		service.actualizar(entidad);
		
	}

    @DeleteMapping("{id}")
	public void eliminar(@PathVariable int id) {
	
		service.eliminar(id);
	}
	 

}
