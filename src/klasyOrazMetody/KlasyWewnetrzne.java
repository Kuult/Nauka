package klasyOrazMetody;

/**
 * Created by Piotr on 02.11.2023.
 */
public class KlasyWewnetrzne {
	public static void main(String[] args){

		Komputer komputer = new Komputer(10);
		komputer.uruchom();
		Komputer.KartaSieciowa kartaSieciowa = komputer.utworzKartaSieciowa();
		kartaSieciowa.ustanowPolaczenie();

		Komputer.KartaSieciowa kartaSieciowa_2 = komputer.new KartaSieciowa();
		Komputer.KartaSieciowa kartaSieciowa_3 = new Komputer(5).new KartaSieciowa();
		kartaSieciowa_3.ustanowPolaczenie();
	}
}
