package wyrazeniaSterujace;

/**
 * Created by Piotr on 31.10.2023.
 */
public class KonstrukcjaSwitch {

	public static void main(String[] args){

		int a = 0;

		switch (a){
			case 0:
				System.out.println("Zero");
				break;
			case 1:
				System.out.println("Jeden");
				break;
			default:
				System.out.println("Wartoś inna od 0 i 1");
		}

		switch (a){
			case 0:
			case 1:
				// Zbiór instrukcji 1.
				break;
			case 2:
			case 3:
				// Zbiór instrukcji 2.
				break;
			default:
				// Zbiór instrukcji.
		}

		String b = "Jan Kowalski";

		switch (a){
			case 0:
				switch (b){
					case "Jan Kowalski":
						System.out.println("Cześć");
						break;
					default:
						System.out.println("Witam");
				}
				break;
			default:
				//Instrukcje
		}

	}
}
