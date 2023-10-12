package Assignment;

public class Assignment7_3 {

	public static void main(String[] args)
	{
		int i,j;
		for (i=1;i<=5;i++)
	       {
			   if(i<=3)
			   {
	    	   for (j=1;j<=i;j++)
	    		   
	    	   {
	    		   if ((i-j)%2 ==0)
	    		   {
	    		   System.out.print("1");
	    		   }
	    		   else
	    		   {
		    		   System.out.print("0");
		    	   }
	    	   }
			   }
	    	   else
	    	   {
	    		   for (j=1;j<=i+1;j++)
		    		   
		    	   {
		    		   if ((i-j)%2 ==0)
		    		   {
		    		   System.out.print("1");
		    		   }
		    		   else
		    		   {
			    		   System.out.print("0");
			    	   }
	    	   }
	    		   
	    	   }
	    	   
	    	   System.out.println();
	    	   
	       }

	}

}
