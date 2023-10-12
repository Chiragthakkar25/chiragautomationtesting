
//WAP to sum values of an array.
package Assignment;
import java.util.Scanner;
public class Assignment9 
{
public static void main(String[] args) {
		
		int k=0,sum=0;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Ener size of array K: ");
		k =sc.nextInt();
		int[] a=new int[k];
		
		for(int i=0;i<k;i++) 
		{
			System.out.println("Ener Value: ");
			a[i]=sc.nextInt();
			sum=sum + a[i];
		}
		for(int i=0;i<k;i++) 
		{
			System.out.println(a[i]+" ");
			
		}
		
		System.out.println("Sum of arry : "+sum);
		sc.close();
	}
}
