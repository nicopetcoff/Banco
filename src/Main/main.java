package Main;
import java.util.*;

import Clases.*;
import ClasesAbstractas.*;
import Fachada.*;

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Banco b= new Banco();
		
		int opcion;
		
		do {
			
			System.out.println("Bienvenido al Banco, elija una opcion");
			System.out.println("1.\t Crear Cuenta");
			System.out.println("2.\t Agregar titular a cuenta");
			
			
			opcion= sc.nextInt();
			
			
			switch(opcion) {
			case 1:
				
				System.out.println("Indice si es: "
						+ "\n1: \t Caja de Ahorro en Pesos"
						+ "\n2: \t Caja de Ahorro en Dolares"
						+ "\n3: \t Cuenta Corriente en Pesos"
						+ "\n4: \t Cuenta Corriente en Dolares");
				
				int tipoCuenta = sc.nextInt();
				
				System.out.println("Elija cliente por su ID");
				System.out.println();
				b.verClientes();
				int clienteID = sc.nextInt();
				Cliente ce = b.soyEseCliente(clienteID);
				
				b.crearCuenta(tipoCuenta, ce);
				break;
				
			case 2:
				
				b.verCuentas();
				System.out.println("Elija la cuenta por su ID");
				
				int idCuenta = sc.nextInt();
				
				CuentaBancaria ce1 = b.soyLaCuenta(idCuenta);
				
				System.out.println("Elija Cliente por su ID");
				System.out.println();
				b.verClientes();
				int clienteID1 = sc.nextInt();
				Cliente ce11 = b.soyEseCliente(clienteID1);
				
				b.agregarMasClientesCuenta(ce1, ce11);
				
				break;
				
			default:
				break;
			}
			
		}while (opcion!=4);
		
		sc.close();
		
	}

}
