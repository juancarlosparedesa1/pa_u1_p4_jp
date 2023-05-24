package com.example.demo.banco.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.repository.modelo.Cuenta;

@Repository
public class CuentaRepositoryImpl implements CuentaRepository {

	private static List<Cuenta> baseDatos = new ArrayList<>();

	@Override
	public void insertar(Cuenta cuenta) {
		// TODO Auto-generated method stub
		baseDatos.add(cuenta);
	}

	@Override
	public void actualizar(Cuenta cuenta) {
		// TODO Auto-generated method stub
		this.elimiar(cuenta.getNumero());
		this.insertar(cuenta);
	}

	@Override
	public void elimiar(String numero) {
		// TODO Auto-generated method stub
		Cuenta cuenta = this.SeleccionarPorNumero(numero);
		baseDatos.remove(cuenta);
	}

	@Override
	public Cuenta SeleccionarPorNumero(String numero) {

		Cuenta cuentaEncontrada = new Cuenta();
		for (Cuenta cuenta : baseDatos) {
			if (numero.equals(cuenta.getNumero())) {
				cuentaEncontrada = cuenta;
			}

		}
		return cuentaEncontrada;
	}

}
