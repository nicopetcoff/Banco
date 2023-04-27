package Clases;
import java.util.*;

import ClasesAbstractas.CuentaBancaria;

public class CCP extends CuentaBancaria {

	public CCP(Cliente e) {
		super(e);
		this.identificador = "CCP" +idCuenta;
		this.importeMantenimiento = 15;
		this.limiteDescubierto= -1000;
	}

	@Override
	public void quitarSaldo(float importe) {
		if ((saldo-importe)>limiteDescubierto) {
			
			saldo = saldo-importe;
			
		}
		
	}


}