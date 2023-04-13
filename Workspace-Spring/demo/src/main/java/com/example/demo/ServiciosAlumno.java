package com.example.demo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ServiciosAlumno {
	
	@Autowired
	private AlmacenAlumnos almacenAlumnos;
	
	/**
	 * Método que devuelve el listado con los nombres
	 * de aquelos alumnos que cumplean años hoy
	 * @return lista de nombres, lista vacía si no hay ninguno
	 */
	public List<String> cumpleHoy(){
		List<String> result = new ArrayList<>();
		
		result = almacenAlumnos.findAll().stream()
					.filter(a->a.getFechaNacimiento().getDayOfMonth() == 
					LocalDate.now().getDayOfMonth() && 
					a.getFechaNacimiento().getMonth() == LocalDate.now()
					.getMonth())
					.map(a -> a.getNombre() + " "+ a.getApellidos())
					.toList();
		
		return result;
		
	}
}
