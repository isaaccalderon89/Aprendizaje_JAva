package EjerciciosBucles;

import javax.swing.JOptionPane;

public class Ejercicio13 {

	public static void main(String[] args) {
		int numero, sumaPosi=0, conteoPosi= 0, sumaNega=0, conteoNega=0, conteoCeros=0;
		float mediaPosi, mediaNega; 
		
		for(int i=1;i<=10;i++) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: "));
			
			if (numero == 0) {//si el numero es cero 
				conteoCeros++;//aumentamos en 1 el conteo de 0
			}
			else if (numero>0) {// si el numero es positivo
				sumaPosi+=numero;//suma iterativa de positivos
				conteoPosi++;
			}
			else {
				sumaNega+=numero;
				conteoNega++;
			}
		}
		//tratamos con los positivos
		if ( conteoPosi ==0){
			System.out.println("No se puede sacar la media de los positivos");
		}
		else {
			mediaPosi=(float) sumaPosi/conteoPosi;
			System.out.println("La media de los numeros positivos es: "+mediaPosi);
		}
		//tratamos con los negativos
		if(conteoNega==0) {
			System.out.println("no se puede sacar la media de los negativos");
		}
		else {
			mediaNega=(float)sumaNega/conteoNega;
			System.out.println("La media de los numeros negativos es: "+mediaNega);
		}
		
		System.out.println("La cantidad de ceros es "+conteoCeros);
	}

}
