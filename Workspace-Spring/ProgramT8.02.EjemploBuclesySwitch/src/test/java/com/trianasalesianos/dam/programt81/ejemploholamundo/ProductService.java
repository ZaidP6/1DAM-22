package com.trianasalesianos.dam.programt81.ejemploholamundo;

import java.util.List;

import org.assertj.core.util.Arrays;
import org.springframework.stereotype.Service;

@Service

public class ProductService {

	public List<Product>getLista(){
		return Arrays.asList(
		new Product(1, "botijo","enfria agua hasta 10 grados", 20.356, true);
		new Product(2, "botijo2","enfria agua hasta 30 grados", 18.27, true);
		);
	}
}
