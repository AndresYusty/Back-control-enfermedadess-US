package com.example.api;

import java.util.List;

import com.example.model.EnfermedadEstudiante;
import com.example.service.implement.EnfermedadEstudianteServiceImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/enfermedad-estudiante")
public class EnfermedadEstudianteRest {

	@Autowired
	private EnfermedadEstudianteServiceImplement service;
	
    @GetMapping("")
	public List<EnfermedadEstudiante> listarTodos() {           /*servicio web*/
	   return service.listarTodos();
    	
	}

   
    @PostMapping("")
	public void registrar(@RequestBody EnfermedadEstudiante entidad) {   /*servicio web*/
		 
		service.registrar(entidad);
		
	}
    
    @GetMapping("/listarEnfermedadesPorEstudiante/{idEstudiante}")
    public List<EnfermedadEstudiante> listarEnfermedadesPorEstudiante(@PathVariable int idEstudiante){
    	return service.listarEnfermedadesPorEstudiante(idEstudiante);
    }

	
}
