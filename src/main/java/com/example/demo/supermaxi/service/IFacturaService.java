package com.example.demo.supermaxi.service;

import java.util.List;

import com.example.demo.supermaxi.repository.modelo.Factura;
import com.example.demo.supermaxi.repository.modelo.Producto;

public interface IFacturaService {

	// CRUD IBAE
	public void insertar(Factura factura);

	public Factura buscar(String id);

	public void actualizar(Factura factura);

	public void eliminar(String id);

	public List<Factura> reporteFacturas();

	public void realizarVenta(List<Producto> productos, String cedulaCliente, String numeroVenta);
}
