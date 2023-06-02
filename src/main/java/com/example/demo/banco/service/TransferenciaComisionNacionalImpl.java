package com.example.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service("nacional")
public class TransferenciaComisionNacionalImpl implements TransferenciaComision {

	@Override
	public BigDecimal calcularMontoComision(BigDecimal monto) {
		// si es nacional se le suma una comision del 5% del monto
		// esto se le resta a la cuenta origen
		BigDecimal comision = monto.multiply(new BigDecimal(0.05));
		return monto.add(comision);

	}

}
