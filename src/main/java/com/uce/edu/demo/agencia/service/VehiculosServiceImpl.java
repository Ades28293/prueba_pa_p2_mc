package com.uce.edu.demo.agencia.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.agencia.modelo.Vehiculos;
import com.uce.edu.demo.agencia.repository.IVehiculosRepository;


@Service
@Primary
public class VehiculosServiceImpl implements IVehiculosService {
	@Autowired
	private IVehiculosRepository iVehiculosRepository;
	
	
	
	@Override
	public void insertarVehiculo(Vehiculos v) {
		// TODO Auto-generated method stub
	this.iVehiculosRepository.insertar(v);
	}

	@Override
	public Vehiculos buscarVehiculo(String placa) {
		// TODO Auto-generated method stub
		return this.iVehiculosRepository.buscar(placa);
	}

	@Override
	public void actualizarVehiculo(Vehiculos v) {
		// TODO Auto-generated method stub
		this.iVehiculosRepository.actualizar(v);
		
	}

	@Override
	public void eliminarVehiculo(String placa) {
		// TODO Auto-generated method stub
		this.iVehiculosRepository.eliminar(placa);
	}

	@Override
	public BigDecimal calcularValor(String placa, BigDecimal precio) {
		// TODO Auto-generated method stub
		return null;
	}
}
