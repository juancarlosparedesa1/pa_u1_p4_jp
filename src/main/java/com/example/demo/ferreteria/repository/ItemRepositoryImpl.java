package com.example.demo.ferreteria.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.ferreteria.repository.modelo.Item;

@Repository
public class ItemRepositoryImpl implements ItemRepository {
	private List<Item> baseDatos = new ArrayList<>();

	@Override
	public void insertar(Item item) {
		// TODO Auto-generated method stub
		baseDatos.add(item);

	}

	@Override
	public Item Seleccionar(String codigoBarras) {
		Item itemEncontrado = new Item();
		for (Item item : baseDatos) {
			if (codigoBarras.equals(item.getCodigoBarras())) {
				itemEncontrado = item;
			}

		}
		return itemEncontrado;
	}

	@Override
	public void actualizar(Item item) {
		// TODO Auto-generated method stub
		this.eliminar(item.getCodigoBarras());
		this.insertar(item);

	}

	@Override
	public void eliminar(String codigoBarras) {
		Item item = this.Seleccionar(codigoBarras);
		baseDatos.remove(item);

	}

	@Override
	public List<Item> SeleccionarTodos() {
		// TODO Auto-generated method stub
		return baseDatos;
	}

}
