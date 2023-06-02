package com.example.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("nacional")
//@Primary
public class TransferenciaComisionNacionalImpl implements TransferenciaComisionService {

	@Override
	public BigDecimal calcularMontoComision(BigDecimal monto) {
		// si es nacional se le suma una comision del 10% del monto
		// esto se le resta a la cuenta origen
		BigDecimal comision = monto.multiply(new BigDecimal(0.1));
		return monto.add(comision);

	}

}
