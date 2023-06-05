package com.example.demo.matriculacionVehiculos.service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.matriculacionVehiculos.repository.MatriculaRepository;
import com.example.demo.matriculacionVehiculos.repository.PropietarioRepository;
import com.example.demo.matriculacionVehiculos.repository.VehiculoRepository;
import com.example.demo.matriculacionVehiculos.repository.modelo.Matricula;
import com.example.demo.matriculacionVehiculos.repository.modelo.Propietario;
import com.example.demo.matriculacionVehiculos.repository.modelo.Vehiculo;

@Service
public class MatriculaServiceImpl implements MatriculaService {

	@Autowired
	private MatriculaRepository matriculaRepository;
	@Autowired
	private PropietarioRepository propietarioRepository;
	@Autowired
	private VehiculoRepository vehiculoRepository;

	@Override
	public void crear(Matricula matricula) {
		// TODO Auto-generated method stub
		this.matriculaRepository.insertar(matricula);

	}

	@Override
	public void realizar(String identificacion, String placa) {
		// TODO Auto-generated method stub
		// buscamos el propietario
		Propietario prop = this.propietarioRepository.buscar(identificacion);
		// buscamos el vehiculo
		Vehiculo vehi = this.vehiculoRepository.buscar(placa);
		// seteamos la fecha de la matricula
		// creamos matricula
		Matricula mat = new Matricula();
		mat.setFechaMatricula(LocalDateTime.now());
		// calculamos el valor de la matricula

		// tradicional
		// creamos la variable (atributo) valor matricula
		// BigDecimal valorMatricula = new BigDecimal(0.0);
		// mat.setValorMatricula(new BigDecimal(0.0));
		BigDecimal valorMatricula = null;
		if (vehi.getTipo().equalsIgnoreCase("m")) {
			valorMatricula = vehi.getPrecio().add(vehi.getPrecio().multiply(new BigDecimal(0.1)));
		} else {
			if (vehi.getTipo().equalsIgnoreCase("a")) {
				valorMatricula = vehi.getPrecio().add(vehi.getPrecio().multiply(new BigDecimal(0.15)));
			}
		}
		BigDecimal valor = new BigDecimal(3000);
		if (valorMatricula.compareTo(valor) > 0) { // -1 b >a 0 b=a 1 a >b
			valorMatricula = valorMatricula.subtract(valorMatricula.multiply(new BigDecimal(0.09)));
		}
		mat.setValorMatricula(valorMatricula);
		mat.setPropietario(prop);
		mat.setVehiculo(vehi);
		this.matriculaRepository.insertar(mat);
		// propietario
		// vehiculo

	}

	@Override
	public List<Matricula> reporte() {
		// TODO Auto-generated method stub
		return this.matriculaRepository.SeleccionarTodos();
	}

}
