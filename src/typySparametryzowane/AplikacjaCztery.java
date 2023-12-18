package typySparametryzowane;

/**
 * Created by Piotr on 03.11.2023.
 */
public class AplikacjaCztery {
	public static void main(String[] args){

		Zamowienie<Integer, Double> zamowienie = new Zamowienie<>(10,15.2352);

		System.out.println("Identyfikator zamówienia " + zamowienie.pobierzIdentyfikator());
		System.out.println("Wartość zamówienia " + zamowienie.pobierzWartosc());

	}
}

class Zamowienie<I, W> implements Informacje<I, W>{

	private I identyfikator;
	private W wartosc;

	public Zamowienie(I identyfikator, W wartosc) {
		this.identyfikator = identyfikator;
		this.wartosc = wartosc;
	}

	@Override
	public I pobierzIdentyfikator() {
		return identyfikator;
	}

	@Override
	public W pobierzWartosc() {
		return wartosc;
	}
}

interface Informacje<I, W>{
	I pobierzIdentyfikator();
	W pobierzWartosc();
}
