package Fachada;

import java.time.LocalDate;
import java.util.ArrayList;

import Clases.*;
import ClasesAbstractas.*;

public class Movimiento {
	
	CuentaBancaria cuentaBancaria;
	Cliente cliente;
	private LocalDate fechaMovimiento;
	
	
	
	public Movimiento() {
		
		this.cuentaBancaria = cuentaBancaria;
		this.cliente = cliente;
		this.fechaMovimiento = LocalDate.now();
	}
	public void depositar(Cliente c, CuentaBancaria cb, double importe) {
		
		cb.agregarSaldo(importe);
		
	}
	public void extraccion(Cliente c, CuentaBancaria cb, float importe) {
		
		cb.quitarSaldo(importe);		
	}
	
	public void consultarSaldo(Cliente c, CuentaBancaria e) {
		
		System.out.println(e.getSaldo());
	}

}
