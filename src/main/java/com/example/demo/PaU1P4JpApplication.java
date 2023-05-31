package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.banco.repository.modelo.Cuenta;
import com.example.demo.banco.repository.modelo.Transferencia;
import com.example.demo.banco.service.CuentaService;
import com.example.demo.banco.service.TransferenciaService;

@SpringBootApplication
public class PaU1P4JpApplication implements CommandLineRunner {

	@Autowired
	private CuentaService cuentaService;

	@Autowired
	private TransferenciaService transferenciaService;

	public static void main(String[] args) {
		SpringApplication.run(PaU1P4JpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// cuenta1
		Cuenta cuenta1 = new Cuenta();
		cuenta1.setCedulaPropietario("1726890000");
		cuenta1.setFechaApertura(LocalDateTime.now());
		cuenta1.setNumero("001");
		cuenta1.setSaldo(new BigDecimal(200));
		cuenta1.setTipo("A");
		this.cuentaService.guardar(cuenta1);
		// cuenta2
		Cuenta cuenta2 = new Cuenta();
		cuenta2.setCedulaPropietario("172600000");
		cuenta2.setFechaApertura(LocalDateTime.now());
		cuenta2.setNumero("002");
		cuenta2.setSaldo(new BigDecimal(100));
		cuenta2.setTipo("A");
		this.cuentaService.guardar(cuenta2);
		this.transferenciaService.realizar("001", "002", new BigDecimal(10));

		// consultar saldos
		System.out.println("Se realizó la transferencia");
		System.out.println("Saldo origen: " + this.cuentaService.buscarPorNumero("001").getSaldo());

		System.out.println("Saldo Destino: " + this.cuentaService.buscarPorNumero("002").getSaldo());

		// imprimir reporte

//		List<Transferencia> reporte = this.transferenciaService.SeleccionarTodos();
//
//		for (Transferencia transferencia : reporte) {
////			System.out.println(transferencia);
//			// Reporte que tenga lo siguiente
//			// Registro CuentaO:123456 cuentaD:6789 fecha:20/05/2023 monto
//			System.out.println("Registro:" + transferencia.getCuentaOrigen().getNumero() + "CtaD:"
//					+ transferencia.getCuentaDestino() + "Fecha:" + transferencia.getFecha() + "monto:"
//					+ transferencia.getMonto());
//		}

	}

}
