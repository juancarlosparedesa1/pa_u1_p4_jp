package com.example.demo.matriculacionVehiculos.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.matriculacionVehiculos.repository.modelo.Propietario;
import com.example.demo.matriculacionVehiculos.repository.modelo.Vehiculo;

@Repository
public class PropietarioRepositoryImpl implements PropietarioRepository {

	private List<Propietario> baseDatos = new ArrayList<>();

	@Override
	public void insertar(Propietario propietario) {
		// TODO Auto-generated method stub
		baseDatos.add(propietario);

	}

	@Override
	public Propietario buscar(String identificacion) {
		Propietario propietarioEncontrado = new Propietario();
		for (Propietario prop : baseDatos) {
			if (identificacion.equals(prop.getIdentificacion())) {
				propietarioEncontrado = prop;
			}
		}
		return propietarioEncontrado;
	}

	@Override
	public void actualizar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.eliminar(propietario.getIdentificacion());
		this.insertar(propietario);

	}

	@Override
	public void eliminar(String identificacion) {
		// TODO Auto-generated method stub
		Propietario prop = this.buscar(identificacion);
		baseDatos.remove(prop);

	}

}
