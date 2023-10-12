///WAP to find the maximum and minimum value of an array.

package Assignment;
import java.util.Scanner;
public class Assignment12 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of Array: ");
		int k=sc.nextInt();
		int[] a=new int[k];
		
		for(int i=0;i<k;i++) 
		{
			System.out.println("Ener Value: ");
			a[i]=sc.nextInt();
			//System.out.print(a[i]);
		}
		int max=a[0];
		int min=a[0];
		//System.out.println("Entered Value a[0]: "+a[0]);
		for(int i=1;i<k;++i)
		{
			if(max<a[i])
			{
				max = a[i];;
				
				
			}else if(a[i]<min)
			{
				min =a[i];
				
			}
		}
			
		System.out.println("max value of array= " +max);
		
		
		System.out.println("min value of array= " +min);

	}

}
