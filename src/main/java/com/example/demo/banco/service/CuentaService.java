package com.example.demo.banco.service;

import com.example.demo.banco.repository.modelo.Cuenta;

public interface CuentaService {

	// crud
	public void guardar(Cuenta cuenta);

	public Cuenta Seleccionar(String numero);

	public void actualizar(Cuenta cuenta);

	public void borrar(String numero);

}
