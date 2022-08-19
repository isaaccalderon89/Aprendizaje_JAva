package EjerciciosOperadores;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		float nota1, nota2, nota3, suma;
		
		// guardamos las 3 notas 
		System.out.println("introduce las tres calificaciones :");
		nota1 = entrada.nextFloat();
		nota2 = entrada.nextFloat();
		nota3 = entrada.nextFloat();
		
		suma = nota1+ nota2 + nota3; // sumamos las 3 notas
		
		System.out.println("\nLa suma es: "+suma);

	}

}
