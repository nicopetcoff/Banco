package Main;
import java.nio.channels.ScatteringByteChannel;
import java.util.*;

import Clases.*;
import ClasesAbstractas.*;
import Fachada.*;

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Banco b= new Banco();
		Movimiento m = new Movimiento(b);
		
		int opcion;
		
		do {
			
			System.out.println("Bienvenido al Banco, elija una opcion");
			System.out.println("1.\t Crear Cuenta");
			System.out.println("2.\t Agregar titular a cuenta (SOLO CUENTAS CARGADAS)");
			System.out.println("3.\t Agregar Cliente");
			System.out.println("4.\t Consultar saldo de Cliente");
			System.out.println("5.\t Depositar dinero en cuenta de Cliente");
			System.out.println("6.\t Listar movimientos de una Cuenta de un Cliente");
			
			
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
				
			case 3:
				System.err.println("Indique nombre:\t");
				String nombrec = sc.next();
				
				System.out.println("Indique DNI:\t");
				String dni = sc.next();
				
				System.out.println("Indique domicilio:\t");
				String domic= sc.next();
				
				System.out.println("¿Envío digital?"
						+ "\n S"
						+ "\n N");
				String tcp = sc.next();
				
				if (tcp.equals("S")) {
					Cliente ce12 = new Cliente(nombrec, dni, domic);
					b.agregarClienteSinEnvio(ce12);
				} else if(tcp.equals("N")) {
					System.out.println("Indique codigo postal:\t");
					String cp = sc.next();
					
					Cliente ce13 = new Cliente(nombrec, dni, domic, cp);
					b.agregarClienteConEnvio(ce13);

				}				
				break;
				
			case 4:
				System.out.println("Elija Cliente por su ID");
				System.out.println();
				b.verClientes();
				int clienteID11 = sc.nextInt();
				Cliente ce111 = b.soyEseCliente(clienteID11);
				
				
				CuentaBancaria c111 = b.buscarCuentasCliente(ce111);
				
				 m.consultarSaldo(ce111, c111);			
				break;
				
			case 5:
				System.out.println("Elija Cliente por su ID");
				System.out.println();
				b.verClientes();
				int clienteID111 = sc.nextInt();
				Cliente ce1111 = b.soyEseCliente(clienteID111);
				
				
				CuentaBancaria c1111 = b.buscarCuentasCliente(ce1111);
				
				System.out.println("Ingrese importe");
				double importe= sc.nextDouble();
				
				 m.depositar(ce1111, c1111, importe);				 
				break;
				
			case 6:
				System.out.println("Elija Cliente por su ID");
				System.out.println();
				b.verClientes();
				int clienteID1111 = sc.nextInt();
				Cliente ce11111 = b.soyEseCliente(clienteID1111);
				
				
				CuentaBancaria c11111 = b.buscarCuentasCliente(ce11111);
				b.mostrarMovimientosDeClienteCuenta(ce11111, c11111);
				
							
				break;
				
			default:
				break;
			}
			
		}while (opcion!=7);
		
		sc.close();
		
	}

}
