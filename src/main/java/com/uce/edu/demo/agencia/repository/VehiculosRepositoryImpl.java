package com.uce.edu.demo.agencia.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.agencia.modelo.Vehiculos;
@Repository
public class VehiculosRepositoryImpl implements IVehiculosRepository{

	@Override
	public void insertar(Vehiculos v) {
		// TODO Auto-generated method stub
		// Aqui se realiza la insercion en la base de datos
		System.out.println("Se ha insertado en la base el vehiculo:" + v);
	}

	@Override
	public Vehiculos buscar(String placa) {
		System.out.println("Se ha buscado en la base el vehiculo:" + placa);
		Vehiculos v = new Vehiculos();
		v.setPlaca(placa);
		v.setPrecio(new BigDecimal(2500));
		//v.setTipoVehiculo("P");
		v.setTipoVehiculo("L");
		return v;
	}

	@Override
	public void actualizar(Vehiculos v) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base el vehiculo:" + v);
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base el vehiculo:" + placa);
	}


}
