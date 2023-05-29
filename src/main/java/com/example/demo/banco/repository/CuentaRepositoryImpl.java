package com.example.demo.banco.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.repository.modelo.Cuenta;

@Repository
public class CuentaRepositoryImpl implements CuentaRepository {

	private List<Cuenta> baseDatos = new ArrayList<>();

	@Override
	public void insertar(Cuenta cuenta) {
		baseDatos.add(cuenta);

	}

	@Override
	public Cuenta Seleccionar(String numero) {
		Cuenta cuentaEncontrada = new Cuenta();
		for (Cuenta cuenta : baseDatos) {
			if (numero.equals(cuenta.getNumero())) {
				cuentaEncontrada = cuenta;
			}
		}
		return cuentaEncontrada;
	}

	@Override
	public void actualizar(Cuenta cuenta) {
		this.eliminar(cuenta.getNumero());
		this.insertar(cuenta);
	}

	@Override
	public void eliminar(String numero) {
		Cuenta cuent = this.Seleccionar(numero);
		baseDatos.remove(cuent);

	}

}
