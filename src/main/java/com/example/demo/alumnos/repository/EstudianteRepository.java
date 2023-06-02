package com.example.demo.alumnos.repository;

import java.util.List;

import com.example.demo.alumnos.repository.modelo.Estudiante;

public interface EstudianteRepository {

	// Crud

	public void insertar(Estudiante estudiante);

	public Estudiante Seleccionar(String cedula);

	public void actualizar(Estudiante estudiante);

	public void eliminar(String cedula);

	public List<Estudiante>SeleccionarTodos();
}
