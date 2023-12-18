package typyProsteDanych;

/**
 * Created by Piotr on 22.10.2023.
 */
public class KonwersjaIRzutowanie {

	public static void main(String[] args){

		int a = 10;
		long b = a;

		short c = 10;
		int d = c;

		double e = 3.999;
		int f = (int) e;

		int g = 10;
		double h = g;

		int i = 10;
		short j = (short) i;

		System.out.println(b);
		System.out.println(d);
		System.out.println(f);  //Java nie zaokrągla tylko ucina co po przecinku
		System.out.println(h);
		System.out.println(j);

		//boolean k = true;
		//char l = (boolean) k;   //Nie mozna konwertować booleana


	}
}
