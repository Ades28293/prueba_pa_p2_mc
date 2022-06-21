package com.uce.edu.demo.agencia.service;

import java.math.BigDecimal;

import com.uce.edu.demo.agencia.modelo.Vehiculos;

public interface IVehiculosService {

	public void insertarVehiculo(Vehiculos v);

	public Vehiculos buscarVehiculo(String placa);

	public void actualizarVehiculo(Vehiculos v);

	public void eliminarVehiculo(String placa);

	public BigDecimal calcularValor(String placa, BigDecimal precio);

}
