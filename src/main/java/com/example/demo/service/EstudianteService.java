package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;

public interface EstudianteService {
	// guardaactualizarbuscarporcedulaborrarreportede todos
	// metodos crud
	public void guardar(Estudiante estudiante);

	public void actualizar(Estudiante estudiante);

	// buscar o seleccionar es valido
	// se busca por un identificacdor
	public Estudiante buscarPorCedula(String cedula);

	// eliminamos por un identificador
	public void borrar(String cedula);

	// metodo seleccionar todos
	// debe retornar una lista de estudiantes
	public List<Estudiante> reporteTodos();
}
