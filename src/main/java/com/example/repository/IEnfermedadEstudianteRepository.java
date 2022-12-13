package com.example.repository;

import java.util.List;

import com.example.model.EnfermedadEstudiante;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/* Queremos heredar el crud que nos ofrece el framework */


@Repository
                                     /*Heredamos de una interfaz llamada JpaRepository*/
public interface IEnfermedadEstudianteRepository extends JpaRepository<EnfermedadEstudiante, Integer> {
	

	

	@Query("from EnfermedadEstudiante ee where ee.estudiante.id = :idEstudiante")
	public List<EnfermedadEstudiante> listarPorIdEstudiante(@Param("idEstudiante") int idEstudiante);
		
	/* El metodo List<EnfermedadEstudiante nos sirve para heredar la lista de enfermedades del estudiante que recibimos por id en el parametro> */

}
