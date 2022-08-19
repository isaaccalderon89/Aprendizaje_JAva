package Ejercicio01;
// no funciona la multiplicaicon REVISAR CODIGO
public class Ejercicio01 {
	//Atributos
	private float lado1;
	private float lado2;
	
	//Metodos
	
	//Metodo constructor 1 (cuadrilatero)
	public Ejercicio01(float lado1, float lado2) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	//Metodo constructor 2 (cuadrado)
	public Ejercicio01(float lado1) {
		super();
		this.lado1 = lado1;
	}
	
	public float getPerimetro() {
		float perimetro = 2*(lado1+lado2);
		return perimetro;
	}
	public float getArea() {
		float area = (lado1 * lado2);
		return area;
	}
	

}
