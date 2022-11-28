package com.example.repository;

import com.example.model.EnfermedadEstudiante;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/* Queremos heredar el crud que nos ofrece el framework */


@Repository
                                     /*Heredamos de una interfaz llamada JpaRepository*/
public interface IEnfermedadEstudianteRepository extends JpaRepository<EnfermedadEstudiante, Integer> {

}
