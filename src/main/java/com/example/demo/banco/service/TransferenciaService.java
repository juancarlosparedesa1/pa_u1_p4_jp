package com.example.demo.banco.service;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.banco.repository.modelo.Transferencia;

public interface TransferenciaService {

	// crud
	public void guardar(Transferencia transferencia);

	public Transferencia Seleccionar(String numero);

	public void actualizar(Transferencia transferencia);

	public void borrar(String numero);

	public void realizar(String cuentaOrigen, String cuentaDestino, BigDecimal monto);

	// seleccionarTodos tambien
	public List<Transferencia> reporte();
}
