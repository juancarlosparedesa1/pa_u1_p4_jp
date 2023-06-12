package com.example.demo.matriculacionbd.service;

import com.example.demo.matriculacionbd.repository.modelo.Vehiculobd;

public interface IVehiculobdService {

	public void guardar(Vehiculobd vehiculo);

	public Vehiculobd buscar(String placa);

	public void Actualizar(Vehiculobd vehiculo);

	public void borrar(String placa);

}
