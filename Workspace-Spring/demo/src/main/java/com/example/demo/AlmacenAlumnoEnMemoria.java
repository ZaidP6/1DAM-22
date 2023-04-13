package com.example.demo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;
@Repository
public class AlmacenAlumnoEnMemoria implements AlmacenAlumnos {
	List<Alumno> lista;
	
	@PostConstruct
	public void init() {
		
		lista = new ArrayList<>();
		
		lista.add(Alumno.builder()
				.nombre("Pilar")
				.apellidos("Aguilar")
				.fechaNacimiento(LocalDate.of(2004, 10, 12))
				.build());
		
		lista.add(Alumno.builder()
				.nombre("Jaime")
				.apellidos("Rodriguez")
				.fechaNacimiento(LocalDate.of(2000, 04, 12))
				.build());
		
		lista.add(Alumno.builder()
				.nombre("Pepe")
				.apellidos("Perez")
				.fechaNacimiento(LocalDate.of(2000, 04, 12))
				.build());
	}
	
	@Override
	public List<Alumno> findAll(){
		
		return Collections.unmodifiableList(lista);
		
	}
	
}
