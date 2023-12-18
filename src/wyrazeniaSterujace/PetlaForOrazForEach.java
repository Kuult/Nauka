package wyrazeniaSterujace;

/**
 * Created by Piotr on 01.10.2023.
 */
public class PetlaForOrazForEach {

	public static void main(String[] args){

//		for (inicjalizacja; warunek; iteracja){
//			//Zbior instrukcji
//		};

		for (int i = 1; i < 10; i++){
			if (i % 2 == 0){
				System.out.println(i + " jest liczbą parzystą");
			} else {
				System.out.println(i + " jest liczbą nieparzystą");
			}
		}

		for (int i = 0, j = 10; i <= j; i++, j--){
			System.out.println("i = " + i +", j = " + j);
		}

//		for (typ zmienna-iteracja: kolekcja){
//			//Zbiór instrukcji.
//		};

		int[][] tablica = new int[][] {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};

		for (int[] x: tablica) {
			for (int y: x){
				System.out.println("Pojedyncze elementy = " + y);
			}
		}

	}
}
