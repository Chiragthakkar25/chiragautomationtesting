///W.A.J.P. Create an abstract class 'Parent' with a method 'message'.

package Assignment;
abstract class Parent {
    abstract void message();
}
class FirstSubclass extends Parent {
    @Override
    void message() {
        System.out.println("This is first subclass");
    }
}
class SecondSubclass extends Parent {
    @Override
    void message() {
        System.out.println("This is second subclass");
    }
}
public class Assignment25 {

	public static void main(String[] args) {
		Parent firstObj = new FirstSubclass();
        Parent secondObj = new SecondSubclass();
        firstObj.message();
        secondObj.message();

	}

}
