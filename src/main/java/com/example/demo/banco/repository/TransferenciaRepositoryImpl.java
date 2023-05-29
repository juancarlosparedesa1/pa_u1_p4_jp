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
	public Transferencia seleccionar(String numero) {
		Transferencia transferEncotrada = new Transferencia();
		for (Transferencia transfer : baseDatos) {
			if (numero.equals(transfer.getNumero())) {
				transferEncotrada = transfer;
			}
		}
		return transferEncotrada;
	}

	@Override
	public void actualizar(Transferencia transferencia) {
		// eliminamos la cuenta por numero
		this.eliminar(transferencia.getNumero());
		// insertaos la transferenca
		this.insertar(transferencia);

	}

	@Override
	public void eliminar(String numero) {
		// busco la cuenta por numero
		Transferencia transfer = this.seleccionar(numero);
		// elimino la cuenta de la base de datos
		baseDatos.remove(transfer);

	}

}
