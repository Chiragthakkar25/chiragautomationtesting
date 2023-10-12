///WAP to create one thread by extending Thread class in another Class.

package Assignment;
class MyThread extends Thread 
{
    @Override
    public void run()
    {
        for (int i = 1; i <= 5; i++) 
        {
            System.out.println("Thread is running: " + i);
            try
            {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) 
            {
                e.printStackTrace();
                System.out.println("Thread END ");
            }
        }
    }
}
public class Assignment18 {

	public static void main(String[] args) 
	{
		MyThread myThread = new MyThread();
        myThread.start();

	}

}
