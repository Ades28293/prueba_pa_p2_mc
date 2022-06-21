package com.uce.edu.demo.agencia.modelo;

import java.math.BigDecimal;

public class Vehiculos {
	private String tipoVehiculo;
	private String modelo;
	private String placa;
	private Propietario propietario;
	private BigDecimal precio;
	private BigDecimal valorMatricula;
	
	//Set y Get 
	public String getTipoVehiculo() {
		return tipoVehiculo;
	}
	public void setTipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public Propietario getPropietario() {
		return propietario;
	}
	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	public BigDecimal getValorMatricula() {
		return valorMatricula;
	}
	public void setValorMatricula(BigDecimal valorMatricula) {
		this.valorMatricula = valorMatricula;
	}
	
	
	@Override
	public String toString() {
		return "Vehiculos [tipoVehiculo=" + tipoVehiculo + ", modelo=" + modelo + ", placa=" + placa + ", propietario="
				+ propietario + ", precio=" + precio + ", valorMatricula=" + valorMatricula + "]";
	}
	
	
	
	
}
