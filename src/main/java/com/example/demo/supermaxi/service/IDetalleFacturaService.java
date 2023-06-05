package com.example.demo.supermaxi.service;

import com.example.demo.supermaxi.repository.modelo.DetalleFactura;

public interface IDetalleFacturaService {

	// CRUD IBAE
	public void insertar(DetalleFactura detfactura);

	public DetalleFactura buscar(String id);

	public void actualizar(DetalleFactura detfactura);

	public void eliminar(String id);
}
