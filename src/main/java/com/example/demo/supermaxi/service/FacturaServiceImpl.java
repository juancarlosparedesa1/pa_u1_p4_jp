package com.example.demo.supermaxi.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.supermaxi.repository.IFacturaRepository;
import com.example.demo.supermaxi.repository.IProductoRepository;
import com.example.demo.supermaxi.repository.modelo.Factura;
import com.example.demo.supermaxi.repository.modelo.Producto;

@Service
public class FacturaServiceImpl implements IFacturaService {

	@Autowired
	private IFacturaRepository facturaRepository;
	@Autowired
	private IProductoRepository productoRepository;

	@Override
	public void insertar(Factura factura) {
		// TODO Auto-generated method stub
		this.facturaRepository.insertar(factura);

	}

	@Override
	public Factura buscar(String id) {
		// TODO Auto-generated method stub
		return this.facturaRepository.buscar(id);
	}

	@Override
	public void actualizar(Factura factura) {
		// TODO Auto-generated method stub
		this.facturaRepository.actualizar(factura);
	}

	@Override
	public void eliminar(String id) {
		// TODO Auto-generated method stub
		this.facturaRepository.eliminar(id);

	}

	@Override
	public void realizarVenta(List<Producto> listaproductos, String cedulaCliente, String numeroVenta) {
		// TODO Auto-generated method stub
		/*
		 * Funcionalidad que permite realizar una venta, a partir de los siguientes
		 * datos: • Lista de Productos (objeto únicamente con atributos: código de
		 * barras y cantidad) • Cédula del Cliente • Número de la factura
		 * 
		 * Se debe controlar que la cantidad de venta de un Producto sea menor o igual
		 * que el stock disponible; si existe un Producto con un menor stock disponible,
		 * se debe realizar la venta con el stock disponible; y si no hay stock
		 * disponible (stock igual a cero o no existe el producto), lanzar una excepción
		 * que reverse toda la transacción de la venta.
		 * 
		 * Nota: Todos los cálculos deben ser realizados en la lógica de negocio. Nota:
		 * Para los datos de la venta, considere escenarios reales de cómo se realiza
		 * una venta y considerar en la transacción funcionalidades que dejen integra y
		 * consistente la información del modelo entidad-relación propuesto.
		 * 
		 * 
		 */

		// si voy a vender busco el producto,para buscar el producto recorro la lista de
		// productos
		for (Producto productoVenta : listaproductos) {
			// busco el producto en la base de datos por el codigo de barras
			Producto prodBuscado = this.productoRepository.buscar(productoVenta.getCodigoBarras());
			// valido que el stock del producto a vender y que no sea nulo
			if (prodBuscado != null && (prodBuscado.getStock() >= productoVenta.getStock())) {
				// resto la cantidad de producto buscado(vender)-cantidad de producto de la bd
				Integer nuevostock = prodBuscado.getStock() - productoVenta.getStock();
				// actualizo el stock del producto
				prodBuscado.setStock(nuevostock);
				this.productoRepository.actualizar(prodBuscado);

			} else {
				System.out.println("Producto no encontrado o Stock no disponible");
			}
		}

		// Realizo la factura(venta)
		Factura factura = new Factura();
		factura.setCedulaCliente(cedulaCliente);
		factura.setFecha(LocalDateTime.now());
		factura.setId("01");
		factura.setNumero(numeroVenta);
		// inserto la factura en la bse de datos
		this.facturaRepository.insertar(factura);

	}

	@Override
	public List<Factura> reporteFacturas() {
		// TODO Auto-generated method stub
		return this.facturaRepository.seleccionarTodos();
	}

}
