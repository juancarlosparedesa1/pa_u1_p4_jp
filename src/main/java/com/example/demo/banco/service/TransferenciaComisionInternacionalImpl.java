package com.example.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("internacional")
public class TransferenciaComisionInternacionalImpl implements TransferenciaComisionService {

	@Override
	public BigDecimal calcularMontoComision(BigDecimal monto) {
		// si es transferencia internacional se aplica un impuesto
		// del 20% de la transferencia
		BigDecimal comision = monto.multiply(new BigDecimal(0.2));
		return monto.add(comision);
	}

}
