package wyrazeniaSterujace;

/**
 * Created by Piotr on 31.10.2023.
 */
public class KonstrukcjaIf {

	public static void main(String[] args){

		double a = 5;
		double b = 0;
		double c;

		if (b != 0){
			c = a / b;
		} else if (a != 0){
			System.out.println("Jesteśmy w bloku else if");
		} else {
			System.out.println("Nie mozna dzielić przez 0");
		}


	}
}
