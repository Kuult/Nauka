package klasyOrazMetody.przeslanieMetod;

/**
 * Created by Piotr on 02.11.2023.
 */
public class Prostokat extends Figura {

	private double a;
	private double b;

	public Prostokat(double a, double b) {
		super(a, b);
		this.a = a;
		this.b = b;
	}

	// Przeslonienie metody.

	public void obliczPolePowierzchni(){
		System.out.println(a * b);
	}
}

