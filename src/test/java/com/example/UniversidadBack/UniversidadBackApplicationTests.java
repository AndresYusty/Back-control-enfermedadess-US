package com.example.UniversidadBack;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.example.model.Estudiante;

@SpringBootTest
class UniversidadBackApplicationTests {
	
	@Autowired
	PasswordEncoder pw;

	
	
	
	@Test
	void contextLoads() {
		
		String clave= "pepito123";
		
		String claveEncriptada = pw.encode(clave);
		
		System.out.println(claveEncriptada);
	
		
		
	
		
		
		
		
	}

}
