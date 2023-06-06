package com.example.demo.supermaxi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.supermaxi.repository.IProductoRepository;
import com.example.demo.supermaxi.repository.modelo.Producto;

@Service
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	private IProductoRepository productoRepository;

	@Override
	public void ingresar(Producto producto) {
		// TODO Auto-generated method stub
		/*
		 * Funcionalidad que permite ingresar un Producto, con un stock definido, y que
		 * debe sumar al stock existente en el caso de que el producto ya esté
		 * registrado en el sistema. Nota: La validacion para saber si un producto esta
		 * registrado en el sitema, se lo debe realizar por el código de barras.
		 * 
		 */

		// producto:producto que va a ingresar-----prod:producto de la base de datos
		// busco el producto en la base de datos por el codigo de barras
		Producto prod = this.productoRepository.buscar(producto.getCodigoBarras());// producto de la base de datos
		// validamos que el producto existe por codigo de barras
		if (producto.getCodigoBarras().equals(prod.getCodigoBarras())) {
			// sumo el stock del producto a ingresar al stock del producto existente
			Integer stockProducto = producto.getStock() + prod.getStock();
			// actualizo el stock del producto en la base de datos
			prod.setStock(stockProducto);
			this.productoRepository.actualizar(prod);
		} else {
			// si el producto no existe solamente lo inserto en la base de datos
			this.productoRepository.insertar(producto);
		}

	}

	@Override
	public Producto buscar(String codigoBarras) {
		// TODO Auto-generated method stub
		return this.productoRepository.buscar(codigoBarras);
	}

	@Override
	public void actualizar(Producto producto) {
		// TODO Auto-generated method stub
		this.productoRepository.actualizar(producto);

	}

	@Override
	public void eliminar(String codigoBarras) {
		// TODO Auto-generated method stub
		this.productoRepository.eliminar(codigoBarras);

	}

	@Override
	public List<Producto> reporteProductos() {
		// TODO Auto-generated method stub
		return this.productoRepository.seleccionarTodos();
	}

}
