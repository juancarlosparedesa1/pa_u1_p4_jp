package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.matriculacionbd.repository.modelo.Propietariobd;
import com.example.demo.matriculacionbd.repository.modelo.Vehiculobd;
import com.example.demo.matriculacionbd.service.IMatriculabdService;
import com.example.demo.matriculacionbd.service.IPropietariobdService;
import com.example.demo.matriculacionbd.service.IVehiculobdService;

@SpringBootApplication
public class Spring01SistemaMatriculacionVehicularBdApplication implements CommandLineRunner {
	@Autowired
	private IVehiculobdService vehiculoService;
	@Autowired
	private IPropietariobdService propietarioService;
	@Autowired
	private IMatriculabdService matriculaService;

	public static void main(String[] args) {
		SpringApplication.run(Spring01SistemaMatriculacionVehicularBdApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// *********************************************Sistema de matriculacion
		// Vehicular*****************************************************************
		// 1.Crear un Vehiculo
		Vehiculobd vehiculo1 = new Vehiculobd();
		vehiculo1.setMarca("Toyota");
		vehiculo1.setModelo("2019");
		vehiculo1.setPlaca("abc-123");
		vehiculo1.setPrecio(new BigDecimal(1000));
		vehiculo1.setTipo("a");
		// guardamos el vehiculo en la bd
		this.vehiculoService.guardar(vehiculo1);
		// 2.Actualzar dos atributos del vehiculo creado
		vehiculo1.setPrecio(new BigDecimal(4000));
		vehiculo1.setModelo("2023");
		this.vehiculoService.Actualizar(vehiculo1);
		// 3.Crear un propietario
		Propietariobd propietario1 = new Propietariobd();
		propietario1.setApellido("Paredes");
		propietario1.setFechaNacimiento(LocalDateTime.of(1999, 10, 5, 11, 11));
		propietario1.setIdentificacion("1726890000");
		propietario1.setNombre("Juan Carlos");
		// guardamos el propietario en la base de datos
		this.propietarioService.guardar(propietario1);
		// 4.Realizar la matricula del vehiculo a partir de los datos:cedula y la placa
		// del vehiculo utilizado
		// en los puntos 1 y 3
		this.matriculaService.realizarMatricula(propietario1.getIdentificacion(), vehiculo1.getPlaca());
	}

}
