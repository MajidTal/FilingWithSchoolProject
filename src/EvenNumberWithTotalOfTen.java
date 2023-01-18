
package src;

public class EvenNumberWithTotalOfTen {

	public static void calEvenNum(int[] evenNum) {
		int totalNumber = 10;
		for (int i = 0; i < evenNum.length; i++) {
			for (int j = i + 1; j < evenNum.length; j++) {
				if (evenNum[i] % 2 == 0 && evenNum[j] % 2 == 0) {
					if (evenNum[i] + evenNum[j] == totalNumber) {
						System.out.println(evenNum[i] + "+" + evenNum[j] + "=" + totalNumber);
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arrayNumber = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		calEvenNum(arrayNumber);
	}

}
