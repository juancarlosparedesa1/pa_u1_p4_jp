package com.example.demo.banco.repository;

import com.example.demo.banco.repository.modelo.Cuenta;

public interface CuentaRepository {

	// crud
	public void insertar(Cuenta cuenta);

	public Cuenta Seleccionar(String numero);

	public void actualizar(Cuenta cuenta);

	public void eliminar(String numero);

}
