package com.example.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service("internacional")
public class TransferenciaComisionInternacionalImpl implements TransferenciaComision {

	@Override
	public BigDecimal calcularMontoComision(BigDecimal monto) {
		// si es transferencia internacional se aplica un impuesto
		// del 10% de la transferencia
		BigDecimal comision = monto.multiply(new BigDecimal(0.1));
		return monto.add(comision);
	}

}
