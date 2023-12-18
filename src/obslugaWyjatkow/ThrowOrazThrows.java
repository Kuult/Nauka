package obslugaWyjatkow;

import java.io.IOException;

/**
 * Created by Piotr on 04.11.2023.
 */
public class ThrowOrazThrows {

	public static void main(String[] args){

//		boolean dzieleniePrzezZero = true;
//
//		try {
//			if (dzieleniePrzezZero){
//				throw new ArithmeticException("Dzielenie przez zero");
//			} else {
//				System.out.println("Wykonuje polecenie...");
//			}
//		} catch (ArithmeticException ex){
//			System.out.println("Wyjątek \"" + ex.toString() + "\" został złapany");
//		}

		try {
			dzielenieDwochLiczb(5, 0);
		} catch (ArithmeticException ex){
			System.out.println("Wyjątek \"" + ex.toString() + "\" został złapany");
		} catch (IOException ex) {
			System.out.println("Błąd wejścia-wyjścia");
		} catch (Exception ex){
			System.out.println("Dodatkowa obsługa wyjątków");
		}

	}

	public static double dzielenieDwochLiczb(double a, double b) throws IOException{
		if (b == 0){
			throw new IOException("Dzielenie przez zero");
		} else {
			return a / b;
		}
	}
}
