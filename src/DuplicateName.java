
package src;
public class DuplicateName {
	public static void main(String[] args) {

	
	String[] names=	{"Atyab", "Fatima", "Saeed", "Abdullah", "Malak", "Fatima", "Daniyal", "atyab", "Abdullah"};
	
	
	//= new int[names.length];
	
	
		for (int i = 0; i < names.length; i++) {
			int counts= 1 ;
			for (int j=i+1; j < names.length; j++) {
				if (names[i].equals(names[j]))

				{
					counts++;
					names[i]=" ";
				}
				
			}
			if(!names[i].equals(" "))
			{
		System.out.println( names + " is repeted " +counts+ " times");
			}	
	}
		
	/*	for (int j = 0; j < names.length; j++ ) {
             String name =names[j];
             int count =counts[j];
		*/		

			}

		}
