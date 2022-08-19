package Ejercicio07;

public class Cuenta {
	private int numeroCuenta;
	private double saldo;
	
	//Constructor con parametros
	public Cuenta(int numeroCuenta, double saldo) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
	}
	//getters

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}
	//metodos
	
	public void ingresarDinero(double cantidad) {
		saldo += cantidad;
	}
	public void retirarDinero(double cantidad) {
		saldo -=cantidad;
	}
	

}
