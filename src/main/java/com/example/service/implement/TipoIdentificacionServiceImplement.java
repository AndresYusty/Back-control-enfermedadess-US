package com.example.service.implement;

import java.util.List;

import com.example.model.TipoIdentificacion;
import com.example.repository.ITipoIdentificacionRepository;
import com.example.service.ITipoIdentificacionServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoIdentificacionServiceImplement implements ITipoIdentificacionServices {

	@Autowired
	private ITipoIdentificacionRepository repo;

	@Override
	public List<TipoIdentificacion> listarTodos() {
	
		return repo.findAll();
	}

	@Override
	public TipoIdentificacion listarPorId(int id) {
		
		return repo.findById(id).orElse(null);
	}

	@Override
	public void registrar(TipoIdentificacion entidad) {
		
		repo.save(entidad);
		
	}

	@Override
	public void actualizar(TipoIdentificacion entidad) {
		
		repo.save(entidad);
		
	}

	@Override
	public void eliminar(int id) {
		repo.deleteById(id);
	}
	
}
