//WAP to calculate the average value of array elements

package Assignment;
import java.util.Scanner;
public class Assignment10 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of Array: ");
		int k=sc.nextInt();
		int[] a=new int[k];
		int sum=0;
		for(int i=0;i<k;i++) 
		{
			System.out.println("Ener Value: ");
			a[i]=sc.nextInt();
			//System.out.print(a[i]);
		}
		for(int i=0;i<k;i++) 
		{
			System.out.print(" "+a[i]);
			
			 sum= sum+a[i];
			
		}
		System.out.println(" ");
		System.out.println("Sum of array element is  "+sum);
		int avg=sum/k;
		System.out.println("avg of array element is  "+avg);
		


	}

}
