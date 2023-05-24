package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;

public interface EstudianteRepository {
	// metodos crud
	public void insertar(Estudiante estudiante);

	public void actualizar(Estudiante estudiante);

	// buscar o seleccionar es valido
	// se busca por un identificacdor
	public Estudiante seleccionar(String cedula);

	// eliminamos por un identificador
	public void eliminar(String cedula);

	// metodo seleccionar todos
	// debe retornar una lista de estudiantes
	public List<Estudiante> seleccionarTodos();

}
