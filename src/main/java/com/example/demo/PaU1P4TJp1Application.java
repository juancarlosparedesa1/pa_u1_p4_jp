package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.banco.repository.modelo.Cuenta;
import com.example.demo.banco.service.CuentaService;
import com.example.demo.banco.service.TransferenciaService;

@SpringBootApplication
public class PaU1P4TJp1Application implements CommandLineRunner {

//	@Autowired
//	private EstudianteService estudianteService;
//	@Autowired
//	private Estudiante estudiante;
	@Autowired
	private TransferenciaService transferenciaService;
	@Autowired
	private CuentaService cuentaService;

	public static void main(String[] args) {
		SpringApplication.run(PaU1P4TJp1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//
//		// 1.guardar estudiante
//		// creamos un estudiante1
//		System.out.println("Insertando estudiantes....");
//		Estudiante estudiante1 = new Estudiante();
//		estudiante1.setNombre("Juan Carlos");
//		estudiante1.setApellido("Paredes");
//		estudiante1.setCedula("1726890000");
//		estudiante1.setFechaMatricula(LocalDateTime.now());
//		this.estudianteService.guardar(estudiante1);
//
//		// creamos un estudiante2
//		Estudiante estudiante2 = new Estudiante();
//		estudiante2.setNombre("Jhon carlos");
//		estudiante2.setApellido("walss");
//		estudiante2.setCedula("1726800000");
//		estudiante2.setFechaMatricula(LocalDateTime.now());
//		this.estudianteService.guardar(estudiante2);
//		// 2.Buscar-seleccionar-leer estudiante
//		System.out.println("buscando estudiante estudiante...");
//		// imprime el estudiante buscado
//		System.out.println(this.estudianteService.Seleccionar("1726800000"));
//
//		// 3.actualizar-modificar estudiante-update
//		System.out.println("modificando estudiantes....");
//		estudiante2.setApellido("Angulo");
//		System.out.println(estudiante2);
//
//		// 4.Eliminar-delete-borrar
//		System.out.println("Eliminando estudiantes...");
//		this.estudianteService.borrar("1726800000");
//		// 5.imprimir Reporte
//		// creamos una lista de estudiantes del service
//		System.out.println("Imprimir Reporte");
//		List<Estudiante> reporte = this.estudianteService.reporte();
//		// recooremos la lista
//		for (Estudiante estudiante : reporte) {
//			System.out.println(estudiante);
//
//		}

		// test class
		// 1.Creamos dos cuentas bancarias

		Cuenta cuenta1 = new Cuenta();
		cuenta1.setCedulaPropietario("1726897299");
		cuenta1.setFechaApertura(LocalDateTime.now());
		cuenta1.setNumero("001");
		// cuenta1.setSaldo(new BigDecimal(200));
		cuenta1.setTipo("A");// ahorros
		this.cuentaService.Crear(cuenta1);

		Cuenta cuenta2 = new Cuenta();
		cuenta2.setCedulaPropietario("1726890000");
		cuenta2.setFechaApertura(LocalDateTime.now());
		cuenta2.setNumero("002");
		// cuenta2.setSaldo(new BigDecimal(1000));
		cuenta2.setTipo("C");// corriente
		this.cuentaService.Crear(cuenta2);

		// 2.Realizar transferencia con los datos del punto anterior
		this.transferenciaService.Realizar("001", "002", new BigDecimal(1000));
	}

}
