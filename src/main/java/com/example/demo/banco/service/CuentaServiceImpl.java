package com.example.demo.banco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.banco.repository.CuentaRepository;
import com.example.demo.banco.repository.modelo.Cuenta;

@Service
public class CuentaServiceImpl implements CuentaService {

	@Autowired
	private CuentaRepository cuentaRepository;

	@Override
	public void Crear(Cuenta cuenta) {
		this.cuentaRepository.insertar(cuenta);
	}

	@Override
	public Cuenta Seleccionar(String numero) {
		return this.cuentaRepository.Seleccionar(numero);
	}

	@Override
	public void actualizar(Cuenta cuenta) {
		this.cuentaRepository.actualizar(cuenta);
	}

	@Override
	public void eliminar(String numero) {
		this.cuentaRepository.eliminar(numero);
	}

}
