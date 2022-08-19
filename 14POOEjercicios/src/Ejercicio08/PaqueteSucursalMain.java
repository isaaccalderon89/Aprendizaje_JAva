package Ejercicio08;

import java.util.Scanner;

public class PaqueteSucursalMain {
	public static int buscarPaquete(Paquete t[], int numeroPaquete, int contadorPaquete) {
		int indice = 0;
		boolean encontrado = false;
		
		for(int i=0; i<contadorPaquete;i++) {
			if(t[i].getNumeroPaquete() == numeroPaquete) {
				encontrado = true;
				indice = i;
			}
		}
		if(encontrado == false) {
			indice = -1;
		}
		
		return indice;
		
	}
	
	public static int buscarSucursal(Sucursal t[], int numeroSucursal, int contadorSucursal) {
		int indice = 0;
		boolean encontrado = false;
		
		for(int i=0; i<contadorSucursal;i++) {
			if(t[i].getNumeroSucursal() == numeroSucursal) {
				encontrado = true;
				indice = i;
			}
		}
		if(encontrado == false) {
			indice = -1;
		}
		
		return indice;
		
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int numeroSucursal, numeroPaquete, prioridad, opcion;
		int contadorSucursal = 0, contadorPaquete = 0, indiceSucursal, indicePaquete;
		String direccion, ciudad, dni;
		double peso, precioPaquete;
		
		//creamos un objeto sucursal y paquete
		Sucursal sucursal[] = new Sucursal[50];
		Paquete paquete[] = new Paquete [100];
		
		do {
			System.out.println("\t.:MENU:.");
			System.out.println("1. Crear una nueva sucursal");
			System.out.println("2. Enviar paquete");
			System.out.println("3. Consultar sucursal");
			System.out.println("4. Consultar paquete");
			System.out.println("5. Mostrar todas las sucursales");
			System.out.println("6. Mostrar todos los paquetes");
			System.out.println("7. Salir");
			System.out.print("Digite la opcion de menu: ");
			opcion = entrada.nextInt();
			
			switch(opcion) {
			case 1: System.out.print("\nDigite el numero de sucursal: ");
					numeroSucursal = entrada.nextInt();
					entrada.nextLine(); //limpiar buffer
					System.out.print("\nDigite la direccion: ");
					direccion = entrada.nextLine();
					System.out.print("Digite la ciudad: ");
					ciudad = entrada.nextLine();
					
					sucursal[contadorSucursal] = new Sucursal(numeroSucursal, direccion, ciudad);
					contadorSucursal++;
					break;
			case 2: System.out.print("\nIndica el numero de Sucursal: ");
					numeroSucursal = entrada.nextInt();
					
					indiceSucursal = buscarSucursal(sucursal, numeroSucursal,contadorSucursal);
					
					if(indiceSucursal == -1) {
						System.out.println("La sucursal no existe");
					}
					else {
						System.out.print("\nDigite el numero de paquete: ");
						numeroPaquete = entrada.nextInt();
						entrada.nextLine();
						System.out.print("Digite el DNI de la persona: ");
						dni = entrada.nextLine();
						System.out.print("Digite el peso del paquete: ");
						peso = entrada.nextDouble();
						System.out.print("Digite la prioridad (0=normal, 1=alta, 2=express");
						prioridad = entrada.nextInt();
						
						paquete[contadorPaquete] = new Paquete(numeroPaquete, dni, peso, prioridad);
						
						precioPaquete = sucursal[indiceSucursal].calcular_precio(paquete[contadorPaquete]);
						
						System.out.println("\nEl precio es: €"+precioPaquete);
						
						contadorPaquete++;
					}
					break;
					
			case 3: System.out.print("\nIntroduzca el numero de sucursal: ");
					numeroSucursal = entrada.nextInt();
					
					indiceSucursal = buscarSucursal(sucursal, numeroSucursal, contadorSucursal);
					
					if(indiceSucursal ==-1) {
						System.out.println("La sucursal no existe");
					}
					else {
						System.out.println("\nLos datos de la Sucursal son: ");
						System.out.println(sucursal[indiceSucursal].mostrarDatosSucursal());
					}
					break;
				
			case 4: System.out.print("Introduzca el numero de Paquete: ");
					numeroPaquete = entrada.nextInt();
					
					indicePaquete = buscarPaquete(paquete, numeroPaquete, contadorPaquete);
					
					if(indicePaquete == -1) {
						System.out.println("El paquete no existe");
					}
					else {
						System.out.println("\nLos dato del paquete son: ");
						System.out.println(paquete[indicePaquete].mostrarDatosPaquete());
					}
					break;
					
			case 5: 
				
					for(int i=0; i<contadorSucursal; i++) {
						System.out.println("\nLos datos de la sucursal Nº"+(i+1)+":");
						System.out.println(sucursal[i].mostrarDatosSucursal());
					}
					break;
					
			case 6:
					for(int i=0; i<contadorPaquete; i++) {
						System.out.println("\nLos datos del paquete Nº"+(i+1)+":");
						System.out.println(paquete[i].mostrarDatosPaquete());
					}
					break;
					
			case 7: break;
			default: System.out.println("Error 404 not found"); break;	
				
			}
			System.out.println("");
			
		}while(opcion !=7);
	}

}
