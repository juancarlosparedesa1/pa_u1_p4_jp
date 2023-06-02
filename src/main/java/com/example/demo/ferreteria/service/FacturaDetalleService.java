package com.example.demo.ferreteria.service;

import com.example.demo.ferreteria.repository.modelo.DetalleFactura;

public interface FacturaDetalleService {
	// Crud
	public void insertar(DetalleFactura detalleFactura);

	public DetalleFactura Seleccionar(String id);

	public void actualizar(DetalleFactura detalleFactura);

	public void eliminar(String id);

}
