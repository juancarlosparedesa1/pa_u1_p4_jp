package com.example.demo.ferreteria.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.ferreteria.repository.FacturaDetalleRepository;
import com.example.demo.ferreteria.repository.modelo.DetalleFactura;
import com.example.demo.ferreteria.repository.modelo.Item;

@Service
public class FacturaDetalleServiceImpl implements FacturaDetalleService {

	@Autowired
	private FacturaDetalleRepository facturaDetalleRepository;

	@Override
	public void insertar(DetalleFactura detalleFactura) {
		// TODO Auto-generated method stub
		this.facturaDetalleRepository.insertar(detalleFactura);
	}

	@Override
	public DetalleFactura Seleccionar(String id) {
		// TODO Auto-generated method stub
		return this.facturaDetalleRepository.Seleccionar(id);
	}

	@Override
	public void actualizar(DetalleFactura detalleFactura) {
		// TODO Auto-generated method stub
		this.facturaDetalleRepository.actualizar(detalleFactura);
	}

	@Override
	public void eliminar(String id) {
		// TODO Auto-generated method stub
		this.facturaDetalleRepository.eliminar(id);
	}

	@Override
	public void realizar(List<Item> producto, String cedula, String numero) {
		// TODO Auto-generated method stub
		// busco el producto

	}

}
