package com.example.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;


/* activamos la dependencia lombok con el @Data, aqui nos genera los setter y getters */
@Data
@Entity
@Table(name="estudiante")

public class Estudiante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="numero_identificacion" , nullable = false)
	private String NumeroIdentificacion;
	
	@Column(name="nombre", nullable = false)
	private String nombre;
	
	@Column(name="apellido", nullable = false)
	private String apellido;
	
	@Column(name="fecha_nacimiento", nullable = false)
	private LocalDate Fecha_nacimiento;
	
	@ManyToOne
	@JoinColumn(name="id_tipo_identificacion", nullable = false)
	private TipoIdentificacion tipoIdentificacion;
	
	@ManyToOne
	@JoinColumn(name="id_tipo_sangre", nullable = false)
	private TipoSangre tipoSangre;

	
	
	

}
