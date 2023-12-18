package wyrazeniaSterujace;

/**
 * Created by Piotr on 01.10.2023.
 */
public class EtykietyOrazInstrukcjeBreakContinue {

	public static void main(String[] args){

//		for (int i = 0; i < 10; i++){
//			if (i == 5){
//				System.out.println("Pętla została przerwana");
//				break;
//			} else {
//				System.out.println(i);
//			}
//		}
//		System.out.println("Jesteśmy za pętlą");
//
//		etykieta: for (int i = 0; i < 10; i++){
//			for (;;){
//				for (;;){
//					break etykieta;
//				}
//			}
//
//		}
//		jeden: {
//			dwa:{
//				trzy:{
//					System.out.println("Początek trzeciego bloku");
//					if (true) break dwa;
//					System.out.println("Koniec trzeciego bloku");
//				}
//				System.out.println("Za trzecim blokiem");
//			}
//			System.out.println("Za drugim blokiem");
//		}

		for (int i = 0; i < 10; i++){
			if (i % 2 == 0)continue;
			System.out.println(i);
		}

		etykieta: for (int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				if (j == 2)continue etykieta;
				System.out.println("i = " + i + ", j = " + j);
			}
		}


	}
}
