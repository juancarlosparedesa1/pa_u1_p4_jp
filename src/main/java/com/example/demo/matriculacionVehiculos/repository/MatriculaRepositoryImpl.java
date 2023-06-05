package com.example.demo.matriculacionVehiculos.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.matriculacionVehiculos.repository.modelo.Matricula;

@Repository
public class MatriculaRepositoryImpl implements MatriculaRepository {

	public List<Matricula> baseDatos = new ArrayList<>();

	@Override
	public void insertar(Matricula matricula) {
		// TODO Auto-generated method stub
		baseDatos.add(matricula);
		System.out.println("Se inserto la matricula en la bd");
	}

	@Override
	public List<Matricula> SeleccionarTodos() {
		// TODO Auto-generated method stub
		return baseDatos;
	}

}
