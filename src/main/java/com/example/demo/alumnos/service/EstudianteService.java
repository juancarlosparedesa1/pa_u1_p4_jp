package com.example.demo.alumnos.service;

import java.util.List;

import com.example.demo.alumnos.repository.modelo.Estudiante;

public interface EstudianteService {
	
	public void insertar(Estudiante estudiante);
	public Estudiante buscar(String cedula);
	public void actualizar(Estudiante estudiante);
	public void borrar (String cedula);
	public List<Estudiante>reporte();
}
