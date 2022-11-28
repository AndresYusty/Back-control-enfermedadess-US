package com.example.repository;


import com.example.model.TipoSangre;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITipoSangreRepository extends JpaRepository<TipoSangre, Integer> {

}
