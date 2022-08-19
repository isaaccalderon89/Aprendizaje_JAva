//Mi clase en Java

public class Concatenacion {
	
	public static void main(String[] args) {
		
		var usuario = "Juan"; 
		var titulo = "Ingeniero";
		var union = titulo + " " + usuario;
		System.out.println("union = "+ union);
		
		System.out.println("************************");
		/*
		 * No se recomienda usar variables tan cortas y tampoco se puede utilizar palabras
		 * reservadas 
		 */
		
		var i = 3;
		var j = 4;
		
		System.out.println(i + j); //Se realiza la suma
		System.out.println(i + j + usuario);//de izquierda a derecha se evalua las expresiones 
		System.out.println(usuario + i + j);//en este caso se toma todo como una cadena porque primero encuentra una cadena
		System.out.println(usuario + (i + j));//se puede utilizar un parentesis para realizar primero la suma 
		
	}

}
