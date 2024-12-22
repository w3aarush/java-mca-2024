/*
Q.> WAP to pass 2 number from the thread class and perform all arithmetic operations by using start a single thread.

*/
// ==================================================================================================================
import java.util.Scanner;
class Arithmetic extends Thread
{
	String tname;
	int x,y;
	Arithmetic(String t, int a, int b)
	{
		this.tname = t;
		this.x = a;
		this.y = b;
	}

	public void run()
	{
		try
		{
			System.out.println("\nRunning Thread : " + tname);
			System.out.println("First Number : " + x + "\nSecond Number : " + y);
			Thread.sleep(2000);
			System.out.println("\nSum : " + (x+y));
			System.out.println("Subtract : " + (x-y));
			System.out.println("Multiply : " + (x*y));
			System.out.println("Division : " + (x/y));
		}
		catch(ArithmeticException ex)
		{
			System.out.println(ex.getMessage());
		}
		catch(Exception ex1)
		{
			System.out.println("Thread Interupted : " + ex1.getMessage());
		}
	}
}

class Thread_problem01
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two number : ");
		int a = in.nextInt();
		int b = in.nextInt();
		Arithmetic z = new Arithmetic("ArithmeticOperation", a, b);
		z.start();
	}
}