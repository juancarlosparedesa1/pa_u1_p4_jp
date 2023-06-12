package com.example.demo.matriculacionbd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.matriculacionbd.repository.IPropietariobdRepository;
import com.example.demo.matriculacionbd.repository.modelo.Propietariobd;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Service
public class PropietariobdServiceImpl implements IPropietariobdService {

	@Autowired
	private IPropietariobdRepository propietarioRepository;

	@Override
	public void guardar(Propietariobd propietario) {
		// TODO Auto-generated method stub
		this.propietarioRepository.insertar(propietario);
	}

	@Override
	public Propietariobd buscar(String identificacion) {
		// TODO Auto-generated method stub
		return this.propietarioRepository.buscar(identificacion);
	}

	@Override
	public void Actualizar(Propietariobd propietario) {
		// TODO Auto-generated method stub
		this.propietarioRepository.Actualizar(propietario);

	}

	@Override
	public void borrar(String identificacion) {
		// TODO Auto-generated method stub
		this.propietarioRepository.eliminar(identificacion);

	}

}
