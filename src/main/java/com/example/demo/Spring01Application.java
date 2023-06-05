package com.example.demo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.matriculacionVehiculos.repository.modelo.Matricula;
import com.example.demo.matriculacionVehiculos.repository.modelo.Propietario;
import com.example.demo.matriculacionVehiculos.repository.modelo.Vehiculo;
import com.example.demo.matriculacionVehiculos.service.MatriculaService;
import com.example.demo.matriculacionVehiculos.service.PropietarioService;
import com.example.demo.matriculacionVehiculos.service.VehiculoService;

@SpringBootApplication
public class Spring01Application implements CommandLineRunner {

	@Autowired
	private VehiculoService vehiculoService;
	@Autowired
	private PropietarioService propietarioService;
	@Autowired
	private MatriculaService matriculaService;

	@Autowired
//	@Qualifier("internacional")
//	private TransferenciaComisionService transferenciaComisionService;

	public static void main(String[] args) {
		SpringApplication.run(Spring01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		// 1. Crear un vehículo.
		Vehiculo vehiculo1 = new Vehiculo();
		vehiculo1.setMarca("mercedes");
		vehiculo1.setModelo("2023");
		vehiculo1.setPlaca("abc-123");
		vehiculo1.setPrecio(new BigDecimal(10000));
		vehiculo1.setTipo("m");
		this.vehiculoService.insertar(vehiculo1);
//		2. Actualizar dos atributos del vehículo creado en el punto 1.
		vehiculo1.setMarca("Chevrolet");
		vehiculo1.setMarca("2022");
		this.vehiculoService.actualizar(vehiculo1);
//		3. Crear un propietario.
		Propietario propietario1 = new Propietario();
		propietario1.setApellido("Paredes");
		propietario1.setFechaNacimiento(LocalDateTime.of(1993, 5, 10, 11, 11));
		propietario1.setIdentificacion("1726890000");
		propietario1.setNombre("Juan Carlos");
		this.propietarioService.insertar(propietario1);
//		4. Realizar una matrícula de vehículo a partir de los datos: cedula y placa del vehículo utilizados 
//		en los puntos 1 y 3
		this.matriculaService.realizar(propietario1.getIdentificacion(), vehiculo1.getPlaca());

		// 5.imprimir matricula
		List<Matricula> reporte = this.matriculaService.reporte();
		for (Matricula matricula : reporte) {
			System.out.println("Matricula----");
			System.out.println("Fecha de matricula:" + matricula.getFechaMatricula());
			System.out.println("Valor matricula :" + matricula.getValorMatricula().setScale(2, RoundingMode.HALF_DOWN));
			System.out.println("Propietario------");
			System.out.println("Nombre:" + propietario1.getNombre());
			System.out.println("Apellido:" + propietario1.getApellido());
			System.out.println("identificacion" + propietario1.getIdentificacion());
			System.out.println("FechaNacimiento:" + propietario1.getFechaNacimiento());
			System.out.println("Vehiculo--------");
			System.out.println("Marca:" + vehiculo1.getMarca());
			System.out.println("Modelo:" + vehiculo1.getMarca());
			System.out.println("Precio:" + vehiculo1.getPrecio());
			System.out.println("Tipo: " + vehiculo1.getTipo());

		}
	}

}
