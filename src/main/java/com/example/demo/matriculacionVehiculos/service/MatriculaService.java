package com.example.demo.matriculacionVehiculos.service;

import java.util.List;

import com.example.demo.matriculacionVehiculos.repository.modelo.Matricula;

public interface MatriculaService {
	public void crear(Matricula matricula);

	public void realizar(String identificacion, String placa);
	
	public List<Matricula>reporte();

}
