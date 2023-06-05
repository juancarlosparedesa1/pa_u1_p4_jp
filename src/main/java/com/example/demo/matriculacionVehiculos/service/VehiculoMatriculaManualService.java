package com.example.demo.matriculacionVehiculos.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service("manual")
public class VehiculoMatriculaManualService implements VehiculoMatriculaService {

	@Override
	public BigDecimal calculoValorMatricula(BigDecimal precio) {
		// TODO Auto-generated method stub
		BigDecimal valorMatricula = precio.add(precio.multiply(new BigDecimal(0.10)));
		BigDecimal valor = new BigDecimal(3000);
		if (valorMatricula.compareTo(valor) > 0) {
			valorMatricula = valorMatricula.subtract(valorMatricula.multiply(new BigDecimal(0.09)));
		}
		return valorMatricula;
	}

}
