package wyrazenieLambda;

/**
 * Created by Piotr on 03.11.2023.
 */
public class Aplikacja {

	public static void main(String[] args) {


		Czlowiek czlowiek = (w, t) -> System.out.println("Człowiek mysli...");

		Korporacje korporacje = new Korporacje();
		korporacje.zarzadzaj((w, t) -> {
			System.out.println("Człowiek myśli...");
			System.out.println(w + " " + t);
		});


		korporacje.zarzadzaj((w,t) -> {
			System.out.println("Człowiek myśli...");
			System.out.println(w + " " + t);
		});
	}
}
class Korporacje{

	public void zarzadzaj(Czlowiek cz){
		System.out.println("Zarządzanie zasobami aktywne");
	}
}

interface Czlowiek{
	void mysl(int wartosc, String tekst);


}
