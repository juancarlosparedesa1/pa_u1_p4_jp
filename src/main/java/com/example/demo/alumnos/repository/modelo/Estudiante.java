package com.example.demo.alumnos.repository.modelo;

import java.time.LocalDateTime;

public class Estudiante {

	private String nombre;
	private String apellido;
	private String cedula;
	private LocalDateTime fechaInscripción;

	// set y get
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

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public LocalDateTime getFechaInscripción() {
		return fechaInscripción;
	}

	public void setFechaInscripción(LocalDateTime fechaInscripción) {
		this.fechaInscripción = fechaInscripción;
	}

	// to string
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", fechaInscripción="
				+ fechaInscripción + "]";
	}

}
