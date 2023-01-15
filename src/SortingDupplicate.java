
package src;

public class SortingDupplicate {

	public static void main(String[] args) {

		int[] douplicate = { 12, 34, 34, 13, 14, 14, 30, 30 };

		for (int i = 0; i < douplicate.length; i++) {
			for (int j = i + 1; j< douplicate.length; j++) {
				if (douplicate[i] == douplicate[j]) {
					System.out.println("THE DOUBLICATE NUMBER IS:" + douplicate[i]);
				}

			}

		}
	}
}
