package com.uce.edu.demo.agencia.service;

import com.uce.edu.demo.agencia.modelo.Matricula;

public interface IMatriculaService {
	public void insertarMatricula(Matricula ma);

	public Matricula buscarMatricula(String numero);

	public void actualizarMatricula(Matricula ma);

	public void eliminarMatricula(String numero);
}
