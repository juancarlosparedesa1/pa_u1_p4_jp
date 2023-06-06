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
import com.example.demo.banco.repository.modelo.Impuesto;
import com.example.demo.banco.repository.modelo.Transferencia;

@Service
public class TransferenciaServiceImpl implements TransferenciaService {

	@Autowired
	private CuentaRepository cuentaRepository;
	@Autowired
	private TransferenciaRepository transferenciaRepository;

//	@Autowired
//	@Qualifier("Internacional")
//	private MondoDebitarService debitarService;

	@Autowired
	private Impuesto impuesto;

	@Override
	public void guardar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		System.out.println("La transferencia se va a calcular con el IVA:");
		System.out.println(impuesto.getIva());
		this.transferenciaRepository.insertar(transferencia);
	}

	@Override
	public void actualizar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		this.transferenciaRepository.actualizar(transferencia);
	}

	@Override
	public void borrar(String numero) {
		// TODO Auto-generated method stub
		this.transferenciaRepository.elimiar(numero);
	}

	@Override
	public Transferencia buscarPorNumero(String numero) {
		// TODO Auto-generated method stub
		return this.transferenciaRepository.SeleccionarPorNumero(numero);
	}

	@Override
	public void realizar(String numeroCtaOrigen, String numeroCtaDestino, BigDecimal monto) {
//		// logica de negocio
//		// calculos-orden-
//		// que hace el negocio
//
////		if(tipo.equals("Nacional"))
////		else {
////			///internacional
////		}else{
////		if() {
////			//familiares
////		}else{
//		// corporativo
////	}
////	}
//
//		// 1.Consultar la cuenta de origen por elnumero
//
//		Cuenta ctaOrigen = this.cuentaRepository.SeleccionarPorNumero(numeroCtaOrigen);
//		// 2.Consultar el saldo de la cuenta Origen
//
//		BigDecimal montoDebitar = this.debitarService.calcular(monto);
//
//		BigDecimal saldoOrigen = ctaOrigen.getSaldo();
//
//		// 3.Validar si el saldo es suficiente
//
//		// si es menor que cero el saldo origen en mayor que el monto
//		if (montoDebitar.compareTo(saldoOrigen) <= 0) {// si es mayor que cero el monto es mayor
//			// si el saldo a.compateTo(b) -1 b>a 1a>b 0 a=b
//			// 5.Si es suficiente ir al paso 6.
//			// 6.Realizamos la resta del saldo origen - monto
//			BigDecimal nuevoSaldoOrigen = saldoOrigen.subtract(montoDebitar);
//			// 7.Actualizamos el nuevo saldo de la cuenta origen
//			ctaOrigen.setSaldo(nuevoSaldoOrigen);
//			// cual tomo?? bypass
//			this.cuentaRepository.actualizar(ctaOrigen);
//			// 8.Consultamos la cuenta de destino por el numero.
//			Cuenta ctaDestino = this.cuentaRepository.SeleccionarPorNumero(numeroCtaDestino);
//			// 9.Consultamos el saldo de la cuenta destino
//			BigDecimal saldoDestino = ctaDestino.getSaldo();
//
//			// 10.Realizamos la suma del saldo destino+monto
//			BigDecimal nuevoSaldoDestino = saldoDestino.add(monto);
//
//			// multiply-multiplicacion-Divide-dividir
//			// 11.Actualizamos el nuevo saldo de la cuenta destino
//			ctaDestino.setSaldo(nuevoSaldoDestino);
//			this.cuentaRepository.actualizar(ctaDestino);
//			// 12.Creamos el registro(la transferencia)
//			Transferencia transfer = new Transferencia();
//			transfer.setCuentaOrigen(ctaOrigen);
//			transfer.setCuentaDestino(ctaDestino);
//			transfer.setMonto(monto);
//			Double numero = Math.random();
//			transfer.setNumero(numero.toString());
//			transfer.setFecha(LocalDateTime.now());
//			// inserto la transferencia
//			this.transferenciaRepository.insertar(transfer);
//		} else {
//			// 4.Si no es suficiente imprimier mensaje de no hay saldo
//
//			System.out.println("Saldo no disponible,su saldo es:" + saldoOrigen);
//		}

	}

	@Override
	public List<Transferencia> SeleccionarTodos() {
		// TODO Auto-generated method stub
		return this.transferenciaRepository.SeleccionarTodos();
	}

}
