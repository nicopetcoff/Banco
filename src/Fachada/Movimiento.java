package Fachada;

import Clases.*;
import ClasesAbstractas.*;

public class Movimiento {
	
	CuentaBancaria cuentabancaria;
	Cliente cliente;
	
	public void depositar(Cliente c, CuentaBancaria cb, float importe) {
		
		cb.agregarSaldo(importe);
		
	}
	

}
