package com.uce.edu.demo.agencia.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.agencia.modelo.Matricula;
@Repository
public class MatriculaRepositoryImpl implements IMatriculaRepository {

	@Override
	public void insertar(Matricula ma) {
		// TODO Auto-generated method stub
		System.out.println("se ha insertado matricula: " + ma);
	}

	@Override
	public Matricula buscar(String numero) {
		System.out.println("Se ha buscado la matricula: "+numero);
		Matricula ma = new Matricula();
		ma.setNumero(numero);
		return ma;
	}

	@Override
	public void actualizar(Matricula ma) {
		// TODO Auto-generated method stub
		System.out.println("se ha actualizado la matricula " + ma);
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("se ha eliminado la matricula " + numero);
	}

}
