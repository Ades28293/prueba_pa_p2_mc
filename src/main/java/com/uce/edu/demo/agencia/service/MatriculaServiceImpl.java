package com.uce.edu.demo.agencia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.agencia.modelo.Matricula;
import com.uce.edu.demo.agencia.repository.IMatriculaRepository;

@Service
public class MatriculaServiceImpl implements IMatriculaService {
	@Autowired
	private IMatriculaRepository iMatriculaRepository;

	@Override
	public void insertarMatricula(Matricula ma) {
		// TODO Auto-generated method stub
		this.iMatriculaRepository.insertar(ma);

	}

	@Override
	public Matricula buscarMatricula(String numero) {
		// TODO Auto-generated method stub
		return this.iMatriculaRepository.buscar(numero);
	}

	@Override
	public void actualizarMatricula(Matricula ma) {
		// TODO Auto-generated method stub

		this.iMatriculaRepository.actualizar(ma);

	}

	@Override
	public void eliminarMatricula(String numero) {
		// TODO Auto-generated method stub
		this.iMatriculaRepository.eliminar(numero);

	}
}
