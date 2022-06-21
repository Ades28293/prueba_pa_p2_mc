package com.uce.edu.demo.agencia.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.agencia.modelo.Vehiculos;
import com.uce.edu.demo.agencia.repository.IVehiculosRepository;

@Service
public class FachadaVehiculosImpl implements IFachadaVehiculos{
	@Autowired
	@Qualifier("livianos")
	private IVehiculosService iVehiculosServiceL;
	
	@Autowired
	@Qualifier("pesados")
	private IVehiculosService iVehiculosServiceP;
	
	@Autowired
	private IVehiculosRepository iVehiculosRepository;
	

	@Override
	public BigDecimal calcularValor(String tipoVehiculo) {
		// TODO Auto-generated method stub
		BigDecimal valor = null;
		Vehiculos v=this.iVehiculosRepository.buscar(tipoVehiculo);
		if(v.getTipoVehiculo().equals("L")) {
			System.out.println("Vehiculo Liviano:");
			valor=this.iVehiculosServiceL.calcularValor(tipoVehiculo, v.getPrecio());
			
		}
		else {
			System.out.println("Vehiculo Pesado:");
			valor=this.iVehiculosServiceP.calcularValor(tipoVehiculo, v.getPrecio());
			
		}
		
		return valor;
	}

}
