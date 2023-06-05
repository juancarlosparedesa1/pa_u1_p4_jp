package com.example.demo.ferreteria.repository;

import java.util.List;

import com.example.demo.ferreteria.repository.modelo.Item;

public interface ItemRepository {

	// Crud
	public void insertar(Item item);

	public Item Seleccionar(String codigoBarras);

	public void actualizar(Item item);

	public void eliminar(String codigoBarras);

	public List<Item> SeleccionarTodos();
}
