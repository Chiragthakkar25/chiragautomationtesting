///W.A.J.P for create Fibonacci Series.

package Assignment;
import java.util.Scanner;
public class Assignment6 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no1: ");
		int no1=sc.nextInt();
		int f0=0;
		int f1=1;
		System.out.print(f0+" "+f1);
		for (int i=2;i <= no1;i=i+1)
		{
			int f2=f0 + f1;
			f0=f1;
			f1=f2;
			
			System.out.print(" "+f2);
		}

	}

}
