package com.example.demo.supermaxi.service;

import java.util.List;

import com.example.demo.supermaxi.repository.modelo.Producto;

public interface IProductoService {

	// CRUD IBAE
	public void ingresar(Producto producto);

	public Producto buscar(String codigoBarras);

	public void actualizar(Producto producto);

	public void eliminar(String codigoBarras);

	public List<Producto> reporteProductos();

}
