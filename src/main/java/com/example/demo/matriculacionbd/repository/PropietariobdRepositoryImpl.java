package com.example.demo.matriculacionbd.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.matriculacionbd.repository.modelo.Propietariobd;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PropietariobdRepositoryImpl implements IPropietariobdRepository {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Propietariobd propietario) {
		// TODO Auto-generated method stub
		this.entityManager.persist(propietario);

	}

	@Override
	public Propietariobd buscar(String identificacion) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Propietariobd.class, identificacion);
	}

	@Override
	public void Actualizar(Propietariobd propietario) {
		// TODO Auto-generated method stub
		this.entityManager.merge(propietario);
	}

	@Override
	public void eliminar(String identificacion) {
		// TODO Auto-generated method stub
		Propietariobd prop = this.buscar(identificacion);
		this.entityManager.remove(prop);

	}

}
