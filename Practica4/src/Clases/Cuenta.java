package Clases;

import java.util.ArrayList;
import java.util.List;
import Clases.Movimiento.signo;;

public class Cuenta {
	private String mNumero;
	private String mNombre;
	private List<Movimiento> mMovimientos;
	private double saldo;
	
	final double limite = -500;
	
	public Cuenta(String mNumero, String mNombre, double saldo) {
		this.mNumero = mNumero;
		this.mNombre = mNombre;
		this.saldo = saldo;
		this.mMovimientos = new ArrayList<>();
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void ingreso(double ingreso) {
		saldo += ingreso;
		Movimiento m = new Movimiento(ingreso, signo.D);
		mMovimientos.add(m);
	}
	
	public void reintegro(double reintegro) throws Exception {
		if (saldo - reintegro < limite)
			throw new Exception("Fondos insuficientes (saldo " + saldo + "€) en la cuenta " + mNumero + " para el reintegro de " + reintegro + "€.");
		else {
			Movimiento m = new Movimiento(reintegro, signo.H);
			mMovimientos.add(m);
			saldo -= reintegro;
		}
	}
}
