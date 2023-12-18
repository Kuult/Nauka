package klasyAbstrakcyjne;

/**
 * Created by Piotr on 03.11.2023.
 */
public class Aplikacja {

	public static void main(String[] args){

		//Maszyna maszyna = new Maszyna();
		Robot robot = new Robot();

		robot.przypiszNumerSeryjny(301232);
		System.out.println(robot.pobierzNumerSeryjny());

		robot.uruchom();
	}
}
