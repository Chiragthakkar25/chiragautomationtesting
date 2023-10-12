
//WAP to demonstrate try catch block.
package Assignment;
import java.util.ArrayList;
import java.util.Scanner;

public class Assignment15 {

	public static void main(String[] args) 
	{
		{ 
			Scanner sc=new Scanner(System.in);
			
			ArrayList a1=new ArrayList();
			a1.add(123);
			a1.add("Rahul");
			a1.add(78.56f);
			a1.add('T');
			a1.add(new Integer(100));
			a1.add("Rahul");
			System.out.println("Now Size is ..."+a1);
			System.out.println("enter number of element: ");
			int k=sc.nextInt();
		try {
			a1.remove(k);
			System.out.println("Now Size is ..."+a1.size());
			System.out.println("Now Size is ..."+a1);
		}
		catch(Exception e)
		{
			//e.printStackTrace();
			System.out.println("some thing is wrong");
		}
	}

	}

}
