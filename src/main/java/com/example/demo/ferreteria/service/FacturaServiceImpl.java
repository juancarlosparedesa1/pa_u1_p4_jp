package com.example.demo.ferreteria.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.ferreteria.repository.modelo.Factura;

@Repository
public class FacturaServiceImpl implements FacturaService {
	private List<Factura> baseDatos = new ArrayList<>();

	@Override
	public void insertar(Factura factura) {
		baseDatos.add(factura);
	}

	@Override
	public Factura Seleccionar(String id) {
		Factura facturaEncontrada = new Factura();
		for (Factura fact : baseDatos) {
			if (id.equals(fact.getId())) {
				facturaEncontrada = fact;
			}

		}
		return facturaEncontrada;
	}

	@Override
	public void actualizar(Factura factura) {
		this.eliminar(factura.getId());
		this.insertar(factura);

	}

	@Override
	public void eliminar(String id) {
		Factura fact = this.Seleccionar(id);
		baseDatos.remove(fact);

	}

}
