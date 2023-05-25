package com.example.demo;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.EstudianteService;

@SpringBootApplication
public class PaU1E1JpApplication implements CommandLineRunner {

	@Autowired
	private EstudianteService estudianteService;

	public static void main(String[] args) {
		SpringApplication.run(PaU1E1JpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		// operaciones crud
		// 1.insertar estudiante
		// creamos un estudiante1
		Estudiante estudiante1 = new Estudiante();
		estudiante1.setNombre("Juan Carlos");
		estudiante1.setApellido("Paredes");
		estudiante1.setCedula("1726897299");
		estudiante1.setFechaMatricula(LocalDateTime.now());

		// creamos un estudiante2
		Estudiante estudiante2 = new Estudiante();
		estudiante2.setNombre("Jhon Carl");
		estudiante2.setApellido("walls");
		estudiante2.setCedula("1726890000");
		estudiante2.setFechaMatricula(LocalDateTime.now());
		// agregamos el estudiante a la bd(lista)
		System.out.println("Inserción de estudiantes---");
		this.estudianteService.guardar(estudiante1);
		this.estudianteService.guardar(estudiante2);
		System.out.println("Estudiante Agregado!!");

		// 2.Buscar estudiante
		System.out.println("Imprime un estudiante si fue encontrado");
		System.out.println("buscando estudiante......");
		System.out.println(this.estudianteService.Seleccionar("1726897299"));

		// 3.Actualizar estudiante
		// se puede actualizar cualquier atributo del estudiante
		System.out.println("Actualizacion Estudiante");
		System.out.println("Actualizando estudiante");
		estudiante1.setApellido("Angulo");
		this.estudianteService.actualizar(estudiante1);
		System.out.println("Estudiante Actualizado!!!");

		// 4.Eliminar estudiante
		System.out.println("Eliminacion Estudiantes---");
		System.out.println("Eliminando estudiantes.....");
		// this.estudianteService.borrar("1726897299");
		// 5.imprimir reporte
		// verificamos si se guardo el estudiant en la base de datos
		List<Estudiante> reporte = this.estudianteService.ReporteTodos();
		System.out.println("Impresion del reporte");
		for (Estudiante estu : reporte) {
			System.out.println(estu);
		}

	}

}
