package com.example.demo.matriculacionbd.service;

import com.example.demo.matriculacionbd.repository.modelo.Propietariobd;

public interface IPropietariobdService {
	public void guardar(Propietariobd propietario);

	public Propietariobd buscar(String identificacion);

	public void Actualizar(Propietariobd propietario);

	public void borrar(String identificacion);
}
