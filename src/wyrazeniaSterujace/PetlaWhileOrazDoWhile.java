package wyrazeniaSterujace;

/**
 * Created by Piotr on 01.11.2023.
 */
public class PetlaWhileOrazDoWhile {

	public static void main(String[] args){

		int iterator = 1;

		while (iterator == 2){
			System.out.println("Jestem w pętli While");
		}

		do {
			System.out.println("Jestem w pętli Do-While");
		} while (iterator == 2);
	}
}
