package com.uce.edu.demo.agencia.repository;

import com.uce.edu.demo.agencia.modelo.Propietario;

public interface IPropietarioRepository {
	
	public void insertar(Propietario p);

	public Propietario buscar(String cedula);

	public void actualizar(Propietario p);

	public void eliminar(String cedula);
}
