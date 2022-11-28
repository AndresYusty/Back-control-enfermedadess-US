package com.example.service;

import java.util.List;

/* Este crud service nos permitira reutilizar codigo ya que es bastante repetitivo */



/*Cuando intenten heredar de esta iterfaz siempre envien un parametro de tipo T (Cualquiera de donde lo esten heredando)*/
public interface ICrudService <T> {

 /*Tenemos todos los metodos para un crud*/
	
	
	public List<T> listarTodos();

	public T listarPorId(int id);

	public void registrar(T entidad);

	public void actualizar(T entidad);

	public void eliminar(int id);
	
}
