package tablice;

/**
 * Created by Piotr on 30.10.2023.
 */
public class TabliceWielowymiarowe {

	public static void main(String[] args) {

		int[][] macierz2D = new int[][]{
				{1, 2, 3, 4},
				{5, 6, 7, 8}
		};

		int x = macierz2D[1][2];

//		System.out.println(x);

		int[][][] macierz3D = new int[][][] {

				{{1, 2}, {3, 4}},
				{{5, 6}, {7, 8}}
		};

		int y = macierz3D[1][1][0];

		System.out.println(y);
	}

}

