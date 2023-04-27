package ClasesAbstractas;
import java.util.*;
import Clases.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class CuentaBancaria {
	

    protected  int idCuenta;
    
    protected static int idsiguiente=100000;
    
    protected String identificador;

    protected double saldo;

    protected ArrayList<Cliente> titulares;

    protected double importeMantenimiento;

    protected float tasaInteres;

    protected boolean giroDescubierto;

    protected float limiteDescubierto;

    protected float tasaDescubierto;
    
    protected LocalDate fechaActual ;
    
    public CuentaBancaria(Cliente e) {
		
		this.idCuenta = idsiguiente;
		idsiguiente++;
		this.saldo = 0;
		this.titulares = new ArrayList<>();
		this.titulares.add(e);
		this.fechaActual = LocalDate.now();
	}
    
        @Override
	public String toString() {
		return "CuentaBancaria [ID=" + identificador + ", titulares=" + titulares + "]";
	}

	public void agregarMasClientes(Cliente e) {
    	
    	titulares.add(e);
    }    

    public boolean tengoEseCliente(Cliente c) {
    	
    	return titulares.contains(c);
    	
    }
    
    public void agregarSaldo(double importe) {
    	
    	saldo=saldo+importe;
    }
    
    public abstract void quitarSaldo(float importe);

	public double getSaldo() {
        // TODO implement here
        return saldo;
    }
	
	public  String getID(){
		
		return identificador;
	}
	
	public void aplicarMantenimientoCuenta() {
		
		saldo= (float) (saldo-importeMantenimiento);
		fechaActual = LocalDate.now();
	}
	
	public void aplicarTasaInteres() {
		
	saldo = saldo*tasaInteres;		    
	    
	}
	
	

}