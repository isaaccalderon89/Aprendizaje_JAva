package Ejercicio02;

public class Tablero {
	//atributos
	private int x;
	private int y;
	
	//Metodo contructor
	public Tablero(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public void moverArriba ( int incremento) {
		y+= incremento;
	}
	public void moverAbajo (int incremento){
		y-=incremento;
	}
	public void moverDerecha(int incremento){
		x+=incremento;
	}
	public void moverIzquierda(int incremento){
		x-= incremento;
	}
	//generamos getter

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	

	

}
