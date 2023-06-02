package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.banco.repository.modelo.Cuenta;
import com.example.demo.banco.repository.modelo.Transferencia;
import com.example.demo.banco.service.CuentaService;
import com.example.demo.banco.service.TransferenciaService;

@SpringBootApplication
public class Spring01Application implements CommandLineRunner {

	@Autowired
	private CuentaService cuentaService;
	@Autowired
	private TransferenciaService transferenciaService;

	public static void main(String[] args) {
		SpringApplication.run(Spring01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// 1.Crear dos cuentas bancarias
		Cuenta cuenta1 = new Cuenta();
		cuenta1.setCedula("1726890000");
		cuenta1.setFechaApertura(LocalDateTime.now());
		cuenta1.setNumero("001");
		cuenta1.setSaldo(new BigDecimal(200));
		cuenta1.setTipo("A");
		this.cuentaService.guardar(cuenta1);
		Cuenta cuenta2 = new Cuenta();
		cuenta2.setCedula("1726000000");
		cuenta2.setFechaApertura(LocalDateTime.now());
		cuenta2.setNumero("002");
		cuenta2.setSaldo(new BigDecimal(500));
		cuenta2.setTipo("C");
		this.cuentaService.guardar(cuenta2);
		System.out.println(cuenta1);
		System.out.println(cuenta2);

		// 2.Realizar una transferencia con los datos del punto anterior
		this.transferenciaService.realizar("001", "002", new BigDecimal(100));

		// 3.Buscar e imprimir el saldo de la cuenta origen

		System.out.println("Saldo cuenta origen: " + this.cuentaService.Seleccionar(cuenta1.getNumero()).getSaldo());
		System.out.println("Saldo cuenta destino: " + this.cuentaService.Seleccionar(cuenta2.getNumero()).getSaldo());

	}

}
