package com.example.demo.supermaxi.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.supermaxi.repository.modelo.Factura;

@Repository
public class FacturaRepositoryImpl implements IFacturaRepository {

	List<Factura> baseDatos = new ArrayList<>();

	@Override
	public void insertar(Factura factura) {
		// TODO Auto-generated method stub
		baseDatos.add(factura);

	}

	@Override
	public Factura buscar(String id) {
		// TODO Auto-generated method stub
		Factura facturaEncontrado = new Factura();
		for (Factura fact : baseDatos) {
			if (id.equals(fact.getId())) {
				facturaEncontrado = fact;

			}

		}
		return facturaEncontrado;
	}

	@Override
	public void actualizar(Factura factura) {
		// TODO Auto-generated method stub
		this.eliminar(factura.getId());
		this.insertar(factura);

	}

	@Override
	public void eliminar(String id) {
		// TODO Auto-generated method stub
		Factura fact = this.buscar(id);
		baseDatos.remove(fact);

	}

	@Override
	public List<Factura> seleccionarTodos() {
		// TODO Auto-generated method stub
		return baseDatos;
	}

}
