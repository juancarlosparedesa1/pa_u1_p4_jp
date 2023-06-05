package com.example.demo.matriculacionVehiculos.service;

import com.example.demo.matriculacionVehiculos.repository.modelo.Propietario;

public interface PropietarioService {
	public void insertar(Propietario propietario);

	public Propietario buscar(String identificacion);

	public void actualizar(Propietario propietario);

	public void eliminar(String identificacion);
}
