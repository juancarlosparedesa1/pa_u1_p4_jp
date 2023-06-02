package com.example.demo.ferreteria.repository;

import com.example.demo.ferreteria.repository.modelo.Factura;

public interface FacturaRepository {

	// Crud
	public void insertar(Factura factura);

	public Factura Seleccionar(String id);

	public void actualizar(Factura factura);

	public void eliminar(String id);
}
