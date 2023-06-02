package com.example.demo.alumnos.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.alumnos.repository.modelo.Estudiante;

@Repository
public class EstudianteRepositoryImpl implements EstudianteRepository {

	private List<Estudiante> baseDatos = new ArrayList<>();

	@Override
	public void insertar(Estudiante estudiante) {
		baseDatos.add(estudiante);
	}

	@Override
	public Estudiante Seleccionar(String cedula) {
		Estudiante estudianteEncontrado = new Estudiante();
		for (Estudiante estu : baseDatos) {
			if (cedula.equals(estu.getCedula())) {
				estudianteEncontrado = estu;
			}
		}
		return estudianteEncontrado;
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// elimino
		this.eliminar(estudiante.getCedula());
		// inserto
		this.insertar(estudiante);

	}

	@Override
	public void eliminar(String cedula) {
		// busco
		Estudiante estu = this.Seleccionar(cedula);
		// elimino de la bd
		baseDatos.remove(estu);
	}

	@Override
	public List<Estudiante> SeleccionarTodos() {
		// TODO Auto-generated method stub
		return baseDatos;
	}

}
