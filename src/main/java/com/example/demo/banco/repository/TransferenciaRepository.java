package com.example.demo.banco.repository;

import com.example.demo.banco.repository.modelo.Transferencia;

public interface TransferenciaRepository {
	// CRUD

	// Create-crear-insertar-guardar
	public void insertar(Transferencia transferencia);

	// Read-leer-buscar-seleccionar
	public Transferencia seleccionar(String numero);

	// Update-actualizar-modificar
	public void actualizar(Transferencia transferencia);

	// eliminar-borrar-vender-alquilar
	public void eliminar(String numero);

	
}
