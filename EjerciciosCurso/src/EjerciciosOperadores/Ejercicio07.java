package EjerciciosOperadores;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int horasTotales, semanas, dias, horas;
		
		System.out.println("Digite el numero de horas totales: ");
		horasTotales = entrada.nextInt();
		
		semanas = horasTotales / 168;
		dias = horasTotales%168 / 24;
		horas = horasTotales%24;
		
		System.out.println("\nEl equivalente es: ");
		System.out.println("Semanas: "+semanas);
		System.out.println("días: "+dias);
		System.out.println("Horas: "+horas);

	}

}
