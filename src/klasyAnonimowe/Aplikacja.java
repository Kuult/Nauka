package klasyAnonimowe;

/**
 * Created by Piotr on 03.11.2023.
 */
public class Aplikacja {

	public static void main(String[] args) {

		Komputer komputer = new Komputer(){
			@Override
			public void zaladujSystemOperacyjny(){
				System.out.println("Ładuje Ubuntu 14.04...");
			}
		};
		komputer.zaladujSystemOperacyjny();

		Czlowiek czlowiek =new Czlowiek() {
			@Override
			public void mysl() {
				System.out.println("Myślę...");
			}
		};
		czlowiek.mysl();
	}
}
class Komputer{

	public void zaladujSystemOperacyjny(){
		System.out.println("Ładuje Windows 11...");
	}
}

interface Czlowiek{
	void mysl();
}
