package com.uce.edu.demo.agencia.service;

import com.uce.edu.demo.agencia.modelo.Propietario;

public interface IPropietarioService {
	
	public void insertarPropietario(Propietario p);

	public Propietario buscarPropietario(String cedula);

	public void actualizarPropietario(Propietario p);

	public void eliminarPropietario(String cedula);
}
