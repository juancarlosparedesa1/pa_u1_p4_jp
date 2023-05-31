package com.example.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service("nacional")
public class MontoDebitarNacionaIServiceImpl implements MondoDebitarService {

	@Override
	public BigDecimal calcular(BigDecimal monto) {
		// TODO Auto-generated method stub
		// enviar un mail
		// guardar en la base una pista de auditoria
		return monto;
	}

}
