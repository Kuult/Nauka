package operatory;

/**
 * Created by Piotr on 30.10.2023.
 */
public class KlasaMath {

	public static void main(String[] args) {

		double pi = Math.PI;
		double e = Math.E;

		double a = Math.pow(4, 2);

		double b = Math.sqrt(4);    //Pierwiastek kwadratowy
		double c = Math.cbrt(27);    //Pierwiastek sześcienny

		double d = Math.pow(16, 1./4.); //Pierwiastek przez potęge 1/4

		double f = Math.log(e);
		double g = Math.log10(100);

		double h = Math.sin(Math.toRadians(90));    //Trzeba zmienić na radiany, kąt w stopniach nie zadziała


		System.out.println(pi);
		System.out.println(e);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
	}
}
