package typyProsteDanych;

/**
 * Created by Piotr on 22.10.2023.
 */
public class Klasa {

	public static void main(String[] args){

		//Zapisz czas na początku
		long start = System.currentTimeMillis();

		//Odliczaj od 0 do 10^9 i dodawaj do siebie odliczone wartości
		long sum = 0L;
		for(long i = 0; i <= 1000000000; i++){
			sum += i;
		}
		System.out.println("Suma wynosi: " + sum);

		//Zapisz czas na koncu
		long stop = System.currentTimeMillis();

		//Wyswietl czas wykonania
		System.out.println("Czas wykonania w ms: " + (stop - start));
	}
}
