/*
=============================================================================================================================
Q1. WAP to print prime number b/w given data range and also print even number b/w same given range by using Daemon Thread ? |
=============================================================================================================================
*/
import java.util.Scanner;
class check extends Thread
{
	void checkPrime(int n)
	{
		int b = 2;
		for(int i = 2; i<=(n/2); i++)
		{
			if(n%i==0)
			{
				b++;
				break;
			}
		}
		if(b==2) System.out.println(n + " is prime.");
		//else System.out.println(n + " is not prime.");
	}

	void checkEven(int n)
	{
		if(n%2==0) System.out.println(n + " is even.");
		//else System.out.println(n + " is not even.");
	}
}

class thread1 extends check
{
	String t;
	int l, u;
	thread1(String t, int l, int u)
	{
		this.t = t;
		this.l = l;
		this.u = u;
	}

	public void run()
	{
		try {
			System.out.println("Running thread : "+ t + "\nStatus of thread(Daemon) : "+ Thread.currentThread().isDaemon());
			for(int i = l; i<=u; i++)
			{
				super.checkPrime(i);
				Thread.sleep(1000);
			}
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}

class thread2 extends check
{
	String t;
	int l, u;
	thread2(String t, int l, int u)
	{
		this.t = t;
		this.l = l;
		this.u = u;
	}
	public void run()
	{
		try
		{
			System.out.println("Running Thread : "+t+"\nStatus of thread (Daemon) : " + Thread.currentThread().isDaemon());
			for(int i = l; i<=u; i++)
			{
				super.checkEven(i);
				Thread.sleep(1000);
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}

class DaemonThread_example01 {
	public static void main(String[] args) {
		System.out.println("Enter your range for which you want to print:");
		System.out.println("Enter first :");
		Scanner in = new Scanner(System.in);
		int first = in.nextInt();
		System.out.println("Enter second :");
		int second = in.nextInt();
		thread1 t1 = new thread1("A", first, second);
		thread2 t2 = new thread2("B", first, second);
		t2.setDaemon(true);
		t1.start();
		t2.start();
	}
}
