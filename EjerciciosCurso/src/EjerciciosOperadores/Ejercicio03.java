package EjerciciosOperadores;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double dolares, dolares1, dolares3, suma;
		
		System.out.println("Introduce la cantidad de dolares que tiene Guillermo: ");
		dolares = entrada.nextDouble();

		dolares1 = dolares / 2;
		dolares3 = dolares + dolares1 / 2;
		suma = dolares + dolares1 + dolares3;
		
		System.out.println("Guillermo tiene: "+dolares);
		System.out.println("Luis tiene: "+dolares1);
		System.out.println("Juan tiene: "+dolares3);
		System.out.println("La suma total de los tres es: "+suma);
		
		System.out.println("********************correccion***********************");
		
        float guillermo,luis,juan,total;
        
        System.out.print("Digite la cantidad que tiene Guillermo: ");
        guillermo = entrada.nextFloat();
        
        luis = guillermo/2; //luis tiene la mitad de guillermo
        juan = (guillermo + luis) / 2; //juan tiene la mitad de luis y guillermo juntos
        
        total = guillermo + luis + juan; //Sumamos las 3 cantidades
        
        System.out.println("\nLa cantidad de dinero entre los 3 es: "+total);
		
	}

}
