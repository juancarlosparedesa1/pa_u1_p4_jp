package com.example.demo;

public class MatriculaCalculo {
	public void realizarMatricula(String tipo) {
		if(tipo.equals("1")) {
			Materia materia = new Materia();
			materia.setNombre("P.web");
			//insertar en la base
			System.out.println("se inserto la materia");
		}else {
			MateriaExtraordinaria extraordinaria = new MateriaExtraordinaria();
			extraordinaria.setNombre("pweb");
			extraordinaria.setCantidadCreditos(10);
			//inyectar en la base
			System.out.println("Se inserto la materia Extraoridinaria");
		}
	}
}
