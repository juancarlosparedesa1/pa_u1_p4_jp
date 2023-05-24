package com.example.demo.banco.repository;

import com.example.demo.banco.repository.modelo.Cuenta;

public interface CuentaRepository {

	public void insertar(Cuenta cuenta);

	public void actualizar(Cuenta cuenta);

	public void elimiar(String numero);

	public Cuenta SeleccionarPorNumero(String numero);

}
