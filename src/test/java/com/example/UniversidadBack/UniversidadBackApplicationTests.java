package com.example.UniversidadBack;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.model.Estudiante;

@SpringBootTest
class UniversidadBackApplicationTests {

	@Test
	void contextLoads() {
		
		/* Esta carpeta y archivos en general  es para realizar pruebas */
		/* En este caso vamos a instanciar un objeto  */
		
		Estudiante estudiante = new Estudiante();
		
		/* Ahora hacemos uso de los getters y setters de la siguiente manera  */
		
		/* Ahora hacemos uso del setters de la siguiente manera  */
		estudiante.setNombre("Andres");
		
		/* Ahora hacemos uso del getters de la siguiente manera  */
		System.out.print(estudiante.getNombre());
		
		
		
		
	}

}
