package com.uce.edu.demo;

import java.math.BigDecimal;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.agencia.modelo.Matricula;
import com.uce.edu.demo.agencia.modelo.Propietario;
import com.uce.edu.demo.agencia.modelo.Vehiculos;
import com.uce.edu.demo.agencia.service.IFachadaVehiculos;
import com.uce.edu.demo.agencia.service.IMatriculaService;
import com.uce.edu.demo.agencia.service.IVehiculosService;

@SpringBootApplication
public class PruebaPaP2McApplication implements CommandLineRunner{
	
	@Autowired
	private IMatriculaService iMatriculaService;
	
	@Autowired
	private IFachadaVehiculos iFachadaVehiculos;
	
	@Autowired
	private IVehiculosService iVehiculosService;
	
	

	public static void main(String[] args) {
		SpringApplication.run(PruebaPaP2McApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Propietario p1=new Propietario();
		p1.setApellido("Cen");
		p1.setNombre("Michael");
		p1.setCedula("1720757101");
		
		Vehiculos auto1=new Vehiculos();
		auto1.setModelo("mazda");
		auto1.setPlaca("123");
		auto1.setPrecio(new BigDecimal(1000));
		auto1.setPropietario(p1);
		auto1.setTipoVehiculo("Pesado");
		auto1.setValorMatricula(this.iFachadaVehiculos.calcularValor("P"));
		
		
		
		//Aqui Actualizo
		auto1.setModelo("mercedez");
		this.iVehiculosService.actualizarVehiculo(auto1);
		
		Matricula ma1 = new Matricula();
		ma1.setNumero("11321456");
		ma1.setVehiculos(new ArrayList<Vehiculos>());
		ma1.getVehiculos().add(auto1);
		this.iMatriculaService.insertarMatricula(ma1);
		
		
		

		
		
		
		
		
	}

}
