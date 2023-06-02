package com.example.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.banco.repository.CuentaRepository;
import com.example.demo.banco.repository.TransferenciaRepository;
import com.example.demo.banco.repository.modelo.Cuenta;
import com.example.demo.banco.repository.modelo.Transferencia;

@Service
public class TransferenciaServiceImpl implements TransferenciaService {

	@Autowired
	private TransferenciaRepository transferenciaRepository;
	@Autowired
	private CuentaRepository cuentaRepository;
	@Autowired
	private TransferenciaComisionService transferenciaComision;

	@Override
	public void guardar(Transferencia transferencia) {
		this.transferenciaRepository.insertar(transferencia);

	}

	@Override
	public Transferencia Seleccionar(String numero) {
		return this.transferenciaRepository.Seleccionar(numero);
	}

	@Override
	public void actualizar(Transferencia transferencia) {
		this.transferenciaRepository.actualizar(transferencia);

	}

	@Override
	public void borrar(String numero) {
		this.transferenciaRepository.eliminar(numero);

	}

	@Override
	public List<Transferencia> reporte() {

		return this.transferenciaRepository.buscarTodos();
	}

	@Override
	public void realizar(String cuentaOrigen, String cuentaDestino, BigDecimal monto) {

		// 1. Paso Consultar la Cuenta de Origen por el numero de cuenta
		// PARA CONSULTAR CRO UNA INSTANCIA DE CUENTA
		// LOS PARAMETROS DE ENTRADA ME SIRVEN PARA CONSULTAR

		Cuenta ctaOrigen = this.cuentaRepository.Seleccionar(cuentaOrigen);
		// 2. Consultar el saldo de la cuenta de Origen
		BigDecimal saldoCtaOrigen = ctaOrigen.getSaldo();

		// 3. validar si el saldo es suficiente
		// comparar el monto con el sado de la cuenta origen
		// comparaciones en bigdecimal
		BigDecimal montoDebitar = this.transferenciaComision.calcularMontoComision(monto);

		if (montoDebitar.compareTo(saldoCtaOrigen) <= 0) { // si es 0 o -1 primero sea menor que el segundo

			// 5. Si es suficiente ir al paso 6
			System.out.println("Saldo cuenta origen antes transferencia:");
			System.out.println(saldoCtaOrigen);
			// 6. Realizamos la resta del saldo origen menos el monto
			// BigDecimal comision = monto.multiply(new BigDecimal(0.05));
			// System.out.println("La comision es:" + comision);
			BigDecimal nuevoSaldoCuentaOrigen = saldoCtaOrigen.subtract(montoDebitar);

			// 7. Actualizamos el saldo de la cuenta Origen
			ctaOrigen.setSaldo(nuevoSaldoCuentaOrigen);
			this.cuentaRepository.actualizar(ctaOrigen);
			System.out.println("Saldo cuenta origen depues transferencia:");
			System.out.println(nuevoSaldoCuentaOrigen);
			// 8. Consultamos la cuenta de Destino por el número
			Cuenta ctaDestino = this.cuentaRepository.Seleccionar(cuentaDestino);

			// 9. Consultamos el saldo de la cuenta destino
			BigDecimal saldoCtaDestino = ctaDestino.getSaldo();
			System.out.println("Saldo cuente destino antes de la transferencia");
			System.out.println(saldoCtaDestino);
			// 10. Realizamos la suma del saldo destino mas el monto
			BigDecimal nuevoSaldoCuentaDestino = saldoCtaDestino.add(monto);
			// 11. Actualizamos el nuevo saldo de la cuenta destino
			ctaDestino.setSaldo(nuevoSaldoCuentaDestino);
			this.cuentaRepository.actualizar(ctaDestino);
			System.out.println("Saldo cuentad destino despues de la transferencia:");
			System.out.println(nuevoSaldoCuentaDestino);

			// comision

			// 12. Creamos el registro/transferencia
			Transferencia transfer = new Transferencia();
			transfer.setFecha(LocalDateTime.now());
			transfer.setCuentaOrigen(ctaOrigen);
			transfer.setCuentaDestino(ctaDestino);
			transfer.setMonto(monto);
			transfer.setNumero("001");

		} else {
			// 4. Si no es suficiente imprimir mensaje de no hay saldo disponible
			System.out.println("Saldo insuficiente");
		}

	}

}
