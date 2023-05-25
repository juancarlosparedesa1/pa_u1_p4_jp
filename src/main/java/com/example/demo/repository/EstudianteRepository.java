package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;

public interface EstudianteRepository {
	// CRUD
	// Create-insertar
	public void insertar(Estudiante estudiante);

	// Read-buscar-seleccionar
	public Estudiante Seleccionar(String cedula);

	// Upadate-actualizar
	public void actualizar(Estudiante estudiante);

	public void eliminar(String cedula);
	
	public List<Estudiante>seleccionarTodos();

}
