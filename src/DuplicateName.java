
package src;
public class DuplicateName {
	public static void main(String[] args) {

	
	String[] names=	{"Atyab", "Fatima", "Saeed", "Abdullah", "Malak", "Fatima", "Daniyal", "atyab", "Abdullah"};
	
	    int counts ;
		for (int i = 0; i < names.length; i++) 
		{
			counts= 1;
			for (int j=i+1; j < names.length; j++) 
			{
				if (names[i].equals(names[j]))   
				{
					counts++;
					names[j]="0";
				}
			}
			if(names[i]!="0")
			{
		        System.out.println( names[i] + " is repeted " +counts+ " times");
			}	
	}
		
}

		}

