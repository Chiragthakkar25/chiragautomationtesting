
////WAP to reverse an array of integer values.
package Assignment;

import java.util.Scanner;

public class Assignment22 {

	public static void main(String[] args)
     {    
		Scanner sc=new Scanner(System.in);
        System.out.println("Ener size of array K: ");
        int k =sc.nextInt();
        int[] a=new int[k];
        int[] b=new int[k];
		
		for(int i=0;i<k;i++) 
		{
			System.out.println("Ener Value: ");
			a[i]=sc.nextInt();
		}
		for(int i=0;i<k;i++) 
		{
			System.out.print(a[i]+" ");
			
		}
		System.out.println();
		System.out.println("Reverse array is");
		
		for(int j=k-1;j>=0;j--) 
		{
			
			b[j]=a[j];
			System.out.print(b[j]+" ");
			
		}
		
        
	}

}
