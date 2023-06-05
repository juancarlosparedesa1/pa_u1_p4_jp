package com.example.demo.ferreteria.service;

import java.util.List;

import com.example.demo.ferreteria.repository.modelo.Item;

public interface ItemService {

	// Crud
	public void ingresar(Item item);

	public Item Seleccionar(String codigoBarras);

	public void actualizar(Item item);

	public void eliminar(String codigoBarras);

	public void ingresarItem(String codigoBarras, Integer stock);

	public List<Item> reporteItem();
}
