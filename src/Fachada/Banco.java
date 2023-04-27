package Fachada;
import java.util.*;

import Clases.*;
import ClasesAbstractas.CuentaBancaria;

public class Banco {
	
	private ArrayList<Cliente> clientes ;
	private ArrayList <CuentaBancaria> cuentas;
	
	public Banco() {
		
		this.clientes = new ArrayList<>();
		this.cuentas = new ArrayList<>();
		
		clientes.add(new Cliente("Nicolas","41577536", "Quilmes"));
		clientes.add(new Cliente("Carlos","4111111", "Quilmes"));
		clientes.add(new Cliente("Pedro","42111111", "Quilmes"));
	}
	
	public void agregarClienteConEnvio(Cliente c) {
		clientes.add(c);
	}
	
	public void agregarClienteSinEnvio(Cliente c) {
		clientes.add(c);
	}
	
	public void verClientes() {
		for(Cliente c: clientes)
			if(c.estaActivo())
				System.out.println(c);			
	}
	
	public Cliente soyEseCliente(int clienteID) {
		
		for(Cliente c: clientes) {
			if(c.getIdCliente()==clienteID)
				return c;
		}
		return null;
	}
	
	public void crearCuenta(int tipoCuenta,Cliente c){
		

		
		if(tipoCuenta==1){			
			CAP cap = new CAP(c);
			cuentas.add(cap);
		} 
		else if(tipoCuenta==2){			
			CAD cad = new CAD(c);
			cuentas.add(cad);
		}
		
		else if(tipoCuenta==3){			
			CCP ccp = new CCP(c);
			cuentas.add(ccp);
		}		

		else if(tipoCuenta==4){			
			CCD ccd = new CCD(c);
			cuentas.add(ccd);
		}
		
	}
	
	public void verCuentas() {
		for(CuentaBancaria cb : cuentas)
			System.out.println(cb);
	}
	
	public CuentaBancaria soyLaCuenta(int id){
		
		for (int i = 0; i < cuentas.size() ; i++) {
			if(cuentas.get(i).getID().equals(id)) {
				return cuentas.get(i);
			}
		}
		return null;
		
	}
	
	public void agregarMasClientesCuenta(CuentaBancaria c, Cliente e) {
		
		c.agregarMasClientes(e);		
		
	}

	public CuentaBancaria buscarCuentasCliente(Cliente c) {
		
		for (CuentaBancaria cb : cuentas) {
			if(cb.tengoEseCliente(c)){
				return cb;
			}
						
		}
		return null;
		
	}

}