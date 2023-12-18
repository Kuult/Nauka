package interfejsy;

/**
 * Created by Piotr on 03.11.2023.
 */
public class Czlowiek implements Informacje, ProcesyKognitywne {

	private String imie;

	public Czlowiek(String imie) {
		this.imie = imie;
	}

	public void oddychaj(){
		System.out.println(imie + " zaczal oddychać");
	}

	@Override
	public void pokazInformacje() {
		System.out.println("Człowiek ma na imie " + imie);
	}

	@Override
	public void mysl() {
		System.out.println(imie + " teraz mysli");
	}
}
