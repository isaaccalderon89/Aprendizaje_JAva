package EjerciciosMatrices;

import java.util.Scanner;

public class Ejercicio03 {//  HAY QUE REVISAR ESTE CODIGO

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int matriz[][] = new int [3][3];
		
		System.out.println("Digite la matriz: ");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3;j++) {
				System.out.print("matriz ["+i+"] ["+j+"]: ");
				matriz[i][j] = entrada.nextInt();
			}
		}
		System.out.println("\nMatriz original: ");
		for(int i = 0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(matriz[i][j]+ " ");
			}
			System.out.println(" ");
			
		}
		
		//transponiendo la matriz
		int aux;
		for(int i=0;i<3;i++) {
			for(int j=0;j<1;j++) {
				aux = matriz[i][j];
				matriz[i][j] = matriz[j][i];
				matriz[i][j] = aux;
				
			}
		}
		
		System.out.println("\nLa matriz transpuesta es: ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println(" ");
		}

	}

}
