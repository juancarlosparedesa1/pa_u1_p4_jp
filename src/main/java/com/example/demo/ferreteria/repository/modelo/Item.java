package com.example.demo.ferreteria.repository.modelo;

import java.math.BigDecimal;

public class Item {

	private String id;
	private String codigoBarras;
	private String nombre;
	private Integer stock;
	private BigDecimal precio;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", codigoBarras=" + codigoBarras + ", nombre=" + nombre + ", stock=" + stock
				+ ", precio=" + precio + "]";
	}

}
