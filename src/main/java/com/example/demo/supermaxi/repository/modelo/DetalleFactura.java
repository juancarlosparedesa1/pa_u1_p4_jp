package com.example.demo.supermaxi.repository.modelo;

import java.math.BigDecimal;

public class DetalleFactura {
	private String id;
	private Integer cantidad;
	private BigDecimal precioUnitario;
	private BigDecimal subtotal;
	private Factura idVenta;
	private Producto idProducto;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public BigDecimal getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(BigDecimal precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public BigDecimal getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}
	public Factura getIdVenta() {
		return idVenta;
	}
	public void setIdVenta(Factura idVenta) {
		this.idVenta = idVenta;
	}
	public Producto getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Producto idProducto) {
		this.idProducto = idProducto;
	}
	@Override
	public String toString() {
		return "DetalleVenta [id=" + id + ", cantidad=" + cantidad + ", precioUnitario=" + precioUnitario
				+ ", subtotal=" + subtotal + ", idVenta=" + idVenta + ", idProducto=" + idProducto + "]";
	}

}
