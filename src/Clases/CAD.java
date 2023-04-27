package Clases;

import java.util.*;

import ClasesAbstractas.*;

/**
 * 
 */
public class CAD extends CuentaBancaria {

	public CAD(Cliente e) {
		super(e);
		this.identificador = "CAD" +idCuenta;
		this.importeMantenimiento = 10;
		this.tasaInteres= (float) 1.05;
	}

	@Override
	public void quitarSaldo(float importe) {
		
		if ((saldo-importe)>0) {
			
			saldo = saldo-importe;
			
		}		
	}



}