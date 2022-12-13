package com.example.service;

import java.util.List;

import com.example.model.EnfermedadEstudiante;



public interface IEnfermedadEstudianteService extends ICrudService<EnfermedadEstudiante> {
	
	/*Necesitamos tenerla en el servicio para poder ser implementada*/

	public List<EnfermedadEstudiante> listarPorIdEstudiante(int idEstudiante);
	
}
