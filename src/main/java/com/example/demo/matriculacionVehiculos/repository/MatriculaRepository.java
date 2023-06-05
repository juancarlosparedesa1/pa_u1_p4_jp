package com.example.demo.matriculacionVehiculos.repository;

import java.util.List;

import com.example.demo.matriculacionVehiculos.repository.modelo.Matricula;

public interface MatriculaRepository {
	public void insertar(Matricula matricula);
	public List<Matricula>SeleccionarTodos();

}
