package com.example.demo.ferreteria.repository;

import com.example.demo.ferreteria.repository.modelo.Item;

public interface ItemRepository {

	// Crud
	public void insertar(Item item);

	public Item Seleccionar(String id);

	public void actualizar(Item item);

	public void eliminar(String id);
}
