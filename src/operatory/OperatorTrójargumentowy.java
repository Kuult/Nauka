package operatory;

/**
 * Created by Piotr on 30.10.2023.
 */
public class OperatorTrójargumentowy {

	public static void main(String[] args){

		int a = 3;
		int b = 1;

		int c = (a > b) ? 10 : 0;

		System.out.println(c);

		System.out.println(a > b ? "Tak" : "Nie");

		System.out.println(jestWiekszeOd(a, b) ? pomnozPrzezSto(a) : pomnozPrzezSto(b));
	}

	public static int pomnozPrzezSto (int wartosc) {

		return wartosc * 100;
	}

	public static boolean jestWiekszeOd (int a, int b) {

		return a > b;
	}
}
