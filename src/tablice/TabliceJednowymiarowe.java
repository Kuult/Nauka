package tablice;

/**
 * Created by Piotr on 30.10.2023.
 */
public class TabliceJednowymiarowe {

	public static void main(String[] args){

		int[] tablica = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

		System.out.println(tablica[9]);

		int x  = tablica[5];

		System.out.println(x);

		tablica[0] = 10;

		System.out.println(tablica[0]);
	}
}
