package com.salesianostriana.dam.e01holamundo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Anotaciones Lombok
@Data @NoArgsConstructor @AllArgsConstructor
public class Persona {

	private String nombre;
	private String apellidos;
	
}