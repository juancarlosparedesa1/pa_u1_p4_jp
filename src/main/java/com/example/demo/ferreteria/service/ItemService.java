package com.example.demo.ferreteria.service;

import com.example.demo.ferreteria.repository.modelo.Item;

public interface ItemService {

	// Crud
	public void insertar(Item item);

	public Item Seleccionar(String id);

	public void actualizar(Item item);

	public void eliminar(String id);
}
