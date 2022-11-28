package com.example.repository;

import com.example.model.TipoIdentificacion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ITipoIdentificacionRepository extends JpaRepository<TipoIdentificacion, Integer> {

}
