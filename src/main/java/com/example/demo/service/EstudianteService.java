package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;

public interface EstudianteService {

	public void guardar(Estudiante estudiante);

	public void actualizar(Estudiante estudiante);

	public Estudiante Seleccionar(String cedula);

	public void borrar(String cedula);

	public List<Estudiante> ReporteTodos();

}
