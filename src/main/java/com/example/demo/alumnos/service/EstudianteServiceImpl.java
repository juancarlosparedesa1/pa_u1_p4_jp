package com.example.demo.alumnos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.alumnos.repository.EstudianteRepository;
import com.example.demo.alumnos.repository.modelo.Estudiante;

@Service
public class EstudianteServiceImpl implements EstudianteService{

	@Autowired
	private EstudianteRepository estudianteRepository;
	@Override
	public void insertar(Estudiante estudiante) {
		this.estudianteRepository.insertar(estudiante);
	}

	@Override
	public Estudiante buscar(String cedula) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.Seleccionar(cedula);
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		this.estudianteRepository.actualizar(estudiante);
	}

	@Override
	public void borrar(String cedula) {
		this.estudianteRepository.eliminar(cedula);
	}

	@Override
	public List<Estudiante> reporte() {
		// TODO Auto-generated method stub
		return this.estudianteRepository.SeleccionarTodos();
	}

}
