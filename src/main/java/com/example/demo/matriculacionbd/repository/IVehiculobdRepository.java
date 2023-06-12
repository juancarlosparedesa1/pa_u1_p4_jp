package com.example.demo.matriculacionbd.repository;

import com.example.demo.matriculacionbd.repository.modelo.Vehiculobd;

public interface IVehiculobdRepository {
	
	public void insertar(Vehiculobd vehiculo);
	public Vehiculobd buscar(String placa);
	public void Actualizar(Vehiculobd vehiculo);
	public void eliminar(String placa); 

}
