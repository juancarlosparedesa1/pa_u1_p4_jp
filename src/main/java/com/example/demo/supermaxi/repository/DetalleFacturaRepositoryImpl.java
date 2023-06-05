package com.example.demo.supermaxi.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.supermaxi.repository.modelo.DetalleFactura;

@Repository
public class DetalleFacturaRepositoryImpl implements IDetalleFacturaRepository {

	List<DetalleFactura> baseDatos = new ArrayList<>();

	@Override
	public void insertar(DetalleFactura factura) {
		// TODO Auto-generated method stub
		baseDatos.add(factura);

	}

	@Override
	public DetalleFactura buscar(String id) {
		// TODO Auto-generated method stub
		DetalleFactura detFacturaEncontrado = new DetalleFactura();
		for (DetalleFactura detfact : baseDatos) {
			if (id.equals(detfact.getId())) {
				detFacturaEncontrado = detfact;

			}

		}
		return detFacturaEncontrado;
	}

	@Override
	public void actualizar(DetalleFactura detfactura) {
		// TODO Auto-generated method stub
		this.eliminar(detfactura.getId());
		this.insertar(detfactura);

	}

	@Override
	public void eliminar(String id) {
		// TODO Auto-generated method stub
		DetalleFactura fact = this.buscar(id);
		baseDatos.remove(fact);

	}

}
