package com.example.demo.matriculacionVehiculos.repository;

import com.example.demo.matriculacionVehiculos.repository.modelo.Propietario;

public interface PropietarioRepository {
	public void insertar(Propietario propietario);

	public Propietario buscar(String identificacion);

	public void actualizar(Propietario propietario);

	public void eliminar(String identificacion);
}
