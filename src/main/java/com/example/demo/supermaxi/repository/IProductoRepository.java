package com.example.demo.supermaxi.repository;

import java.util.List;

import com.example.demo.supermaxi.repository.modelo.Producto;

public interface IProductoRepository {

	// CRUD IBAE
	public void insertar(Producto producto);

	public Producto buscar(String codigoBarras);

	public void actualizar(Producto producto);

	public void eliminar(String codigoBarras);

	public List<Producto> seleccionarTodos();
}
