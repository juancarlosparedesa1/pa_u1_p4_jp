package com.example.demo.ferreteria.repository;

import com.example.demo.ferreteria.repository.modelo.DetalleFactura;

public interface FacturaDetalleRepository {
	// Crud
	public void insertar(DetalleFactura detalleFactura);

	public DetalleFactura Seleccionar(String id);

	public void actualizar(DetalleFactura detalleFactura);

	public void eliminar(String id);

}
