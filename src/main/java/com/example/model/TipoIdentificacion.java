package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data /* activamos la dependencia lombok con el @Data, aqui nos genera los setter y getters */


/*  Con estos arrobas damos entender que esta clase es una tabla*/
@Entity
@Table(name= "tipo_identificacion")
public class TipoIdentificacion {

	
	/* A continuacion mapeamos todo el Tipo de Identificacion */
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) /*  Informamos que el ID será auto incrementable con el IDENTITY*/
	private int id;
	
	@Column(name = "nombre", nullable = false)/* Informamos el nombre de la tabla del sql y ponemos que es no null */
	private String nombre;
	
	@Column(name= "descripcion", nullable=false) /* Informamos el nombre de la tabla del sql y ponemos que es no null */
	private String descripcion;
	
	

	

}
