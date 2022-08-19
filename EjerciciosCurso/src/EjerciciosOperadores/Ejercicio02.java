package EjerciciosOperadores;
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double hora, salario, calculo;
		
		System.out.println("Introduce la cantidad de horas trabajadas esta semana: ");
		hora = entrada.nextDouble();
		System.out.println("Introduce el salario por cada hora");
		salario = entrada.nextDouble();
		
		
		calculo = hora * salario;
		System.out.println("El salario semanal es: "+calculo);
		
		
		System.out.println("********************correccion***********************");
		
		   int horas;
	       float salarioHora,salario2;
	        
	        //Pedimos los datos
	        System.out.print("Digite el numero total de horas trabajadas a la semana: ");
	        horas = entrada.nextInt();
	        System.out.print("Digite el salario por hora: ");
	        salarioHora = entrada.nextFloat();
	        
	        //Sacamos el salario semanal
	        salario2 = horas * salarioHora;
	        
	        //Mostramos el resultado
	        System.out.println("\nEl salario semanal es: "+salario2);
		

	}

}
