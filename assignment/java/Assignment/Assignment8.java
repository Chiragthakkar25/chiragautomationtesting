///WAP to compute the sum of the first 100 prime numbers.
package Assignment;

import java.util.Scanner;

public class Assignment8 
{
    public static void main(String[] args) 
	{
        int n,sum = 0;
        int status = 1;
        int num = 3;
        //For capturing the value of n
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        //The entered value is stored in the var n
        n = scanner.nextInt();
        if (n >= 1)
        {
           System.out.println("First "+n+" prime numbers are:");
           //2 is a known prime number
           System.out.println(2);
        }

        for ( int i = 2 ; i <=n ;  )
        {
           for ( int j = 2 ; j <= Math.sqrt(num); j++ )
           {
              if ( num%j == 0 )
              {
                 status = 0;
                 break;
              }
           }
           if ( status != 0 )
           {
              System.out.println(num);
              sum=sum+num;
              i++;
              
           }
           status = 1;
           num++;
        }         

        System.out.println("sum of first "+n+" prime number is "+sum);

    		  
	}
    	
}

