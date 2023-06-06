package com.example.demo.banco.repository.modelo;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

@Repository
public class ImpuestoRepositoryImpl implements IImpuestoRepository {

	@Override
	public BigDecimal seleccionar(String codigoImpuesto) {
		// TODO Auto-generated method stub
		return new BigDecimal(12);
	}

}
