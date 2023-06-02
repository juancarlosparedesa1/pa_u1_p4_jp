package com.example.demo.ferreteria.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.ferreteria.repository.modelo.DetalleFactura;

@Repository
public class FacturaDetalleServiceImpl implements FacturaDetalleService {

	private List<DetalleFactura> baseDatos = new ArrayList<>();

	@Override
	public void insertar(DetalleFactura detalleFactura) {
		this.baseDatos.add(detalleFactura);

	}

	@Override
	public DetalleFactura Seleccionar(String id) {

		DetalleFactura detalleFacturaEncontrado = new DetalleFactura();
		for (DetalleFactura detFact : baseDatos) {
			if (id.equals(detFact.getId())) {
				detalleFacturaEncontrado = detFact;
			}

		}
		return detalleFacturaEncontrado;
	}

	@Override
	public void actualizar(DetalleFactura detalleFactura) {
		// elimino
		this.eliminar(detalleFactura.getId());
		// inserto
		this.insertar(detalleFactura);

	}

	@Override
	public void eliminar(String id) {
		// busco
		DetalleFactura detFact = this.Seleccionar(id);
		// elimino
		baseDatos.remove(detFact);

	}

}
