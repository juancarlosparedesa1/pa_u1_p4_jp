package com.example.demo.ferreteria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ferreteria.repository.ItemRepository;
import com.example.demo.ferreteria.repository.modelo.Item;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemRepository itemRepository;

	@Override
	public void ingresar(Item item) {
		// busco el item
		Item item1 = this.itemRepository.Seleccionar(item.getCodigoBarras());
		// valido que el item este registrado en el sistema
		if (item.getCodigoBarras().equals(item1.getCodigoBarras())) {
			Integer stock = item.getStock() + item1.getStock();
			// seteo el stock
			item1.setStock(stock);
			// actualizo el stock
			this.itemRepository.actualizar(item);
		} else {
			this.itemRepository.insertar(item);
		}

	}

	@Override
	public Item Seleccionar(String codigoBarras) {
		// TODO Auto-generated method stub
		return this.itemRepository.Seleccionar(codigoBarras);
	}

	@Override
	public void actualizar(Item item) {
		// TODO Auto-generated method stub
		this.itemRepository.actualizar(item);
	}

	@Override
	public void eliminar(String codigoBarras) {
		// TODO Auto-generated method stub
		this.itemRepository.eliminar(codigoBarras);
	}

	@Override
	public void ingresarItem(String codigoBarras, Integer stock) {
		// TODO Auto-generated method stub
		// busco el item
//		Item item = this.itemRepository.Seleccionar(codigoBarras);
//		Integer stockExistente = item.getStock();
//		// validar que el item este registrado en el sistema
//		if (codigoBarras.equals(item.getCodigoBarras())) {
//			stockExistente = stock + item.getStock();
//		} else {
//			stockExistente = stock;
//
//		}
//
//		// seteamos el strock del item
//		item.setStock(stockExistente);
//		// actualizamos el stock del item en la bd
//		this.itemRepository.actualizar(item);
//
//		// ingresamos el item en la BD
//		this.itemRepository.insertar(item);

	}

	@Override
	public List<Item> reporteItem() {
		// TODO Auto-generated method stub
		return this.itemRepository.SeleccionarTodos();
	}

}
