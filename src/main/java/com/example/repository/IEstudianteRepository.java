package com.example.repository;

import com.example.model.Estudiante;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

               /* estos repositorios nos sirven para poder heredar un crud de JpaRepository */
public interface IEstudianteRepository extends JpaRepository<Estudiante, Integer> {

}
