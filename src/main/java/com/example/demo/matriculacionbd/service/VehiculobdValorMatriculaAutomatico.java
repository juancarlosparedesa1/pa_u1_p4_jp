package com.example.demo.matriculacionbd.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service("automaticobd")
public class VehiculobdValorMatriculaAutomatico implements IVehiculobdValorMatricula {

	@Override
	public BigDecimal calcularValorMatricula(BigDecimal precio) {
		// TODO Auto-generated method stub
		BigDecimal valorMatricula = precio.multiply(new BigDecimal(0.1));
		// defino un valor para comparar en este caso 3000
		BigDecimal valor = new BigDecimal(3000);
		if (valorMatricula.compareTo(valor) > 0) { // a>b 1
			valorMatricula = valorMatricula.subtract(valorMatricula.multiply(new BigDecimal(0.09)));
		}
		return valorMatricula;
	}

}
