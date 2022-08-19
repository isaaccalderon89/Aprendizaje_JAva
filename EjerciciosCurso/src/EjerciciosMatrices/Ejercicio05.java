package EjerciciosMatrices;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int matriz[][], nFilas,nCol,sumaFilas, sumaCol=0;
		
		nFilas = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de filas"));
		nCol = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de columnas"));
		
		matriz = new int [nFilas] [nCol];
		
		System.out.println("Digite la matriz");
		for(int i=0; i<nFilas; i++) {
			for(int j=0;j<nCol;j++) {
				System.out.print("matriz ["+i+"] ["+j+"]: ");
				matriz[i][j] = entrada.nextInt();
			}
		}
		System.out.println("\nla matriz es: ");
		for(int i=0; i<nFilas; i++) {
			for(int j=0;j<nCol;j++) {
				System.out.println(matriz[i][j]);
			}
			System.out.println(" ");
		}
		//Ahora sumamos las filas
		for(int i=0;i<nFilas;i++) {
			sumaFilas = 0;
			for(int j = 0; j<nCol;j++) {
				sumaFilas +=matriz[i][j];	
			}
			System.out.println("\nLa suma de la fila ["+i+"] es: "+sumaFilas);
		}
		System.out.println(" ");
		
		//por ultimo sumamos las columnas
		for(int j=0;j<nCol;j++) {
			for(int i=0;i<nFilas;i++) {
				sumaCol += matriz[i][j];
			}
			System.out.println("\nLa suma de la columna ["+j+"] es: "+sumaCol);
		}
		System.out.println(" ");

	}

}
