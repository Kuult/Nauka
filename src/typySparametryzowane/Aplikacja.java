package typySparametryzowane;

import java.util.ArrayList;

/**
 * Created by Piotr on 03.11.2023.
 */
public class Aplikacja {
	public static void main(String[] args){

		ArrayList arrayList = new ArrayList<>();

		arrayList.add(1);
		arrayList.add(1.2345);
		arrayList.add("Nietoperz");

		String zwierze = (String) arrayList.get(2);

//		for (String str: arrayList){
//			System.out.println(str);
//		}

		ArrayList<String> arrayList_2 = new ArrayList<>();

		arrayList_2.add("Jeden");
		arrayList_2.add("Dwa");
		arrayList_2.add("Trzy");

		for (String str: arrayList_2){
			System.out.println(str);
		}
	}
}
