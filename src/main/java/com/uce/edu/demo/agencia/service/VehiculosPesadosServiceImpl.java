package com.uce.edu.demo.agencia.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.agencia.modelo.Vehiculos;

@Service
@Qualifier("pesados")
public class VehiculosPesadosServiceImpl implements IVehiculosService {

	@Override
	public void insertarVehiculo(Vehiculos v) {
		// TODO Auto-generated method stub

	}

	@Override
	public Vehiculos buscarVehiculo(String placa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizarVehiculo(Vehiculos v) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminarVehiculo(String placa) {
		// TODO Auto-generated method stub

	}

	@Override
	public BigDecimal calcularValor(String placa, BigDecimal precio) {
		// TODO Auto-generated method stub
		BigDecimal valorFinal = precio.multiply(new BigDecimal(12)).divide(new BigDecimal(100));

		return valorFinal;
	}

}
