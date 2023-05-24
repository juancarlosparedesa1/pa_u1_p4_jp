package com.example.demo.banco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.banco.repository.CuentaRepository;
import com.example.demo.banco.repository.modelo.Cuenta;

@Service
public class CuentaServiceImpl implements CuentaRepository {

	@Autowired
	private CuentaRepository cuentaRepository;

	@Override
	public void insertar(Cuenta cuenta) {
		// TODO Auto-generated method stub
		this.cuentaRepository.insertar(cuenta);
	}

	@Override
	public void actualizar(Cuenta cuenta) {
		// TODO Auto-generated method stub
		this.cuentaRepository.actualizar(cuenta);
	}

	@Override
	public void elimiar(String numero) {
		// TODO Auto-generated method stub
		this.cuentaRepository.elimiar(numero);
	}

	@Override
	public Cuenta SeleccionarPorNumero(String numero) {
		// TODO Auto-generated method stub
		return this.cuentaRepository.SeleccionarPorNumero(numero);
	}

}
