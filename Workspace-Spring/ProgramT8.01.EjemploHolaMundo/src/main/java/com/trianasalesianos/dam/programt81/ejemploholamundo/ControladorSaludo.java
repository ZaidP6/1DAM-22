package com.trianasalesianos.dam.programt81.ejemploholamundo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControladorSaludo {

	@GetMapping({"/","welcome"}) //para que pueda buscar por welcome o poniendo /
	public String welcome(@RequestParam(name="nombre", required=false, defaultValue= "Mundo") 
					String nombre, Model model) {
		model.addAttribute("nombre", nombre); // "nombre" parametro en la web, nombre variable en codigo.

		return "index"; //devuelve el nombre de un archivo(una página) que se llama index, no se pone la extensión
		
	}
}
