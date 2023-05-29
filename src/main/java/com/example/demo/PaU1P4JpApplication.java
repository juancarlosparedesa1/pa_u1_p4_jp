package com.example.demo;

import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.EstudianteService;

@SpringBootApplication
public class PaU1P4JpApplication implements CommandLineRunner {
	@Autowired
	private EstudianteService estudianteService;

	public static void main(String[] args) {
		SpringApplication.run(PaU1P4JpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// 1.Guardar estudiante
		Estudiante miEstudiante = new Estudiante();
		miEstudiante.setApellido("paredes");
		miEstudiante.setCedula("172343423");
		miEstudiante.setNombre("juan carlos");
		miEstudiante.setFechaNacimiento(LocalDateTime.of(1997, 10, 5, 11, 11));
		this.estudianteService.guardar(miEstudiante);

		Estudiante miEstudiante1 = new Estudiante();
		miEstudiante1.setApellido("angulo");
		miEstudiante1.setCedula("1723412111");
		miEstudiante1.setNombre("jose david");
		miEstudiante1.setFechaNacimiento(LocalDateTime.of(1990, 10, 5, 12, 12));
		this.estudianteService.guardar(miEstudiante1);

		// 5.imprimir reporte

		List<Estudiante> reporte = this.estudianteService.reporteTodos();
		System.out.println("Reporte de todos los estudiantes");
		for (Estudiante estu : reporte) {
			System.out.println(estu);

		}

		// 2. actualizar
		miEstudiante1.setApellido("Perez");
		this.estudianteService.actualizar(miEstudiante1);
		List<Estudiante> reporte2 = this.estudianteService.reporteTodos();
		System.out.println("Reporte 2");
		for (Estudiante estu : reporte2) {
			System.out.println(estu);

		}

		// 3.eliminar
		this.estudianteService.borrar("172343423");
		miEstudiante1.setApellido("Perez");
		this.estudianteService.actualizar(miEstudiante1);
		List<Estudiante> reporte3 = this.estudianteService.reporteTodos();
		System.out.println("Reporte 3");
		for (Estudiante estu : reporte3) {
			System.out.println(estu);
		}

		// buscar estudiante que existe
		System.out.println("buscar por cedula: " + miEstudiante1.getCedula());
		System.out.println(this.estudianteService.buscarPorCedula("1723412111"));

		// buscar estudiante que no existe
		System.out.println("buscar por cedula:17234121123");
		System.out.println(this.estudianteService.buscarPorCedula("17234121123"));
		
		
		//cambio taller9preview
		
		
		

	}

}
