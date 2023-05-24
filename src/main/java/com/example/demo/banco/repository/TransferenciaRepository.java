package com.example.demo.banco.repository;

import com.example.demo.banco.repository.modelo.Transferencia;

public interface TransferenciaRepository {

	public void insertar(Transferencia transferencia);

	public void actualizar(Transferencia transferencia);

	public void elimiar(String numero);

	public Transferencia SeleccionarPorNumero(String numero);
}
