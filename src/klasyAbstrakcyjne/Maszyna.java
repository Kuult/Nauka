package klasyAbstrakcyjne;

/**
 * Created by Piotr on 03.11.2023.
 */
public abstract class Maszyna {

	private int numerSeryjny;

	public void przypiszNumerSeryjny(int numerSeryjny){
		this.numerSeryjny = numerSeryjny;
	}

	public int pobierzNumerSeryjny(){
		return numerSeryjny;
	}

	public abstract void uruchom();
}
