package com.example.demo.matriculacionbd.repository.modelo;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "propietario")
public class Propietariobd {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prop_seq")
	@SequenceGenerator(name = "prop_seq", sequenceName = "prop_seq", allocationSize = 1)
	@Column(name = "prop_id")
	private String id;
	@Column(name = "prop_nombre")
	private String nombre;
	@Column(name = "prop_apellido")
	private String apellido;
	@Column(name = "prop_identificacion")
	private String identificacion;
	@Column(name = "prop_fechNacimiento")
	private LocalDateTime fechaNacimiento;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Propietario [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", identificacion="
				+ identificacion + ", fechaNacimiento=" + fechaNacimiento + "]";
	}

}
