package klasyOrazMetody.przeslanieMetod;

/**
 * Created by Piotr on 02.11.2023.
 */
public class Trojkat extends Figura {

	private double a;
	private double h;

	public Trojkat(double a, double h) {
		super(a, h);
		this.a = a;
		this.h = h;
	}

	// Przesloniecie metody.

	public void obliczPolePowierzchni(){
		System.out.println((a * h) / 2);
	}
}
