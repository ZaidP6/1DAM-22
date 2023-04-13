package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class AlmacenAlumnosArray implements AlmacenAlumnos {

	@Override
	public List<Alumno> findAll() {
		// TODO Auto-generated method stub
		Alumno[] lista = new Alumno[] {
				
		};
		return Arrays.asList(lista);
	}

}
