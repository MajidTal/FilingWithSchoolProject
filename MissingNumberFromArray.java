
public class MissingNumberFromArray {

	
	public static void main(String[] args) {
      int[] array= {5, 10, 20, 25, 30};
     
  
 
      
      
      int a=0;
     System.out.print("The elements are: ");
     for(int i=0; i<array.length; i++)
     {
    	 System.out.print(" "+array[i]);
    	 for(int j=i+1; j<array.length-1; j++)
    	 {
    		if(array[i]+5 != array[j])
    		{
    			a=array[i]+5;
    			
    		}
    		
    	 

      }
     }  
		System.out.println("\n"+"The missing number is: "+a);
                 
	}
	}


