package EjerciciosMatrices;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int matriz[][], nFilas, nCol;
		boolean simetrica = true;
		
		
		nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el nuemro de filas: "));
		nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el nuemro de columnas: "));
		
		matriz = new int [nFilas] [nCol];
		
		System.out.println("Digite una matriz: ");
		for(int i=0;i<nFilas;i++) {
			for(int j=0;j<nCol;j++) {
				System.out.println("Matriz ["+i+"] ["+j+"]: ");
				matriz[i][j] = entrada.nextInt();
			}
		}
		
		if(nFilas == nCol) {//Si el numeo de filas es igual al numero de columnas
			int i, j;
			i=0;
			while(i<nFilas && simetrica == true) {
				j=0;
				while(j<i && simetrica==true){
					if(matriz[i][j] != matriz[j][i]) {
						simetrica = false;
					}
					j++;
				}
				i++;
			}
			if (simetrica == true) {
				JOptionPane.showMessageDialog(null, "La matriz es simetrica");
			}
			else {
				JOptionPane.showMessageDialog(null, "La matriz  no es simetrica");
			}
			
		}
		else {
			JOptionPane.showMessageDialog(null, "La matriz no es simetrica");
		}

	}

}
