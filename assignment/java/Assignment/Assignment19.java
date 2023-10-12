///WAP to iterate through all elements in an array list.
package Assignment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Assignment19 {

	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		ArrayList b1=new ArrayList();
		a1.add(123);
		a1.add("Rahul");
		a1.add(78.56f);
		a1.add('T');
		a1.add(new Integer(100));
		a1.add("Rahul");
		System.out.println("Now Size is ..."+a1.size());
		System.out.println("Now Size is ..."+a1);
		Iterator i1=a1.iterator();
		while (i1.hasNext())
		{
			System.out.println(i1.next());
		}
		

	}

}
