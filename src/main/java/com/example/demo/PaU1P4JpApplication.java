package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.banco.repository.modelo.Cajero;
import com.example.demo.banco.repository.modelo.Presidente;
import com.example.demo.banco.repository.modelo.Transferencia;
import com.example.demo.banco.service.ICargaSistemaService;
import com.example.demo.banco.service.TransferenciaService;

@SpringBootApplication
public class PaU1P4JpApplication implements CommandLineRunner {

	@Autowired
	private Cajero cajero;

	@Autowired
	private Cajero cajero1;

	@Autowired
	private Presidente presidente;
	@Autowired
	private Presidente presidente1;

	@Autowired
	private ICargaSistemaService cargaSistemaService;

	@Autowired
	private TransferenciaService transferenciaService;

	public static void main(String[] args) {
		SpringApplication.run(PaU1P4JpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.cajero.setApellido("Paredes");
		this.cajero.setNombre("Juan Carlos");
		this.cajero.setSalario(new BigDecimal(30000));

		this.cajero1.setApellido("Teran");
		System.out.println(this.cajero);
		System.out.println(this.cajero1);

		this.presidente.setApellido("Porras");
		this.presidente.setNombre("andrea");
		this.presidente.setCedula("123424");

		this.presidente1.setApellido("Taco");

		// imprimen lo mismo porque son la misma instancia
		// proque tiene un scope singleton
		// si no le pongo scope por defecto tiene el prototipe
		System.out.println(this.presidente);
		System.out.println(this.presidente1);

		System.out.println("*****segunda parte*****");
		this.cargaSistemaService.cargar();
		Transferencia transf = new Transferencia();
		transf.setCuentaDestino(null);
		transf.setCuentaOrigen(null);
		transf.setFecha(LocalDateTime.now());
		transf.setMonto(new BigDecimal(100));
		transf.setNumero("001");

		// cambio para el branch

		this.transferenciaService.guardar(transf);

	}
}