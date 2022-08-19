package EjerciciosOperadores;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		Float participacion, primerExamen, segundoExamen, examenFinal, notaFinal;
		
		//Pedir los datos necesarios
		System.out.println("Digite la nota de participación: ");
		participacion = entrada.nextFloat();
		System.out.println("Digite la nota del primer parcial: ");
		primerExamen = entrada.nextFloat();
		System.out.println("Digite la nota del segundo parcial: ");
		segundoExamen = entrada.nextFloat();
		System.out.println("Digite la nota de examenFinal: ");
		examenFinal = entrada.nextFloat();

		//Sacamos los calculos
		participacion *= 0.10f;
		primerExamen *= 0.25f;
		segundoExamen *=0.25f;
		examenFinal *=0.40f;
		
		//Sumamos las notas
		notaFinal = participacion + primerExamen + segundoExamen + examenFinal;
		
		//Imprimir el resultado en pantalla
		System.out.println("\n La nota final es:  "+notaFinal);
		
	
		

	}

}
