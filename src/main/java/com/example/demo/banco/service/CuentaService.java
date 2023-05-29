package com.example.demo.banco.service;

import java.math.BigDecimal;

import com.example.demo.banco.repository.modelo.Cuenta;

public interface CuentaService {
	// CRUD
	public void Crear(Cuenta cuenta);

	public Cuenta Seleccionar(String numero);

	public void actualizar(Cuenta cuenta);

	public void eliminar(String numero);
}
