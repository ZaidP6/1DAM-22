package com.example.demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MainDeMentira {
	@Autowired
	private ServiciosAlumno servicioAlumno;
	
	@PostConstruct
	public void ejecutar() {
		
		System.out.println("Alumnos que cumplean años hoy");
		servicioAlumno.cumpleHoy().forEach(a -> 
		System.out.println(a + " CumpleAñosHoy"));
		
	}
	
	
}
