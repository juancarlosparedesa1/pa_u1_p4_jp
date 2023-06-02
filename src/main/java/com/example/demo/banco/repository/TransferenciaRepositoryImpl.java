package com.example.demo.banco.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.repository.modelo.Transferencia;

@Repository
public class TransferenciaRepositoryImpl implements TransferenciaRepository {

	private List<Transferencia> baseDatos = new ArrayList<>();

	@Override
	public void insertar(Transferencia transferencia) {
		baseDatos.add(transferencia);

	}

	@Override
	public Transferencia Seleccionar(String numero) {
		Transferencia transferEncontrada = new Transferencia();
		for (Transferencia transfer : baseDatos) {
			if (numero.equals(transfer.getNumero())) {
				transferEncontrada = transfer;
			}

		}
		return transferEncontrada;

	}

	@Override
	public void actualizar(Transferencia transferencia) {
		// elimino
		this.eliminar(transferencia.getNumero());
		// inserto
		this.insertar(transferencia);
	}

	@Override
	public void eliminar(String numero) {
		Transferencia transfer = this.Seleccionar(numero);
		baseDatos.remove(transfer);
	}

	@Override
	public List<Transferencia> buscarTodos() {
		// TODO Auto-generated method stub
		return baseDatos;
	}

}
