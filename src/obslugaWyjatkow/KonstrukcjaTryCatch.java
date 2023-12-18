package obslugaWyjatkow;

/**
 * Created by Piotr on 04.11.2023.
 */
public class KonstrukcjaTryCatch {

	public static void main(String[] args){

		System.out.println("Jakies operacje...");

		try{
			int a = 10 / 0;
		} catch (NullPointerException ex){
			// Obsulga drugiego wyjątku
		} finally {
			System.out.println("Operacje końcowe...");
		}

		System.out.println("Dodatkowe operacje...");
	}
}
