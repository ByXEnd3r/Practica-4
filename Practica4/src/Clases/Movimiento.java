package Clases;

public class Movimiento {
	double importe;
	public enum signo{D,H};
	signo Signo;
	String detalle;
	
	public Movimiento(double importe, signo X) {
		this.importe = importe;
		Signo = X;
	}
}
