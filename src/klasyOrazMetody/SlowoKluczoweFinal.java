package klasyOrazMetody;

/**
 * Created by Piotr on 02.11.2023.
 */
final public class SlowoKluczoweFinal {

	final private int STALA;

	SlowoKluczoweFinal(){
		STALA = 10;
	}

	final public void test(){
		final int KOLEJNA_STALA = 10;
		System.out.println(STALA + KOLEJNA_STALA);
	}
}
