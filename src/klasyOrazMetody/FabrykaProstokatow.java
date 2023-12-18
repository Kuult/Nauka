package klasyOrazMetody;

/**
 * Created by Piotr on 02.11.2023.
 */
public class FabrykaProstokatow {

	public static void main(String[] args){

		Prostokat prostokatNumerJeden = new Prostokat(10, 5);
		Prostokat prostokatNumerDwa = new Prostokat(4, 2);
		Prostokat prostokatNowy = new Prostokat(5, 3, "Nowy prostokąt");

		//System.out.println(prostokatNowy.getNazwaProstokata());

		prostokatNowy.test();
		prostokatNowy.test("Korzystam z drugiej metody test");
		int poleProstokota = prostokatNowy.test(prostokatNowy.getA(), prostokatNowy.getB());
		System.out.println(poleProstokota);
	}
}
