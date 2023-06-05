package com.example.demo.ferreteria.service;

import java.util.List;

import com.example.demo.ferreteria.repository.modelo.DetalleFactura;
import com.example.demo.ferreteria.repository.modelo.Item;

public interface FacturaDetalleService {
	// Crud
	public void insertar(DetalleFactura detalleFactura);

	public DetalleFactura Seleccionar(String id);

	public void actualizar(DetalleFactura detalleFactura);

	public void eliminar(String id);

	public void realizar(List<Item> producto, String cedula, String numero);

}
