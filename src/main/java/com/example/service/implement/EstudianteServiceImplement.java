package com.example.service.implement;

import java.util.List;

import com.example.model.Estudiante;
import com.example.repository.IEstudianteRepository;
import com.example.service.IEstudianteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EstudianteServiceImplement implements IEstudianteService {

	@Autowired
	private IEstudianteRepository repo;

	@Override
	public List<Estudiante> listarTodos() {
		
		return repo.findAll();
	}

	@Override
	public Estudiante listarPorId(int id) {
		
		return repo.findById(id).orElse(null);
	}

	@Override
	public void registrar(Estudiante entidad) {
	 repo.save(entidad);
		
	}

	@Override
	public void actualizar(Estudiante entidad) {
	
		repo.save(entidad);
	}

	@Override
	public void eliminar(int id) {
	
		repo.deleteById(id);
	}
	 
	
}
