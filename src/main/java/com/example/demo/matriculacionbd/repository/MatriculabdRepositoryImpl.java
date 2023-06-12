package com.example.demo.matriculacionbd.repository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.demo.matriculacionbd.repository.modelo.Matriculabd;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository("matriculacionbd")
@Transactional
public class MatriculabdRepositoryImpl implements IMatriculabdRepository {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Matriculabd matricula) {
		// TODO Auto-generated method stub
		this.entityManager.persist(matricula);
	}

}
