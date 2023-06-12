package com.example.demo.matriculacionbd.service;

import com.example.demo.matriculacionbd.repository.modelo.Matriculabd;

public interface IMatriculabdService {

	public void guarda(Matriculabd matricula);

	public void realizarMatricula(String identificacion, String placa);

}
