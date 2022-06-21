package com.uce.edu.demo.agencia.repository;

import com.uce.edu.demo.agencia.modelo.Matricula;

public interface IMatriculaRepository {

	public void insertar(Matricula ma);

	
	public Matricula buscar(String numero);

	
	public void actualizar(Matricula ma);

	
	public void eliminar(String numero);
}
