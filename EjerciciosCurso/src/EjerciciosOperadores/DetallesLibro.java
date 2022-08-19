package EjerciciosOperadores;
import java.util.Scanner;

public class DetallesLibro {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Proprociona un titulo: ");
		String titulo = sc.nextLine();
		System.out.println("Proporciona el autor: ");
		String autor = sc.nextLine();
		System.out.println(titulo + " fue escrito por "+autor);
		
	}

}
