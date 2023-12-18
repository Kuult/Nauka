package typySparametryzowane;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by Piotr on 03.11.2023.
 */
public class AplikacjaPiec {
	public static void main(String[] args){

		ArrayList<Maszyna> arrayList = new ArrayList<>();

		arrayList.add(new Maszyna());

		wyswietlElement(0, arrayList);
	}

	public static  void wyswietlElement(int indeks, ArrayList <? super Robot> arrayList){

		Object element = arrayList.get(indeks);

		System.out.println("Element " + element);
		System.out.println("Typ elementu " + element.getClass().getName());
	}

//	public static <T> void wyswietlElement(int indeks, ArrayList<T> arrayList){
//
//		T element = arrayList.get(indeks);
//
//		System.out.println("Element " + element);
//		System.out.println("Typ elementu " + element.getClass().getName());
//	}
}

class Maszyna{

}

class Robot extends Maszyna{

}

class SuperRobot extends Robot{

}
