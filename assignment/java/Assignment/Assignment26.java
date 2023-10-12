
///W.A.J.P. which will ask the user to enter his/her marks (out of 100).
package Assignment;
import java.util.Scanner;
class mark
{   double per;
	public void grades(double per) 
	{
		if ((91<=per) && (per<=100))
		{
			System.out.println("Grade of student is = AA" );
		}
		else if ((81<=per) && (per<=90))
		{
			System.out.println("Grade of student is = AB" );
		}
		else if ((71<=per) && (per<=80))
		{
			System.out.println("Grade of student is = BB" );
		}
		else if ((61<=per) && (per<=70))
		{
			System.out.println("Grade of student is = BC" );
		}
		else if ((51<=per) && (per<=60))
		{
			System.out.println("Grade of student is = CD" );
		}
		else if ((41<=per) && (per<=50))
		{
			System.out.println("Grade of student is = DD" );
		}
		else 
		{
			System.out.println("Student is fail" );
		}

	}
}
public class Assignment26 {

	public static void main(String[] args) {
		mark s1=new mark();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter percentage of student = ");
	    double per =sc.nextDouble();
	    s1.grades(per);

	}

}
