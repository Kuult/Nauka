package typyProsteDanych;

/**
 * Created by Piotr on 22.10.2023.
 */
public class OpakowywanieTypówProstych {

	public static void main(String[] args){

		// Byte, Short, Integer, Long, Float, Double, Character i Boolean

		int x = 10;
		Integer integer = x;

		int compare = integer.compareTo(15);

		System.out.println(compare);

		int y = integer;
	}
}
