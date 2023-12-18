package typySparametryzowane;

/**
 * Created by Piotr on 03.11.2023.
 */
public class AplikacjaDwa {
	public static void main(String[] args){

		KlasaGeneryczna<Double, String> klasaGeneryczna = new KlasaGeneryczna<>(10.0, "Jeden");
		klasaGeneryczna.nazwaTypuGenerycznego();

		double wartosc = klasaGeneryczna.getPoleGeneryczne();
	}
}
