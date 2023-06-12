package com.example.demo.matriculacionbd.repository.modelo;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "propietariobd")
public class Propietariobd {

	@Id
	@Column(name = "prop_id")
	private Integer id;
	@Column(name = "prop_nombre")
	private String nombre;

	@Column(name = "prop_apellido")
	private String apellido;

	@Column(name = "prop_identificacion")
	private String identificacion;

	@Column(name = "prop_fechNacimiento")
	private LocalDateTime fechaNacimiento;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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
		return "Propietariobd [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", identificacion="
				+ identificacion + ", fechaNacimiento=" + fechaNacimiento + "]";
	}

}
