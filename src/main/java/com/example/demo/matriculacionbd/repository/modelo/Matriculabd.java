package com.example.demo.matriculacionbd.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "matricula")
public class Matriculabd {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "matric_seq")
	@SequenceGenerator(name = "matric_seq", sequenceName = "matric_seq", allocationSize = 1)
	@Column(name = "matric_id")
	private Integer id;
	@Column(name = "matric_fecha")
	private LocalDateTime fecha;
	@Column(name = "matric_valor")
	private BigDecimal valor;
	@Column(name = "matric_propietario")
	private Propietariobd propietario;
	@Column(name = "matric_vehiculo")
	private Vehiculobd vehiculo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Propietariobd getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietariobd propietario) {
		this.propietario = propietario;
	}

	public Vehiculobd getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculobd vehiculo) {
		this.vehiculo = vehiculo;
	}

	@Override
	public String toString() {
		return "Matricula [id=" + id + ", fecha=" + fecha + ", valor=" + valor + ", propietario=" + propietario
				+ ", vehiculo=" + vehiculo + "]";
	}

}
