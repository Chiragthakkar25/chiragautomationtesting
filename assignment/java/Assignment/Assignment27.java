package Assignment;
import java.util.Scanner;
class NoMoreBalanceException extends Exception
{
	double amount;
	public NoMoreBalanceException(double amount)
	{
		this.amount=amount;
	}
	
}
class ATM
{
	double balance;
	public void deposit(double amount)
	{
		balance =balance + amount;
		System.out.println(amount+" Rs Deposited..");
		System.out.println("Your Account balance is ...."+balance);
	}
	
	public void withdrawal(double amount) throws NoMoreBalanceException
	{
		if(amount<=balance)
		{
			balance =balance - amount;
			System.out.println(amount+" Rs Withdrawl..");
			System.out.println("Remainging balance in your account is Rs."+balance);
		}
		else
		{
			double needs = amount -balance;
			throw new NoMoreBalanceException(needs);
			
		}
	}
}

public class Assignment27 {

	public static void main(String[] args)
	
	{
		Scanner sc=new Scanner(System.in);
		ATM a1=new ATM();
		System.out.println("Enter amount from deposit: ");
		double amount =sc.nextDouble();
		a1.deposit(amount);
		System.out.println("Enter amount from Withdrawal: ");
		amount =sc.nextDouble();
		
		try
		{
			a1.withdrawal(amount);
			
		}catch (NoMoreBalanceException e)
		{
			System.out.println("Sorry insufficiant balance,you need to add "+e.amount+ " Rs more in account then you can Withdrawal "+amount+" Rs");
		}

	}

}
