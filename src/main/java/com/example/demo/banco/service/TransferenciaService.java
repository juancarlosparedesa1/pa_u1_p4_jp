package com.example.demo.banco.service;

import java.math.BigDecimal;

import com.example.demo.banco.repository.modelo.Transferencia;

public interface TransferenciaService {

	// CRUD
	public void Realizar(String numeroCtaOrigen, String numeroCtaDestino, BigDecimal monto);

	public Transferencia Seleccionar(String numero);

	public void actualizar(Transferencia transferencia);

	public void eliminar(String numero);
}
