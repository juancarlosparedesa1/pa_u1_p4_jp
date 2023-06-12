package com.example.demo.matriculacionbd.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.matriculacionbd.repository.IMatriculabdRepository;
import com.example.demo.matriculacionbd.repository.IPropietariobdRepository;
import com.example.demo.matriculacionbd.repository.IVehiculobdRepository;
import com.example.demo.matriculacionbd.repository.modelo.Matriculabd;
import com.example.demo.matriculacionbd.repository.modelo.Propietariobd;
import com.example.demo.matriculacionbd.repository.modelo.Vehiculobd;

@Service
public class MatriculabdServiceImpl implements IMatriculabdService {

	@Autowired
	private IMatriculabdRepository matriculaRepository;
	@Autowired
	private IVehiculobdRepository vehiculoRepository;
	@Autowired
	private IPropietariobdRepository propietarioRepository;
	@Autowired
	@Qualifier("automatico")
	private IVehiculobdValorMatricula valorMatricula;

	@Override
	public void guarda(Matriculabd matricula) {
		// TODO Auto-generated method stub
		this.matriculaRepository.insertar(matricula);
	}

	@Override
	public void realizarMatricula(String identificacion, String placa) {
		// TODO Auto-generated method stub
		// 1.busco el vehiculo y propietario
		Vehiculobd vehi = this.vehiculoRepository.buscar(placa);
		Propietariobd prop = this.propietarioRepository.buscar(identificacion);
		// 2.Calculo el valor de la matricula(gestor y Qualifiers)

		BigDecimal valorMatricula = this.valorMatricula.calcularValorMatricula(vehi.getPrecio());

		// 3.Creamos la matricula
		Matriculabd matricula = new Matriculabd();
		matricula.setFecha(LocalDateTime.now());
		matricula.setPropietario(prop);
		matricula.setValor(valorMatricula);
		matricula.setVehiculo(vehi);
		// insertamos la matricula en la bd
		this.matriculaRepository.insertar(matricula);

	}

}
