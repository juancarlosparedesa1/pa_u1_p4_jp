package com.example.demo.banco.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Cuenta {

	private String numero;
	private String tipo;
	private BigDecimal saldo;
	private String cedulaPropietario;
	private LocalDateTime fechaApertura;

	// get and set
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

	public String getCedulaPropietario() {
		return cedulaPropietario;
	}

	public void setCedulaPropietario(String cedulaPropietario) {
		this.cedulaPropietario = cedulaPropietario;
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
		return "Cuenta [numero=" + numero + ", tipo=" + tipo + ", saldo=" + saldo + ", cedulaPropietario="
				+ cedulaPropietario + ", fechaApertura=" + fechaApertura + "]";
	}

}
