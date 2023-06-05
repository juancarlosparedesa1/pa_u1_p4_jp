package com.example.demo.supermaxi.repository;

import com.example.demo.supermaxi.repository.modelo.DetalleFactura;

public interface IDetalleFacturaRepository {

	// CRUD IBAE
	public void insertar(DetalleFactura detfactura);

	public DetalleFactura buscar(String id);

	public void actualizar(DetalleFactura detfactura);

	public void eliminar(String id);
}
