package com.example.service.implement;

import java.util.List;

import com.example.model.EnfermedadEstudiante;
import com.example.repository.IEnfermedadEstudianteRepository;
import com.example.service.IEnfermedadEstudianteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service                       
/*Aqui indicamos que es un servicio y se usa para inyectar las dependencias*/


public class EnfermedadEstudianteServiceImplement implements IEnfermedadEstudianteService {

	
	/*Instanciamos el repositorio para hacer uso del crud, como estamos instanciando una interfaz hacemos uso de la inyeccion de depedencias con autowired*/
    @Autowired
	private IEnfermedadEstudianteRepository Repo;

	@Override
	public List<EnfermedadEstudiante> listarTodos() {
		
		return Repo.findAll(); /*internamente esto hace un select * from*/
	}

	@Override
	public EnfermedadEstudiante listarPorId(int id) {

		return Repo.findById(id).orElse(null); /*selecciona por id */
	}

	@Override
	public void registrar(EnfermedadEstudiante entidad) {
		
		Repo.save(entidad);
		
	}

	@Override
	public void actualizar(EnfermedadEstudiante entidad) {
	
		Repo.save(entidad);
	}

	@Override
	public void eliminar(int id) {
		
		Repo.deleteById(id);
	}

	@Override
	public List<EnfermedadEstudiante> listarEnfermedadesPorEstudiante(int idEstudiante) {
		
		return Repo.listarEnfermedadesPorEstudiante(idEstudiante);
	}


	
}
