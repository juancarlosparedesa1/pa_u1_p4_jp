package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;

public interface EstudianteRepository {

	// CRUD

	// CREATE-INSERT-GUARDAR
	public void insertar(Estudiante estudiante);

	// Read-seleccionar-buscar
	public Estudiante seleccionar(String cedula);

	// Update-actualizar

	public void actualizar(Estudiante estudiante);

	// Delete-Eliminar-borrar

	public void eliminar(String cedula);

	// SeleccionarTodos-imprimir-reporte
	public List<Estudiante> SeleccionarTodos();

}
