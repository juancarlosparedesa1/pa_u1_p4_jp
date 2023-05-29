package com.example.demo.banco.repository;

import com.example.demo.banco.repository.modelo.Cuenta;

public interface CuentaRepository {

	// CRUD
	// create
	public void insertar(Cuenta cuenta);

	// Read-buscar-seleccionar
	public Cuenta Seleccionar(String numero);

	// Update-actualizar-modificar
	public void actualizar(Cuenta cuenta);

	// Delete
	public void eliminar(String numero);

}
