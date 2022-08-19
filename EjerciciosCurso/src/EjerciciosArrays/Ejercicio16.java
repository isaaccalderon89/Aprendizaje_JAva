/*
 * Ejercicio 16:  Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un centro educativo.
 * Cada grupo (o clase) está compuesto por 5 alumnos. Se pide leer las notas del primer,
 * segundo y tercer trimestre de un grupo. Debemos mostrar al final: la nota media del grupo en cada trimestre,
 * y la media del alumno que se encuentra en la posición N (N se lee por teclado).
 */
package EjerciciosArrays;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		float primer[], segundo[], tercer[];
		float sumaPrimer = 0, sumaSegundo = 0, sumaTercer = 0, sumaAlumno;
		float promedioPrimer, promediosegundo, promedioTercer, promedioAlumno;
		int posicion;
		
		//Creamos los arrays de 5 elementos 
		primer = new float[5];
		segundo = new float[5];
		tercer =new float[5];
		
		System.out.println("Digite las notas del primer trimestre: ");
		for(int i=0; i<5;i++) {
			System.out.println("Alumno ["+i+"] : ");
			primer[i] = entrada.nextFloat();
			
			sumaPrimer+= primer[i];//sumamos todas las notas del primer trimestre
		}
		System.out.println("Digite las notas del segundo trimestre: ");
		for(int i=0; i<5;i++) {
			System.out.println("Alumno ["+i+"] : ");
			segundo[i] = entrada.nextFloat();
			
			sumaSegundo += segundo[i];
		}
		System.out.println("Digite las notas del tercer trimestre: ");
		for(int i=0; i<5;i++) {
			System.out.println("Alumno ["+i+"] : ");
			tercer[i] = entrada.nextFloat();
			
			sumaTercer += tercer[i];
		}
		
		//sacamos los promedios de cada uno de los trimestres
		promedioPrimer = sumaPrimer/5;
		promediosegundo = sumaSegundo/5;
		promedioTercer = sumaTercer/5;
		
		//Ahora pedimos la posicion del alumno N para sacar tu promedio
		do {
			System.out.println("\nDigite la posicion del alumno (0-4), para sacar el promedio: ");
			posicion = entrada.nextInt();
		}while (posicion<0 || posicion>4);
		
		//sacamos la suma de las notas del alumno
		sumaAlumno = primer[posicion] + segundo[posicion] + tercer[posicion];
		promedioAlumno = sumaAlumno/3;
		
		System.out.println("\nMostrando los datos requeridos");
		System.out.println("Promedio del primer trimestrs: "+promedioPrimer);
		System.out.println("Promedio del segundo trimestrs: "+promediosegundo);
		System.out.println("Promedio del tercer trimestrs: "+promedioTercer);
		System.out.println("Promedio del Alumno: "+promedioAlumno);
	}

}
