package com.example.demo;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.alumnos.repository.modelo.Estudiante;
import com.example.demo.alumnos.service.EstudianteService;

@SpringBootApplication
public class Spring01Application implements CommandLineRunner {

	@Autowired
	private EstudianteService estudianteService;
	public static void main(String[] args) {
		SpringApplication.run(Spring01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//1.insertar estudiantes
		//creamos un estudiantes
		Estudiante estudiante1 = new Estudiante();
		estudiante1.setNombre("juan carlos");
		estudiante1.setApellido("paredes");
		estudiante1.setCedula("1726897299");
		estudiante1.setFechaInscripción(LocalDateTime.now());
		//agreggamos insertamos guardamos estudiante en la bd
		this.estudianteService.insertar(estudiante1);
		Estudiante estudiante2 = new Estudiante();
		estudiante2.setNombre("Jean");
		estudiante2.setApellido("prado");
		estudiante2.setCedula("1726890000");
		estudiante2.setFechaInscripción(LocalDateTime.now());
		//agregamos insertamos guardamos estudiante en la bd
		this.estudianteService.insertar(estudiante2);
		System.out.println("Estudiante/es insertado/os");
		//2.Seleccionar -buscar --leer
		System.out.println("studiante encontrado!!!");
		
		System.out.println(this.estudianteService.buscar("1726897299"));
		
		//3.Actualizar-modificar-cambiar
		estudiante1.setApellido("Angulo");
		this.estudianteService.actualizar(estudiante1);
		System.out.println("Estudiante modificado!!");
		
		//4.eliminar-borrar-vender-quitar
		this.estudianteService.borrar("1726890000");
		System.out.println("Estudiante eliminado!!");
		//5.reporte
		//creamos la lista
		System.out.println("Imprime  reporte!!!");
		List<Estudiante>reporte = this.estudianteService.reporte();
		//recorremos la lista para imprimr
		for (Estudiante estu : reporte) {
			System.out.println("Nombre: "+estu.getNombre());
			System.out.println("Apellido:"+estu.getApellido());
			System.out.println("Cedula:"+estu.getCedula());
			System.out.println("Fecha Inscripción"+estu.getFechaInscripción());
		}
		
		
		
		
		
		
		
	}

}
