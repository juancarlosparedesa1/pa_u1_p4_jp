package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Estudiante;

@Repository
public class EstudianteRepositoryImpl implements EstudianteRepository {

	private List<Estudiante> baseDeDatos = new ArrayList<>();

	@Override
	public void insertar(Estudiante estudiante) {
		baseDeDatos.add(estudiante);
	}

	@Override
	public Estudiante Seleccionar(String cedula) {

		Estudiante estudianteEncontrado = new Estudiante();
		// recorremos la lista
		for (Estudiante estu : baseDeDatos) {
			if (cedula.equals(estu.getCedula())) {
				estudianteEncontrado = estu;
			}
		}
		return estudianteEncontrado;
	}

	@Override
	public void actualizar(Estudiante estudiante) {

		// elimino el estudiante
		this.eliminar(estudiante.getCedula());
		// inserto el estudiante en la lista
		this.insertar(estudiante);

	}

	@Override
	public void eliminar(String cedula) {

		// buscamos por cedula
		Estudiante estu = this.Seleccionar(cedula);
		// removemos de la base de datos
		baseDeDatos.remove(estu);
	}

	@Override
	public List<Estudiante> seleccionarTodos() {
		// TODO Auto-generated method stub
		return baseDeDatos;
	}

}
