package com.example.demo.matriculacionVehiculos.repository;

import com.example.demo.matriculacionVehiculos.repository.modelo.Vehiculo;

public interface VehiculoRepository {

	public void insertar(Vehiculo vehiculo);

	public Vehiculo buscar(String placa);

	public void actualizar(Vehiculo vehiculo);

	public void eliminar(String placa);

}
