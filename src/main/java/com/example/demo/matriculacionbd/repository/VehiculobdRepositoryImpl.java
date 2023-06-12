package com.example.demo.matriculacionbd.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.matriculacionbd.repository.modelo.Vehiculobd;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class VehiculobdRepositoryImpl implements IVehiculobdRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Vehiculobd vehiculo) {
		// TODO Auto-generated method stub
		this.entityManager.persist(vehiculo);

	}

	@Override
	public Vehiculobd buscar(String placa) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Vehiculobd.class, placa);
	}

	@Override
	public void Actualizar(Vehiculobd vehiculo) {
		// TODO Auto-generated method stub
		this.entityManager.merge(vehiculo);

	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		Vehiculobd vehi = this.buscar(placa);
		this.entityManager.remove(vehi);

	}

}
