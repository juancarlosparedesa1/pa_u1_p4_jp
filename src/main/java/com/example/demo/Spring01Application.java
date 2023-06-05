package com.example.demo;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.ferreteria.repository.modelo.Item;
import com.example.demo.ferreteria.service.ItemService;

@SpringBootApplication
public class Spring01Application implements CommandLineRunner {

//	@Autowired
//	private VehiculoService vehiculoService;
//	@Autowired
//	private PropietarioService propietarioService;
//	@Autowired
//	private MatriculaService matriculaService;

	@Autowired
	private ItemService itemService;

	@Autowired
//	@Qualifier("internacional")
//	private TransferenciaComisionService transferenciaComisionService;

	public static void main(String[] args) {
		SpringApplication.run(Spring01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Creamos un item1(producto)
		Item item1 = new Item();
		item1.setCodigoBarras("001");
		item1.setId("01");
		item1.setNombre("Coca cola");
		item1.setPrecio(new BigDecimal(100));
		item1.setStock(200);
		// ingreso el producto
		this.itemService.ingresar(item1);
		this.itemService.ingresar(item1);
		// Creamos un item1(producto)
		Item item2 = new Item();
		item2.setCodigoBarras("002");
		item2.setId("01");
		item2.setNombre("gatorade");
		item2.setPrecio(new BigDecimal(100));
		item2.setStock(200);
		this.itemService.ingresar(item2);
		this.itemService.ingresar(item2);

		// this.itemService.eliminar(item1.getCodigoBarras());
		List<Item> reporteItems = this.itemService.reporteItem();

		for (Item item : reporteItems) {
			System.out.println(item);
		}

	}

}
