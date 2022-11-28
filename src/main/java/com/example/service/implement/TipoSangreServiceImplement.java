package com.example.service.implement;

import java.util.List;

import com.example.model.TipoSangre;
import com.example.repository.ITipoSangreRepository;
import com.example.service.ITipoSangreService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoSangreServiceImplement implements ITipoSangreService {

	@Autowired
	private ITipoSangreRepository repo;

	@Override
	public List<TipoSangre> listarTodos() {
		
		return repo.findAll();
	}

	@Override
	public TipoSangre listarPorId(int id) {

		return repo.findById(id).orElse(null);
	}

	@Override
	public void registrar(TipoSangre entidad) {
	 
		repo.save(entidad);
		
	}

	@Override
	public void actualizar(TipoSangre entidad) {
		
		repo.save(entidad);
		
	}

	@Override
	public void eliminar(int id) {
		
		repo.deleteById(id);
		
	}
	
	
	
	
	
}
