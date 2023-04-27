package Clases;
import java.util.*;

import javax.swing.Spring;

/**
 * 
 */
public class Cliente {

    private String nombre;
    private int idCliente;
    private static int idSiguiente =100000;    
    private String documento;
    private String domicilio;
    private String cp;
    private boolean activo;
    
    
    
    
	public Cliente(String nombre, String documento, String domicilio) {
		this.nombre = nombre;
		this.idCliente = idSiguiente;
		idSiguiente++;
		this.documento = documento;
		this.domicilio = domicilio;
		this.activo= true;
	}
	
	public Cliente(String nombre, String documento, String domicilio, String cp) {
		this.nombre = nombre;
		this.idCliente = idSiguiente;
		idSiguiente++;
		this.documento = documento;
		this.domicilio = domicilio;
		this.cp= cp;
		this.activo= true;
	}
	
	public String toString() {
		return "Cliente [nombre=" + nombre + ", ID=" + idCliente + ", documento=" + documento + ", domicilio="
				+ domicilio + "]";
	}
	
	public void desactivarCliente() {
		this.activo=false;
	}
	
	public boolean estaActivo() {
		return activo;
	}

	public int getIdCliente() {
		return idCliente;
	}    


}