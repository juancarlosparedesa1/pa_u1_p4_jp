package com.example.demo.matriculacionbd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.matriculacionbd.repository.IVehiculobdRepository;
import com.example.demo.matriculacionbd.repository.modelo.Vehiculobd;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Service
public class VehiculobdServiceImpl implements IVehiculobdService {

	@Autowired
	private IVehiculobdRepository vehiculoRepository;

	@Override
	public void guardar(Vehiculobd vehiculo) {
		// TODO Auto-generated method stub
		this.vehiculoRepository.insertar(vehiculo);
	}

	@Override
	public Vehiculobd buscar(String placa) {
		// TODO Auto-generated method stub
		return this.vehiculoRepository.buscar(placa);
	}

	@Override
	public void Actualizar(Vehiculobd vehiculo) {
		// TODO Auto-generated method stub
		this.vehiculoRepository.Actualizar(vehiculo);

	}

	@Override
	public void borrar(String placa) {
		// TODO Auto-generated method stub
		this.vehiculoRepository.eliminar(placa);
	}

}
