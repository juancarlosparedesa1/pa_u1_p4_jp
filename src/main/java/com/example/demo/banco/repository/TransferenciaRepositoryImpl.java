package com.example.demo.banco.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.repository.modelo.Transferencia;

@Repository
public class TransferenciaRepositoryImpl implements TransferenciaRepository {

	private static List<Transferencia> baseDatos = new ArrayList<>();

	@Override
	public void insertar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		baseDatos.add(transferencia);

	}

	@Override
	public void actualizar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		this.elimiar(transferencia.getNumero());
		this.insertar(transferencia);
	}

	@Override
	public void elimiar(String numero) {
		// TODO Auto-generated method stub
		Transferencia transfer = this.SeleccionarPorNumero(numero);
		baseDatos.remove(transfer);

	}

	@Override
	public Transferencia SeleccionarPorNumero(String numero) {
		// TODO Auto-generated method stub
		Transferencia transEncontrado = new Transferencia();
		for (Transferencia trans : baseDatos) {
			if (numero.equals(trans.getNumero())) {
				transEncontrado = trans;
			}

		}
		return transEncontrado;

	}

	@Override
	public List<Transferencia> SeleccionarTodos() {
		// TODO Auto-generated method stub
		return baseDatos;
	}

}
