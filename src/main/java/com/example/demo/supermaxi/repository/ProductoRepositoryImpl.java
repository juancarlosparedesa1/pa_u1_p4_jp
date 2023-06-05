package com.example.demo.supermaxi.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.supermaxi.repository.modelo.Producto;

@Repository
public class ProductoRepositoryImpl implements IProductoRepository {

	List<Producto> baseDatos = new ArrayList<>();

	@Override
	public void insertar(Producto producto) {
		// TODO Auto-generated method stub
		baseDatos.add(producto);

	}

	@Override
	public Producto buscar(String codigoBarras) {
		// TODO Auto-generated method stub
		Producto productoEncontrado = new Producto();
		for (Producto prod : baseDatos) {
			if (codigoBarras.equals(prod.getCodigoBarras())) {
				productoEncontrado = prod;

			}

		}
		return productoEncontrado;
	}

	@Override
	public void actualizar(Producto producto) {
		// TODO Auto-generated method stub
		this.eliminar(producto.getCodigoBarras());
		this.insertar(producto);

	}

	@Override
	public void eliminar(String codigoBarras) {
		// TODO Auto-generated method stub
		Producto prod = this.buscar(codigoBarras);
		baseDatos.remove(prod);

	}

	@Override
	public List<Producto> seleccionarTodos() {
		// TODO Auto-generated method stub
		return baseDatos;
	}

}
