package Fachada;

import java.time.LocalDate;
import java.util.ArrayList;

import Clases.*;
import ClasesAbstractas.*;

public class Movimiento {
	
	private CuentaBancaria cuentaBancaria;
	private Cliente cliente;
	private LocalDate fechaMovimiento;
	private String tipoMovimiento;
	private Banco b;
	
	
	
	public Movimiento(Banco b) {
		
		this.cuentaBancaria = cuentaBancaria;
		this.cliente = cliente;
		this.b=b;
		this.fechaMovimiento = LocalDate.now();		
	}
	
	public Movimiento(Cliente c, CuentaBancaria cb, String tipoMovimiento) {
		this.cliente= c;
		this.cuentaBancaria=cb;
		this.tipoMovimiento= tipoMovimiento;
	}
	public void depositar(Cliente c, CuentaBancaria cb, double importe) {
		
		cb.agregarSaldo(importe);
		this.fechaMovimiento = LocalDate.now();
		b.guardarMovimiento(c, cb, "Deposito");
		
		
	}
	public void extraccion(Cliente c, CuentaBancaria cb, float importe) {
		
		cb.quitarSaldo(importe);
		this.fechaMovimiento = LocalDate.now();				
		this.tipoMovimiento= "Extraccion";
		
	}
	
	public void consultarSaldo(Cliente c, CuentaBancaria e) {
		
		System.out.println(e.getSaldo());
	}
	public CuentaBancaria getCuentaBancaria() {
		return cuentaBancaria;
	}
	public Cliente getCliente() {
		return cliente;
	}
	@Override
	public String toString() {
		return "Movimiento [cuentaBancaria=" + cuentaBancaria + "\n, cliente=" + cliente + "\n, fechaMovimiento="
				+ fechaMovimiento + "\n, tipoMovimiento=" + tipoMovimiento + "]";
	}
	
	
	
}
