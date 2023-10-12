//W.A.J.P to find factorial for Given Number

package Assignment;
import java.util.Scanner;
public class Assignment3 {

	public static void main(String[] args)
{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int k=sc.nextInt();
		int f=1;
		for(int i=1;i<=k;i++)
		{  
			f=i*f ;
		}
		System.out.print("Fectorial of number "+k+" is :"+f);

	}

}
