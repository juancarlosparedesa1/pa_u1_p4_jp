package com.example.demo.repository;

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
}
