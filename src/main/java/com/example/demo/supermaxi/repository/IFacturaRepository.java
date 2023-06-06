package com.example.demo.supermaxi.repository;

import java.util.List;

import com.example.demo.supermaxi.repository.modelo.Factura;

public interface IFacturaRepository {

	// CRUD IBAE
	public void insertar(Factura factura);

	public Factura buscar(String id);

	public void actualizar(Factura factura);

	public void eliminar(String id);
	
	public List<Factura>seleccionarTodos();
}
