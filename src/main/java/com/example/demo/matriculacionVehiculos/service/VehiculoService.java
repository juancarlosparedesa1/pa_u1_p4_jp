package com.example.demo.matriculacionVehiculos.service;

import com.example.demo.matriculacionVehiculos.repository.modelo.Vehiculo;

public interface VehiculoService {

	public void insertar(Vehiculo vehiculo);

	public Vehiculo buscar(String placa);

	public void actualizar(Vehiculo vehiculo);

	public void eliminar(String placa);

}
