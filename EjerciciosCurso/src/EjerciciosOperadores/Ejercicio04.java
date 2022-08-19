package EjerciciosOperadores;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);                      

        

        final int salario = 1000;

        int numeroCoches;

        float precioCoche, salarioTotal;

       

        System.out.print("Indica el total de coches vendidos");

        numeroCoches = entrada.nextInt();

        System.out.print("Indica el precio de los coches: ");

        precioCoche = entrada.nextFloat();



        salarioTotal = salario + (numeroCoches*150)+(0.05f*precioCoche*numeroCoches);

        System.out.print("\n el salario total del empleado es: "+salarioTotal );	

	}

}
