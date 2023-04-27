package Clases;
import java.util.*;

import ClasesAbstractas.CuentaBancaria;

/**
 * 
 */
public class CCD extends CuentaBancaria {

	public CCD(Cliente e) {
		super(e);
		this.identificador = "CCD" +idCuenta;
		this.importeMantenimiento = 15;
	}

	@Override
	public void quitarSaldo(float importe) {
		if ((saldo-importe)>0) {
			
			saldo = saldo-importe;
			
		}
		
	}


}