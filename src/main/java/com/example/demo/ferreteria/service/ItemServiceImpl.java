package com.example.demo.ferreteria.service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.ferreteria.repository.modelo.Item;

public class ItemServiceImpl implements ItemService {
	private List<Item> baseDatos = new ArrayList<>();

	@Override
	public void insertar(Item item) {
		// TODO Auto-generated method stub
		baseDatos.add(item);

	}

	@Override
	public Item Seleccionar(String id) {
		Item itemEncontrado = new Item();
		for (Item item : baseDatos) {
			if (id.equals(item.getId())) {
				itemEncontrado = item;
			}

		}
		return itemEncontrado;
	}

	@Override
	public void actualizar(Item item) {
		// TODO Auto-generated method stub
		this.eliminar(item.getId());
		this.insertar(item);

	}

	@Override
	public void eliminar(String id) {
		Item item = this.Seleccionar(id);
		baseDatos.remove(item);

	}

}
