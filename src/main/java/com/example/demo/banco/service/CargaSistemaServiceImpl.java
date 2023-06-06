package com.example.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.banco.repository.modelo.IImpuestoRepository;
import com.example.demo.banco.repository.modelo.Impuesto;

@Service
public class CargaSistemaServiceImpl implements ICargaSistemaService {

	@Autowired
	private Impuesto impuesto;
	@Autowired
	private IImpuestoRepository impuestoRepository;

	@Override
	public void cargar() {
		// TODO Auto-generated method stub
		System.out.println("Inicia carga de impuesto");
		BigDecimal valorIva = this.impuestoRepository.seleccionar("IVA");
		this.impuesto.setIva(valorIva);
		System.out.println("Fin de carga de impuesto");
	}

}
