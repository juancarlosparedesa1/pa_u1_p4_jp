package com.example.demo.matriculacionbd.repository;

import com.example.demo.matriculacionbd.repository.modelo.Propietariobd;

public interface IPropietariobdRepository {
	public void insertar(Propietariobd propietario);

	public Propietariobd buscar(String identificacion);

	public void Actualizar(Propietariobd propietario);

	public void eliminar(String identificacion);
}
