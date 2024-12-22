/*
--------------------------------------------------------------------------------------------------------------------------
Q.-> WAP to print 1 to 10 and 10 to 1 by using 2 different threads named as threadA and threadB through multiple threads. |
--------------------------------------------------------------------------------------------------------------------------
*/

class ThreadA extends Thread
{
	int i;
	char tname;
	ThreadA(char t)
	{
		this.tname = t;
	}
	public void run()
	{
		try
		{
			System.out.println("Running Thread : " + tname);
			for(i=1; i<=10; i++)
			{
				System.out.println("Value by thread " + tname + " is " + i);
				Thread.sleep(2000);
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}

class ThreadB extends Thread
{
	int i;
	char tname;
	ThreadB(char t)
	{
		this.tname = t;
	}
	public void run()
	{
		try
		{
			System.out.println("Running thread : " + tname);
			for(i = 10; i>=1; i--)
			{
				System.out.println("Value by thread " + tname + " is " + i);
				Thread.sleep(2000);
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}

class MultipThread_Problem02
{
	public static void main(String[] args) {
		ThreadA t1 = new ThreadA('A');
		ThreadB t2 = new ThreadB('B');
		t1.start();
		t2.start();
	}
}