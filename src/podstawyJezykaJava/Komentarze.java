package podstawyJezykaJava;

/**
 * Created by $(USER) on $(DATE).
 */
public class Komentarze {

	int x;
	int y;

	/**
	 * To jest konstruktor klasy komentarze
	 * @param x
	 * @param y
	 */
	public Komentarze(int x, int y){

		this.x = x;
		this.y = y;
	}

	/**
	 * To jest metoda main
	 * @param args
	 */
	public static void main(String[] args){

	}

	/**
	 * To jest metoda mnozaca przez siebie dwie wartosci
	 * @param x Parametr nr 1
	 * @param y Parametr nr 2
	 * @return Iloczyn x i y
	 */
	private  int pomoz(int x, int y){

		return x * y;
	}
}
