package com.uce.edu.demo.agencia.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.agencia.modelo.Propietario;
@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository{

	@Override
	public void insertar(Propietario p) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado en la base el propietario:"+ p);
		
	}

	@Override
	public Propietario buscar(String cedula) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado en la base el propietario:"+ cedula);
		Propietario p=new Propietario();
		p.setNombre(cedula);
		return p;
	}

	@Override
	public void actualizar(Propietario p) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base el propietario:"+ p);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base el propietario: "+ cedula);
		
	}


}
