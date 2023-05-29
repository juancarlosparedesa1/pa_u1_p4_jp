package com.example.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.banco.repository.TransferenciaRepository;
import com.example.demo.banco.repository.modelo.Cuenta;
import com.example.demo.banco.repository.modelo.Transferencia;

@Service
public class TransferenciaServiceImpl implements TransferenciaService {

	@Autowired
	private TransferenciaRepository transferenciaRepository;

	@Override
	public void Realizar(String numeroCtaOrigen, String numeroCtaDestino, BigDecimal monto) {

		Cuenta cuentaOrigen = new Cuenta();
		Cuenta cuentaDestino = new Cuenta();

		cuentaOrigen.setNumero(numeroCtaOrigen);
		cuentaDestino.setNumero(numeroCtaDestino);

		cuentaOrigen.setSaldo(new BigDecimal(800));
		cuentaDestino.setSaldo(new BigDecimal(200));

		// validaciones
		int comparacion = monto.compareTo(cuentaOrigen.getSaldo());
		if (cuentaOrigen.getSaldo().compareTo(BigDecimal.ZERO) <= 0 || comparacion > 0) {
			System.out.println("saldo Insuficiente, no es posible realizar la transferencia");
		} else {
			// restamos monto de la cuenta origen
			BigDecimal comision = monto.multiply(new BigDecimal(0.05));
			cuentaOrigen.setSaldo(cuentaOrigen.getSaldo().subtract(monto.add(comision)));
			// añadimos el monto a la cuenta origen
			cuentaDestino.setSaldo(cuentaDestino.getSaldo().add(monto));
		}

	}

	@Override
	public Transferencia Seleccionar(String numero) {
		return this.transferenciaRepository.seleccionar(numero);
	}

	@Override
	public void actualizar(Transferencia transferencia) {
		this.transferenciaRepository.actualizar(transferencia);
	}

	@Override
	public void eliminar(String numero) {
		this.transferenciaRepository.eliminar(numero);

	}

}
