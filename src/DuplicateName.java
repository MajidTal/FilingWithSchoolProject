
package src;

import java.util.Scanner;

public class DuplicateName {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	String[] names=	{"Atyab", "Fatima", "Saeed", "Abdullah", "Malak", "Fatima", "Daniyal", "atyab", "Abdullah", "Abdullah"};
		//System.out.println("Enter string data");
		String st = sc.nextLine();
		String[] word = st.split(" ");

		int count;
		for (int i = 0; i < word.length; i++) {
			count = 1;
			for (int j = i + 1; j < word.length; i++) {
				if (word[i].equals(word[j]))

				{
					count = count + 1;
					word[j] = "0";
				}
			}

			if (word[i] != "0") {
				System.out.println(word[i] + "is repeted" + count+ "tiems");

			}

		}
	}
}
