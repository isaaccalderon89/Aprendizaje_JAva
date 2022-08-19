
public class ClaseMath {

	public static void main(String[] args) {
		
		// Para sacar la raiz cuadrada
		double raiz = Math.sqrt(36.67);
		
		System.out.println(raiz);
		System.out.println("\n************************************");
		
		//para elevar un numero
		double base = 5, exponente = 2;
		double resultado = Math.pow(base, exponente);
		
		System.out.println(resultado);
		System.out.println("\n************************************");
		
		// Para redondear
		double numero = 4.56;
		long resultado1 = Math.round(numero);
		
		System.out.println(resultado1);
		System.out.println("\n************************************");
		
		// para recibir un numero aleatorio
		double aleatorio = Math.random();
		
		System.out.println(aleatorio);

		
		

	}

}
