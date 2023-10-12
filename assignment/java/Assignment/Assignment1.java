//W.A.J.P to Take three numbers from the user and print the greatest number.
package Assignment;
import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no1: ");
		int no1=sc.nextInt();
		System.out.println("enter no2: ");
		int no2=sc.nextInt();
		System.out.println("enter no3: ");
		int no3=sc.nextInt();
		if(no1>no2 && no2>no3)
		{
			System.out.print("Maximum number is = "+no1);
		}
		else if(no2>no1 && no2>no3)
		{
			
			System.out.print("Maximum number is  = "+no2);
		}
		else 
		{
			System.out.print("Maximum number is = "+no3);
		}

	}

}
