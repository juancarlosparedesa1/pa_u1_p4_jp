package com.example.demo.matriculacionVehiculos.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.matriculacionVehiculos.repository.PropietarioRepository;
import com.example.demo.matriculacionVehiculos.repository.modelo.Propietario;
import com.example.demo.matriculacionVehiculos.repository.modelo.Vehiculo;

@Service
public class PropietarioServiceImpl implements PropietarioService {

	@Autowired
	private PropietarioRepository propietarioRepository;

	@Override
	public void insertar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.propietarioRepository.insertar(propietario);

	}

	@Override
	public Propietario buscar(String identificacion) {
		// TODO Auto-generated method stub
		return this.propietarioRepository.buscar(identificacion);
	}

	@Override
	public void actualizar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.propietarioRepository.actualizar(propietario);

	}

	@Override
	public void eliminar(String identificacion) {
		// TODO Auto-generated method stub
		this.propietarioRepository.eliminar(identificacion);
	}

}
