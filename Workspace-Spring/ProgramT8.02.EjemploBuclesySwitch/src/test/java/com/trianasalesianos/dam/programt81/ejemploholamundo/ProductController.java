package com.trianasalesianos.dam.programt81.ejemploholamundo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller

public class ProductController {

	@Autowired
	private ProductService service;
	
	
	//anotamos el tipo de peticion que atendera cuando se 
	//escriba en el navegador la ruta barra productos(despues localhost...)
	
	@GetMapping ("/Productos")
	public String controladorCondicionales (Model model) {
		model.addAttribute("productList", service.getLista());
		return "PantillaBucleYFormateo";  //Se devuelve la platilla
	}
	
}
