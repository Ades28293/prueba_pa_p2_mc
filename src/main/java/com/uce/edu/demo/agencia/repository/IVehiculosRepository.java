package com.uce.edu.demo.agencia.repository;

import com.uce.edu.demo.agencia.modelo.Vehiculos;

public interface IVehiculosRepository {

	public void insertar(Vehiculos v);

	public Vehiculos buscar(String placa);

	public void actualizar(Vehiculos v);

	public void eliminar(String placa);
}
