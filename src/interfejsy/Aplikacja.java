package interfejsy;

/**
 * Created by Piotr on 03.11.2023.
 */
public class Aplikacja {

	public static void main(String[] args){

		Robot robot = new Robot(1922);
		robot.uruchom();

		Czlowiek czlowiek = new Czlowiek("Piotr");
		czlowiek.oddychaj();

		Informacje[] informacje = new Informacje[] {robot, czlowiek};

		for (Informacje i: informacje){
			i.pokazInformacje();
		}

		Informacje infoRobot = new Robot(999);
		infoRobot.pokazInformacje();

		ProcesyKognitywne[] procesyKognitywne = new ProcesyKognitywne[] {robot, czlowiek};

		for (ProcesyKognitywne i: procesyKognitywne){
			i.mysl();
		}
	}

	public static void testInterfejsu(Informacje info){
		info.pokazInformacje();
	}
}
