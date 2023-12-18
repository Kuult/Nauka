package obslugaWyjatkow;

/**
 * Created by Piotr on 04.11.2023.
 */
public class Aplikacja {

	public static void main(String[] args){

		try {
			nawiazPolaczenie(5);
		} catch (NiewlasciwyPort ex){
			System.out.println(ex.toString());
		}
	}

	public static void nawiazPolaczenie(int numerPortu) throws NiewlasciwyPort{

		if(numerPortu < 0){
			throw new NiewlasciwyPort("Próba otworzenia portu nr " + numerPortu);
		} else {
			System.out.println("Port nr " + numerPortu + " zostal otwarty");
		}
	}
}

class NiewlasciwyPort extends Exception{

	public NiewlasciwyPort(String opisWyjatku){
		super(opisWyjatku);
	}
}
