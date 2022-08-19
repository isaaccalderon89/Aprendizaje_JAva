package Ejercicio07;

import java.util.Scanner;

public class CuentaCliente {
	public static int buscarNumeroCuenta(Cuenta cuentas[], int n) {
		int i=0, indice = 0;
		boolean encontrado = false;
		
		//busqueda secuencial
		while ((i<cuentas.length) && (encontrado==false)) {
			if (cuentas[i].getNumeroCuenta() == n) {
				encontrado = true;
				indice = i;
			}
			i++;
		}
		if (encontrado == false) {
			indice =-1;
		}
		return indice;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		String nombre, apellido,dni;
		int numeroCuenta, nCuentas, opcion, indiceCuenta;
		double saldo, cantidad;
		Cuenta cuentas[];
		Cliente cliente;
		
		System.out.print("Introduzca el nombre del cliente: ");
		nombre = entrada.nextLine();
		System.out.print("Introduzca el apellido del cliente: ");
		apellido = entrada.nextLine();
		System.out.print("Introduzca el dni del cliente: ");
		dni = entrada.nextLine();
		System.out.print("Introduca el numero de cuentas que tiene en el Banco: ");
		nCuentas =  entrada.nextInt();
		
		//creamos el arreglo con el numero de cuentas del cliente
		cuentas = new Cuenta[nCuentas];
		
		for(int i=0; i<cuentas.length;i++) {
			System.out.println("\nIntroduzca los datos para la cuenta "+(i+1)+ ":");
			System.out.print("Introduzca el numero de cuenta: ");
			numeroCuenta= entrada.nextInt();
			System.out.print("Introduce el saldo de la cuenta: ");
			saldo = entrada.nextDouble();
			
			cuentas[i] = new Cuenta(numeroCuenta, saldo);
		}
		
		cliente = new Cliente (nombre, apellido, dni, cuentas);
		
		do {
			System.out.println("\t.:MENU:.");
			System.out.println("1. Ingresar dinero en la cuenta");
			System.out.println("2. Retirar dinero de la cuenta");
			System.out.println("3. Consultar saldo de la cuenta");
			System.out.println("4. Salir");
			System.out.println("Digite la opcion de menu: ");
			opcion = entrada.nextInt();
			
			switch(opcion) {
			case 1: System.out.println("\nIndique el numero de cuenta: ");
					numeroCuenta = entrada.nextInt();
					indiceCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);
					
					if(indiceCuenta == -1) {
						System.out.println("\nEl numero de cuenta ingresado no existe");
					}
					else {
						System.out.println("\nDigite la cantidad de dinero a ingresar:  ");
						cantidad = entrada.nextDouble();
						
						cliente.ingresar_dinero(indiceCuenta, cantidad);
						System.out.println("\nIngreso realizado correctamente");
						System.out.println("saldo disponible: "+cliente.consultar_saldo(indiceCuenta));
					}
					break;
			case 2: System.out.println("\nIndique el numero de cuenta: ");
					numeroCuenta = entrada.nextInt();
					indiceCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);
			
					if(indiceCuenta == -1) {
					System.out.println("\nEl numero de cuenta ingresado no existe");
					}
					else {
						System.out.println("\nDigite la cantidad de dinero que desea retirar: ");
						cantidad = entrada.nextDouble();
						
						if (cantidad > cliente.consultar_saldo(indiceCuenta)) {
							System.out.println("\nSaldo insuficiente");
						}
						else {
							cliente.retirar_dinero(indiceCuenta, cantidad);
							System.out.println("\nRetiro realizado correctamente");
							System.out.println("saldo disponible: "+cliente.consultar_saldo(indiceCuenta));
							
						}
						
					}
					break;
			case 3: System.out.println("\nIndique el numero de cuenta: ");
					numeroCuenta = entrada.nextInt();
					indiceCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);
	
					if(indiceCuenta == -1) {
					System.out.println("\nEl numero de cuenta ingresado no existe");
					}
					else {
						System.out.println("Saldo disponible: "+cliente.consultar_saldo(indiceCuenta));
					}
					break;
					
			case 4: break;
			default: System.out.println("Error 404 no found");
					
			
			}
			
		}while(opcion !=4);
		
	}

}
