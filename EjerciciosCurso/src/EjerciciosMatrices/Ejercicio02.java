package EjerciciosMatrices;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int matriz1[][], matriz2[][], suma[][];
		
		matriz1= new int [3][3];
		matriz2 = new int [3][3];
		
		System.out.println("Digite la matriz1: ");
		for(int i=0; i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print("Matriz1 ["+i+"] ["+j+"]: ");
				matriz1[i][j]=entrada.nextInt();
			}
		}
		System.out.println("\nDigite la matriz2: ");
		for(int i=0; i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print("Matriz2 ["+i+"] ["+j+"]: ");
				matriz2[i][j]=entrada.nextInt();
			}
		}
		
		//Vamos a sumar las matrices 
		suma = new int[3][3];
		for(int i = 0; i<3;i++) {
			for(int j = 0; j<3; j++) {
				suma[i][j] = matriz1[i][j] + matriz2[i][j];
			}
		}
		
		System.out.println("\nLa sumas de ambas matrices es: ");
		for (int i=0;i<3;i++) {
			for(int j=0;j<3;j++)
				System.out.print(suma[i][j]+" ");
		}
		
		System.out.println(" ");

	}

}
