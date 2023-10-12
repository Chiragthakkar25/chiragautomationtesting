///WAP to remove the third element from a array list.
package Assignment;

import java.util.ArrayList;

public class Assignment21 {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(123);
		a1.add("Rahul");
		a1.add(78.56f);
		a1.add('T');
		a1.add(new Integer(100));
		a1.add("Rahul");
		System.out.println("Now Size is ..."+a1.size());
		System.out.println("Now Size is ..."+a1);
		a1.remove(3);
		System.out.println("Now Size is ..."+a1.size());
		System.out.println("Now Size is ..."+a1);
		a1.set(3,"Ra");
		System.out.println("Now Size is ..."+a1.size());
		System.out.println("Now Size is ..."+a1);

	}

}
