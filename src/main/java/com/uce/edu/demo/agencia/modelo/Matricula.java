package com.uce.edu.demo.agencia.modelo;

import java.util.List;

public class Matricula {
	private String numero;
	private List<Vehiculos> vehiculos;
	
	//Set y Get
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public List<Vehiculos> getVehiculos() {
		return vehiculos;
	}
	public void setVehiculos(List<Vehiculos> vehiculos) {
		this.vehiculos = vehiculos;
	}
	
	
	//metodo toString
	@Override
	public String toString() {
		return "Matricula [numero=" + numero + ", vehiculos=" + vehiculos + "]";
	}
	
	
	
}
