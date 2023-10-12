//WAP to find the second largest element in an array
package Assignment;
import java.util.Scanner;
public class Assignment24 {

	public static void main(String[] args) {
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
		int sec=a[0];
		//System.out.println("Entered Value a[0]: "+a[0]);
		for(int i=1;i<k;++i)
		{
			if(max<a[i])
			{
			  max = a[i];
				
			}
		}
		for(int j=1;j<k;++j)
		{
			if(sec<max && sec > a[j])
			{
			  sec = a[j];
				
			}
		}
		System.out.println("max value of array= " +max);
		System.out.println("Second largest value of array= " +sec);
		

	}

}
