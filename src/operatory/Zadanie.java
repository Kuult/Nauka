package operatory;

/**
 * Created by Piotr on 30.10.2023.
 */
public class Zadanie {

	public static void main(String[] args) {

		int a = 4;
		int b = 3;

		int c = a < b ? a : b;
		int d = a > b ? a : b;
		int e = b == a ? b : a;
		int f = a == b ? b : a;

		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}
}
