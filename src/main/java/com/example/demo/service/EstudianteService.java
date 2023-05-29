package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;

public interface EstudianteService {

	// CRUD

	// Crear-insertar-guardar
	public void guardar(Estudiante estudiante);

	// Read-leer-seleccionar-buscar
	public Estudiante Seleccionar(String cedula);

	// Update-actualizar-modificar
	public void modificar(Estudiante estudiante);

	// Eliminar-delete-borrar
	public void borrar(String cedula);

	// opcionn reporte
	public List<Estudiante> reporte();

}
