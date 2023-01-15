

package src;


public class MostProfitable {


	public static void main(String[] args) {
            int [] riseStack = { 900, 1200, 1200, 1210,900,750,1050};
            int [] wheatStack = { 1100, 1900, 1500, 1500,1500,1500,1400};
            int [] cottonStack = { 200, 700, 300, 290,600,750,350};
            int profitrice=riseStack[0];
            int profitwheat=wheatStack[0];
            int profitcotton=cottonStack[0];

            
            
            for(int i=0; i<6; i++)
            {
            	int diffrent=riseStack[i]-riseStack[i+1];
            	riseStack[i]=diffrent;
            }
            for(int i=0; i<6; i++)
            {
            	if(profitrice>riseStack[i+1])
            	{
            		profitrice=riseStack[i+1];
            	}
            
            	
            }
	       
            for(int i=0; i<6; i++)
            {
            	int diffrent=wheatStack[i]-wheatStack[i+1];
            	wheatStack[i]=diffrent;
            }
            for(int i=0; i<6; i++)
            {
            	if(profitwheat>wheatStack[i+1])
            	{
            		profitwheat=wheatStack[i+1];
            	}
            
            	
            }
            for(int i=0; i<6; i++)
            {
            	int diffrent=cottonStack[i]-cottonStack[i+1];
            	cottonStack[i]=diffrent;
            }
            for(int i=0; i<6; i++)
            {
            	if(profitcotton>cottonStack[i+1])
            	{
            		profitcotton=cottonStack[i+1];
            	}
            
            	
            }
            
            System.out.println("the highst profit in riseStack is: " +profitrice );
            System.out.println("the highst profit in riseStack is: " +profitwheat );
            System.out.println("the highst profit in riseStack is: " +profitcotton );

	}

}
