
///W.A.J.P to check given number is Armstrong or not?
package Assignment;

import java.util.Scanner;

public class Assignment5 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no: ");
		int no=sc.nextInt();
		int temp = no;
		int j=0;
		
		while(no > 0)
		{
			int rem=no%10;
			j=j+(rem*rem*rem);
			no=no/10;
		}
		if(j==temp)
		{
			System.out.println(temp+" is armstrong number");
		}
		else
		{
			System.out.println(temp+" is not armstrong number");
		}
		
}
}
