package com.example.demo.banco.repository;

import java.util.List;

import com.example.demo.banco.repository.modelo.Transferencia;

public interface TransferenciaRepository {
	// crud
	public void insertar(Transferencia transferencia);

	public Transferencia Seleccionar(String numero);

	public void actualizar(Transferencia transferencia);

	public void eliminar(String numero);

	// seleccionarTodos tambien
	public List<Transferencia> buscarTodos();

}
