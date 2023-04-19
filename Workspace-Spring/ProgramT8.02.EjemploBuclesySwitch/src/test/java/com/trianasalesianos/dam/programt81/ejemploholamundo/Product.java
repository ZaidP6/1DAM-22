package com.trianasalesianos.dam.programt81.ejemploholamundo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsContructor
public class Product {

	
	private long od;
	private String name;
	private String description;
	private double price;
	private boolean inStock = false;
	
	
	//Importar la libreria de spring, de las dos que salen
	//la marrion, de spring
	
	@DateTimeFormat(iso=ISO.DATE_TIME);
}
