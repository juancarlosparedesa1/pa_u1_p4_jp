package com.example.demo.repository.modelo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.EstudianteRepository;

@Repository
public class EstudianteRepositoryImpl implements EstudianteRepository {

	// creamos la base de datos-mockeados

	private List<Estudiante> baseDatos = new ArrayList<>();

	@Override
	public void insertar(Estudiante estudiante) {
		// añadimos el estudiante a la base de datos
		baseDatos.add(estudiante);
	}

	@Override
	public Estudiante seleccionar(String cedula) {
		// buscar o seleccionar un estudiante
		// instanciamos un objeto estudiante
		Estudiante estudianteEncontrado = new Estudiante();
		// recorremos la lista con for-each
		for (Estudiante estu : baseDatos) {
			// comparamos la cedula ingresada con la cedula del estudiante en la BD
			if (cedula.equals(estu.getCedula())) {
				// si encuentra la cedula asignamos al estudiante instanciado ese
				// estudiante
				estudianteEncontrado = estu;
			}
		}
		// retornamos el estudiante encontrado
		return estudianteEncontrado;
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// buscar el estudiante o seleccionar el estudiante a actualizar
		// 1.elimino el estudiante por cedula
		this.eliminar(estudiante.getCedula());
		// 2.inserto el estudiante en la lista
		this.insertar(estudiante);
	}

	@Override
	public void eliminar(String cedula) {
		// eliminar estudiante
		Estudiante estu = this.seleccionar(cedula);
		baseDatos.remove(estu);
	}

	@Override
	public List<Estudiante> SeleccionarTodos() {
		// TODO Auto-generated method stub
		return baseDatos;
	}

}
