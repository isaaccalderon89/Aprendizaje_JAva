package EjerciciosBucles;

import javax.swing.JOptionPane;

public class Ejercicio15 {

	public static void main(String[] args) {
		int edad, sumaEdad=0, contadorMayor=0, contadorAltura=0;  
		float altura, sumaEstatura=0,mediaEdad=0, mediaEstatura = 0;
		
		for(int i = 1; i<=5; i++) {
			edad = Integer.parseInt(JOptionPane.showInputDialog("Alumno "+i+"\nDigite su edad: "));
			
			altura = Float.parseFloat(JOptionPane.showInputDialog("Alumno "+i+"\nDigite su estatura: "));
			
			sumaEdad += edad;// Suma iterativa de edades
			sumaEstatura += altura;// suma iterativa de las alturas
			
			if (edad > 18) {//si la edad es mayor de 18
				contadorMayor++;
			}
			if (altura >1.75) {// sila altura es mayor a 1.75
				
			}
		}
		mediaEdad = (float)sumaEdad/5;
		mediaEstatura = (float) mediaEstatura/5;
		
		System.out.println("La edad  pomedio es: "+mediaEdad);
		System.out.println("La altura  pomedio es: "+mediaEstatura);
		System.out.println("Cantidad de alumnos mayores de 18 años: "+contadorMayor);
		System.out.println("Cantidad de alumnos que miden mas de 1.75m: "+contadorAltura);
		
		

	}

}
