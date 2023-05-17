package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaU1P4JpApplication implements CommandLineRunner {

	@Autowired
	private Profesor profesor1;

	public static void main(String[] args) {
		SpringApplication.run(PaU1P4JpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Mi primer programa");
		/*
		 * Spring framework es un framework que permite la construcion/desarrollo de
		 * aplicaciones empresariales basadas en spring comentario luego del almuerzo
		 */

		// commit subida de prueba antes del taller
		System.out.println("Mi primer proyecto");

		Profesor profesor = new Profesor();

		profesor.setNombre("juan Carlos");
		profesor.setApellido("Paredes");
		profesor.setCedula("1726897299");
		profesor.setFechaNacimiento(LocalDateTime.now());

		
		System.out.println(profesor);
		profesor.setApellido("angulo");
		System.out.println(profesor.getApellido());

		System.out.println(profesor);

		// profesor1 = new Profesor();
		// esto da error?porque
		System.out.println(profesor1);
		profesor1.setApellido("benitez");// porque imprime null=)(/
		profesor1.setApellido("");
		System.out.println(profesor1.getApellido());

		MatriculaCalculo calculo = new MatriculaCalculo();
		calculo.realizarMatricula("1");

	}

}
