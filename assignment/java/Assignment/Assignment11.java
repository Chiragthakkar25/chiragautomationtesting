//WAP to find the index of an array element.

package Assignment;
import java.util.Scanner;
public class Assignment11 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of Array: ");
		int k=sc.nextInt();
		int[] a=new int[k];
		
		int index = -1 ;
		for(int i=0;i<k;i++) 
		{
			System.out.println("Enter Value: ");
			a[i]=sc.nextInt();
			//System.out.print(a[i]);
		}
		for(int i=0;i<k;i++) 
		{
			System.out.print("  "+a[i]);
		}
		System.out.println();
		System.out.println("enter Target element : ");
		int t=sc.nextInt();
		for(int j=0;j<k;j++) 
		{
			if(a[j]==t)
			{
				index=j;
				 break;
			}
            
  
		}
		System.out.println();
		if (index==-1)   
        {
     	   System.out.println("Entered target element is not in Array");
        }
		else
		{
		System.out.print(" Entered number index = "+index);
		}

	}

}
