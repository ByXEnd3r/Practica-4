package Clases;

public class Cuenta {
	private String mNumero;
	private String mNombre;
	//private List<Movimiento> mMovimientos;
	private double saldo;
	
	public Cuenta(String mNumero, String mNombre, double saldo) {
		this.mNumero = mNumero;
		this.mNombre = mNombre;
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void ingreso(double ingreso) {
		saldo += 50;
	}
	
	public void reintegro(double reintegro) {
		saldo -= 50;
	}
}
