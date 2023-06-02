package com.example.demo.banco.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.cglib.core.Local;

public class Cuenta {
	private String numero;
	private String tipo;
	private BigDecimal saldo;
	private String cedula;
	private LocalDateTime fechaApertura;

	// setters and getters
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public LocalDateTime getFechaApertura() {
		return fechaApertura;
	}

	public void setFechaApertura(LocalDateTime fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	// to String
	@Override
	public String toString() {
		return "Transferencia [numero=" + numero + ", tipo=" + tipo + ", saldo=" + saldo + ", cedula=" + cedula
				+ ", fechaApertura=" + fechaApertura + "]";
	}

}
