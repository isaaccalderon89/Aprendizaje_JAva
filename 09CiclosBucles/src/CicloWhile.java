import java.util.Scanner;

public class CicloWhile {

	public static void main(String[] args) {
			/*
			 * Ciclo While
			 * 
			 * while (condicion){
			 * 	Instrucciones; 
			 * }
			 */
		Scanner entrada = new Scanner(System.in);
		int i = 1, contador;
		
			System.out.println("Introduce un numero :");
			contador = entrada.nextInt();
			
			while(1<=contador) {
				System.out.println(i);
				i+=2;
			}
			
			

	}

}
