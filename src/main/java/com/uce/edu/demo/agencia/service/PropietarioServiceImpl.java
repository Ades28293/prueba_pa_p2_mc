package com.uce.edu.demo.agencia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.agencia.modelo.Propietario;
import com.uce.edu.demo.agencia.repository.IPropietarioRepository;

@Service
public class PropietarioServiceImpl implements IPropietarioService{
	@Autowired
	private IPropietarioRepository iPropietarioRepository;

	@Override
	public void insertarPropietario(Propietario p) {
		// TODO Auto-generated method stub
		this.iPropietarioRepository.insertar(p);
		
	}

	@Override
	public Propietario buscarPropietario(String nombre) {
		// TODO Auto-generated method stub
		return this.iPropietarioRepository.buscar(nombre);
	}

	@Override
	public void actualizarPropietario(Propietario p) {
		// TODO Auto-generated method stub
		this.iPropietarioRepository.actualizar(p);
	}

	@Override
	public void eliminarPropietario(String nombre) {
		// TODO Auto-generated method stub
		this.iPropietarioRepository.eliminar(nombre);
	}

}
