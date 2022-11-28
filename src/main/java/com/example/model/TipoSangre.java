package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data /* activamos la dependencia lombok con el @Data, aqui nos genera los setter y getters */

@Entity
@Table(name="tipo_sangre")

public class TipoSangre {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column (name="nombre")
	private String nombre;
	
	@Column (name= "descripcion")
	private String descripcion;




}
