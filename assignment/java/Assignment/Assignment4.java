///W.A.J.P to check given number is Prime or not?

package Assignment;
import java.util.Scanner;
public class Assignment4 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no: ");
		int no=sc.nextInt();
		if (no%2==0)
		{
			System.out.println("Number is prime number:- " +no);
		}
		else
		{
			System.out.println("Number is not a prime number:- " +no);
		}

	}

}
