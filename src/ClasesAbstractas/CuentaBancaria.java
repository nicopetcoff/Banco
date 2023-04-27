package ClasesAbstractas;
import java.util.*;
import Clases.*;


public abstract class CuentaBancaria {
	

    protected  int idCuenta;
    
    protected static int idsiguiente=1;

    protected float saldo;

    protected ArrayList<Cliente> titulares;

    protected float importeMantenimiento;

    protected float tasaInteres;

    protected boolean giroDescubierto;

    protected float limiteDescubierto;

    protected float tasaDescubierto;

	public int getId; //implementar en las clases :/
    
    

    public CuentaBancaria(Cliente e) {
		
		this.idCuenta = idsiguiente;
		idsiguiente++;
		this.saldo = 0;
		this.titulares = new ArrayList<>();
		this.titulares.add(e);
	}
    
        @Override
	public String toString() {
		return "CuentaBancaria [ID=" + idCuenta + ", titulares=" + titulares + "]";
	}

	public void agregarMasClientes(Cliente e) {
    	
    	titulares.add(e);
    }    

    public boolean tengoEseCliente(Cliente c) {
    	
    	return titulares.contains(c);
    	
    }
    
    public void agregarSaldo(float importe) {
    	
    	saldo=saldo+importe;
    }

	public float getSaldo() {
        // TODO implement here
        return 0.0f;
    }
	
	

}