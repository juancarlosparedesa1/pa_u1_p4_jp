package com.example.demo;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.supermaxi.repository.modelo.Producto;
import com.example.demo.supermaxi.service.IFacturaService;
import com.example.demo.supermaxi.service.IProductoService;

@SpringBootApplication
public class Spring01Application implements CommandLineRunner {

//	@Autowired
//	private VehiculoService vehiculoService;
//	@Autowired
//	private PropietarioService propietarioService;
//	@Autowired
//	private MatriculaService matriculaService;

//	@Autowired
//	private ItemService itemService;
//	@Autowired
//	private FacturaService facturaService;

	// @Autowired
//	@Qualifier("internacional")
//	private TransferenciaComisionService transferenciaComisionService;

	// inyeccion de dependencias
	@Autowired
	private IProductoService productoService;
	@Autowired
	private IFacturaService facturaService;

	public static void main(String[] args) {
		SpringApplication.run(Spring01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// Supermecados supermaxi
		// 1. Insertar desde la clase principal 1 Producto (por dos ocasiones cada
		// producto)

		// creo el producto
		Producto producto1 = new Producto();
		producto1.setCategoria("bebidas");
		producto1.setCodigoBarras("001");
		producto1.setId("01");
		producto1.setPrecio(new BigDecimal(50));
		producto1.setStock(100);

		// inserto el producto en la base de datos
		this.productoService.ingresar(producto1);
		this.productoService.ingresar(producto1);

		// 2.Desde la clase principal realizar 1 venta con un item.
		List<Producto> productos = this.productoService.reporteProductos();
		this.facturaService.realizarVenta(productos, "1726897299", "0001");

		// imprimir la base de datos de productos
		List<Producto> listaProductos = this.productoService.reporteProductos();
		for (Producto producto : listaProductos) {
			System.out.println(producto);

		}

	}

}
