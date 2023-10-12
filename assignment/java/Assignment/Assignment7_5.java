package Assignment;
import java.util.Scanner;
public class Assignment7_5 {

	public static void main(String[] args)
	{
		int i,j,k,rows;
		 
        Scanner num_row = new Scanner(System.in);
 
        System.out.println("Enter the number of rows to print numbers =");
        rows = num_row.nextInt();
      for (i = 1; i <= rows; i++) 
   {
      for (j=rows-i; j>=1; j--)
            {
              
                System.out.print("  ");
            }
    
    for (k=1; k<=2*i-1; k++ )
            {
               
                System.out.print("* ");
            }
      System.out.println();
    }
   for (i = rows-1; i >= 1; i--) {
	      for (j=rows-i; j>=1; j--)
	            {
	              
	                System.out.print("  ");
	            }
	    
	    for (k=1; k<=2*i-1; k++ )
	            {
	               
	                System.out.print("* ");
	            }
	      System.out.println();
	    }



	}

}
