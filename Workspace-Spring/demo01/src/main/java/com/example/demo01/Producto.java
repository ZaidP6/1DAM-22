package com.example.demo01;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Producto {

	private String code,name;
	private double precioU;
	
	
	public static Object builder() {
		// TODO Auto-generated method stub
		return null;
	}
}
