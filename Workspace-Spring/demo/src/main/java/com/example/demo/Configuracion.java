package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuracion {
	
	@Bean
	public AlmacenAlumnos almacenAlumnos() {
		return new AlmacenAlumnoEnMemoria();
	}

}
