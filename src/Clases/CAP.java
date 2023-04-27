package Clases;
import java.util.*;

import ClasesAbstractas.CuentaBancaria;

/**
 * 
 */
public class CAP extends CuentaBancaria {

	public CAP(Cliente e) {
		super(e);
		this.identificador = "CAP" +idCuenta;
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